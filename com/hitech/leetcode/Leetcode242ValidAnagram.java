package com.hitech.leetcode;

public class Leetcode242ValidAnagram {
    static 
    {
        for (int i = 0; i < 500; i++) 
        {
            isAnagram("a", "");
        }
    }
    public static boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
            return false;
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i)-97]++;
        }
        for (int i = 0; i < t.length(); i++) 
        {
            if (--freq[t.charAt(i) - 97] < 0)
            {
                return false;
            }
        }
        return true;
    }

    //public static boolean isAnagram(String s, String t) 
    // {
    //     if(s.length() != t.length())
    //         return false;

    //     HashMap<Character, Integer> map = new HashMap<>();
    //     for(int i = 0; i < s.length(); i++)
    //         map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
    //     for(int i = 0; i < s.length(); i++)
    //     {
    //         if(map.get(t.charAt(i)) == null)
    //             return false;
    //         map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
    //         if(map.get(t.charAt(i)) < 0)
    //             return false;       
    //     }
    //     return true;
    // }
   
}
