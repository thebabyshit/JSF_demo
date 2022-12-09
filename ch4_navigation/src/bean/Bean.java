package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * @Author
 * @Date 2022/11/9 19:38
 * @Description
 **/

@ManagedBean
@RequestScoped
public class Bean implements Serializable {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String selectJudge(){
        int len = this.getInfo().length();
        if(len<3){
            return "less";
        }else{
            return "great";
        }
    }

}
