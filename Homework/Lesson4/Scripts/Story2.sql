#Story 2:

SELECT f.flightNumber, f.departureAirport, f.arrivalAirport, f.averageTicketPrice, f.availableSeats, l.airline, l.isMealincluded, a.dutyFree
FROM flights AS f
 JOIN airlines AS l 
 ON f.flightNumber = l.flightNumber
 JOIN airports AS p 
 ON f.departureAirport = p.airport
 JOIN airports AS a 
 ON f.arrivalAirport = a.airport
 WHERE f.departureAirport = 'New York'
 AND f.averageTicketPrice <= 500
 AND f.availableSeats >= 1
 AND l.isMealincluded = 'yes'
 AND a.dutyFree = 'yes';