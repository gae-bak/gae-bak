package wooong;

public class face {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 50;
		
		if (count >=90)
		{
			System.out.println("���б�");
		} else if (count >=60)
			{System.out.println("�հ�");
			}
		else {
			System.out.println("���հ�");
		}
		
		int score = (count / 10) *10 ;
		switch (score) {
		case 100 :
		case 90 :
			System.out.println("���б�");
		break;
		case 80:
		case 70:
		case 60:
			System.out.println("�հ�");
			break;
			default:
				System.out.println("���հ�");
		}
	}
}
