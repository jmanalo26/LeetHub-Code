# Write your MySQL query statement below
Select FirstName, LastName, City, State From Person Left Join Address on Address.PersonId = Person.PersonId