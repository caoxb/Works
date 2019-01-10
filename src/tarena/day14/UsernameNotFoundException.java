package tarena.day14;

public class UsernameNotFoundException 
					extends Exception {
	public UsernameNotFoundException() {
		super();
	}
	public UsernameNotFoundException(String s) {
		super(s);
	}
	public UsernameNotFoundException(Exception e) {
		super(e);
	}
}
