package AST;

import java.util.ArrayList;
import java.util.List;

public class Ifstatement implements AST_Node{
    String IF;
    Expression expression;
    List<Statement> statement=new ArrayList<>();
    String ELSE;


    public String getIF() {
        return IF;
    }

    public void setIF(String IF) {
        this.IF = IF;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<Statement> getStatement() {
        return statement;
    }

    public void setStatement(List<Statement> statement) {
        this.statement = statement;
    }

    public String getELSE() {
        return ELSE;
    }

    public void setELSE(String ELSE) {
        this.ELSE = ELSE;
    }
    @Override
    public String toString() {

        return "Ifstatement{" +
                ", IF=" + IF +
                "expression='" + expression + '\'' +
                "statement='" + statement + '\'' +
                "ELSE='" + ELSE + '\'' +

                '}';
    }
}
