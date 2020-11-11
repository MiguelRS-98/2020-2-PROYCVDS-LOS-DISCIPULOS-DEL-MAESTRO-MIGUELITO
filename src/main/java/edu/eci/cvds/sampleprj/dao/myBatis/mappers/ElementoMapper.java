/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.sampleprj.dao.myBatis.mappers;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.Elemento;

import java.util.List;

/**
 *
 * @author Daniel Ducuara - Miguel Rodríguez - James Torres
 */
public interface ElementoMapper 
{
    public List<Elemento> consultarElementosDeEquipo(@Param("idElemento")int idElemento);
    public void añadirElemento(@Param("elemento") Elemento elemento);
}