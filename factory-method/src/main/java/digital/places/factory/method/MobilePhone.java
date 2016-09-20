package digital.places.factory.method;

public interface MobilePhone {

	OS create(Features... features);
	
	Store getStore();
	
	
	
}
