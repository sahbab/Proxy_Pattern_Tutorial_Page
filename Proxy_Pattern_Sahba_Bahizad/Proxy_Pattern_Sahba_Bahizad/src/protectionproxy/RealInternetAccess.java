/**
 * 
 */
package protectionproxy;

/**
 * This is the RealSubject class
 * 
 * @author Sahba Bahizad
 * 
 */
public class RealInternetAccess implements InternetAccess {
	private Users user = null;

	public RealInternetAccess(Users user) {
		this.user = user;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: "
				+ user.getName());
	}
}
