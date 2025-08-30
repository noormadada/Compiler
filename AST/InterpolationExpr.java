package AST;

public class InterpolationExpr implements AST_Node{
    String InterpolationId;
    String InterpolationString;
    String InterpolationNumber;
    String INTERPOLATION_NTERROGATIVE;
    String INTERPOLATION_COLON;
    InterpolationFullExpr interpolationFullExpr;


    public String getINTERPOLATION_NTERROGATIVE() {
        return INTERPOLATION_NTERROGATIVE;
    }

    public String getINTERPOLATION_COLON() {
        return INTERPOLATION_COLON;
    }

    public void setINTERPOLATION_COLON(String INTERPOLATION_COLON) {
        this.INTERPOLATION_COLON = INTERPOLATION_COLON;
    }

    public void setINTERPOLATION_NTERROGATIVE(String INTERPOLATION_NTERROGATIVE) {
        this.INTERPOLATION_NTERROGATIVE = INTERPOLATION_NTERROGATIVE;
    }

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
        }  else if (INTERPOLATION_NTERROGATIVE!=null) {
            return "InterpolationExpr{" +
                    "INTERPOLATION_NTERROGATIVE='" + INTERPOLATION_NTERROGATIVE + '\'' +
                    '}';
        }  else if (INTERPOLATION_COLON!=null) {
            return "InterpolationExpr{" +
                    "INTERPOLATION_COLON='" + INTERPOLATION_COLON + '\'' +
                    '}';
        } else {
            return "InterpolationExpr{" +
                    "InterpolationNumber='" + InterpolationNumber + '\'' +
                    '}';
        }
    }
}
