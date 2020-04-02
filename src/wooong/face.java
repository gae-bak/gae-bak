package wooong;

public class face {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 50;
		
		if (count >=90)
		{
			System.out.println("장학금");
		} else if (count >=60)
			{System.out.println("합격");
			}
		else {
			System.out.println("불합격");
		}
		
		int score = (count / 10) *10 ;
		switch (score) {
		case 100 :
		case 90 :
			System.out.println("장학금");
		break;
		case 80:
		case 70:
		case 60:
			System.out.println("합격");
			break;
			default:
				System.out.println("블합격");
		}
	}
}
