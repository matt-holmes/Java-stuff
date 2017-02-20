package datastuctures;

/*
 * Fast but size must be declared
 * 
 */

public class WorkingWithArrays {
	
	private String[] myArray;
	
	public WorkingWithArrays() {
		this.myArray = new String[5];
	}
	
	public void AddToMyArray(int index, String item) {
		this.myArray[index] = item;
	}
	
	public void setMyArray(String[] aArray) {
		this.myArray = aArray;
	}
	
	public String[] getMyArray() {
		return this.myArray;
	}
	
	public int getMyArraySize() {
		return this.getMyArray().length;
	}
	
	public String getResultByWhileLoop() {
		int i = 0;
		String result = "";
		while(i < this.getMyArray().length) {
			result += " " + this.getMyArray()[i];
			i++;
		}
		return result;
	}

	
}
