package Neetcode150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            String key = s.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // create a list of lists of the collected strings
        List<List<String>> output = new ArrayList<>();
        map.forEach((key, value) -> {
            output.add(value);
        });
        return output;
    }
}
