import java.util.Collection;
import java.util.Collections;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.apache.myfaces.trinidad.convert.ClientConverter;

public class CheckBoxConverter implements Converter, ClientConverter {

    public CheckBoxConverter() {
        super();
    }

    /**
     * @param facesContext
     * @param uiComponent
     * @param value
     * @return
     */
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        return "true".equals(value) ? "Y" : "N";
    }

    /**
     * @param facesContext
     * @param uiComponent
     * @param value
     * @return
     */
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        return "Y".equals(value) ? "true" : "false";
    }

    /**
     * @param facesContext
     * @return
     */
    public String getClientLibrarySource(FacesContext facesContext) {
        return null;
    }

    /**
     * @return
     */
    public Collection<String> getClientImportNames() {
        return Collections.emptySet();
    }

    /**
     * @param facesContext
     * @param uiComponent
     * @return
     */
    public String getClientScript(FacesContext facesContext, UIComponent uiComponent) {
        return null;
    }

    /**
     * @param facesContext
     * @param uiComponent
     * @return
     */
    public String getClientConversion(FacesContext facesContext, UIComponent uiComponent) {
        return null;
    }
}
