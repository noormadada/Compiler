package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrayElement {
    List<ObjectFieldInArray> objectFieldInArrayList=new ArrayList<>();

    public List<ObjectFieldInArray> getObjectFieldInArrayList() {
        return objectFieldInArrayList;
    }

    public void setObjectFieldInArrayList(List<ObjectFieldInArray> objectFieldInArrayList) {
        this.objectFieldInArrayList = objectFieldInArrayList;
    }

    @Override
    public String toString() {
        return "ArrayElement{" +
                "objectFieldInArrayList=" + objectFieldInArrayList +
                '}';
    }
}
