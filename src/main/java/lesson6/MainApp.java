package lesson6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MainApp {
//    private static Logger logger = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) throws IOException {

//        LogManager logManager = LogManager.getLogManager();
//        logManager.readConfiguration(new FileInputStream("logging.properties"));
//        logger.info("java");


    }   public static int[] arrayAfter4(int[]arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }

        }
        throw new RuntimeException("Массив не содержит цифру 4");
    }

    public static boolean arraysHasOneOrFour(int[]arr) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1) {
                return hasOne = true;

            }
            if (arr[i] == 4) {
                return hasFour = true;
            }

        }return hasFour && hasOne;

    }

}









