import java.util.List;

public interface RideDAO{
		void add(Ride r);
		void remove(String id);
		void edit(Ride r);
		void getAll();
		void get(String id);
	}