package AST;

import java.util.ArrayList;
import java.util.List;

public class Parameter implements AST_Node {
    List<String> id=new ArrayList<>();
  String PRIVATE;
  String ANY;

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public String getPRIVATE() {
        return PRIVATE;
    }

    public void setPRIVATE(String PRIVATE) {
        this.PRIVATE = PRIVATE;
    }

    public String getANY() {
        return ANY;
    }

    public void setANY(String ANY) {
        this.ANY = ANY;
    }
    @Override
    public String toString() {
        if(PRIVATE!=null){
            if(ANY!=null){
                return "FunctionDeclaration{" +
                        "PRIVATE='" + PRIVATE + '\'' +
                        ", id=" + id +
                        ", ANY=" + ANY +

                        '}';

                }
            else {
                return "FunctionDeclaration{" +
                        "PRIVATE='" + PRIVATE + '\'' +
                        ", id=" + id +
                        ", ANY=" + " " +

                        '}';

             }

        }else{
            if(ANY!=null){
                return "FunctionDeclaration{" +
                        "PRIVATE='" + "" + '\'' +
                        ", id=" + id +
                        ", ANY=" + ANY +

                        '}';

            }
            else {
                return "FunctionDeclaration{" +
                        "PRIVATE='" + "" + '\'' +
                        ", id=" + id +
                        ", ANY=" + " " +

                        '}';

            }
        }
    }

}
