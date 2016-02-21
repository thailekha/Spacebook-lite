package models;

import javax.persistence.Entity;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.OneToMany;
import play.db.jpa.Model;
import play.db.jpa.Blob;

@Entity
public class User extends Model
{
  public String firstName;
  public String lastName;
  public String email;
  public String password;

  public User(String firstName, String lastName, String email, String password)
  {
	  this.firstName = firstName;
	  this.lastName  = lastName;
	  this.email     = email;
	  this.password  = password;
  }
  
  public void editUser(String firstName, String lastName, String password)
  {
	  if(!firstName.equals(""))
	  {
		  this.firstName = firstName;
	  }
	  if(!lastName.equals(""))
	  {
		  this.lastName = lastName;
	  }
	  if(!password.equals(""))
	  {
		  this.password = password;
	  }
  }
  
  public static User findByEmail(String email)
  {
	  return find("email", email).first();
  }
  
  public boolean checkPassword(String password)
  {
	  return this.password.equals(password);
  }
}