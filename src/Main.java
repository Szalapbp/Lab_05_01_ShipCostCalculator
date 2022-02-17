public class Main
{

    public static void main(String[] args)
    {
	double itemPrice;
    final double shippingRate = .02;
    itemPrice = 50.86;

        if(itemPrice <= 100)
        {
            System.out.println(" The shipping cost for your item is $" + itemPrice * shippingRate);

        }
        else
        {

            System.out.println("The shipping cost for your item is Free! ");

        }
    }
}
