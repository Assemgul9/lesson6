import lesson6.MainApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MassTest {

    public static  Stream<Arguments> dataForAfter4(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1,4,5,6,7}, new int[]{5,6,7}));
        list.add((Arguments.arguments(new int[]{1,2,4}, new int []{})));
        list.add(Arguments.arguments(new int[]{2,5,4,1,2},new int[]{1,2}));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForAfter4")
    public void massTestArrayAfter4(int[] in, int[]out){
        Assertions.assertArrayEquals(out, MainApp.arrayAfter4(in));
    }

    public static  Stream<Arguments> dataForOnly1and4(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{5,2,1,4,7},false));
        list.add(Arguments.arguments(new int[]{1,1,4}, true));
        list.add(Arguments.arguments(new int[]{2,5,4,1,2},false));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForOnly1and4")
    public void massTestArrayContainsOnly1and4(int[] in, boolean flag){
        Assertions.assertEquals(flag,MainApp.arraysHasOneOrFour(in));
    }

}
