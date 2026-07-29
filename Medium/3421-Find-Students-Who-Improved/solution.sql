-- ═══════════════════════════════════════════════════════
--  Problem  : 3421. Find Students Who Improved
--  URL      : https://leetcode.com/problems/find-students-who-improved/
--  Difficulty : Medium
--  Language : MySQL
--  Runtime  : 87 ms
--  Memory   : 0B
--  Solved   : July 29, 2026
-- ═══════════════════════════════════════════════════════

# Write your MySQL query statement below
Select t1.student_id  , t1.subject, t1.score as first_score , t2.score as latest_score 
from Scores  t1
join Scores t2 
on t1.student_id = t2.student_id 
where t1.score >  t2.score & t1.student_id = t2.student_id ;