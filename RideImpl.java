import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class RideImpl implements RideDAO{

	List<Ride>list=new ArrayList<>();
	
	public void add(Ride r){
	list.add(r);
	System.out.println("Ride added");
	}

	public void remove(String id){
		Iterator<Ride>it=list.iterator();
		while(it.hasNext()){
			Ride obj=it.next();
			if(obj.getRideId().equals(id)){
				it.remove();
				System.out.println("Ride removed");
			}
		}
	}

	public void edit(Ride r){
		boolean found=false;
		Iterator<Ride>it=list.iterator();
		while(it.hasNext()){
			Ride ride=it.next();
			if(ride.getRideId().equals(r.getRideId())){
				int index=list.indexOf(ride);
				list.set(index,r);
				found=true;
			}
		}
		if(!found)
			System.out.println("Ride not found");
	}
	
	public void getAll(){
	if(list.isEmpty()){
		System.out.println("list is empty");
		return;
		}
		System.out.println("Details of all rides\n\n");
	Iterator<Ride>it=list.iterator();
	while(it.hasNext()){
		Ride obj=it.next();
		System.out.println(obj);
		}
	}
	
	public void get(String id){
	if(list.isEmpty()){
		System.out.println("list is empty");
		return;
		}
		System.out.println("Details of all rides\n\n");
		Iterator<Ride>it=list.iterator();
		while(it.hasNext()){
			Ride obj=it.next();
			if(obj.getRideId().equals(id)){
				System.out.println(obj);
			}
		}	
	}
}