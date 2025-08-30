package AST;

import java.util.ArrayList;
import java.util.List;

public class Constructor implements AST_Node {
    ParameterList parameterList;
    String ANY;
    String VOID;
    Block block;
    String Id;
    String Constructor;

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

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getConstructor() {
        return Constructor;
    }

    public void setConstructor(String constructor) {
        Constructor = constructor;
    }

    @Override
    public String toString() {
        if(parameterList!=null){
            if(ANY!=null){
                return "Constructor{" +
                        "constructor" + Constructor+
                        "parameterList='" + parameterList + '\'' +
                        "Any='" +ANY+ '\'' +
                        "void='" + "" + '\'' +
                        ", block=" + block +
                        '}';
            }
            else if(VOID!=null){
                return "Constructor{" +
                        "constructor" + Constructor+
                        "parameterList='" + parameterList + '\'' +
                        "Any='" + ""+ '\'' +
                        "void='" + VOID + '\'' +
                        ", block=" + block +
                        '}';
            }
            else if(Id!=null){
                return "Constructor{" +
                        "constructor" + Constructor+
                        "parameterList='" + parameterList + '\'' +
                        "Any='" + ""+ '\'' +
                        "ID='" + Id + '\'' +
                        ", block=" + block +
                        '}';
            }

            else return "Constructor{" +
                        "constructor" + Constructor+
                        "Id='" + Id + '\'' +
                        ", parameterList=" + parameterList +
                        ", block=" + block +
                        '}';

        }
        else{
            if(ANY!=null){
                return "Constructor{" +
                        "constructor" + Constructor+

                        "parameterList='" + "" + '\'' +
                        "Any='" +ANY+ '\'' +
                        "void='" + "" + '\'' +
                        ", block=" + block +
                        '}';
            }
            else if(VOID!=null){
                return "Constructor{" +
                        "constructor" + Constructor+
                        "parameterList='" + "" + '\'' +
                        "Any='" + ""+ '\'' +
                        "void='" + VOID + '\'' +
                        ", block=" + block +
                        '}';
            }
            else if(Id!=null){
                return "Constructor{" +
                        "constructor" + Constructor+
                        "Id='" + Id + '\'' +
                        "parameterList='" + "" + '\'' +
                        "Any='" + ""+ '\'' +
                        ", block=" + block +
                        '}';
            }
            else return "Constructor{" +
                        "constructor" + Constructor+
                        ", parameterList=" + " " +
                        ", block=" + block +
                        '}';

        }
    }
}
