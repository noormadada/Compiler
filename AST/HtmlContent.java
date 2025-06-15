package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent implements AST_Node {
    List<HtmlChunk>htmlChunkList=new ArrayList<>();

    public List<HtmlChunk> getHtmlChunkList() {
        return htmlChunkList;
    }

    public void setHtmlChunkList(List<HtmlChunk> htmlChunkList) {
        this.htmlChunkList = htmlChunkList;
    }

    @Override
    public String toString() {
        return "HtmlContent{" +
                "htmlChunkList=" + htmlChunkList +
                '}';
    }
}
