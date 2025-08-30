package AST;

public class ObjectExpr extends Expression implements AST_Node {
    ObjectLiteral objectLiteral;

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    @Override
    public String toString() {
        return "ObjectExpr{" +
                "objectLiteral=" + objectLiteral +
                '}';
    }
}
