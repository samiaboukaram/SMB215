package applications.socialMedia;

import javax.servlet.http.HttpServletResponse;

public class SocialMediaHelper {

	private final String facebookAppID;
	private final String facebookAppSecret;
	private final String callbackView;
	
	public SocialMediaHelper(){
		/*
		 * TODO Create socialMedia.properties ( it will contains the facebook app properties)
		 * TODO parse the socialMedia.properties and set the FacebookAppID, facebookAppSecret and callbackView attributes
		 */
		
		facebookAppID = "";
		facebookAppSecret ="";
		callbackView = "";
 	}
	
	/**
	 * redirect to facebook popup to let the user to authenticate
	 * @param response
	 */
	public void loginWithFaceBook(HttpServletResponse response){
		try{
			response.sendRedirect("https://www.facebook.com/dialog/oauth?client_id="+facebookAppID+"&redirect_uri="+this.callbackView);
		}catch(Exception e){
			
		}
	}
	
	//TODO handle the facebook response and parse the response to get the user_id
	
}
