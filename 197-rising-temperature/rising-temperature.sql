# Write your MySQL query statement below

select A.id 
FROM Weather as A
INNER JOIN Weather as B
ON DATEDIFF(A.recordDate,B.recordDate)=1
WHERE A.temperature > B.temperature;
