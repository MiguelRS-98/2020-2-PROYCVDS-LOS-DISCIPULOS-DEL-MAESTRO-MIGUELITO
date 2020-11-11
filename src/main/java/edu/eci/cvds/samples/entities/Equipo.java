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
public class Equipo implements Serializable
{
    private int idEquipo;
    private String ip;
    private String informacion;
    private int laboratorio;
    
    public Equipo() 
    {
        
    }
    
    public Equipo (int idEquipo, String ip, String informacion, int laboratorio)
    {
        this.idEquipo = idEquipo;
        this.ip = ip;
        this.informacion = informacion;
        this.laboratorio = laboratorio;
    }
    
    public int getIdEquipo ()
    {
        return idEquipo;
    }
    public void setIdEquipo (int idEquipo)
    {
        this.idEquipo = idEquipo;
    }
    
    public String getIp ()
    {
        return ip;
    }
    public void setIp (String ip)
    {
        this.ip = ip;
    }
    
    public String getInformacion ()
    {
        return informacion;
    }
    public void setInformacion (String informacion)
    {
        this.informacion = informacion;
    }
    
    public int getLaboratorio ()
    {
        return laboratorio;
    }
    public void setLaboratorio (int laboratorio)
    {
        this.laboratorio = laboratorio;
    }
    
    @Override
    public String toString () 
    {
        return "Equipos {idEquipo: " + idEquipo + ", ip: " + ip + ", Información: " + informacion + ", Laboratorio: " + laboratorio + "}";
    }
}
