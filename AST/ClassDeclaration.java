package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration {
  String EXPORT;
    String CLASS;
    String ID;
    List<ClassMember> classMember = new ArrayList<>();


    public String getEXPORT() {
        return EXPORT;
    }

    public void setEXPORT(String EXPORT) {
        this.EXPORT = EXPORT;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<ClassMember> getClassMember() {
        return classMember;
    }

    public void setClassMember(List<ClassMember> classMember) {
        this.classMember = classMember;
    }
    @Override
    public String toString() {
        if(classMember.isEmpty())
            return "ClassDeclaration{" +
                    "\n EXPORT= " + EXPORT +
                    "\n CLASS=" + CLASS +
                    "\n ID=" + ID +
                    "\n classMember=" + "" +
              "\n }";
          else
            return "ClassDeclaration{" +
                    "\n EXPORT= " + EXPORT +
                    "\n CLASS=" + CLASS +
                    "\n ID=" + ID +
                    "\n classMember=" + classMember +
                    "\n }";
    }
}
