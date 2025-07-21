package AST;

public class VariableDeclaration implements AST_Node {
    String  ID ;
    Expression expression;
    Type type;
    String privateWord;


    public String getID() {
        return ID;
    }

    public String getPrivateWord() {
        return privateWord;
    }

    public void setPrivateWord(String privateWord) {
        this.privateWord = privateWord;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
        if(type!=null&&expression!=null){
            return "VariableDeclaration{" +
                    "\n ID= " + ID +
                    "\n expression= " + expression +
                    "\n type"+ type+
                    (privateWord!=null?"\n type"+privateWord :"")+
                    "\n }";
        } else if (type!=null&&expression==null) {
            return "VariableDeclaration{" +
                    "\n ID= " + ID +
                    "\n type"+ type+
                    (privateWord!=null?"\n type"+privateWord :"")+
                    "\n }";
        }else {
            return "VariableDeclaration{" +
                    "\n ID= " + ID +
                    "\n expression= " + expression +
                    (privateWord!=null?"\n type"+privateWord :"")+
                    "\n }";
        }
    }
}
