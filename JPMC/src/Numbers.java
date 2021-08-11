public class Numbers {

    static String findDigits(String line) {

        String[] num = { "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine" };

        int[] arr = new int[10];
        String ans = "";

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'z')
                arr[0]++;
            if (line.charAt(i) == 'w')
                arr[2]++;
            if (line.charAt(i) == 'g')
                arr[8]++;
            if (line.charAt(i) == 'x')
                arr[6]++;
            if (line.charAt(i) == 'v')
                arr[5]++;
            if (line.charAt(i) == 'o')
                arr[1]++;
            if (line.charAt(i) == 's')
                arr[7]++;
            if (line.charAt(i) == 'f')
                arr[4]++;
            if (line.charAt(i) == 'h')
                arr[3]++;
            if (line.charAt(i) == 'i')
                arr[9]++;
        }

        arr[7] -= arr[6];
        arr[5] -= arr[7];
        arr[4] -= arr[5];
        arr[1] -= (arr[2] + arr[4] + arr[0]);
        arr[3] -= arr[8];
        arr[9] -= (arr[5] + arr[6] + arr[8]);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr[i]; j++) {
                ans += (char)(i + '0');
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "owoftnuoer";
        System.out.println(findDigits(s));
    }

}
