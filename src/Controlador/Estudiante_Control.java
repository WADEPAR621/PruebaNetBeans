/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estudiante_Control {
    /*
    Clase Controlador de estudiante.
    */
    // Obtencion de todos los estudiantes desde la base
    // Se guarda en una lista cada estudiante.
    public ArrayList<Estudiante> getEstudiantes() {
        Conector con = new Conector();
        con.setCon();
        ArrayList<Estudiante> listaEstudiantes = new ArrayList();
        String sql = "SELECT * FROM estudiantes;";

        try {
            Statement psd = con.getCon().createStatement();
            ResultSet rs = psd.executeQuery(sql);
            while (rs.next()) {
                Estudiante est = new Estudiante();
                est.setCedula(rs.getString("CED_EST"));
                est.setNombre(rs.getString("NOM_EST"));
                est.setApellido(rs.getString("APE_EST"));
                est.setDireccion(rs.getString("DIR_EST"));
                est.setCelular(rs.getString("TEL_EST"));
                listaEstudiantes.add(est);
            }
            con.getCon().close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listaEstudiantes;
    }

    //Edicion de un estudiante
    public void editarEstudiantes(String nombre, String cedula, String apellido, String direccion, String telefono) {
        Estudiante est = new Estudiante(nombre, cedula, apellido, direccion, telefono);
        Conector con = new Conector();
        con.setCon();
        String sql = "UPDATE ESTUDIANTES SET NOM_EST = ?, APE_EST = ?, DIR_EST = ?, TEL_EST = ? WHERE CED_EST = ?;";
        try {
            PreparedStatement psd = con.getCon().prepareStatement(sql);
            psd.setString(1, est.getNombre());
            psd.setString(2, est.getApellido());
            psd.setString(3, est.getDireccion());
            psd.setString(4, est.getCelular());
            psd.setString(5, est.getCedula());
            int anser = JOptionPane.showConfirmDialog(null, "Seguro que desea editar ese estudiante?");
            if (anser != 0) {
                return;
            }
            int i = psd.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "SE GUARDO");
            }
            con.getCon().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Eliminacion de un estudiante
    public void eliminarEstudiante(String cedula) {
        Estudiante est = new Estudiante(cedula);
        Conector con = new Conector();
        con.setCon();
        String sql = "DELETE FROM ESTUDIANTES WHERE CED_EST = '" + est.getCedula() + "'";
        try {
            PreparedStatement psd = con.getCon().prepareStatement(sql);
            int anser = JOptionPane.showConfirmDialog(null, "Seguro que desea borrar ese estudiante?");
            if (anser != 0) {
                return;
            }
            int i = psd.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "SE ELIMINO");
            }
            con.getCon().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Creacion de un estudiante.
    public void crearEstudiante(Estudiante est) {
        Conector con = new Conector();
        con.setCon();
        String sql = "INSERT INTO ESTUDIANTES(CED_EST, NOM_EST, APE_EST, DIR_EST, TEL_EST)"
                + " VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement psd = con.getCon().prepareStatement(sql);
            psd.setString(1, est.getCedula());
            psd.setString(2, est.getNombre());
            psd.setString(3, est.getApellido());
            psd.setString(4, est.getDireccion());
            psd.setString(5, est.getCelular());
            int i = psd.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "SE GUARDO");
            }
            con.getCon().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
