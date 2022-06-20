import java.util.Random;

public class CredentialService {

    public String generateEmail(Employee employee, String department) {
        return employee.getFirstName()+employee.getLastName()+"@"+department+".abc.com";
    }

    public String generatePassword(int length) {
        String capitalLetters = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmopqrstuvwxyz";
        String digits = "0123456789";
        String specialChar = "!@#$%^&*";
        Random rnd = new Random();
        String allChars = capitalLetters+smallLetters+digits+specialChar;
        StringBuilder sb = new StringBuilder(length);
        for(int i=0;i<length;i++){
            if(i == 0) {
                sb.append(digits.charAt(rnd.nextInt(digits.length())));
            } else if(i == 1) {
                sb.append(specialChar.charAt(rnd.nextInt(specialChar.length())));
            } else if(i == length-1) {
                sb.append(capitalLetters.charAt(rnd.nextInt(capitalLetters.length())));
            } else if(i == length-2) {
                sb.append(smallLetters.charAt(rnd.nextInt(smallLetters.length())));
            } else {
                sb.append((allChars).charAt(rnd.nextInt(allChars.length())));
            }
        }
        return sb.toString();
    }
    public void showCredentials(Employee employee){
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email       ---->" + employee.getEmail());
        System.out.println("Password    ---->" + employee.getPassword());
    }



}
