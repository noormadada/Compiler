package AST;

public abstract class Expression {
    ThisExpr thisExpr;
    ThisPropertyExpr thisPropertyExpr;
    ThisCallExpr thisCallExpr;
    IdentifierExpr identifierExpr;
    IdentifierExpr2 identifierExpr2;
    IdentifierExpr3 identifierExpr3;
    TemplateExpr templateExpr;
    LiteralExpr literalExpr;
    CssExpr cssExpr;
    ArrayExpr arrayExpr;
    ObjectExpr objectExpr;
    SpreadObjectExpr spreadObjectExpr;
    PropertyAccess propertyAccess;
    ArrayAccessExpr arrayAccessExpr;
    CallExpr callExpr;
    UnaryExpr unaryExpr;
    BinaryExpr binaryExpr;
    ParenthesizedExpr parenthesizedExpr;

    public IdentifierExpr getIdentifierExpr() {
        return identifierExpr;
    }

    public void setIdentifierExpr(IdentifierExpr identifierExpr) {
        this.identifierExpr = identifierExpr;
    }

    public IdentifierExpr2 getIdentifierExpr2() {
        return identifierExpr2;
    }

    public void setIdentifierExpr2(IdentifierExpr2 identifierExpr2) {
        this.identifierExpr2 = identifierExpr2;
    }

    public IdentifierExpr3 getIdentifierExpr3() {
        return identifierExpr3;
    }

    public void setIdentifierExpr3(IdentifierExpr3 identifierExpr3) {
        this.identifierExpr3 = identifierExpr3;
    }

    public TemplateExpr getTemplateExpr() {
        return templateExpr;
    }

    public void setTemplateExpr(TemplateExpr templateExpr) {
        this.templateExpr = templateExpr;
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

    public ObjectExpr getObjectExpr() {
        return objectExpr;
    }

    public void setObjectExpr(ObjectExpr objectExpr) {
        this.objectExpr = objectExpr;
    }

    public SpreadObjectExpr getSpreadObjectExpr() {
        return spreadObjectExpr;
    }

    public void setSpreadObjectExpr(SpreadObjectExpr spreadObjectExpr) {
        this.spreadObjectExpr = spreadObjectExpr;
    }

    public PropertyAccess getPropertyAccess() {
        return propertyAccess;
    }

    public void setPropertyAccess(PropertyAccess propertyAccess) {
        this.propertyAccess = propertyAccess;
    }

    public ArrayAccessExpr getArrayAccessExpr() {
        return arrayAccessExpr;
    }

    public void setArrayAccessExpr(ArrayAccessExpr arrayAccessExpr) {
        this.arrayAccessExpr = arrayAccessExpr;
    }

    public CallExpr getCallExpr() {
        return callExpr;
    }

    public void setCallExpr(CallExpr callExpr) {
        this.callExpr = callExpr;
    }

    public ThisExpr getThisExpr() {
        return thisExpr;
    }

    public void setThisExpr(ThisExpr thisExpr) {
        this.thisExpr = thisExpr;
    }

    public ThisPropertyExpr getThisPropertyExpr() {
        return thisPropertyExpr;
    }

    public void setThisPropertyExpr(ThisPropertyExpr thisPropertyExpr) {
        this.thisPropertyExpr = thisPropertyExpr;
    }

    public ThisCallExpr getThisCallExpr() {
        return thisCallExpr;
    }

    public void setThisCallExpr(ThisCallExpr thisCallExpr) {
        this.thisCallExpr = thisCallExpr;
    }

    public UnaryExpr getUnaryExpr() {
        return unaryExpr;
    }

    public void setUnaryExpr(UnaryExpr unaryExpr) {
        this.unaryExpr = unaryExpr;
    }

    public BinaryExpr getBinaryExpr() {
        return binaryExpr;
    }

    public void setBinaryExpr(BinaryExpr binaryExpr) {
        this.binaryExpr = binaryExpr;
    }

    public ParenthesizedExpr getParenthesizedExpr() {
        return parenthesizedExpr;
    }

    public void setParenthesizedExpr(ParenthesizedExpr parenthesizedExpr) {
        this.parenthesizedExpr = parenthesizedExpr;
    }

    @Override
    public String toString() {
        if(thisExpr!=null)
        return "Expression{" +
                "thisExpr=" + thisExpr +
                '}';
        else if (thisPropertyExpr!=null)
            return "Expression{" +
                    "thisPropertyExpr=" + thisPropertyExpr +
                    '}';
        else if (thisCallExpr!=null)
            return "Expression{" +
                    "thisCallExpr=" + thisCallExpr +
                    '}';
        else if (identifierExpr!=null)
            return "Expression{" +
                    "IdentifierExpr=" + identifierExpr +
                    '}';
        else if (identifierExpr2!=null)
            return "Expression{" +
                    "identifierExpr2=" + identifierExpr2 +
                    '}';
        else if (identifierExpr3!=null)
            return "Expression{" +
                    "identifierExpr3=" + identifierExpr3 +
                    '}';
        else if (literalExpr!=null)
            return "Expression{" +
                    "literalExpr=" + literalExpr +
                    '}';
        else if (templateExpr!=null)
            return "Expression{" +
                    "TemplateExpr=" + templateExpr +
                    '}';
        else if (cssExpr!=null)
            return "Expression{" +
                    "CssExpr=" + cssExpr +
                    '}';
        else if (arrayExpr!=null)
            return "Expression{" +
                    "ArrayExpr=" + arrayExpr +
                    '}';
        else if (objectExpr!=null)
            return "Expression{" +
                    "ObjectExpr=" + objectExpr +
                    '}';
        else if (spreadObjectExpr!=null)
            return "Expression{" +
                    "spreadObjectExpr=" + spreadObjectExpr +
                    '}';
        else if (propertyAccess!=null)
            return "Expression{" +
                    "PropertyAccess=" + propertyAccess +
                    '}';
        else if (arrayAccessExpr!=null)
            return "Expression{" +
                    "arrayAccessExpr=" + arrayAccessExpr +
                    '}';
        else if (callExpr!=null)
            return "Expression{" +
                    "CallExpr=" + callExpr +
                    '}';
        else if (unaryExpr!=null)
            return "Expression{" +
                    "UnaryExpr=" + unaryExpr +
                    '}';
        else if (binaryExpr!=null)
            return "Expression{" +
                    "BinaryExpr=" + binaryExpr +
                    '}';
        else
            return "Expression{" +
                    "ParenthesizedExpr=" + parenthesizedExpr +
                    '}';

    }
}
