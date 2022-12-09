package bean;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 * @Author
 * @Date 2022/11/14 17:04
 * @Description
 **/
public class ActionHandler implements ActionListener {
    @Override
    public void processAction(ActionEvent actionEvent) throws AbortProcessingException {
        System.out.println(" 操作事件发生："+actionEvent.getComponent().getClientId().toString());
    }
}
