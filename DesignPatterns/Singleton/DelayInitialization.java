/**
*利用静态内部类做延迟初始化
*/
public class DelayInitialization{
	private static class ResourceHolder{
		public static Resource resource = new Resource();
	}
	
	public static Resource getResource(){
		return ResourceHolder.resource;
	}
}