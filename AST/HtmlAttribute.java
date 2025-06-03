package AST;

public class HtmlAttribute {
    String TEMPLATE_ID;
    String ANGULAR_PROPERTY_BINDING;
    String ANGULAR_EVENT_BINDING;
    String ANGULAR_TWO_WAY_BINDING;
    String ANGULAR_STRUCTURAL_DIRECTIVE;
    String TEMPLATE_EQUALS;
    AttributeValue attributeValue  ;

    public String getANGULAR_PROPERTY_BINDING() {
        return ANGULAR_PROPERTY_BINDING;
    }

    public void setANGULAR_PROPERTY_BINDING(String ANGULAR_PROPERTY_BINDING) {
        this.ANGULAR_PROPERTY_BINDING = ANGULAR_PROPERTY_BINDING;
    }

    public String getTEMPLATE_ID() {
        return TEMPLATE_ID;
    }

    public void setTEMPLATE_ID(String TEMPLATE_ID) {
        this.TEMPLATE_ID = TEMPLATE_ID;
    }

    public String getANGULAR_EVENT_BINDING() {
        return ANGULAR_EVENT_BINDING;
    }

    public void setANGULAR_EVENT_BINDING(String ANGULAR_EVENT_BINDING) {
        this.ANGULAR_EVENT_BINDING = ANGULAR_EVENT_BINDING;
    }

    public String getANGULAR_TWO_WAY_BINDING() {
        return ANGULAR_TWO_WAY_BINDING;
    }

    public void setANGULAR_TWO_WAY_BINDING(String ANGULAR_TWO_WAY_BINDING) {
        this.ANGULAR_TWO_WAY_BINDING = ANGULAR_TWO_WAY_BINDING;
    }

    public String getANGULAR_STRUCTURAL_DIRECTIVE() {
        return ANGULAR_STRUCTURAL_DIRECTIVE;
    }

    public void setANGULAR_STRUCTURAL_DIRECTIVE(String ANGULAR_STRUCTURAL_DIRECTIVE) {
        this.ANGULAR_STRUCTURAL_DIRECTIVE = ANGULAR_STRUCTURAL_DIRECTIVE;
    }

    public String getTEMPLATE_EQUALS() {
        return TEMPLATE_EQUALS;
    }

    public void setTEMPLATE_EQUALS(String TEMPLATE_EQUALS) {
        this.TEMPLATE_EQUALS = TEMPLATE_EQUALS;
    }

    public AttributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }
    @Override
    public String toString() {
        if (TEMPLATE_ID != null) {
            return "HtmlAttribute{" +
                    "\n TEMPLATE_ID= " + TEMPLATE_ID +
                    "\n TEMPLATE_EQUALS= " + TEMPLATE_EQUALS +

                    "\n attributeValue=" + attributeValue +
                    "\n }";
        }
        if (ANGULAR_PROPERTY_BINDING != null) {
            return "HtmlAttribute{" +
                    "\n ANGULAR_PROPERTY_BINDING= " + ANGULAR_PROPERTY_BINDING +
                    "\n TEMPLATE_EQUALS= " + TEMPLATE_EQUALS +

                    "\n attributeValue=" + attributeValue +
                    "\n }";
        }
        if (ANGULAR_EVENT_BINDING != null) {
            return "HtmlAttribute{" +
                    "\n ANGULAR_PROPERTY_BINDING= " + ANGULAR_EVENT_BINDING +
                    "\n TEMPLATE_EQUALS= " + TEMPLATE_EQUALS +

                    "\n attributeValue=" + attributeValue +
                    "\n }";
        }
        if (ANGULAR_TWO_WAY_BINDING != null) {
            return "HtmlAttribute{" +
                    "\n ANGULAR_PROPERTY_BINDING= " + ANGULAR_TWO_WAY_BINDING +
                    "\n TEMPLATE_EQUALS= " + TEMPLATE_EQUALS +

                    "\n attributeValue=" + attributeValue +
                    "\n }";
        }
        return "HtmlAttribute{" +
                "\n ANGULAR_PROPERTY_BINDING= " + ANGULAR_STRUCTURAL_DIRECTIVE +
                "\n TEMPLATE_EQUALS= " + TEMPLATE_EQUALS +
                "\n attributeValue=" + attributeValue +
                "\n }";
    }
}
