-- Last updated: 05/08/2026, 10:30:30
SELECT name As Customers FROM Customers
left join Orders
on Customers.id=Orders.customerId
where Orders.customerId is null;