package digital.places.factory.method;

public enum Features {

	  CALL("CALL"), TEXT("TEXT"), BROWSE("BROWSE");

	  private String title;

	  Features(String title) {
	    this.title = title;
	  }

	  @Override
	  public String toString() {
	    return title;
	  }
}
