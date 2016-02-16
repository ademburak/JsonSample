import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {

	private final static Gson gson = new GsonBuilder().create();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildBean child = new ChildBean();
		child.setProperty1(0);
		child.setProperty2(1);
		child.setProperty3(2);

		String json = gson.toJson(child);

		ParentBean parent = gson.fromJson(json, ParentBean.class);

		System.out.println(parent.getProperty1() + " " + parent.getProperty2());
	}
}
