-- Last updated: 26/03/2026, 16:19:17
select id,
        case 
            when p_id is Null then "Root"

            when id not in (
                select distinct p_id
                from Tree
                where p_id is not null
            )
            then "Leaf"

            else "Inner"

            end as type
from tree
group by id            