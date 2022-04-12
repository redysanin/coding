package coding.test.examples;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	// Time complexity O(n square) ,  Space complexity O(1)
	public static int[] BruteForce(int[] numbs,int target ){
		for (int j=0; j<numbs.length-1;j++){
			int startwith =numbs[j];
			for (int i=j+1; i<numbs.length;i++){
				if (startwith+numbs[i] ==target){
					  return new int[]{j,i};
				}
			}
		}
		return null;
		
	}
	
	// Time complexity O(n) ,  Space complexity O(n)
	public static int[] OneHash(int[] numbs,int target ){
		Map<Integer, Integer> storeMap = new HashMap<Integer,Integer>();
		for (int j=0; j<numbs.length;j++){
			int reminder=target-numbs[j];
			if (storeMap.containsKey(reminder)){
				 return new int[]{storeMap.get(reminder),j};
			}
			storeMap.put(numbs[j],j);
		}
		return null;
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbs[] = {9,11,2,7,8};
		int target =17;
		
		int[] response=BruteForce(numbs,target);
		if (response!=null){
			System.out.println("BruteForce= ["+response[0]+","+response[1]+"]");
		}else {
			System.out.println("Not found");
		}
		
		int[] response2=OneHash(numbs,target);
		if (response2!=null){
			System.out.println("OneHash= ["+response2[0]+","+response2[1]+"]");
		}else {
			System.out.println("Not found");
		}

	}

}
