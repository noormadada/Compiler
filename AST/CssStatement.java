package AST;

import java.util.ArrayList;
import java.util.List;

public class CssStatement implements AST_Node {
    String cssClassName;
    String templateTagImage;
    List<CssRule>cssRuleList=new ArrayList<>();
    List<String> templateId=new ArrayList<>();
    String templateTagButton;

    public List<String> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<String> templateId) {
        this.templateId = templateId;
    }

    public String getTemplateTagButton() {
        return templateTagButton;
    }

    public void setTemplateTagButton(String templateTagButton) {
        this.templateTagButton = templateTagButton;
    }

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
        if(cssClassName!=null){
            if(cssRuleList.isEmpty()){
                if(templateTagImage!=null){
                return "CssStatement{" +
                        "cssClassName='" + cssClassName + '\'' +
                        ", templateTagImage='" + templateTagImage + '\'' +
                        '}';
                }else {
                return "CssStatement{" +
                        "cssClassName='" + cssClassName + '\'' +
                        '}';
                }
            }else {
                if(templateTagImage!=null){
                    return "CssStatement{" +
                            "cssClassName='" + cssClassName + '\'' +
                            ", templateTagImage='" + templateTagImage + '\'' +
                            "cssRule"+cssRuleList+
                            '}';
                }else {
                    return "CssStatement{" +
                            "cssClassName='" + cssClassName + '\'' +
                            "cssRule"+cssRuleList+
                            '}';
                }
            }
        }else {
            if(cssRuleList.isEmpty()){
                if(templateTagImage!=null){
                    if(templateId.isEmpty()) {
                        return "CssStatement{" +
                                "templateTagImage" + templateTagImage +
                                '}';
                    }else {
                        return "CssStatement{" +
                                "templateTagImage" + templateTagImage +
                                "template Id"+templateId+
                                '}';
                    }
                } else if (templateTagButton!=null) {
                    if(templateId.isEmpty()) {
                        return "CssStatement{" +
                                "templateTagButton" + templateTagButton +
                                '}';
                    }else {
                        return "CssStatement{" +
                                "templateTagButton" + templateTagButton +
                                "template Id"+templateId+
                                '}';
                    }
                }else {
                    return "CssStatement{" +
                            "template Id"+templateId+
                            '}';
                }
            }else {
                if(templateTagImage!=null){
                    if(templateId.isEmpty()) {
                        return "CssStatement{" +
                                "cssRule" + cssRuleList +
                                "templateTagImage" + templateTagImage +
                                '}';
                    }else {
                        return "CssStatement{" +
                                "cssRule" + cssRuleList +
                                "templateTagImage" + templateTagImage +
                                "template Id"+templateId+
                                '}';
                    }
                } else if (templateTagButton!=null) {
                    if(templateId.isEmpty()) {
                        return "CssStatement{" +
                                "cssRule" + cssRuleList +
                                "templateTagButton" + templateTagButton +
                                '}';
                    }else {
                        return "CssStatement{" +
                                "cssRule" + cssRuleList +
                                "templateTagButton" + templateTagButton +
                                "template Id"+templateId+
                                '}';
                    }
                }else {
                    return "CssStatement{" +
                            "cssRule" + cssRuleList +
                            "template Id"+templateId+
                            '}';
                }
            }
        }
    }
}
