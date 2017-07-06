/**
 * 
 */

/**
 * @author User
 *
 */
public class Message {
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}

	

}
