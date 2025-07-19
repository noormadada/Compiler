package AST;

public class ConstDeclaration implements AST_Node{
    String CONST ;
    String ID;
    Expression expression;

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

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    @Override
    public String toString() {

        return "ConstDeclaration{" +
                ", CONST=" + CONST +
                "ID='" + ID + '\'' +
                "expression='" + expression + '\'' +

                '}';
    }
}
