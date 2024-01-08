public class problema1 {
    public static void main(String[] args) {

        int[][] tab = new int[10][10];
        for (int x = 1; x <= 10; x++) {
            for (int n = 1; n <= 10; n++) {
                tab[x - 1][n - 1] = x * n;
            }
        }
        for (int x = 0; x < 10; x++) {
            for (int n = 0; n < 10; n++) {

                System.out.print(tab[x][n] + " \t");

            }
            System.out.println();

        }
    }
}