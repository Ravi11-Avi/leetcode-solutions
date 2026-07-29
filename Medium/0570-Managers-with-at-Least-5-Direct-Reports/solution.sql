-- ═══════════════════════════════════════════════════════
--  Problem  : 0570. Managers with at Least 5 Direct Reports
--  URL      : https://leetcode.com/problems/managers-with-at-least-5-direct-reports/
--  Difficulty : Medium
--  Language : MySQL
--  Runtime  : 92 ms
--  Memory   : 0B
--  Solved   : July 29, 2026
-- ═══════════════════════════════════════════════════════

# Write your MySQL query statement below

select name from Employee 
group by managerId
having count(*)<=5;