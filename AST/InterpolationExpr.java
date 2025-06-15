package AST;

public class InterpolationExpr implements AST_Node{
    String InterpolationId;
    String InterpolationString;
    String InterpolationNumber;

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
        }else {
            return "InterpolationExpr{" +
                    "InterpolationNumber='" + InterpolationNumber + '\'' +
                    '}';
        }
    }
}
