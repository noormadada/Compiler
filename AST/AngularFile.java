package AST;

import java.util.ArrayList;
import java.util.List;

public class AngularFile implements AST_Node {
    List<ImportStatement> importstatement = new ArrayList<>();
    List<Decorator> decorator =  new ArrayList<>();
    List<ClassDeclaration> classDeclaration=new ArrayList<>();
    List<ConstExportStatement> constExportStatement= new ArrayList<>();
    List<ExpressionStatement> expressionStatement= new ArrayList<>();


    public List<Decorator> getDecorator() {
        return decorator;
    }

    public void setDecorator(List<Decorator> decorator) {
        this.decorator = decorator;
    }

    public List<ConstExportStatement> getConstExportStatement() {
        return constExportStatement;
    }

    public void setConstExportStatement(List<ConstExportStatement> constExportStatement) {
        this.constExportStatement = constExportStatement;
    }

    public List<ExpressionStatement> getExpressionStatement() {
        return expressionStatement;
    }

    public void setExpressionStatement(List<ExpressionStatement> expressionStatement) {
        this.expressionStatement = expressionStatement;
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

        if(!importstatement.isEmpty()){
            if(!decorator.isEmpty()){
               if(!classDeclaration.isEmpty()) {
                   return "AngularFile{" +
                           "importstatement=" + importstatement +
                           ", decorator=" + decorator +
                           ", classDeclaration=" + classDeclaration +
                           '}';

               } else if (!constExportStatement.isEmpty()) {
                   return "AngularFile{" +
                           "importstatement=" + importstatement +
                           ", decorator=" + decorator +
                           ", constExportStatement=" + constExportStatement +
                           '}';

               } else if(!expressionStatement.isEmpty())  {
                   return "AngularFile{" +
                           "importstatement=" + importstatement +
                           ", decorator=" + decorator +
                           ", expressionStatement=" + expressionStatement +
                           '}';

               }else {
                   return "AngularFile{" +
                           "importstatement=" + importstatement +
                           ", decorator=" + decorator +
                           '}';

               }
            }else {
                if (!classDeclaration.isEmpty()) {
                    return "AngularFile{" +
                            "importstatement=" + importstatement +
                            ", classDeclaration=" + classDeclaration +
                            '}';

                } else if (!constExportStatement.isEmpty()) {
                    return "AngularFile{" +
                            "importstatement=" + importstatement +
                            ", constExportStatement=" + constExportStatement +
                            '}';

                } else if (!expressionStatement.isEmpty()) {
                    return "AngularFile{" +
                            "importstatement=" + importstatement +
                            ", expressionStatement=" + expressionStatement +
                            '}';

                } else {
                    return "AngularFile{" +
                            "importstatement=" + importstatement +
                            '}';

                }
            }

            }else{
                if(!decorator.isEmpty()){
                    if(!classDeclaration.isEmpty()) {
                        return "AngularFile{" +
                                ", decorator=" + decorator +
                                ", classDeclaration=" + classDeclaration +
                                '}';

                    } else if (!constExportStatement.isEmpty()) {
                        return "AngularFile{" +
                                ", decorator=" + decorator +
                                ", constExportStatement=" + constExportStatement +
                                '}';

                    } else if(!expressionStatement.isEmpty())  {
                        return "AngularFile{" +
                                ", decorator=" + decorator +
                                ", expressionStatement=" + expressionStatement +
                                '}';

                    }else {
                        return "AngularFile{" +
                                ", decorator=" + decorator +
                                '}';

                    }
                }else{
                    if(!classDeclaration.isEmpty()) {
                        return "AngularFile{" +
                                ", classDeclaration=" + classDeclaration +
                                '}';

                    } else if (!constExportStatement.isEmpty()) {
                        return "AngularFile{" +
                                ", constExportStatement=" + constExportStatement +
                                '}';

                    } else if(!expressionStatement.isEmpty())  {
                        return "AngularFile{" +
                                ", expressionStatement=" + expressionStatement +
                                '}';

                    }else {
                        return "AngularFile{" +
                                '}';

                    }

                }
            }
        }
    }

