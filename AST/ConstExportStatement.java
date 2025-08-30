package AST;

public class ConstExportStatement implements AST_Node{
String EXPORT;
String CONST;
String ID;
Type type;
Expression expression;

    public String getEXPORT() {
        return EXPORT;
    }

    public void setEXPORT(String EXPORT) {
        this.EXPORT = EXPORT;
    }

    public String getCONST() {
        return CONST;
    }

    public void setCONST(String CONST) {
        this.CONST = CONST;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {

        return "ConstExportStatement{" +
                "EXPORT=" + EXPORT +

                "CONST=" + CONST +
                "ID=" + ID + '\'' +
                "type=" + type + '\'' +
                "expression='" + expression + '\'' +

                '}';
    }
}
