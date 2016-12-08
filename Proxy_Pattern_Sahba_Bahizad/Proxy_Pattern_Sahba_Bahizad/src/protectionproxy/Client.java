/**
 * 
 */
package protectionproxy;

/**
 * @author Sahba Bahizad
 * 
 */
public class Client {

	public static void main(String[] args) {
		InternetAccess internetAccess = new ProxyInternetAccess(new Users("Jim Smith", 3));
		internetAccess.grantInternetAccess();
	}

}
