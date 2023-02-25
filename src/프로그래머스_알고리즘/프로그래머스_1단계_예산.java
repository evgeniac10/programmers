package 프로그래머스_알고리즘;
import java.util.*;
public class 프로그래머스_1단계_예산 {

	class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	       Arrays.sort(d);
	        for(int i=0; i<d.length; i++){
	             if(budget >= d[i]){
	                 budget = budget - d[i];
	                     answer++;
	             }
	            else{
	               break; 
	            }
	        }    
	        return answer;
	    }
	}
}
