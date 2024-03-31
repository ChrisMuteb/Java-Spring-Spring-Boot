import org.example.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {
    private MyMath math = new MyMath();

    @Test
    public void calculateSum_ThreeMemberArray(){
        // given & when & then
        assertEquals(6, math.calculateSum(new int[]{1,2,3}));
    }

    @Test
    public void calculateSum_ZeroLengthArray(){
        // given & when & then
        assertEquals(0, math.calculateSum(new int[]{}));
    }


}
