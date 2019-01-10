package tarena.day14;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		super();
	}
	public WrongPasswordException(String s) {
		super(s);
	}
	public WrongPasswordException(Exception e) {
		super(e);
	}
}
