package AST;

public class HtmlSelfClosingChunk extends HtmlChunk{
    SelfClosingTag selfClosingTag;

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    @Override
    public String toString() {
        return "HtmlSelfClosingChunk{" +
                "selfClosingTag=" + selfClosingTag +
                '}';
    }
}
