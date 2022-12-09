import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author
 * @Date 2022/11/7 16:41
 * @Description
 **/

@ManagedBean(name = "bean1")
@RequestScoped
public class UserBean implements Serializable {

    @ManagedProperty(value = "124.12345")
    private double amount;
    private Date date;
    private String info;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        if(null==date){
            date = new Date();
        }
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
