package project.xyz;

public class Ticket {
	private static int ticketId = 101;
	private final int TICKET_ID;
	private final int USER_ID;
	private final Movie MOVIE;
	private final Seat SEAT;
	private boolean cancel;
	
	public Ticket(int userId, Movie movie, Seat seat) {
		TICKET_ID = ticketId++;
		USER_ID = userId;
		MOVIE = movie;
		SEAT = seat;
		cancel = false;
	}
	
	public int getTicketId() {
		return TICKET_ID;
	}
	
	public int getUserId() {
		return USER_ID;
	}
	
	public Movie getMovie() {
		return MOVIE;
	}
	
	public Seat getSeat() {
		return SEAT;
	}
	
	public boolean isCancelled() {
		return cancel;
	}
	
	public void cancelled() {
		cancel = true;
	}
	
	public String toString() {
		return "ID: "+TICKET_ID+"\tUser: "+USER_ID+"\tMovie: "+MOVIE.getTitle()+"\nSeat: "+SEAT.getSeatId()+"\t"+SEAT.getSeatShow();
	}
}
