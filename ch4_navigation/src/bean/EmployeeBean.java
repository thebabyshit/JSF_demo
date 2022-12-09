package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * @Author
 * @Date 2022/11/9 20:05
 * @Description
 **/

@ManagedBean
@RequestScoped
public class EmployeeBean {
    private int id;
    private String name;

    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        String id = "Emp_ID:"+this.id;
        String name = "Emp_Name:"+this.name;
        this.info = id+" >< "+name;
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String checkId(){
        if(this.id>=1&&this.id<=3){
            return "success";
        }else{
            return "error";
        }
    }
}
