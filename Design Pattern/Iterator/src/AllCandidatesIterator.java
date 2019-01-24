import java.util.Iterator;

public class AllCandidatesIterator implements Iterator<Candidate>{
	Candidate[] data;
	int position = 0;
	
	public AllCandidatesIterator(Candidate[] data) {
		this.data = data;
	}
	
	public Candidate next() {
		Candidate candidate = data[position];
		position = position + 1;
		return candidate;
	}
	
	public boolean hasNext() {
		if(position >= data.length || data[position] == null) {
			return false;
		}else {
			return true;
		}
	}
}
