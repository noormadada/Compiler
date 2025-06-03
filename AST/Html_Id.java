package AST;

public class Html_Id extends HtmlChunk {
    String TEMPLATE_ID;

    public String getTEMPLATE_ID() {
        return TEMPLATE_ID;
    }

    public void setTEMPLATE_ID(String TEMPLATE_ID) {
        this.TEMPLATE_ID = TEMPLATE_ID;
    }

    @Override
    public String toString() {
        return "Html_Id{" +
                "TEMPLATE_ID='" + TEMPLATE_ID + '\'' +
                '}';
    }
}
