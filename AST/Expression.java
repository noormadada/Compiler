package AST;

import java.util.ArrayList;
import java.util.List;

public class Expression {
IdentifierExpr identifierExpr;
TemplateExpr templateExpr;
LiteralExpr literalExpr;
CssExpr cssExpr;
ArrayExpr arrayExpr;

    public TemplateExpr getTemplateExpr() {
        return templateExpr;
    }

    public void setTemplateExpr(TemplateExpr templateExpr) {
        this.templateExpr = templateExpr;
    }

    public IdentifierExpr getIdentifierExpr() {
        return identifierExpr;
    }

    public void setIdentifierExpr(IdentifierExpr identifierExpr) {
        this.identifierExpr = identifierExpr;
    }

    public LiteralExpr getLiteralExpr() {
        return literalExpr;
    }

    public void setLiteralExpr(LiteralExpr literalExpr) {
        this.literalExpr = literalExpr;
    }

    public CssExpr getCssExpr() {
        return cssExpr;
    }

    public void setCssExpr(CssExpr cssExpr) {
        this.cssExpr = cssExpr;
    }

    public ArrayExpr getArrayExpr() {
        return arrayExpr;
    }

    public void setArrayExpr(ArrayExpr arrayExpr) {
        this.arrayExpr = arrayExpr;
    }

    @Override
    public String toString() {
        if(identifierExpr!=null){
            return "\nExpression{" +
                    "\nidentifierExpr=" + identifierExpr+
                    "\n} ";
        }else if(templateExpr!=null){
            return "\nExpression{" +
                    "\ntemplateExpr=" + templateExpr+
                    "\n} ";
        }else if(literalExpr!=null){
            return "\nExpression{" +
                    "\ntemplateExpr=" + literalExpr+
                    "\n} ";
        }else if(cssExpr!=null){
            return "\nExpression{" +
                    "\ncssExpr=" + cssExpr+
                    "\n} ";
        }else {
            return "\nExpression{" +
                    "\narrayExpr=" + arrayExpr+
                    "\n} ";
        }
    }
}
