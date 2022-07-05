package model;
import java.io.Serializable;

	

public class Mutter implements Serializable {

	private String username;
	private String text;
	private static int mojinum = 300;
	
	public Mutter() {}
	public Mutter(String username, String text) {
		this.username = username;
		this.text = text;
	}
	public int getMojinum() {
		return mojinum;
	}
	public void setMojinum(int mojinum) {
		Mutter.mojinum = mojinum;
	}
	public String getUsername() {
		return username;
	}
	public String getText() {
		return text;
	}
	
	
	
}
