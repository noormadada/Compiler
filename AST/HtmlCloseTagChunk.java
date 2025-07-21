package AST;

public class HtmlCloseTagChunk extends HtmlChunk implements AST_Node {
    CloseTag closeTag;

    public CloseTag getCloseTag() {
        return closeTag;
    }

    public void setCloseTag(CloseTag closeTag) {
        this.closeTag = closeTag;
    }

    @Override
    public String toString() {
        return "HtmlCloseTagChunk{" +
                "closeTag=" + closeTag +
                '}';
    }
}
