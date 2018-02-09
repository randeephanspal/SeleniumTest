package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal=200;  //not allowed to change var value of Interface.

		HSBCBank hs = new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		//dynamic polymorphism
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		b.credit();
		
		
	}

}
