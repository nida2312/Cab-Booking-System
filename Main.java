import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main{
	public static void main(String[] args) throws Exception{

		RideImpl impl=new RideImpl();
		String response= "yes";

		do{
		System.out.println("Enter operation to perform");
		System.out.println("\n1. Add\n2. Remove\n3. Edit\n4. GetALL\n5. Get\n");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		scan.nextLine();
		

		String id,source,destination,str_date;
		Date bookingDate;
		Double estimatedBill;
		Ride rid= new Ride();
		
		switch(choice){
			case 1:
				System.out.println("Enter ride id");
				id=scan.nextLine();
				System.out.println("Enter source");
				source=scan.nextLine();
				System.out.println("Enter destination");
				destination=scan.nextLine();
				System.out.println("Enter date");
				str_date=scan.nextLine();
				bookingDate=new SimpleDateFormat("dd-MM-yyyy").parse(str_date);
				System.out.println("Enter bill");
				estimatedBill=scan.nextDouble();
				scan.nextLine();
				
				rid=new Ride(id,source,destination,bookingDate,estimatedBill);
				impl.add(rid);
				break;
			case 2:
				System.out.println("Enter ride id to remove");
				id=scan.nextLine();
				impl.remove(id);
				break;
			case 3:
				System.out.println("Enter ride id");
				id=scan.nextLine();
				System.out.println("Enter source");
				source=scan.nextLine();
				System.out.println("Enter destination");
				destination=scan.nextLine();
				System.out.println("Enter date");
				str_date=scan.nextLine();
				bookingDate=new SimpleDateFormat("dd-MM-yyyy").parse(str_date);
				System.out.println("Enter bill");
				estimatedBill=scan.nextDouble();
				scan.nextLine();
				
				rid=new Ride(id,source,destination,bookingDate,estimatedBill);
				impl.edit(rid);
				break;
			case 4:
				impl.getAll();
				break;	
			case 5:
				System.out.println("Enter ride id to display");
				id=scan.nextLine();
				impl.get(id);
				break;
			default:
				System.out.println("Wrong choice entered");
				break;
		}
		
		System.out.println("Do you want to continue?(yes/no)?");
		response = scan.nextLine();
		}while(response.equalsIgnoreCase("yes"));
	}
}