package day9;

public class Emailsplitter {

	public static void main(String[] args) {
		String email = "muskanjha777@gmail.com";
        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);


	}

}
