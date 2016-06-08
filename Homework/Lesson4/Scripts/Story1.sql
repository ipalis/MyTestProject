#Story 1:

SELECT f.flightNumber, f.departureAirport, f.arrivalAirport, f.averageTicketPrice, f.availableSeats, l.airline, l.additionalSpaceService, p.priorityBoarding
FROM flights AS f
JOIN airlines AS l
ON f.flightNumber = l.flightNumber
JOIN airports AS p
ON f.departureAirport = p.airport
WHERE departureAirport = 'London'
AND arrivalAirport = 'Munich'
AND averageTicketPrice <= 120
AND availableSeats >= 4
AND additionalSpaceService = 'yes'
AND priorityBoarding = 'yes';