package AST;

public class Interpolation {
    InterpolationContent interpolationContent;

    public InterpolationContent getInterpolationContent() {
        return interpolationContent;
    }

    public void setInterpolationContent(InterpolationContent interpolationContent) {
        this.interpolationContent = interpolationContent;
    }

    @Override
    public String toString() {
        if (interpolationContent==null)
        {
            return "Interpolation{" +
                    '}';
        }else {
            return "Interpolation{" +
                    "interpolationContent=" + interpolationContent +
                    '}';
        }
    }
}
