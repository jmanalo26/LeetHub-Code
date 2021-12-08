CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE M INT;
SET M=N-1;
  RETURN (
      # Write your MySQL query statement below.
      Select IFNULL(
        (Select Distinct Salary from Employee Order by Salary desc Limit 1 Offset M), Null
      )
  );
END