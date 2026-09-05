// ═══════════════════════════════════════════════════════
//  Problem  : 0621. Task Scheduler
//  URL      : https://leetcode.com/problems/task-scheduler/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 1 ms
//  Memory   : 42.7 MB
//  Solved   : September 5, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int leastInterval(char[] tasks, int n) {
        

        PriorityQueue<Integer> maxheap = new  PriorityQueue<>(Collections.reverseOrder());
        int[] freq =  new int [26];
        for (char c :  tasks)freq[c- 'A']++;
        for (int f :  freq)maxheap.add(f);

        Queue<int[]> cooldown  =  new LinkedList<>();
        int time = 0 ;

        while(!maxheap.isEmpty()|| !cooldown.isEmpty()){
            time++;

            if (!maxheap.isEmpty()){
                int remaing =  maxheap.poll()-1;

                if (remaing > 0 ){
                    cooldown.add(new int[]{remaing,time+n});
                }
            }

            if(!cooldown.isEmpty()&& cooldown.peek()[1]==time ){
                maxheap.add(cooldown.poll()[0]);
            }
        }


        return time ;


    }
}