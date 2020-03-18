
package com.cursojavaee.primefaces;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


@Named(value = "alumnoController")
@RequestScoped
public class AlumnoController implements Serializable {


    public AlumnoController() {
    }
    
    public void salvarAlumno(ActionEvent actionEvent){
        FacesMessage facesMessage = new FacesMessage("Datos salvados correctamente");
        facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
        
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

}
