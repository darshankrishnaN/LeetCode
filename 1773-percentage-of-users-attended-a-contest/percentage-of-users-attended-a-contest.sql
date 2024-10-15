# Write your MySQL query statement below
SELECT r.contest_id , ROUND(count(user_id)*100.0 / (select count(user_id) from Users), 2) as percentage
FROM Register r
GROUP BY contest_id
ORDER BY percentage desc , contest_id;