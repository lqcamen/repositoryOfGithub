/**
*���þ�̬�ڲ������ӳٳ�ʼ��
*/
public class DelayInitialization{
	private static class ResourceHolder{
		public static Resource resource = new Resource();
	}
	
	public static Resource getResource(){
		return ResourceHolder.resource;
	}
}