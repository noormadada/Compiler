package AST;

import java.util.ArrayList;
import java.util.List;

public class ObjectLiteral {
    List<ObjectField> objectField = new ArrayList<>();

    public List<ObjectField> getObjectField() {
        return objectField;
    }

    public void setObjectField(List<ObjectField> objectField) {
        this.objectField = objectField;
    }
    @Override
    public String toString() {

        return "ObjectLiteral{" +
                "\n objectField= " + objectField +
                "\n }";

    }
}
