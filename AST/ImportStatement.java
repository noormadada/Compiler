package AST;

public class ImportStatement implements AST_Node{
   String IMPORT;
    String ID;
    String FROM;
    String STRING_LITERAL;
    IdList idList ;

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

    public IdList getIdList() {
        return idList;
    }

    public void setIdList(IdList idList) {
        this.idList = idList;
    }

    @Override
    public String toString() {
        return "ImportStatement{" +
                "IMPORT='" + IMPORT + '\'' +
                ", ID='" + ID + '\'' +
                ", FROM='" + FROM + '\'' +
                ", STRING_LITERAL='" + STRING_LITERAL + '\'' +
                ", idList=" + idList +
                '}';
    }
}
