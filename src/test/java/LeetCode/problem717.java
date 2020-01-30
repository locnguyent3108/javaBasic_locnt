package LeetCode;

import org.junit.Test;

public class problem717 {
    /*
    We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).
    Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
     */

    public boolean Test(int[] bits) {
        int ones = 0;
        //Starting from one but last, as last one is always 0.
        for (int i = bits.length - 2; i >= 0 && bits[i] != 0 ; i--) {
            ones++;
        }
        if (ones % 2 > 0)
            return false;
        return true;
    }

    @Test
    public void main() {
        int[] bits = {1,0};
        Test(bits);
    }
}