# Book My Show

## Setup the Application

1. Create a database `bookmyshow` using the sql file `bookmyshow.sql` provided in `src/main/resources`.

2. Open `src/main/resources/application.properties` and change `spring.datasource.username` and `spring.datasource.password` properties as per your MySQL installation.

3. Run the application as a Spring boot in any IDE or Type `mvn spring-boot:run` from the root directory of the project to run the application.


## Setting up the data

1. Access the application using swagger on `http://localhost:8080/bms/swagger-ui.html`

2. Execute the API `http://localhost:8080/bms/initialize/generate` from swagger inside the heading `data-populator`. This will create a sample user, movie, theater, theater seats, shows, shows seats that will be used in booking ticket.


## Booking a ticket

1. Use the `show-controller` heading in swagger and call the `search` API inside it using `pageNo=1` and `limit=10` to see the available list of shows.

2. Select any show from the above search result and copy its id.

3. Now go to `ticket-controller` in the swagger and  execute the book ticket API using the following request body - 

{"seatType":"CLASSIC","seatsNumbers":["1A"],"showId":1,"userId":1}

`{`
  `"seatType": "CLASSIC",`
  `"seatsNumbers": [`
    `"1A"`
  `],`
  `"showId": 1,`
  `"userId": 1`
`}`

This will book a ticket for you and you will get ticket id along with show details in response.


## Verifying the results from DB

1. Login to your MySQL and go to `bookmyshow` DB

2. `SELECT * FROM bookmyshow.users;` to see all registered users.

3. `SELECT * FROM bookmyshow.movies;` to see all movies.

4. `SELECT * FROM bookmyshow.theaters;` to see all theaters.

5. `SELECT * FROM bookmyshow.theater_seats;` to see all theater's seats.

6. `SELECT * FROM bookmyshow.shows;` to see all shows for movies in theaters.

7. `SELECT * FROM bookmyshow.show_seats;` to see all show's seats by type.

8. `SELECT * FROM bookmyshow.tickets;` to see all booked tickets.


## Other API Details

1. `UserController` -  APIs to add and get user

2. `MovieController` - APIs to add and get movie

3. `TheaterController` - APIs to add and get theater

4. `ShowController` - APIs to add and search show


## Future Scope

1. Multiple user handling 
2. Seat locking during payment
3. Multiple Screen handling in theater
4. Seat management on the fly
5. Payment Flow
6. Login and User Account Management
