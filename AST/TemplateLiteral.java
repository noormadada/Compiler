package AST;

public class TemplateLiteral implements AST_Node {
HtmlContent htmlContent;

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        if(htmlContent==null){
            return "TemplateLiteral{" +
                    '}';
        }else {
            return "TemplateLiteral{" +
                    "htmlContent=" + htmlContent +
                    '}';
        }
    }
}
