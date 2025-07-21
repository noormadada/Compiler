package AST;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration implements AST_Node {
    ParameterList parameterList;
    String ANY;
    String VOID;
    Block block;
    List<String> Id=new ArrayList<>();

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public String getANY() {
        return ANY;
    }

    public void setANY(String ANY) {
        this.ANY = ANY;
    }

    public String getVOID() {
        return VOID;
    }

    public void setVOID(String VOID) {
        this.VOID = VOID;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public List<String> getId() {
        return Id;
    }

    public void setId(List<String> id) {
        Id = id;
    }

    @Override
    public String toString() {
        if(parameterList!=null){
            if(ANY!=null){
            return "FunctionDeclaration{" +
                    "Id='" + Id + '\'' +
                    "parameterList='" + parameterList + '\'' +
                    "Any='" +ANY+ '\'' +
                    "void='" + "" + '\'' +
                    ", block=" + block +
                    '}';
               }
            else if(VOID!=null){
                return "FunctionDeclaration{" +
                        "Id='" + Id + '\'' +
                        "parameterList='" + parameterList + '\'' +
                        "Any='" + ""+ '\'' +
                        "void='" + VOID + '\'' +
                        ", block=" + block +
                        '}';
            }
             else return "FunctionDeclaration{" +
                    "Id='" + Id + '\'' +
                    ", parameterList=" + parameterList +
                    ", block=" + block +
                    '}';

              }
        else{
            if(ANY!=null){
                return "FunctionDeclaration{" +
                        "Id='" + Id + '\'' +
                        "parameterList='" + "" + '\'' +
                        "Any='" +ANY+ '\'' +
                        "void='" + "" + '\'' +
                        ", block=" + block +
                        '}';
            }
            else if(VOID!=null){
                return "FunctionDeclaration{" +
                        "Id='" + Id + '\'' +
                        "parameterList='" + "" + '\'' +
                        "Any='" + ""+ '\'' +
                        "void='" + VOID + '\'' +
                        ", block=" + block +
                        '}';
            }
            else return "FunctionDeclaration{" +
                        "Id='" + Id + '\'' +
                        ", parameterList=" + "" +
                        ", block=" + block +
                        '}';

        }
    }
}
