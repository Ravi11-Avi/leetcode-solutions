// ═══════════════════════════════════════════════════════
//  Problem  : 0752. Open the Lock
//  URL      : https://leetcode.com/problems/open-the-lock/submissions/2115193309/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 102 ms
//  Memory   : 48.4 MB
//  Solved   : August 21, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String> seen = new HashSet<>();

        for (String each : deadends){
            seen.add(each);
        }
        if (seen.contains("0000")) return-1;

        HashMap<Character, List<Character>>  map =  new HashMap<>();

        for (int i =0 ; i <=9; i++){
            char curr = (char)('0'+i);
            char prev=  (char)('0'+(i+9)%10);
            char next=  (char)('0'+(i+1)%10);

            map.put(curr,List.of(prev , next));
        }


        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        seen.add("0000");
        int turn =  0;
        while (!queue.isEmpty()){
            int size =  queue.size();
            for (int i = 0 ; i< size ; i++){
                String curr =  queue.poll();
                if (curr.equals(target))return  turn;


                for (int j = 0 ; j < 4 ; j++){
                     char[] eachone = curr.toCharArray();

                    char  currchar=  eachone[j];

                    for (char nextone : map.get(currchar)){
                        eachone[j] = nextone;

                        String nextString = new String(eachone);
                        if (!seen.contains(nextString)){
                            queue.offer(nextString);
                            seen.add(nextString);
                        }
                    }
                }
               
            }
            turn++;
        }

        return -1;
        
    }
}