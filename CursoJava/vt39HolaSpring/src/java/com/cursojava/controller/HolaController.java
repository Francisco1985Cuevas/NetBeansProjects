/*
 
 */
package com.cursojava.controller;

import com.cursojava.service.HolaService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


public class HolaController extends SimpleFormController {
    
    private HolaService holaService;
    public void setHolaService(HolaService holaService){
        this.holaService = holaService;
    }
    
    public HolaController() {
        //Initialize controller properties here or 
        //in the Web Application Context
        
        //especificamos las propiedades de el Controller
        //metodos setter
        setCommandClass(Nombre.class);//configura el nombre de comando de la clase.
        setCommandName("nombre");//definimos el nombre del comando que va a ir en el Modelo
        setSuccessView("holaView");//configura el nombre de la vista que debe mostrarse despues de que el envio se haya hecho de modo correcto
        setFormView("nombreView");//configura el nombre de la vista que va a usarse para mostrar el formulario
    }
    
//    @Override
//    protected void doSubmitAction(Object command) throws Exception {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        return mv;
    }
     */
    protected ModelAndView onSubmit(Object command) throws Exception {
        
        Nombre nombre = (Nombre)command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("holaMensaje",holaService.diHola(nombre.getValue()));
        //Do something...
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
