package AST;

public class TemplateField extends ObjectField {
    String TEMPLATEE;
    TemplateLiteral templateLiteral;


    public String getTEMPLATEE() {
        return TEMPLATEE;
    }

    public void setTEMPLATEE(String TEMPLATEE) {
        this.TEMPLATEE = TEMPLATEE;
    }

    public TemplateLiteral getTemplateLiteral() {
        return templateLiteral;
    }

    public void setTemplateLiteral(TemplateLiteral templateLiteral) {
        this.templateLiteral = templateLiteral;
    }
    @Override
    public String toString() {

        return "TemplateField{" +
                "\n TEMPLATEE= " + TEMPLATEE +
                "\n templateLiteral=" + templateLiteral +
                "\n }";

    }

}
