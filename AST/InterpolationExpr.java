package AST;

public class InterpolationExpr implements AST_Node{
    String InterpolationId;
    String InterpolationString;
    String InterpolationNumber;
    InterpolationFullExpr interpolationFullExpr;

    public String getInterpolationId() {
        return InterpolationId;
    }

    public void setInterpolationId(String interpolationId) {
        InterpolationId = interpolationId;
    }

    public String getInterpolationString() {
        return InterpolationString;
    }

    public void setInterpolationString(String interpolationString) {
        InterpolationString = interpolationString;
    }

    public String getInterpolationNumber() {
        return InterpolationNumber;
    }

    public void setInterpolationNumber(String interpolationNumber) {
        InterpolationNumber = interpolationNumber;
    }

    public InterpolationFullExpr getInterpolationFullExpr() {
        return interpolationFullExpr;
    }

    public void setInterpolationFullExpr(InterpolationFullExpr interpolationFullExpr) {
        this.interpolationFullExpr = interpolationFullExpr;
    }

    @Override
    public String toString() {
        if(InterpolationId!=null)
        {
            return "InterpolationExpr{" +
                    "InterpolationId='" + InterpolationId + '\'' +
                    '}';
        }else if(InterpolationString!=null)
        {
            return "InterpolationExpr{" +
                    "InterpolationString='" + InterpolationString + '\'' +
                    '}';
        } else if (interpolationFullExpr!=null) {
            return "InterpolationExpr{" +
                    "interpolationFullExpr='" + interpolationFullExpr + '\'' +
                    '}';
        } else {
            return "InterpolationExpr{" +
                    "InterpolationNumber='" + InterpolationNumber + '\'' +
                    '}';
        }
    }
}
