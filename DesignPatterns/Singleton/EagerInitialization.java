/**
 * 提前初始化
*/
public class EagerInitialization{
	private static Resource resource = new Resource();
	public static Resource getResource(){
		return resource;
	}
}
