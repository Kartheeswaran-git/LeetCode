-- Last updated: 26/03/2026, 16:21:35
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;