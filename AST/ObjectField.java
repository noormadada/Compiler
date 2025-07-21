package AST;

public abstract class ObjectField implements AST_Node {
    TemplateField TemplateField ;
    StylesField StylesField;
    GenericField  GenericField;

    public AST.TemplateField getTemplateField() {
        return TemplateField;
    }

    public void setTemplateField(AST.TemplateField templateField) {
        TemplateField = templateField;
    }

    public AST.StylesField getStylesField() {
        return StylesField;
    }

    public void setStylesField(AST.StylesField stylesField) {
        StylesField = stylesField;
    }

    public AST.GenericField getGenericField() {
        return GenericField;
    }

    public void setGenericField(AST.GenericField genericField) {
        GenericField = genericField;
    }

    @Override
    public String toString() {
        if ( TemplateField != null) {
            return '\n' +
                    "TemplateField=" + TemplateField + '\n' ;
        }
        else if(StylesField != null){
            return '\n' +
                    ", StylesField=" + StylesField + '\n' +
                    '}';
        }else {
            return '\n' +
                    ", GenericField=" + GenericField + '\n' +
                    '}';
        }

    }
}
