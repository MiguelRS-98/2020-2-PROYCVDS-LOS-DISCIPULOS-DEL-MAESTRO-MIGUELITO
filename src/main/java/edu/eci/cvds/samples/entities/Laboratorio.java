/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.samples.entities;

import java.io.Serializable;

/**
 *
 * @author Daniel Ducuara - Miguel Rodríguez - James Torres
 */
public class Laboratorio implements Serializable 
{
    private int idLaboratorio;
    private String nombre;
    private int cantidadEquipos;
    private String informacion;
    
    public Laboratorio() 
    {
        
    }
    
    public Laboratorio(int idLaboratorio, String nombre, int cantidadEquipos, String informacion)
    {
        this.idLaboratorio = idLaboratorio;
        this.nombre = nombre;
        this.cantidadEquipos = cantidadEquipos;
        this.informacion = informacion;
    }
    
    public int getIdLaboratorio ()
    {
        return idLaboratorio;
    }
    public void setIdLaboratorio (int idLaboratorio)
    {
        this.idLaboratorio = idLaboratorio;
    }
    
    public String getNombre ()
    {
        return nombre;
    }
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
    
    public int getCantidadEquipos ()
    {
        return cantidadEquipos;
    }
    public void setCantidadEquipos (int cantidadEquipos)
    {
        this.cantidadEquipos = cantidadEquipos;
    }
    
    public String getInformacion ()
    {
        return informacion;
    }
    public void setInformacion (String informacion)
    {
        this.informacion = informacion;
    }
    
    @Override
    public String toString () 
    {
        return "Laboratory {idLaboratorio: " + idLaboratorio + ", Nombre: " + nombre + ", Cantidad de Equipos: " + cantidadEquipos + ", Información: " + informacion + "}";
    }
}
