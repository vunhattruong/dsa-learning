package com.hackerrank;

/*

 */

import java.util.*;

public class MatchingStrings {
    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings (List<String> strings, List<String> queries) {
        // Write your code here
        Map<String, Integer> stringsMap = new HashMap<>();
        List<Integer>        results    = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if ( stringsMap.containsKey(strings.get(i)) ) {
                stringsMap.put(strings.get(i), stringsMap.get(strings.get(i)) + 1);
            } else {
                stringsMap.put(strings.get(i), 1);
            }
        }
        for (int i = 0; i < queries.size(); i++) {
            if ( stringsMap.containsKey(queries.get(i)) ) {
                results.add(stringsMap.get(queries.get(i)));
            }
            else {
                results.add(0);
            }
        }
        return results;
    }

    public static void main (String[] args) {
        MatchingStrings.matchingStrings(Arrays.asList("abcde"
            , "sdaklfj"
            , "asdjf"
            , "na"
            , "basdn"
            , "sdaklfj"
            , "asdjf"
            , "na"
            , "asdjf"
            , "na"
            , "basdn"
            , "sdaklfj"
            , "asdjf"), Arrays.asList("abcde"
            , "sdaklfj"
            , "asdjf"
            , "na"
            , "basdn"));
    }
}
