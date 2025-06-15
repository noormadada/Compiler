package AST;

public class Literal implements AST_Node {
    String  stringLiteral;
    String number ;
    String trueId;
    String falseId;

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getFalseId() {
        return falseId;
    }

    public void setFalseId(String falseId) {
        this.falseId = falseId;
    }

    public String getTrueId() {
        return trueId;
    }

    public void setTrueId(String trueId) {
        this.trueId = trueId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if(stringLiteral!=null){
            return "\nLiteral{" +
                    "\nstringLiteral='" + stringLiteral + '\'' +
                    "\n }";
        } else if (number!=null) {
            return "\nLiteral{" +
                    "\nnumber='" + number + '\'' +
                    "\n }";
        } else if (trueId!=null) {
            return "\nLiteral{" +
                    "\ntrueId='" + trueId + '\'' +
                    "\n }";
        }else {
            return "\nLiteral{" +
                    "\nfalseId='" + falseId + '\'' +
                    "\n }";
        }
    }
}
