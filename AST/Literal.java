package AST;

public class Literal implements AST_Node {
    String  template_id;
    String  stringLiteral;
    String number ;
    String trueId;
    String falseId;
    TemplateLiteral templateLiteral;

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public TemplateLiteral getTemplateLiteral() {
        return templateLiteral;
    }

    public void setTemplateLiteral(TemplateLiteral templateLiteral) {
        this.templateLiteral = templateLiteral;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getFalseId() {
        return falseId;
    }

    public void setFalseId(String falseId) {
        this.falseId = falseId;
    }

    public String getTrueId() {
        return trueId;
    }

    public void setTrueId(String trueId) {
        this.trueId = trueId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if(stringLiteral!=null){
            return "\nLiteral{" +
                    "\nstringLiteral='" + stringLiteral + '\'' +
                    "\n }";
        } else if (number!=null) {
            return "\nLiteral{" +
                    "\nnumber='" + number + '\'' +
                    "\n }";
        } else if (trueId!=null) {
            return "\nLiteral{" +
                    "\ntrueId='" + trueId + '\'' +
                    "\n }";

        }  else if (template_id!=null) {
            return "\nLiteral{" +
                    "\ntemplate_id='" + template_id + '\'' +
                    "\n }";
        } else if (templateLiteral!=null) {
            return "\nLiteral{" +
                    "\ntemplateLiteral='" + templateLiteral + '\'' +
                    "\n }";
        } else {
            return "\nLiteral{" +
                    "\nfalseId='" + falseId + '\'' +
                    "\n }";
        }
    }
}
