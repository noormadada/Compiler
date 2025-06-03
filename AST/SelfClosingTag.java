package AST;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag {
    HtmlTag htmlTag;
    List<HtmlAttribute>htmlAttributeList=new ArrayList<>();

    public HtmlTag getHtmlTag() {
        return htmlTag;
    }

    public void setHtmlTag(HtmlTag htmlTag) {
        this.htmlTag = htmlTag;
    }

    public List<HtmlAttribute> getHtmlAttributeList() {
        return htmlAttributeList;
    }

    public void setHtmlAttributeList(List<HtmlAttribute> htmlAttributeList) {
        this.htmlAttributeList = htmlAttributeList;
    }

    @Override
    public String toString() {
        if (htmlAttributeList.isEmpty()){
            return "SelfClosingTag{" +
                    "htmlTag=" + htmlTag +
                    '}';
        }else {
            return "SelfClosingTag{" +
                    "htmlTag=" + htmlTag +
                    ", htmlAttributeList=" + htmlAttributeList +
                    '}';
        }
    }
}
