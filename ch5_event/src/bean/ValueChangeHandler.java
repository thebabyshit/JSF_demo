package bean;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;

/**
 * @Author
 * @Date 2022/11/14 17:07
 * @Description
 **/
public class ValueChangeHandler implements javax.faces.event.ValueChangeListener {
    @Override
    public void processValueChange(ValueChangeEvent valueChangeEvent) throws AbortProcessingException {
        System.out.println(" 值更改事件发生前：Value="+valueChangeEvent.getOldValue());
        System.out.println("                   newValue="+valueChangeEvent.getNewValue());
    }
}
