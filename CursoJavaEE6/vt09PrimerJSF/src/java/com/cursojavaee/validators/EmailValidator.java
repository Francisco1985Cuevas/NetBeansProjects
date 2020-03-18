
package com.cursojavaee.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("emailValidator")
public class EmailValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        String str = (String)value;
        if(str.indexOf('@') == -1){
            throwException("Invalid email id");
        }
        
    }

    private void throwException(String errMessage) {
        FacesMessage message = new FacesMessage();
        message.setDetail(errMessage);
        message.setSummary(errMessage);
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        throw new ValidatorException(message);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
