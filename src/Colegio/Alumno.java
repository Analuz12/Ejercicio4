/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colegio;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana luz
 */
public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    private HashSet<Materia> materia= new HashSet<>();

    public Alumno() {
    }

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashSet<Materia> getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return apellido+","+nombre;//re definimos para ver en los combos solo esto
    }

    public void agregarMateria(Materia m){
        if (materia.add(m)){
            JOptionPane.showMessageDialog(null,"La materia se agrego con exito");
        }else{
            JOptionPane.showMessageDialog(null,"El alumno ya esta escrito");
        }
    }
    public int cantidadMateria(){
        return materia.size();
    }
}
