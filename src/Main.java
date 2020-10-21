import java.io.File;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    final static Logger logger = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        File f = null;
        File f1 = null;
        String v, v1;
        boolean bool = false;
        f = new File("C:\\file.txt");
        f1 = new File("C:\\Program Files");
        try {
            v = f.getName();
            v1 = f1.getName();
            Scanner sc = new Scanner(System.in);
            System.out.println("შემოიტანე საძიებო სიტყვა: ");
            String keyboardInput = sc.next();
            logger.info("შემოტანილი სიტყვაა: " + keyboardInput);
            if (keyboardInput == v){
                logger.info("მოიძებნა " + v);
            }
            if (keyboardInput == v1) {
                logger.info("მოიძებნა: " + v1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
