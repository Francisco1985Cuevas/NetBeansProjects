package com.py.web.controller;

import com.py.entidades.Tornillosxcliente;
import com.py.web.controller.util.JsfUtil;
import com.py.web.controller.util.JsfUtil.PersistAction;
import com.py.web.TornillosxclienteFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("tornillosxclienteController")
@SessionScoped
public class TornillosxclienteController implements Serializable {

    @EJB
    private com.py.web.TornillosxclienteFacade ejbFacade;
    private List<Tornillosxcliente> items = null;
    private Tornillosxcliente selected;

    public TornillosxclienteController() {
    }

    public Tornillosxcliente getSelected() {
        return selected;
    }

    public void setSelected(Tornillosxcliente selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
        selected.setTornillosxclientePK(new com.py.entidades.TornillosxclientePK());
    }

    private TornillosxclienteFacade getFacade() {
        return ejbFacade;
    }

    public Tornillosxcliente prepareCreate() {
        selected = new Tornillosxcliente();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("TornillosxclienteCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("TornillosxclienteUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("TornillosxclienteDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Tornillosxcliente> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Tornillosxcliente getTornillosxcliente(com.py.entidades.TornillosxclientePK id) {
        return getFacade().find(id);
    }

    public List<Tornillosxcliente> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Tornillosxcliente> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Tornillosxcliente.class)
    public static class TornillosxclienteControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TornillosxclienteController controller = (TornillosxclienteController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tornillosxclienteController");
            return controller.getTornillosxcliente(getKey(value));
        }

        com.py.entidades.TornillosxclientePK getKey(String value) {
            com.py.entidades.TornillosxclientePK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.py.entidades.TornillosxclientePK();
            key.setIdtornilloTornillo(Integer.parseInt(values[0]));
            key.setIdclienteCliente(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(com.py.entidades.TornillosxclientePK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getIdtornilloTornillo());
            sb.append(SEPARATOR);
            sb.append(value.getIdclienteCliente());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Tornillosxcliente) {
                Tornillosxcliente o = (Tornillosxcliente) object;
                return getStringKey(o.getTornillosxclientePK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Tornillosxcliente.class.getName()});
                return null;
            }
        }

    }

}
