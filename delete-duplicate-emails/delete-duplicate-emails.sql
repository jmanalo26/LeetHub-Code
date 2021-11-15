# Write your MySQL query statement below
Delete p1 from Person as p1
Inner join Person as p2
where p1.email = p2.email and p1.id > p2.id