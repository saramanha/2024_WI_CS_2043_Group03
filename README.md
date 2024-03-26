
# Group3 Project

## Theater Management System

### 1. Glossary
1. __TMS__: Theater Management System.
2. __Showtime__: A scheduled time at which the movies are screened.
3. __Capacity Recognition__: The system's ability to identify when a theater is at full
capacity.
4. __Seat Availability__: The number of open seats for a particular movie showing.
5. __Layout__: The layout of each screen in the theater.

### 2. Input and Output Files
#### Input
1. __layout.csv__: The file contains the screen information in the first row [Screen ID, 
Screen Type, Base Ticket Price, Capacity] and information of all seats in each screen show
that the following lines [Seat ID, Seat Type, Additional Price].
2. __schedule.csv__: The file contains the showtime information in the first row 
[Date(yyyy-MM-dd), Time(HH:mm), Number of Screen showed in this showtime] and information 
of all shows in each showtime show that the following lines [Screen ID, Movie Title].
3. __movie_list.csv__: The files contains all movies information.

#### Output
1. __user_list.dat__: The binary file contains the user objects.
