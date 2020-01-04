import org.json.simple.JSONObject;

public class MainClass {

	public static void main(String[] args) throws Exception {
		JSONObject request = Request.createInstance();
		System.out.println(request);
	}

}
