# Write your MySQL query statement below
Select IFNULL(
(Select Distinct Salary from Employee Order by Salary desc Limit 1 Offset 1), Null)
as SecondHighestSalary