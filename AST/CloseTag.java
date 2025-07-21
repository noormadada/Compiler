package AST;

public class CloseTag implements AST_Node{
    HtmlTag htmlTag;

    public HtmlTag getHtmlTag() {
        return htmlTag;
    }

    public void setHtmlTag(HtmlTag htmlTag) {
        this.htmlTag = htmlTag;
    }

    @Override
    public String toString() {
        return "CloseTag{" +
                "htmlTag=" + htmlTag +
                '}';
    }
}
