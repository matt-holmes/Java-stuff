package datastuctures;

import java.util.ArrayList;
import java.util.List;

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
	
	public String getResultStandardForLoop() {
		String result = "";
		for(int i = 0; i < this.myList.size(); i++) {
			result += " " + this.myList.get(i);
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

}
