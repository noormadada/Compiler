package AST;

public class ArrayExpr extends  Expression{
    ArrayLiteral arrayLiteral;

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    @Override
    public String toString() {
        return "ArrayExpr{" +
                "arrayLiteral=" + arrayLiteral +
                '}';
    }
}
