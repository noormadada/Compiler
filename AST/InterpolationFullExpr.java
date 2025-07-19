package AST;

import java.util.ArrayList;
import java.util.List;

public class InterpolationFullExpr {
    List<String> interpolationId =new ArrayList<>();

    public List<String> getInterpolationId() {
        return interpolationId;
    }

    public void setInterpolationId(List<String> interpolationId) {
        this.interpolationId = interpolationId;
    }

    @Override
    public String toString() {
        return "InterpolationFullExpr{" +
                "interpolationId=" + interpolationId +
                '}';
    }
}
