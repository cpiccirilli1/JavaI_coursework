package acctpkg;
import java.util.Scanner;

public class AccountTester{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an account #: ");
		String acctNum = input.next(); 
		System.out.println("Please enter an account type: ");
		String acctType = input.next();
		System.out.println("Card number?: ");
		String cardNo = input.next();
		System.out.println("Expiration date?: ");
		String exp = input.next();

		Account newAcct = new Account(acctNum, acctType, cardNo, exp);

		System.out.printf("Account#: %s\n Account Type: %s\n Card Number: %s\n Card Expiration: %s\n",
		newAcct.acctNum, newAcct.acctType, newAcct.cardNo, newAcct.expDate);

		Account newNextAcct = new Account();
		newNextAcct.setAcctNum(acctNum);
		newNextAcct.setAcctType(acctType);
		newNextAcct.setCardNo(cardNo);
		newNextAcct.setExp(exp);

		System.out.printf("Account#: %s\n Account Type: %s\n Card Number: %s\n Card Expiration: %s\n",
		newNextAcct.getAcctNum(), newNextAcct.getAcctType(), newNextAcct.getCardNo(), newNextAcct.getExp());
	}
}