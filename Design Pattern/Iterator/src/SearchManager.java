import java.util.Iterator;
public class SearchManager {
	AllCandidates allCandidate;
	
	public SearchManager(AllCandidates allCandidate) {
		this.allCandidate = allCandidate;
	}
	
	public void displayAll() {
		Iterator<Candidate> candidateIterator = allCandidate.createIterator();
		
		System.out.println("Candidate List:\n");
		printCandidate(candidateIterator);
	}
	
	public void printCandidate(Iterator<Candidate> iterator) {
		int count = 1;
		while(iterator.hasNext()) {
			Candidate candidate = iterator.next();
			System.out.println("["+count+"] "+candidate.getName()+", "+candidate.getCert()+", "+candidate.getState());
			count ++;
		}
	}
	
	public void displayCert(String cert) {
		Iterator<Candidate> candidateIterator = allCandidate.createIterator();
		
		System.out.println("\n"+cert+" Candidates List:\n");
		printCert(candidateIterator,cert);
	}
	
	public void printCert(Iterator<Candidate> iterator, String cert) {
		int count = 1;
		while(iterator.hasNext()) {
			Candidate candidate = iterator.next();
			if(candidate.getCert().equalsIgnoreCase(cert)) {
				System.out.println("["+count+"] "+candidate.getName()+", "+candidate.getCert()+", "+candidate.getState());
				count ++;
			}
		}
	}
	
}
