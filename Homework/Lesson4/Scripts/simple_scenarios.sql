SELECT airport FROM airports
WHERE airport = 'Barcelona';

SELECT flightNumber FROM flights
WHERE arrivalAirport = 'Kiev';

SELECT DISTINCT airline FROM airlines
WHERE airline = 'WizzAir';

SELECT availableSeats FROM flights
WHERE arrivalAirport = 'New York'
AND availableSeats != 0;

SELECT averageTicketPrice FROM flights
WHERE arrivalAirport = 'London';

SELECT dutyFree FROM airports
WHERE airport = 'Helsinki';

SELECT priorityBoarding FROM airports
WHERE airport = 'Barcelona';

SELECT flightNumber, additionalSpaceService FROM airlines
WHERE airline = 'Cathay Pacific'
AND additionalSpaceService = 'yes';

SELECT flightNumber, webRegistration FROM airlines
WHERE airline = 'Virgin'
AND webRegistration = 'yes';

SELECT flightNumber, isMealincluded FROM airlines
WHERE airline = 'AirAsia'
AND isMealincluded = 'yes';