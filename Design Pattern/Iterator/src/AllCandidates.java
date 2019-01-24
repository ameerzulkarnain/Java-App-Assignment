
import java.util.Iterator;

public class AllCandidates implements CandidatesInterface{
	Candidate[] data;
	static final int MAX_ITEMS = 11;
	int dataCount = 0;
	
	public AllCandidates() {
		data = new Candidate[MAX_ITEMS];
		addData("Partha","Sun MicroSystems","Michigan");
		addData("Pavan","Sun MicroSystems","California");
		addData("D.R.Sudhakar","Microsoft","California");
		addData("Clark","Microsoft","Michigan");
		addData("Mike","Sun MicroSystems","Georgia");
		addData("Venkatesh,Microsoft","Microsoft","Georgia");
		addData("Arnold","Sun MicroSystems","California");
		addData("Tom","IBM","Georgia");
		addData("Bobby","IBM","Michigan");
		addData("Denise","None","Michigan");
		addData("Bill","None","Michigan");
		
	}
	
	public void addData(String name, String cert, String state) {
		Candidate item = new Candidate(name, cert, state);
		if(dataCount >= MAX_ITEMS) {
			System.out.println("The candidate list is full.");
		}else {
			data[dataCount] = item;
			dataCount = dataCount + 1;
		}
	}
	
	public Iterator<Candidate> createIterator() {
		return new AllCandidatesIterator(data);
	}
}
