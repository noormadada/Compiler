package AST;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration implements AST_Node {
    String EXPORT;
    String CLASS;
    List<String> ID=new ArrayList<>();
    String implementsWord;
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

    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }

    public String getImplementsWord() {
        return implementsWord;
    }

    public void setImplementsWord(String implementsWord) {
        this.implementsWord = implementsWord;
    }

    public List<ClassMember> getClassMember() {
        return classMember;
    }

    public void setClassMember(List<ClassMember> classMember) {
        this.classMember = classMember;
    }
    @Override
    public String toString() {
        if(classMember.isEmpty()) {
            if (implementsWord != null) {
                return "ClassDeclaration{" +
                        "\n EXPORT= " + EXPORT +
                        "\n CLASS=" + CLASS +
                        "\n ID=" + ID +
                        "\n implements " + implementsWord +
                        "\n }";
            } else {
                return "ClassDeclaration{" +
                        "\n EXPORT= " + EXPORT +
                        "\n CLASS=" + CLASS +
                        "\n ID=" + ID +
                        "\n }";
            }
        }
        else{
            if(implementsWord!=null){
                return "ClassDeclaration{" +
                        "\n EXPORT= " + EXPORT +
                        "\n CLASS=" + CLASS +
                        "\n ID=" + ID +
                        "\n classMember=" + classMember +
                        "\n implements " + implementsWord +
                        "\n }";
            }else {
                return "ClassDeclaration{" +
                        "\n EXPORT= " + EXPORT +
                        "\n CLASS=" + CLASS +
                        "\n ID=" + ID +
                        "\n classMember=" + classMember +
                        "\n }";
            }
        }
    }
}
