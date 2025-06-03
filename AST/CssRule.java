package AST;

import java.util.ArrayList;
import java.util.List;

public class CssRule {
    List<String> templateId=new ArrayList<>();
    List<String> cssValue=new ArrayList<>();

    public List<String> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<String> templateId) {
        this.templateId = templateId;
    }

    public List<String> getCssValue() {
        return cssValue;
    }

    public void setCssValue(List<String> cssValue) {
        this.cssValue = cssValue;
    }

    @Override
    public String toString() {
     if (cssValue==null) {
            return "CssRule{" +
                    "templateId=" + templateId +
                    '}';
        }else {
            return "CssRule{" +
                    "templateId=" + templateId +
                    ", cssValue=" + cssValue +
                    '}';
        }
    }
}
