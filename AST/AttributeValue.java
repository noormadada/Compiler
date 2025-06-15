package AST;

public class AttributeValue implements AST_Node {
    String TEMPLATE_STRING;
    String TEMPLATE_ID;
    Interpolation  interpolation;


    public String getTEMPLATE_STRING() {
        return TEMPLATE_STRING;
    }

    public void setTEMPLATE_STRING(String TEMPLATE_STRING) {
        this.TEMPLATE_STRING = TEMPLATE_STRING;
    }

    public String getTEMPLATE_ID() {
        return TEMPLATE_ID;
    }

    public void setTEMPLATE_ID(String TEMPLATE_ID) {
        this.TEMPLATE_ID = TEMPLATE_ID;
    }

    public Interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(Interpolation interpolation) {
        this.interpolation = interpolation;
    }
    @Override
    public String toString() {
        if(TEMPLATE_STRING!=null) {
            return "AttributeValue{" +
                    "\n TEMPLATE_STRING= " + TEMPLATE_STRING +
                    "\n }";

        }
        else  if(TEMPLATE_ID!=null) {
            return "AttributeValue{" +
                    "\n TEMPLATE_ID= " + TEMPLATE_ID +
                    "\n }";

        } else
            return "AttributeValue{" +
                    "\n interpolation= " + interpolation +
                    "\n }";
    }
}
