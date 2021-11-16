# Write your MySQL query statement below
Select a.id from Weather a
Join weather b on DATEDIFF(a.recordDate, b.recordDate) = 1 and a.temperature > b.temperature