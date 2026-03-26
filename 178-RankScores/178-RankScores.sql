-- Last updated: 26/03/2026, 16:21:40

SELECT score, DENSE_RANK() OVER (ORDER BY score DESC) as `rank`
FROM Scores;