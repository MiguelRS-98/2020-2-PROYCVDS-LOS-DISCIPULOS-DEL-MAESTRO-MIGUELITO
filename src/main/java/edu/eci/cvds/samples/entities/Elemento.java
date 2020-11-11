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
public class Elemento implements Serializable
{
    private int idElemento;
    private String tipo;
    private String informacion;
    private int equipo;
    
    public Elemento() 
    {
        
    }
    
    public Elemento(int idElemento, String tipo, String informacion, int equipo)
    {
        this.idElemento = idElemento;
        this.tipo = tipo;
        this.informacion = informacion;
        this.equipo = equipo;
    }
    
    public int getIdElemento ()
    {
        return idElemento;
    }
    public void setIdElemento (int idElementos)
    {
        this.idElemento = idElemento;
    }
    
    public String getTipo ()
    {
        return tipo;
    }
    public void setTipo (String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getInformacion ()
    {
        return informacion;
    }
    public void setInformacion (String informacion)
    {
        this.informacion = informacion;
    }
    
    public int getEquipo ()
    {
        return equipo;
    }
    public void setEquipo (int equipo)
    {
        this.equipo = equipo;
    }
    
    @Override
    public String toString () 
    {
        return "Elementos {idElemento: " + idElemento + ", Tipo: " + tipo + ", Información: " + informacion + ", Equipo: " + equipo + "}";
    }
}
