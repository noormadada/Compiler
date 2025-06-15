package AST;

public class HtmlElementChunk extends  HtmlChunk implements AST_Node{
    HtmlElement htmlElement;

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    @Override
    public String toString() {
        return "HtmlElementChunk{" +
                "htmlElement=" + htmlElement +
                '}';
    }
}
