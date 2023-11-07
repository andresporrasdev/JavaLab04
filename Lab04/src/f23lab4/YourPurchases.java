package f23lab4;

/**
 * You were at a store near your home to make some purchases last weekend. You
 * had so many coins that you decided to use them for those purchases. A cash
 * register sums up the sales and then computes the change due to you.
 */
public class YourPurchases
{

	// Canadian money is expressed as "dollars".
	// A dollar has 100 "cents".
	// All values are expressed as dollars in this code.
	// There is a one-dollar coin nicknamed the "loonie".

	/** The 25-cent coin is a quarter */
	public static final double QUARTER_VALUE = 0.25;

	/** A 10-cent coin is called a dime. */
	public static final double DIME_VALUE = 0.1;
	
	/** A 5-cent coin is called a dime. */
	public static final double NICKEL_VALUE = 0.05;
	
	/** A 1-cent coin is called a penny.*/
	public static final double PENNY_VALUE = 0.01;

	private double purchase;
	private double payment;

	/**
	 * Constructs a cash register - your purchases- with no money in it.
	 */
	public YourPurchases()
	{
		purchase = 0;
		payment = 0;
	}

	/**
	 * Returns the amount of purchases.
	 * 
	 * @return amount of purchases
	 */
	public double getPurchase()
	{
		return purchase;

	}

	/**
	 * Returns the amount of payment.
	 * 
	 * @return amount of payments
	 */
	public double getPayment()
	{
		return payment;

	}

	/**
	 * Records the purchase price of an item.
	 * 
	 * @param amount the price of the purchased item
	 */
	public void recordPurchase(double amount)
	{
		purchase = purchase + amount;

	}

	/**
	 * Enters the payment received from the customer.
	 * 
	 * @param dollars  the number of dollars in the payment
	 * @param quarters the number of quarters in the payment
	 * @param dimes    the number of dimes in the payment
	 * @param nickels  the number of nickels in the payment
	 * @param pennies  the number of pennies in the payment
	 */
	public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies)
	{
		payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE
				+ pennies * PENNY_VALUE;
	}

	/**
	 * Computes and returns the change due. This calculates the change as payment
	 * minus the purchases
	 * 
	 * @return the change due to the customer
	 */
	public double CalculateChange()
	{
		double change = payment - purchase;

		return change;
	}

	/**
	 * Computes the change due and resets the machine for the next customer.
	 * 
	 * @return the change due to the customer
	 */
	public double giveChange()
	{
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}
