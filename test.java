import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
 
public class test {
 
  public static void main(String args[]) throws Exception {
 
    HttpClient client = new HttpClient();
    client.getParams().setParameter("username", "sridhar.b.s@capgemini.com");
    client.getParams().setParameter("password", "Sridhar4661!");
 
    GetMethod method = new GetMethod("https://kabuki201909200533435.saas.appdynamics.com/controller");
    try{
      client.executeMethod(method);
      Cookie[] cookies = client.getState().getCookies();
      for (int i = 0; i < cookies.length; i++) {
        Cookie cookie = cookies[i];
        System.err.println(
          "Cookie: " + cookie.getName() +
          ", Value: " + cookie.getValue() +
          ", IsPersistent?: " + cookie.isPersistent() +
          ", Expiry Date: " + cookie.getExpiryDate() +
          ", Comment: " + cookie.getComment());
        }
      client.executeMethod(method);
    } catch(Exception e) {
      System.err.println(e);
    } finally {
      method.releaseConnection();
    }
  }
}
