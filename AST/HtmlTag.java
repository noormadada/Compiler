package AST;

public class HtmlTag implements AST_Node {
    String templateTagDiv;
    String templateTagSpan;
    String templateTagSection;
    String templateTagP;
    String templateTagH1;
    String templateTagH2;
    String templateTagH3;
    String templateTagImg;
    String templateTagButton;
    String templateTagInput;
    String templateTagId;
    String templateTagUl;
    String templateTagLi;

    public String getTemplateTagDiv() {
        return templateTagDiv;
    }

    public void setTemplateTagDiv(String templateTagDiv) {
        this.templateTagDiv = templateTagDiv;
    }

    public String getTemplateTagSpan() {
        return templateTagSpan;
    }

    public void setTemplateTagSpan(String templateTagSpan) {
        this.templateTagSpan = templateTagSpan;
    }

    public String getTemplateTagSection() {
        return templateTagSection;
    }

    public void setTemplateTagSection(String templateTagSection) {
        this.templateTagSection = templateTagSection;
    }

    public String getTemplateTagP() {
        return templateTagP;
    }

    public void setTemplateTagP(String templateTagP) {
        this.templateTagP = templateTagP;
    }

    public String getTemplateTagH1() {
        return templateTagH1;
    }

    public void setTemplateTagH1(String templateTagH1) {
        this.templateTagH1 = templateTagH1;
    }

    public String getTemplateTagH2() {
        return templateTagH2;
    }

    public void setTemplateTagH2(String templateTagH2) {
        this.templateTagH2 = templateTagH2;
    }

    public String getTemplateTagH3() {
        return templateTagH3;
    }

    public void setTemplateTagH3(String templateTagH3) {
        this.templateTagH3 = templateTagH3;
    }

    public String getTemplateTagImg() {
        return templateTagImg;
    }

    public void setTemplateTagImg(String templateTagImg) {
        this.templateTagImg = templateTagImg;
    }

    public String getTemplateTagInput() {
        return templateTagInput;
    }

    public void setTemplateTagInput(String templateTagInput) {
        this.templateTagInput = templateTagInput;
    }

    public String getTemplateTagButton() {
        return templateTagButton;
    }

    public void setTemplateTagButton(String templateTagButton) {
        this.templateTagButton = templateTagButton;
    }

    public String getTemplateTagId() {
        return templateTagId;
    }

    public void setTemplateTagId(String templateTagId) {
        this.templateTagId = templateTagId;
    }

    public String getTemplateTagUl() {
        return templateTagUl;
    }

    public void setTemplateTagUl(String templateTagUl) {
        this.templateTagUl = templateTagUl;
    }

    public String getTemplateTagLi() {
        return templateTagLi;
    }

    public void setTemplateTagLi(String templateTagLi) {
        this.templateTagLi = templateTagLi;
    }

    @Override
    public String toString() {
        if(templateTagButton != null){
            return "HtmlTag{" +
                    ", templateTagButton='" + templateTagButton + '\'' +
                    '}';
        } else if (templateTagDiv != null) {
            return "HtmlTag{" +
                    ", templateTagDiv='" + templateTagDiv + '\'' +
                    '}';
        } else if (templateTagSpan != null) {
            return "HtmlTag{" +
                    ", templateTagSpan='" + templateTagSpan + '\'' +
                    '}';
        } else if (templateTagSection != null) {
            return "HtmlTag{" +
                    ", templateTagSection='" + templateTagSection + '\'' +
                    '}';
        } else if (templateTagP != null) {
            return "HtmlTag{" +
                    ", templateTagP='" + templateTagP + '\'' +
                    '}';
        } else if (templateTagH1 != null) {
            return "HtmlTag{" +
                    ", templateTagH1='" + templateTagH1 + '\'' +
                    '}';
        } else if (templateTagH2 != null) {
            return "HtmlTag{" +
                    ", templateTagH2='" + templateTagH2 + '\'' +
                    '}';
        } else if (templateTagH3 != null) {
            return "HtmlTag{" +
                    ", templateTagH3='" + templateTagH3 + '\'' +
                    '}';
        } else if (templateTagImg != null) {
            return "HtmlTag{" +
                    ", templateTagImg='" + templateTagImg + '\'' +
                    '}';
        } else if (templateTagInput != null) {
            return "HtmlTag{" +
                    ", templateTagInput='" + templateTagInput + '\'' +
                    '}';
        } else if (templateTagId != null) {
            return "HtmlTag{" +
                    ", templateTagId='" + templateTagId + '\'' +
                    '}';
        } else if (templateTagUl != null) {
            return "HtmlTag{" +
                    ", templateTagUl='" + templateTagUl + '\'' +
                    '}';
        } else  {
            return "HtmlTag{" +
                    ", templateTagLi='" + templateTagLi + '\'' +
                    '}';
        }
    }
}
