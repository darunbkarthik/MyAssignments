package week3day2Assignment;

public interface DatabaseConnection {

	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();
	
}
