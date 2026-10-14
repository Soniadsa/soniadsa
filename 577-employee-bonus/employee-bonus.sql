# Write your MySQL query statement below
SELECT e.name , b.bonus FROM Employee e
Left JOIN Bonus b 
ON e.empId = b.empId
WHERE bonus < 1000 OR bonus is NULL;
