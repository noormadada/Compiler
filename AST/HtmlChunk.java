package AST;

public abstract class HtmlChunk implements AST_Node {
HtmlElementChunk htmlElementChunk;
HtmlSelfClosingChunk htmlSelfClosingChunk;
InterpolationChunk interpolationChunk;
HtmlCloseTagChunk htmlCloseTagChunk;
Html_Id htmlId;
String TEMPLATE_TEXT;


    public String getTEMPLATE_TEXT() {
        return TEMPLATE_TEXT;
    }

    public void setTEMPLATE_TEXT(String TEMPLATE_TEXT) {
        this.TEMPLATE_TEXT = TEMPLATE_TEXT;
    }

    public HtmlElementChunk getHtmlElementChunk() {
        return htmlElementChunk;
    }

    public void setHtmlElementChunk(HtmlElementChunk htmlElementChunk) {
        this.htmlElementChunk = htmlElementChunk;
    }

    public HtmlSelfClosingChunk getHtmlSelfClosingChunk() {
        return htmlSelfClosingChunk;
    }

    public void setHtmlSelfClosingChunk(HtmlSelfClosingChunk htmlSelfClosingChunk) {
        this.htmlSelfClosingChunk = htmlSelfClosingChunk;
    }

    public InterpolationChunk getInterpolationChunk() {
        return interpolationChunk;
    }

    public void setInterpolationChunk(InterpolationChunk interpolationChunk) {
        this.interpolationChunk = interpolationChunk;
    }

    public HtmlCloseTagChunk getHtmlCloseTagChunk() {
        return htmlCloseTagChunk;
    }

    public void setHtmlCloseTagChunk(HtmlCloseTagChunk htmlCloseTagChunk) {
        this.htmlCloseTagChunk = htmlCloseTagChunk;
    }

    public Html_Id getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(Html_Id htmlId) {
        this.htmlId = htmlId;
    }

    @Override
    public String toString() {
        if(htmlElementChunk!=null){
            return "HtmlChunk{" +
                    "htmlElementChunk=" + htmlElementChunk +
                    '}';
        } else if (htmlCloseTagChunk!=null) {
            return "HtmlChunk{" +
                    "htmlCloseTagChunk=" + htmlCloseTagChunk +
                    '}';
        } else if (htmlSelfClosingChunk!=null) {
            return "HtmlChunk{" +
                    "htmlSelfClosingChunk=" + htmlSelfClosingChunk +
                    '}';
        } else if (interpolationChunk!=null) {
            return "HtmlChunk{" +
                    "interpolationChunk=" + interpolationChunk +
                    '}';
        }
        else if (TEMPLATE_TEXT!=null) {
            return "HtmlChunk{" +
                    "TEMPLATE_TEXT=" + TEMPLATE_TEXT +
                    '}';
        }
        else {
            return "HtmlChunk{" +
                    "htmlId=" + htmlId +
                    '}';
        }
    }
}
