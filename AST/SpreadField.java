package AST;

public class SpreadField implements AST_Node {

    String id;
    ObjectField objectField;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ObjectField getObjectField() {
        return objectField;
    }

    public void setObjectField(ObjectField objectField) {
        this.objectField = objectField;
    }

    @Override
    public String toString() {
        if(id == null)
        return "SpreadField{" +
                ", objectField=" + objectField +
                '}';
        else
            return "SpreadField{" +
                    "ID='" +  id + '\'' +
                    '}';

    }
}
