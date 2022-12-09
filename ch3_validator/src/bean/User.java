package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import java.io.Serializable;

/**
 * @Author
 * @Date 2022/11/8 9:03
 * @Description
 **/

@ManagedBean
@RequestScoped
public class User implements Serializable {
    private String id;
    private String phone;
    private String email;
    private String pass;
    private String confirm;

    /**
     *   bean方法实现验证器
     */
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String value = o.toString();
        if(!value.equals("1234")){
            FacesMessage msg = new FacesMessage();
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            msg.setSummary("两次密码不一样，请重新输入");
            throw new ValidatorException(msg);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
}
