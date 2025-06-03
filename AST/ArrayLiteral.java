package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiteral {
List<ArrayElement> arrayElement=new ArrayList<>();

    public List<ArrayElement> getArrayElement() {
        return arrayElement;
    }

    public void setArrayElement(List<ArrayElement> arrayElement) {
        this.arrayElement = arrayElement;
    }

    @Override
    public String toString() {
        return "ArrayLiteral{" +
                "arrayElement=" + arrayElement +
                '}';
    }
}
