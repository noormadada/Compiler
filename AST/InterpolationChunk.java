package AST;

public class InterpolationChunk extends HtmlChunk implements AST_Node{
    Interpolation interpolation;

    public Interpolation getInterpolation() {
        return interpolation;
    }

    public void setInterpolation(Interpolation interpolation) {
        this.interpolation = interpolation;
    }

    @Override
    public String toString() {
        return "InterpolationChunk{" +
                "interpolation=" + interpolation +
                '}';
    }
}
