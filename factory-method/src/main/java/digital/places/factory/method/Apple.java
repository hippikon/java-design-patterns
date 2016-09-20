package digital.places.factory.method;

public class Apple implements MobilePhone {

	private OS os;
	private Store store;

	public Apple() {
		this.store = new Store("iTunes");
	}
	
	@Override
	public OS create(Features... features) {
		this.os = new IOS(features);
		return this.os;
	}

	@Override
	public Store getStore() {
		// TODO Auto-generated method stub
		return this.store;
	}

	
	
	@Override
	public String toString() {
		return "Apple ios=" + os + ", store=" + store;
	}
	
	

}
