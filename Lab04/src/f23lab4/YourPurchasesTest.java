package f23lab4;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest {

	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	
	@Test
	public void testGetPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.recordPurchase(1.5);
		double changeResult = aPurchase.getPurchase();
		double expected = 3.0; // Expected the 3 dollars of purchase
	    Assert.assertEquals(expected, changeResult, EPSILON);
	}

	@Test
	public void testGetPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(1, 1, 1, 1, 1); //One dollar, one quarter, one dime, one nickel and one penny of payment.
		double changeResult = aPurchase.getPayment();
		double expected = 1.41; //Expecting one dollar and forty one pennies
	    Assert.assertEquals(expected, changeResult, EPSILON);
	}


	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(6);
		double changeResult = aPurchase.getPurchase();
		double expected = 6; //Expecting 6 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);

	}

	
	@Test
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(10, 10, 10, 10, 10); //Ten dollar, Ten quarter, Ten dime, Ten nickel and Ten penny of payment.
		double paymentResult = aPurchase.getPayment();
		double expected = 14.1; //Expecting fourteen dollars  and one penny of change.
	    Assert.assertEquals(expected, paymentResult, EPSILON);
	}
	
	
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0); //Five dollars of payment.
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50; //Expecting 3.5 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);
		
	}
	
	@Test
	public void testGiveChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(2);
		aPurchase.receivePayment(5, 0, 0, 0, 0); //Five dollars of payment.
		aPurchase.CalculateChange();
		double changeResult = aPurchase.giveChange();
		double expected = 3; //Expecting 3 dollars of change.
	    Assert.assertEquals(expected, changeResult, EPSILON);
	}
}