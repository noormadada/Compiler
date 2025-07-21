package AST;

public class TemplateExpr extends Expression implements AST_Node{
    TemplateLiteral templateLiteral;

    public TemplateLiteral getTemplateLiteral() {
        return templateLiteral;
    }

    public void setTemplateLiteral(TemplateLiteral templateLiteral) {
        this.templateLiteral = templateLiteral;
    }

    @Override
    public String toString() {
        return "TemplateExpr{" +
                "templateLiteral=" + templateLiteral +
                '}';
    }
}
