package AST;

public class ObjectFieldInArray implements AST_Node {
    String Id;
    Literal literal;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        if(literal==null){
            return "ObjectFieldInArray{" +
                    "Id='" + Id + '\'' +
                    '}';
        }else{
            return "ObjectFieldInArray{" +
                    "Id='" + Id + '\'' +
                    ", literal=" + literal +
                    '}';
        }
    }
}
