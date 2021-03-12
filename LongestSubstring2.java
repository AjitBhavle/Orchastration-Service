import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestSubstring2 {
 
  public void countDupChars(String str){
 
    //Create a HashMap 
    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
 
    //Convert the String to char array
    char[] chars = str.toCharArray();
 
    /* logic: char are inserted as keys and their count
     * as values. If map contains the char already then
     * increase the value by 1
     */
    int res1=0,count=0;
    for(Character ch:chars){
      if(map.containsKey(ch)){
         /*res1=map.size();
		if(res1>count) {
			count=res1;
		}*/
		
      } else {
    	  map.put(ch, 1);
        }
    }
 
    //Obtaining set of keys
    Set<Character> keys = map.keySet();
 
    /* Display count of chars if it is
     * greater than 1. All duplicate chars would be 
     * having value greater than 1.
     */
    for(Character ch:keys){
      if(map.get(ch) > 1){
        System.out.println("Char "+ch+" "+map.get(ch));
      }
    }
  }
 
  public static void main(String a[]){
    LongestSubstring2 obj = new LongestSubstring2();
    obj.countDupChars("ABCDRTABDFG");
  

  }
}