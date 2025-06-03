package AST;

import java.util.ArrayList;
import java.util.List;

public class CssStatement {
    String cssClassName;
    String templateTagImage;
    List<CssRule>cssRuleList=new ArrayList<>();

    public String getCssClassName() {
        return cssClassName;
    }

    public void setCssClassName(String cssClassName) {
        this.cssClassName = cssClassName;
    }

    public String getTemplateTagImage() {
        return templateTagImage;
    }

    public void setTemplateTagImage(String templateTagImage) {
        this.templateTagImage = templateTagImage;
    }

    public List<CssRule> getCssRuleList() {
        return cssRuleList;
    }

    public void setCssRuleList(List<CssRule> cssRuleList) {
        this.cssRuleList = cssRuleList;
    }

    @Override
    public String toString() {
        if (cssRuleList.isEmpty()){
            if(templateTagImage!=null) {
                return "CssStatement{" +
                        "cssClassName='" + cssClassName + '\'' +
                        ", templateTagImage='" + templateTagImage + '\'' +
                        '}';
            }else {
                return "CssStatement{" +
                        "cssClassName='" + cssClassName + '\'' +
                        '}';
            }
        } else if (templateTagImage==null) {
                return "CssStatement{" +
                        "cssClassName='" + cssClassName + '\'' +
                        '}';
        }else {
            return "CssStatement{" +
                    "cssClassName='" + cssClassName + '\'' +
                    ", templateTagImage='" + templateTagImage + '\'' +
                    ", cssRuleList=" + cssRuleList +
                    '}';
        }
    }
}
