package AST;

import java.util.ArrayList;
import java.util.List;

public class ParameterList implements AST_Node {
List<Parameter> parameterList=new ArrayList<>();

    public List<Parameter> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<Parameter> parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        return "ParameterList{" +
                "parameterList=" + parameterList +
                '}';
    }
}
