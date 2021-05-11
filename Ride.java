import java.util.Date;

public class Ride{
	private String rideId;
	private String source;
	private String destination;
	private Date bookingDate;
 	private Double estimatedBill;


	public Ride(){
	}


	public Ride(String rideId, String source,String destination,Date bookingDate, Double estimatedBill){
		this.rideId= rideId;
		this.source= source;
		this.destination= destination;
		this.bookingDate=bookingDate;
		this.estimatedBill=estimatedBill;	

	}

	public void setRideId(String rideId){
		this.rideId=rideId;
	}

	public String getRideId(){
		return rideId;
	}

	public void setSource(String source){
		this.source=source;
	}

	public String getSource(){
		return source;
	}

	public void setDestination(String destination){
		this.destination=destination;
	}

	public String getDestination(){
		return destination;
	}

	public void setBookingDate(Date bookingDate){
		this.bookingDate=bookingDate;
	}

	public Date getBookingDate(){
		return bookingDate;
	}

	public void setEstimatedBill(Double estimatedBill){
		this.estimatedBill=estimatedBill;
	}

	public Double getEstimatedBill(){
		return estimatedBill;
	}

	
	public String toString(){
		String rideInfo;
		rideInfo= String.format("ID:%s\nSource:%s\nDest:%s\nBooking date:%s\nBill:$%s",rideId,source,destination,bookingDate,estimatedBill);
		return rideInfo;
	}

	

}