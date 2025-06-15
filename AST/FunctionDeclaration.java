package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration implements AST_Node {
    String Id;
    ParameterList parameterList;
    List<Block> block=new ArrayList<>();

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public List<Block> getBlock() {
        return block;
    }

    public void setBlock(List<Block> block) {
        this.block = block;
    }

    @Override
    public String toString() {
        if(parameterList==null){
            return "FunctionDeclaration{" +
                    "Id='" + Id + '\'' +
                    ", block=" + block +
                    '}';
        }else{
            return "FunctionDeclaration{" +
                    "Id='" + Id + '\'' +
                    ", parameterList=" + parameterList +
                    ", block=" + block +
                    '}';
        }
    }
}
