package jun15;

public class Test02 {
	public static void main(String[] args) {
		        int totalCount = 0;

		        for (int hour = 0; hour < 24; hour++) {
		            for (int minute = 0; minute < 60; minute++) {
		                String time = String.format("%02d:%02d", hour, minute);
		                if (time.contains("3")) {
		                    totalCount += 60; // 1분은 60초
		                }
		            }
		        }

		        int totalSeconds = totalCount;
		        System.out.println("하루 동안 3이 표시되는 시간(초): " + totalSeconds);
		    }
		}

	
