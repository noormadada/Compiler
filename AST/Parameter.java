package AST;

import java.util.ArrayList;
import java.util.List;

public class Parameter {
    List<String> id=new ArrayList<>();

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "id=" + id +
                '}';
    }
}
