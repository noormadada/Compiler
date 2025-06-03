package AST;

public class StylesField extends ObjectField{
    String STYLES;
    StyleArray styleArray;

    public String getSTYLES() {
        return STYLES;
    }

    public void setSTYLES(String STYLES) {
        this.STYLES = STYLES;
    }


    public StyleArray getStyleArray() {
        return styleArray;
    }

    public void setStyleArray(StyleArray styleArray) {
        this.styleArray = styleArray;
    }
    @Override
    public String toString() {

        return "StylesField{" +
                "\n STYLES= " + STYLES +
                "\n styleArray=" + styleArray +
                "\n }";

    }
}
