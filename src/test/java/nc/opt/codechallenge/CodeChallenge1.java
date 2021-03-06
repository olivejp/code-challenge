package nc.opt.codechallenge;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
public class CodeChallenge1 {

    private int[] rotate(int[] array, int rotate) {
        // TODO Fill this method
        return array;
    }

    @Test
    public void rotateListTwoTime() {
        int[] result = rotate(new int[]{1, 2, 3, 4, 5}, 2);
        assertThat(result[0]).isEqualTo(3);
        assertThat(result[1]).isEqualTo(4);
        assertThat(result[2]).isEqualTo(5);
        assertThat(result[3]).isEqualTo(1);
        assertThat(result[4]).isEqualTo(2);

        result = rotate(new int[]{1, 2}, 1);
        assertThat(result[0]).isEqualTo(2);
        assertThat(result[1]).isEqualTo(1);

        result = rotate(new int[]{1, 2}, 2);
        assertThat(result[0]).isEqualTo(1);
        assertThat(result[1]).isEqualTo(2);
    }

    @Test
    public void rotateListOneTime() {
        int[] result = rotate(new int[]{1, 2}, 1);
        assertThat(result[0]).isEqualTo(2);
        assertThat(result[1]).isEqualTo(1);
    }

    @Test
    public void rotateListFourTime() {
        int[] result = rotate(new int[]{1, 2}, 4);
        assertThat(result[0]).isEqualTo(1);
        assertThat(result[1]).isEqualTo(2);
    }
}
