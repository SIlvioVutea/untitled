public class Main {
    public static void main(String args[]) {
        String inputString = "corona virus";
        int lunghezza = inputString.length();
        if (inputString.length() > 10) {
            System.out.println("Lunghezza maggiore di 10.");
        } else if (inputString.length() < 10) {
            System.out.println("Lunghezza minore di 10.");
        } else if (inputString.length() == 10) {
            System.out.println("Lunghezza uguale a 10.");
        }
    }
}