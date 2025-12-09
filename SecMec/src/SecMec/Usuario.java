package SecMec;
/*
 * 
 */
public class Usuario {
	String username;
    String passwordHash;
    String salt;
    
    public Usuario(String username, String passwordHash, String salt) {
    	this.username = username;
    	this.passwordHash = passwordHash;
    	this.salt = salt;
    }
    
    public String getUsername() {
    	return username;
    }
    
    public void setUsername(String username) {
    	this.username = username;
    }
    
    public String getPasswordHash() {
    	return passwordHash;
    }
    
    public void setPasswordHash(String passwordHash) {
    	this.passwordHash = passwordHash;
    }
    
    public String getSalt() {
    	return salt;
    }
    
    public void setSalt(String salt) {
    	this.salt = salt;
    }
    
    public String toString() {
		return "Usuario{" +
                ", Username:'" + username +
                ", passwordHash:" + passwordHash +
                ", salt:" + salt +
                '}';
	}
}
