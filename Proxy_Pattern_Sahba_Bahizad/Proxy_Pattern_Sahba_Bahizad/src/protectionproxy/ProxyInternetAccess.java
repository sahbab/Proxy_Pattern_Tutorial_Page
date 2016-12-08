/**
 * 
 */
package protectionproxy;
/**
 * This is the Proxy class which wraps the RealSubject class
 * 
 * @author Sahba Bahizad
 * 
 */
public class ProxyInternetAccess implements InternetAccess {
	private Users user = null;
	
	private RealInternetAccess objRealIA = null;

	public ProxyInternetAccess(Users user) {
		this.user = user;
	}

	@Override
	public void grantInternetAccess() {
		if (user.getRole() > 5) {
			objRealIA = new RealInternetAccess(user);
			objRealIA.grantInternetAccess();
		} else {
			System.out
					.println("No Internet access granted. Your job level is below 5");
		}
	}


}
