-- Last updated: 05/08/2026, 10:26:41
select user_id,
    concat(upper(left(name, 1)), lower(substring(name, 2)))
    as name
from Users
order by user_id;