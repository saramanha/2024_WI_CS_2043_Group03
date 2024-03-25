package project.xyz;

import java.time.*;

public class Screen {
	private final int SCREEN_ID;
	private String screenType;
	private double basePrice;
	private Seat[] layout;
	private LocalDate date;
	private LocalTime time;
	
	public Screen (int screenId, String type, double price, Seat[] layout) {
		SCREEN_ID = screenId;
		this.screenType = type;
		this.basePrice = price;
		this.layout = deepCopyArray(layout);
	}
	
	public int getScreenId() {
		return SCREEN_ID;
	}
	
	public String getScreenType() {
		return screenType;
	}
	
	public double getBasePrice() {
		return basePrice;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public LocalTime getTime() {
		return time;
	}
	
	public Seat[] getSeats() {
		return layout;
	}
	
	public Seat[] deepCopyArray(Seat[] layout) {
		Seat[] output = new Seat[layout.length];
		for (int i=0; i<layout.length; i++) {
			output[i] = new Seat(layout[i].getSeatId(), layout[i].getSeatType(), layout[i].getAdditionalPrice());
			output[i].setScreen(SCREEN_ID, screenType, basePrice);
		}
		return output;
	}

	public String toString() {
		String result = "Screen: "+SCREEN_ID+"\tType: "+screenType+"\tCapacity: "+layout.length;
		return result;
	}
	
	public String printAllSeat() {
		String result = toString()+"\n";
		for (int i=0; i<layout.length; i++) {
			result += layout[i].getSeatInfo()+"\n";
		}
		return result;
	}
}
