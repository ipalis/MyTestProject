#Story 3:

SELECT l.airline, avg(f.averageTicketPrice)
FROM airlines l
JOIN flights f ON l.flightNumber = f.flightNumber
  INNER JOIN (
    SELECT l.airline
    FROM airlines l
    JOIN flights f ON l.flightNumber = f.flightNumber
    GROUP BY l.airline
    HAVING avg(f.averageTicketPrice) < 100
	) AS n ON n.airline = l.airline
WHERE f.arrivalAirport IN ('Milan', 'Helsinki')
AND l.webRegistration = 'yes';