package AST;

import java.util.ArrayList;
import java.util.List;

public class AngularFile implements AST_Node {
    List<ImportStatement> importstatement = new ArrayList<>();
    Decorator decorator;
    List<ClassDeclaration> classDeclaration=new ArrayList<>();


    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public List<ImportStatement> getImportstatement() {
        return importstatement;
    }

    public void setImportstatement(List<ImportStatement> importstatement) {
        this.importstatement = importstatement;
    }

    public List<ClassDeclaration> getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(List<ClassDeclaration> classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        if(importstatement.isEmpty())
            return "AngularFile{" +
                    "\n importstatement= " + " " +
                    "\n decorator=" + decorator +
                    "\n classDeclaration=" + classDeclaration +
                    "\n }";
        else
        return "AngularFile{" +
                "\n importstatement= " + importstatement +
                "\n decorator=" + decorator +
                "\n classDeclaration=" + classDeclaration +
                "\n }";
    }
}
