package entities;

import java.sql.Date;
import java.util.Objects;

public class EntradaDeLog {
	
	private String username;
	private Date moment;
	
	
	public EntradaDeLog(String username, Date moment) {
		this.username = username;
		this.moment = moment;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	@Override
	public int hashCode() {
		return Objects.hash(username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntradaDeLog other = (EntradaDeLog) obj;
		return Objects.equals(username, other.username);
	}
	
	
	
	

}
