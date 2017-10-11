/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.CategoriaFacadeLocal;

import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Categoria;

/**
 *
 * @author jacque
 */
@Named
@ViewScoped
public class CategoriaBean implements Serializable{

    /**
     * Creates a new instance of CategoriaBean
     */
    public CategoriaBean() {
    }
    @EJB 
    CategoriaFacadeLocal CategoriaFacade;
     List<Categoria> CategoriaList=new ArrayList<>();
    
    @PostConstruct
    public void init() {
       this.CategoriaList=CategoriaFacade.findAll();
    }
   
     public List<Categoria> getCategoriaList() {
        return CategoriaList;
    }

    public void setCategoriaList(List<Categoria> CategoriaList) {
        this.CategoriaList = CategoriaList;
    }

    public CategoriaFacadeLocal getCategoriaFacade() {
        return CategoriaFacade;
    }

    public void setCategoriaFacade(CategoriaFacadeLocal CategoriaFacade) {
        this.CategoriaFacade = CategoriaFacade;
    }
    
}
