
package bean;

import java.util.Calendar;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("navegacionBean")
@RequestScoped
public class NavegacionBean {

    
    public NavegacionBean() {
    }
    
    public String saludar(){
        String mensaje = "no";
        int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        
        if(hora < 12){
            mensaje = "buenos-dias";
        }
        
        if(hora < 18){
            mensaje = "buenas-tardes";
        }
        
        if(hora < 23){
            mensaje = "buenas-noches";
        }
        
        return mensaje;
        
    }
}
