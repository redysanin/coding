package coding.test.examples;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomizedSet {
	
	 public static Set<Integer> set ;
	
	 public static void RandomizedSet() {
		 set = new TreeSet();
	 }
	    
	    public static boolean insert(int val) {
	        if(set.contains(val)) {
	        	return false;
	        }
	        set.add(val);
	        return true;
	    }
	    
	    public static boolean remove(int val) {
	    	 if(set.contains(val)) {
	    		 set.remove(val);
	    		  return true;
	    	 }else {
	    		 return false;
	    	 }
	    }
	    
	    public static int getRandom() {
	    	if(set.size()==0) {
	    		return 0;
	    	}
	    	int value=new Random().nextInt(set.size());
	    	int i=0;
	    	for(int k : set) {
	    		if(i==value) {
	    			return k;
	    		}
	    		i++;
	    	}
	    	for(int k : set) {
	    		return k;
	    	}
	    	return 0;
	    }
	

	public static void main(String[] args) {
		RandomizedSet();
		System.out.println(insert(1)); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
		
		System.out.println(insert(3));
		System.out.println(insert(4));
		System.out.println(insert(5));
		System.out.println(insert(6));
		
		
		System.out.println(remove(2)); // Returns false as 2 does not exist in the set.
		System.out.println(insert(2)); // Inserts 2 to the set, returns true. Set now contains [1,2].
		System.out.println(getRandom()); // getRandom() should return either 1 or 2 randomly.
		System.out.println(remove(1)); // Removes 1 from the set, returns true. Set now contains [2].
		System.out.println(insert(2)); // 2 was already in the set, so return false.
		System.out.println(getRandom()); // Since 2 is the only number in the set, getRandom() will always return 2.

	}

}
