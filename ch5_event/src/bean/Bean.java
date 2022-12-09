package bean;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * @Author
 * @Date 2022/11/14 16:59
 * @Description
 **/
@ManagedBean
public class Bean implements Serializable {

    private String v;

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
