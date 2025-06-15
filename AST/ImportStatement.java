package AST;

public class ImportStatement implements AST_Node{
   String IMPORT;
    String ID;
    String FROM;
    String STRING_LITERAL;


    public String getIMPORT() {
        return IMPORT;
    }

    public void setIMPORT(String IMPORT) {
        this.IMPORT = IMPORT;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFROM() {
        return FROM;
    }

    public void setFROM(String FROM) {
        this.FROM = FROM;
    }

    public String getSTRING_LITERAL() {
        return STRING_LITERAL;
    }

    public void setSTRING_LITERAL(String STRING_LITERAL) {
        this.STRING_LITERAL = STRING_LITERAL;
    }
    @Override
    public String toString() {

            return "ImportStatement{" +
                    "\n IMPORT= " + IMPORT +
                    "\n ID=" + ID +
                    "\n FROM=" + FROM +
                    "\n STRING_LITERAL=" + STRING_LITERAL +
                    "\n }";

    }

}
