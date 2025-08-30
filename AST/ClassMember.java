package AST;

public class ClassMember implements AST_Node {
    VariableDeclaration variableDeclaration;
    FunctionDeclaration  functionDeclaration;
    Constructor constructor;

    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    @Override
    public String toString() {
        if(variableDeclaration!=null) {
            return "ClassMember{" +
                    "\n variableDeclaration= " + variableDeclaration +
                    "\n }";
        }
          else if (functionDeclaration!=null){
            return "ClassMember{" +
                    "\n functionDeclaration= " + functionDeclaration +
                    "\n }";}
          else
            return "ClassMember{" +
                    "\n Constructor= " + constructor +
                    "\n }";

    }
}
