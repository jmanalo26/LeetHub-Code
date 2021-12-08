# Write your MySQL query statement below
Select score, DENSE_RANK() OVER (
    Order by score desc
) as 'rank'
from Scores