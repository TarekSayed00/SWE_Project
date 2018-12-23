package sww;
import java.util.*;

public class UserService {
	static ArrayList<User> mylist = new ArrayList<User>();
	public void SignUp ()
	{
		User tmp = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("Sign UP ...");
		System.out.println("Enter your User Name : ");
		tmp.setUserName(input.nextLine());
		System.out.println("Enter your password : ");
		tmp.setPassword(input.nextLine());
		mylist.add(tmp);
		for (int i=0 ; i<mylist.size() ; i++)
		{
			System.out.println(mylist.get(i).getUserName() +""+mylist.get(i).getPassword());
		}
	}
	
	public void LogIn ()
	{
		String name ,pass;
		Scanner input = new Scanner(System.in);
		System.out.println("Log In ...");
		System.out.println("Enter Your User Name : ");
		name = input.nextLine();
		System.out.println("Enter you Password : ");
		pass = input.nextLine();
		for (int i=0 ; i<mylist.size() ; i++)
		{
			if (name.equals(mylist.get(i).getUserName())&&pass.equals(mylist.get(i).getPassword()))
			{
				System.out.println("Successfully");
				break;
			}
			
			if (i==mylist.size()-1)
			{
				System.out.println("UnSuccessfully");
			}
		}
	}
	   
}
