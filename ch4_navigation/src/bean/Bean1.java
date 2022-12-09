package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * @Author
 * @Date 2022/11/14 16:10
 * @Description
 **/
@ManagedBean
@RequestScoped
public class Bean1 implements Serializable {
    private String type;
    private boolean flag;

    public boolean selectType(){
        if(this.getType().toString().equals("winter")) {
            flag = true;
        } else if(this.getType().toString().equals("summer")){
            flag = false;
        }
        return flag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
