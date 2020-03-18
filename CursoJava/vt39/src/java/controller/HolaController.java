/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HolaService;

/**
 *
 * @author francisco
 */
public class HolaController extends SimpleFormController {
    
    private HolaService holaService;
    public void setHolaService(HolaService holaService){
        this.holaService = holaService;
    }
    
    
    public HolaController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Nombre.class);
        setCommandName("nombre");
        setSuccessView("holaView");
        setFormView("nombreView");
        
    }
    
    
    
    
    

    



    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        
                Nombre nombre = (Nombre)command;
                ModelAndView mv = new ModelAndView(getSuccessView());
                ModelAndView ModelAndView; /*addObject*/
                ModelAndView = mv.addObject("holaMensaje", holaservice.diHola(nombre.getValue()));
                return mv;
            }

    private void setCommandClass(Class<Nombre> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setCommandName(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSuccessView(String holaView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setFormView(String nombreView) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSuccessView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
