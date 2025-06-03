package AST;

public class ClassMember {
    VariableDeclaration variableDeclaration;
    FunctionDeclaration  functionDeclaration;

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
    @Override
    public String toString() {
        if(variableDeclaration!=null) {
            return "ClassMember{" +
                    "\n variableDeclaration= " + variableDeclaration +
                    "\n }";
        }
          else
            return "ClassMember{" +
                    "\n functionDeclaration= " + functionDeclaration +
                    "\n }";
    }
}
