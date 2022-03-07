import lesson6.MainApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray {

    @Test
    public void test1ArrayAfter4() {
        int[] in = new int[]{1, 2, 3, 4, 5, 5, 6};
        int[] out = new int[]{5, 5, 6};
        Assertions.assertArrayEquals(out, MainApp.arrayAfter4(in));
    }

    @Test
    public void test2ArrayAfter4() {
        int[] in = new int[]{1, 3, 5, 6};
        Assertions.assertThrows(RuntimeException.class, () -> {

            MainApp.arrayAfter4(in);
        });

    }

    @Test
    public void test1ArrayContainsOnly1and4(){
        int [] in = new int[]{8,2,1,3};
        Assertions.assertFalse(MainApp.arraysHasOneOrFour(in));
    }

    @Test
    public void test2ArraysContainsOnly1and4(){
        int [] in = new int[]{1,4,1,4};
        Assertions.assertTrue(MainApp.arraysHasOneOrFour(in));
    }
}

