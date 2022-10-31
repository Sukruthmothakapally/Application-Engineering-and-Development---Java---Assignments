import java.util.regex.*;
public class Exercise_4 {
    public static void main(String[] args) {

        //Regex pattern to validate phone number:
        Pattern phno = Pattern.compile("^\\+\\d{2}( )[6 7]\\d{9}"); //mandatory 2 digit country code starting with + , followed by 10 digit number starting with 6 or 7
        String phno_1 ="+91 7876264498"; //positive case
        String phno_2 ="798066543"; //negative case
        Matcher phno_m1 = phno.matcher(phno_1);
        Matcher phno_m2 = phno.matcher(phno_2);
        System.out.println("Is "+phno_1+" a valid phone number? "+phno_m1.matches());
        System.out.println("Is "+phno_2+" a valid phone number? "+phno_m2.matches());

        System.out.println();

        //Regex pattern to validate email id:
        Pattern email = Pattern.compile("^[a-z\\d._]{4,10}@[a-z\\d]+\\.[a-z]{2,3}$", Pattern.CASE_INSENSITIVE); // starting with minimum of 4 to 10 alphabets or digits or dot or underscore followed by @ and min of 1 alphabet or digit followed by . and 2 or 3 character organization name. finally making everything case insensitive.
        String email1 = "suk_mo123@northeastern.edu"; //positive case
        String email2 = "sukruthgmail,in"; //negative case
        Matcher email_m1 = email.matcher(email1);
        Matcher email_m2 = email.matcher(email2);
        System.out.println("Is "+email1+" a valid email address? "+email_m1.matches());
        System.out.println("Is "+email2+" a valid email address? "+email_m2.matches());

        System.out.println();

        //Regex pattern to validate password:
        Pattern paswrd = Pattern.compile("^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$])(?=\\S+$).{7,15}$"); // 7 to 15 character password - starting with lowercase, 1 uppercase, 1 digit, 1 given special character and cannot contact space.
        String pass1 = "sukrS1$!"; //positive case
        String pass2 = "fsdfwe "; //negative case
        Matcher pass_m1 = paswrd.matcher(pass1);
        Matcher pass_m2 = paswrd.matcher(pass2);
        System.out.println("Is "+pass1+" a valid password? "+pass_m1.matches());
        System.out.println("Is "+pass2+" a valid password? "+pass_m2.matches());

        System.out.println();

        //Regex pattern to validate username - firstname lastname
        Pattern username = Pattern.compile("^[a-zA-Z]{4,10}[_.][a-zA-Z]{4,10}$"); // username with only alphabets - 4 to 10 character first name separated by . or _ followed by 4,10 character last name
        String user1 = "Sukruth.mothA"; //positive case
        String user2 = "sukruthmotha "; //negative case
        Matcher user_m1 = username.matcher(user1);
        Matcher user_m2 = username.matcher(user2);
        System.out.println("Is "+user1+" a valid username? "+user_m1.matches());
        System.out.println("Is "+user2+" a valid username? "+user_m2.matches());

        System.out.println();

        //Regex pattern to validate address with zipcode
        Pattern address = Pattern.compile("^#\\d{1,4}( )[a-zA-Z]{2,20}( )[A-Z]{2,3}( )\\d{5}$"); // address starting with % followed by 1 to 4 digit number. space. followed by 2 to 20 character city name. space. followed by 2-3 character state name. space. Ending with 5 digit zip code.
        String addr1 = "#1 manhattan NY 12345"; //positive case
        String addr2 = "77 san jose CA 12121"; //negative case
        Matcher addr_m1 = address.matcher(addr1);
        Matcher addr_m2 = address.matcher(addr2);
        System.out.println("Is "+addr1+" a valid address? "+addr_m1.matches());
        System.out.println("Is "+addr2+" a valid address? "+addr_m2.matches());

    }
}

