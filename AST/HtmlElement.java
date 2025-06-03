package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    HtmlTag htmlTag;
    List<HtmlAttribute>htmlAttributeList =new ArrayList<>();
    List<HtmlChunk>htmlChunkList=new ArrayList<>();
    CloseTag closeTag;

    public HtmlTag getHtmlTag() {
        return htmlTag;
    }

    public void setHtmlTag(HtmlTag htmlTag) {
        this.htmlTag = htmlTag;
    }

    public List<HtmlChunk> getHtmlChunkList() {
        return htmlChunkList;
    }

    public void setHtmlChunkList(List<HtmlChunk> htmlChunkList) {
        this.htmlChunkList = htmlChunkList;
    }

    public List<HtmlAttribute> getHtmlAttributeList() {
        return htmlAttributeList;
    }

    public void setHtmlAttributeList(List<HtmlAttribute> htmlAttributeList) {
        this.htmlAttributeList = htmlAttributeList;
    }

    public CloseTag getCloseTag() {
        return closeTag;
    }

    public void setCloseTag(CloseTag closeTag) {
        this.closeTag = closeTag;
    }

    @Override
    public String toString() {
        if(htmlAttributeList.isEmpty())
        {
            if(!htmlChunkList.isEmpty()){
                return "HtmlElement{" +
                        "htmlTag=" + htmlTag +
                        ", htmlChunkList=" + htmlChunkList +
                        ", closeTag=" + closeTag +
                        '}';
            }else {
                return "HtmlElement{" +
                        "htmlTag=" + htmlTag +
                        ", closeTag=" + closeTag +
                        '}';
            }
        } else if (htmlChunkList.isEmpty()) {
                return "HtmlElement{" +
                        "htmlTag=" + htmlTag +
                        ", closeTag=" + closeTag +
                        '}';
        }else {
            return "HtmlElement{" +
                    "htmlTag=" + htmlTag +
                    ", htmlAttributeList=" + htmlAttributeList +
                    ", htmlChunkList=" + htmlChunkList +
                    ", closeTag=" + closeTag +
                    '}';
        }
    }
}
