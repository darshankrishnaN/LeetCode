select A.id 
from Weather A
Inner join Weather B
ON DATEDIFF(A.recordDate,B.recordDate)=1
where A.temperature > B.temperature;