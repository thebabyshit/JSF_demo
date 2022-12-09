package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;

/**
 * @Author
 * @Date 2022/11/15 8:38
 * @Description
 **/

@ManagedBean
@RequestScoped
public class ValueBean implements Serializable {
    private HtmlInputText id, t1, t2, t3;

    /**
     * 值更改事件触发bean方法，该方法实现自动填充
     */
    public void autoFill(ValueChangeEvent valueChangeEvent) {
        String idVal = valueChangeEvent.getNewValue().toString();
        StringBuilder t11 = new StringBuilder();
        StringBuilder t22 = new StringBuilder();
        StringBuilder t33 = new StringBuilder();
        backDataById(idVal,t11,t22,t33);//数据填充
        t1.setValue(t11);
        t2.setValue(t22);
        t3.setValue(t33);
    }

    /**
     * 传入id，自动分配数据
     */
    public void backDataById(String id, StringBuilder v1, StringBuilder v2, StringBuilder v3) {
        if(id.equals("001")){
            v1.append("j2se");
            v2.append("spring");
            v3.append("mybatis");
        }else if(id.equals("002")){
            v1.append("c++");
            v2.append("MFC");
            v3.append(".NET");
        }else if(id.equals("003")){
            v1.append("rust");
            v2.append("golang");
            v3.append("julia");
        }
    }


    public HtmlInputText getId() {
        return id;
    }

    public void setId(HtmlInputText id) {
        this.id = id;
    }

    public HtmlInputText getT1() {
        return t1;
    }

    public void setT1(HtmlInputText t1) {
        this.t1 = t1;
    }

    public HtmlInputText getT2() {
        return t2;
    }

    public void setT2(HtmlInputText t2) {
        this.t2 = t2;
    }

    public HtmlInputText getT3() {
        return t3;
    }

    public void setT3(HtmlInputText t3) {
        this.t3 = t3;
    }
}
