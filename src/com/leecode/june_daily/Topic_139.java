package com.leecode.june_daily;

import java.util.List;

public class Topic_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        if ("".equals(s))
            return true;
        for (String str :
                wordDict) {
            if (s.contains(str)) {
                if (wordBreak(s.replace(str, ""), wordDict))
                    return true;
            }
        }
        return false;
    }

}
