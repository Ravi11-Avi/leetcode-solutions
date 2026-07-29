-- ═══════════════════════════════════════════════════════
--  Problem  : 0196. Delete Duplicate Emails
--  URL      : https://leetcode.com/problems/delete-duplicate-emails/submissions/2086097875/
--  Difficulty : Easy
--  Language : MySQL
--  Runtime  : 1040 ms
--  Memory   : 0B
--  Solved   : July 29, 2026
-- ═══════════════════════════════════════════════════════

DELETE FROM Person 
WHERE id NOT IN (
    SELECT min_id FROM (
        SELECT MIN(id) AS min_id 
        FROM Person 
        GROUP BY email
    ) AS temp
);
