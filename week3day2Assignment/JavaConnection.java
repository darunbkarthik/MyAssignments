package week3day2Assignment;

public class JavaConnection extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connect");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute update");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Execute query");
		
	}
	public static void main(String[] args)
	{
	JavaConnection jc =new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeQuery();
	jc.executeUpdate();
	
	}

}
