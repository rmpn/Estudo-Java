package objetos;

import org.apache.commons.lang3.StringUtils;

public class Account {

	int a, b;

	public void setData(int a, int b) {

		this.a = a;
		this.b = b;

	}

	public void showData() {

		System.out.println(StringUtils.capitalize("imprimindo os elementos  A e B, são:  ") + this.a + " e " + this.b);

	}

}
