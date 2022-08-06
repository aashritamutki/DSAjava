//Program: 19

//Given: array of characters
//Output: length of longest substring without repeating characters
//Brute Force: TC=O(n^3)
//Optimized way: TC=O(n)
//maintain hash map

import java.util.*;

public class LongestSubstring{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = in.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();

        int max_count = 0, current_count = 0, end = -1, start = -1;
        map.put(str.charAt(0), 1);
        current_count = 1;
        start = 0;
        end = 0;
        max_count = current_count;
        char current_char;

        for(int i = 1; i < str.length(); i++){
            end++;
            current_char = str.charAt(i);

            //acquire & release previous
            //for old character in hashmap
            if(map.containsKey(current_char) && map.get(current_char) > 0){
                map.put(current_char, 2);
                while(true){
                    char ch = str.charAt(start);
                    map.put(ch, map.getOrDefault(ch, 0) - 1);
                    ++start;
                    if(map.get(ch) == 1){
                        break;
                    }
                    else{
                        --current_count;
                    }
                }
                
            }
            //only acquire
            //for new character in hashmap
            else{
                map.put(str.charAt(i), 1);
                current_count = end - start + 1;
                if(current_count > max_count){
                    max_count = current_count;
                }
            }
        }

        System.out.println(max_count);
    }

}
