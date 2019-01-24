
public class testClass {

	public static void main(String[] args) {
		AllCandidates allCandidate = new AllCandidates();
		SearchManager sm = new SearchManager(allCandidate);
		sm.displayAll();
		sm.displayCert("Sun MicroSystems");
		sm.displayCert("Microsoft");
		sm.displayCert("IBM");
		sm.displayCert("None");
	}

}
