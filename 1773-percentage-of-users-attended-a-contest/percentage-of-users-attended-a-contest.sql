# Write your MySQL query statement below
SELECT r.contest_id , ROUND(count(user_id)/ (select count(user_id) from Users)*100, 2) as percentage
FROM Register r
GROUP BY contest_id
ORDER BY percentage desc , contest_id;