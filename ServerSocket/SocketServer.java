public class SocketServer {
	
	public native void server();
	
	static {
		System.loadLibrary("server");
	}
}
