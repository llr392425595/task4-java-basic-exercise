package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> result = new ArrayList<>();
        for (String item : collection1) {
            if (collection2.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
