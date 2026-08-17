// ═══════════════════════════════════════════════════════
//  Problem  : 0127. Word Ladder
//  URL      : https://leetcode.com/problems/word-ladder/
//  Difficulty : Hard
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : August 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> set = new  HashSet<>(wordList);
        Queue<String> queue =  new LinkedList<>();

        queue.offer(beginWord);

        int wordcount  = 1 ; 

        while (!queue.isEmpty()){
            String curr =  queue.poll();

            if (curr == endWord ) return wordcount;
            
            char[] wordchar =  curr.toCharArray();

            for (int i = 0 ; i < wordchar.length ; i++){
                char ch = wordchar[i];

                for (char c = 'a'; c<='z';c++){
                    wordchar[i] = c;
                    String newword =  new String(wordchar);

                    if(set.contains(newword)){
                        queue.offer(newword);
                        set.remove(newword);
                    }
                }
            }
        }

        return  0 ;

    }
}