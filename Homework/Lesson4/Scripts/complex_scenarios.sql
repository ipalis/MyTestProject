1.
#combination of airport and flight

SELECT p.airport, f.flightNumber
from airports AS p
JOIN flights AS f
ON p.airport = f.departureAirport
WHERE airport = 'New York';

2.
#combination of flight and airline 

SELECT l.airline, f.flightNumber 
from flights AS f
JOIN airlines AS l
ON f.flightNumber = l.flightNumber
WHERE airline = 'Lufthansa';


3.
#check combination of airport and airline

SELECT DISTINCT p.airport, l.airline
FROM flights AS f
JOIN airlines AS l
ON f.flightNumber = l.flightNumber
JOIN airports AS p
ON f.departureAirport = p.airport
WHERE airport = 'Ottava'
ORDER BY l.airline;


4
#check combination flight and priority boarding

SELECT p.priorityBoarding, f.flightNumber
from airports AS p
JOIN flights AS f
ON p.airport = f.departureAirport
WHERE priorityBoarding = 'yes';


5
#check flights and duty free available

SELECT f.flightNumber, a.dutyFree
FROM flights AS f
 JOIN airlines AS l 
 ON f.flightNumber = l.flightNumber
 JOIN airports AS p 
 ON f.departureAirport = p.airport
 JOIN airports AS a 
 ON f.arrivalAirport = a.airport
 WHERE a.dutyFree = 'no';
 
