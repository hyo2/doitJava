package chapter4;

public class Practice_Score {

	public static void main(String[] args) {
		int score = 95;
		char grade;
		
		if(score>=90 && score <= 100) {
			grade = 'A';
		}
		
		else if(score>=80 && score<=89){
			grade = 'B';
		}
		
		else if(score>=70 && score<=79){
			grade = 'C';
		}
		
		else if(score>=60 && score<=69){
			grade = 'D';
		}
		
		else {
			grade='F';
		}
		
		System.out.println("성적 = "+score+", 학점 = "+grade);
	}

}
