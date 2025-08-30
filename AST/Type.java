package AST;

public class Type {
    String id;
    String any;
    String voidWord;

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVoidWord() {
        return voidWord;
    }

    public void setVoidWord(String voidWord) {
        this.voidWord = voidWord;
    }

    @Override
    public String toString() {
        if (id!=null){
            return "\n Type{" +
                    "\n id='" + id + '\'' +
                    "\n }";
        } else if (any!=null) {
            return "\n Type{" +
                    "\n any='" + any + '\'' +
                    "\n }";
        }else {
            return "\n Type{" +
                    "\n voidWord='" + voidWord + '\'' +
                    "\n }";
        }
    }
}
