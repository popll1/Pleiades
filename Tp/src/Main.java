
	import java.util.Arrays;
	import java.util.Comparator;

	public class Main {
	    public static void main(String[] args) {
	        int[] nums = {3, 30, 34, 5, 9};
	        String largestNumber = largestNumber(nums);
	        System.out.println(largestNumber);
	    }
	    
	    public static String largestNumber(int[] nums) {
	        // 숫자를 문자열로 변환
	        String[] numStrings = new String[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            numStrings[i] = String.valueOf(nums[i]);
	        }
	        
	        // 비교 함수를 사용하여 정렬
	        Arrays.sort(numStrings, new Comparator<String>() {
	            @Override
	            public int compare(String a, String b) {
	                String order1 = a + b;
	                String order2 = b + a;
	                System.out.printf(order1);
	                System.out.println("------------");
	                return order2.compareTo(order1);
	                
	            }
	        });
	        
	        // 정렬된 숫자를 이어붙임
	        StringBuilder sb = new StringBuilder();
	        for (String numString : numStrings) {
	            sb.append(numString);
	        }
	        
	        // 예외 처리: 0으로 시작하는 경우
	        if (sb.charAt(0) == '0') {
	            return "0";
	        }
	        
	        return sb.toString();
	    }
	}


