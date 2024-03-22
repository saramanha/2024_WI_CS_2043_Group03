public class Driver {
    public static void main(String[] args) {
        // Creating an instance of UserId
        Userid user = new Userid("John Doe", 19, 506462863, "w6vms@unb.ca", "password123");

        // Printing UserId information
        System.out.println("User Information:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Phone Number: " + user.getphoneNum());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getpassword());
        System.out.println("User Object: " + user.toString());
        System.out.println();

        // Creating an instance of Movie
        Movie movie = new Movie("Inception", "Science Fiction", "2010-07-16", 8.8, "A thief who enters the dreams of others to steal secrets", "English");

        // Printing Movie information
        System.out.println("Movie Information:");
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Release Date: " + movie.getReleaseDate());
        System.out.println("Rating: " + movie.getRating());
        System.out.println("Description: " + movie.getDescription());
        System.out.println("Language: " + movie.getLanguage());
        System.out.println("Movie Object: " + movie.toString());
    }
}
