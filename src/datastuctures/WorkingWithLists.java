package datastuctures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * An ordered collection.  Allows Duplicates
 * 
 */

public class WorkingWithLists {
	
	private List<String> myList;
	
	
	public WorkingWithLists(){
		this.myList = new ArrayList<String>();
	}
	
	public List<String> getMyList() {
		return this.myList;
	}
	
	public void setMyList(List<String> aArrayList) {
		this.myList = aArrayList;
	}
	
	public void addToList(String item) {
		this.myList.add(item);
	}
	
	public int getMyListSize() {
		return this.getMyList().size();
	}
	
	public void removeFromMyListByObject(String item) {
		this.getMyList().remove(item);
	}
	
	public List<String> getMyListSubList(int start, int end) {
		return this.getMyList().subList(start, end);
	}

	public void removeFromMyListByIndex(int index) {
		this.getMyList().remove(index);
	}
	
	public String getResultStandardForLoop() {
		String result = "";
		for(int i = 0; i < this.getMyList().size(); i++) {
			result += " " + this.getMyList().get(i);
		}
		return result;
	}
	
	public String getResultNewForLoop() {
		String result = "";
		for(String item : this.getMyList()) {
			result += " " + item;
		}
		return result;
	}
	
	public String getResultWithIterator(){
		String result = "";
		Iterator<String> iter = this.getMyList().iterator();
		while(iter.hasNext()) {
			result += " " + iter.next();
		}
		return result;
	}
	
}
