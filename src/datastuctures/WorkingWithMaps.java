package datastuctures;

import java.util.*;
import java.util.Map.Entry;

public class WorkingWithMaps {
	
	Map<String, String> myMap;
	
	public WorkingWithMaps() {
		this.myMap = new <String, String> HashMap<String, String>();
	}
	
	public Map<String, String> getMyMap() {
		return this.myMap;
	}
	
	public void setMyMap(Map<String, String> aHashMap) {
		this.myMap = aHashMap;
	}
	
	public void addToMap(String key, String item) {
		this.myMap.put(key, item);
	}
	
	public String getValuesUsingIterator() {
		String result = "";
		Iterator<Entry<String, String>>iter = this.getMyMap().entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry<String, String> pair = (Map.Entry<String, String>)iter.next();
	        result += " " + pair.getValue();
	    }
		return result;
	}
	
	public String getKeysUsingIterator() {
		String result = "";
		Iterator<Entry<String, String>>iter = this.getMyMap().entrySet().iterator();
	    while (iter.hasNext()) {
	        Map.Entry<String, String> pair = (Map.Entry<String, String>)iter.next();
	        result += " " + pair.getKey();
	    }
		return result;
	}
	
	public String getItemFromKey(String key) {
		return this.getMyMap().get(key);
	}
	
	public int getMyMapSize() {
		return this.getMyMap().size();
	}
	
	public boolean getMyMapContainsKey(String key) {
		return this.getMyMap().containsKey(key);
	}
	
	public boolean getMyMapContainsValue(String value) {
		return this.getMyMap().containsValue(value);
	}

}
