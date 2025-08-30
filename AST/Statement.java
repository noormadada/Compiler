package AST;

public class Statement implements AST_Node{
    Block block;
    AssignmentStatement assignmentStatement;

    MethodcallStatment methodcallStatment;
    ReturnStatement returnStatement;
    Ifstatement ifstatement;
    ConstDeclaration constDeclaration;
    ExpressionStatement expressionStatement;
    VariableDeclaration variableDeclaration;
    FunctionDeclaration functionDeclaration;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public AssignmentStatement getAssignmentStatement() {
        return assignmentStatement;
    }

    public void setAssignmentStatement(AssignmentStatement assignmentStatement) {
        this.assignmentStatement = assignmentStatement;
    }

    public MethodcallStatment getMethodcallStatment() {
        return methodcallStatment;
    }

    public void setMethodcallStatment(MethodcallStatment methodcallStatment) {
        this.methodcallStatment = methodcallStatment;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    public Ifstatement getIfstatement() {
        return ifstatement;
    }

    public void setIfstatement(Ifstatement ifstatement) {
        this.ifstatement = ifstatement;
    }

    public ConstDeclaration getConstDeclaration() {
        return constDeclaration;
    }

    public void setConstDeclaration(ConstDeclaration constDeclaration) {
        this.constDeclaration = constDeclaration;
    }

    public ExpressionStatement getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(ExpressionStatement expressionStatement) {
        this.expressionStatement = expressionStatement;
    }

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
        if(block != null){
            return "HtmlTag{" +
                    ", block='" + block + '\'' +
                    '}';
        } else if (assignmentStatement != null) {
            return "HtmlTag{" +
                    ", assignmentStatement='" + assignmentStatement + '\'' +
                    '}';
        } else if (methodcallStatment != null) {
            return "HtmlTag{" +
                    ", methodcallStatment='" + methodcallStatment + '\'' +
                    '}';
        } else if (returnStatement != null) {
            return "HtmlTag{" +
                    ", returnStatement='" + returnStatement + '\'' +
                    '}';
        } else if (ifstatement != null) {
            return "HtmlTag{" +
                    ", ifstatement='" + ifstatement + '\'' +
                    '}';
        } else if (constDeclaration != null) {
            return "HtmlTag{" +
                    ", constDeclaration='" + constDeclaration + '\'' +
                    '}';
        } else if (expressionStatement != null) {
            return "HtmlTag{" +
                    ", expressionStatement='" + expressionStatement + '\'' +
                    '}';
        } else if (variableDeclaration != null) {
            return "HtmlTag{" +
                    ", variableDeclaration='" + variableDeclaration + '\'' +
                    '}';
        }
            return "HtmlTag{" +
                    ", functionDeclaration='" + functionDeclaration + '\'' +
                    '}';

    }
}
