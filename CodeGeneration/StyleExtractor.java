package CodeGeneration;

import java.util.regex.*;
import java.util.*;

public class StyleExtractor {
    public static List<String> extractAllStyles(String sourceCode) {
        List<String> stylesList = new ArrayList<>();
        Pattern pattern = Pattern.compile("styles\\s*:\\s*\\[\\s*`([\\s\\S]*?)`\\s*\\]", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(sourceCode);

        while (matcher.find()) {
            stylesList.add(matcher.group(1).trim());
        }
        return stylesList;
    }
}
