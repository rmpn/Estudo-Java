package objetos;

public class AccountDemo {

	public static void main(String[] args) {

		Account c[] = new Account[2];
		c[0] = new Account();
		c[1] = new Account();
		//
		c[0].setData(2, 3);
		c[1].setData(4, 5);
		
		c[0].showData();
		c[1].showData();

	}

}
