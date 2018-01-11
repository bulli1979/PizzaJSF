package converter;

import java.io.Serializable;

import javax.el.ValueExpression;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import beans.OrderAndExtrasBean;
import pojos.Extra;

@ManagedBean
@FacesConverter(value = "extraConverter")
public class ExtraConverter implements Converter, Serializable {
	
	public ExtraConverter(){}
	
	@Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value.isEmpty()) {
            return null;
        }
        ValueExpression vex =
        		context.getApplication().getExpressionFactory()
                        .createValueExpression(context.getELContext(),
                                "#{orderAndExtrasBean}", OrderAndExtrasBean.class);
        Integer id = new Integer(value);
        OrderAndExtrasBean oeBean = (OrderAndExtrasBean)vex.getValue(context.getELContext());
        return oeBean.getExtra(Integer.valueOf(id));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null || value.toString().isEmpty()) {
            return "";
        }
        Integer id = ((Extra) value).getId();
        return id.toString();
    }
}
