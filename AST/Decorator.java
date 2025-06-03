package AST;

public class Decorator {
    String AT;
    String ID;
    ObjectLiteral  objectLiteral;


    public String getAT() {
        return AT;
    }

    public void setAT(String AT) {
        this.AT = AT;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }
    @Override
    public String toString() {

        return "Decorator{" +
                "\n AT= " + AT +
                "\n ID=" + ID +
                "\n ObjectLiteral=" + objectLiteral +
                "\n }";

    }
}
