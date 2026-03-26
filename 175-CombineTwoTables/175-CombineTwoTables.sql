-- Last updated: 26/03/2026, 16:21:42
select p.firstName, p.lastName, a.city, a.state 
from Person p
left join Address a on p.personId = a.personId;