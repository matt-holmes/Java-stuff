package datastuctures;

import java.util.*;


/*
 * A unordered collection that contains no duplicate elements
 */

public class WorkingWithSets {
	
	private Set<Integer> mySet;
	
	public WorkingWithSets() {
		this.mySet = new TreeSet<Integer>();
	}
	
	public void setMySet(Set<Integer> aSet) {
		this.mySet = aSet;
	}
	
	public Set<Integer> getMySet() {
		return this.mySet;
	}
	
	public boolean addToMySet(int item) {
		return this.getMySet().add(item);
	}
	
	public void removeFromMySet(int item) {
		this.getMySet().remove(item);
	}
	
	public int getMySetSize() {
		return this.getMySet().size();
	}
	
	public int getMySetSum() {
		int sum = 0;
		for (int i : this.getMySet()) {
			sum += i;
		}
		return sum;
	}
}
