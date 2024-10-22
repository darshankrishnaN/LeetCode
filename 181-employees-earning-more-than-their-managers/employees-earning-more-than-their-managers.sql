# Write your MySQL query statement below
SELECT a.name as Employee
FROM  Employee a
INNER JOIN Employee d
ON a.managerId = d.id
AND a.salary > d.salary;