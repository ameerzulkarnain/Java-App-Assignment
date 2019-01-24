
public class Candidate {
	String name;
	String cert;
	String state;
	
	public Candidate(String name, String cert, String state) {
		this.name = name;
		this.cert = cert;
		this.state = state;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCert() {
		return cert;
	}
	
	public String getState() {
		return state;
	}
}
