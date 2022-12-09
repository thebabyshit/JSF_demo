package bean;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @Author
 * @Date 2022/11/8 9:06
 * @Description
 **/
@FacesValidator(value = "validator1")
public class MyValidator1 implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        System.out.println(o.toString());
    }
}
