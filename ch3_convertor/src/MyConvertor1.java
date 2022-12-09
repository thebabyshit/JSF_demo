import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * @Author
 * @Date 2022/11/7 17:02
 * @Description
 **/

@FacesConverter(value = "convertor1")
public class MyConvertor1 implements Converter {
    //receive Args 处理输入
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        System.out.println(uiComponent.getClientId());
        String str = s.trim();
        //转换器的验证作用
        if(str.length()!=8){
            FacesMessage msg = new FacesMessage();
            msg.setSummary("输入的信息长度不对 请输入8个字符");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(msg);
        }else{
            String str1 = str.substring(0,4);
            String str2 = str.substring(4,8);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str1);
            stringBuilder.append("♥♠>_<♣♦");
            stringBuilder.append(str2);
            stringBuilder.reverse();
            return stringBuilder;
        }
    }

    //Render Page 用于输出
    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return null;
    }
}
