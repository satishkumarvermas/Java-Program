import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 3, 5, 6, 4, 4 };
        int fre[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j] && fre[i] != -1) {
                    count++;
                    fre[j] = -1;
                }
                if (count == 0) {
                    continue;
                }
                fre[i] = count;
            }
        }
        System.out.println(Arrays.toString(fre));
    }
}