package digital.places.factory.method;

public class Android implements MobilePhone {

	private OS os;
	private Store store;

	public Android() {
		this.store = new Store("Google Play");
	}
	
	
	@Override
	public OS create(Features... features) {
		this.os = new AndroidOS(features);
		return this.os;
	}

	@Override
	public Store getStore() {
		return this.store;
	}

	
	
	@Override
	public String toString() {
		return "Android androidos=" + os + ", store=" + store;
	}
	
}
