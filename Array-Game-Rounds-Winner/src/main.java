public class main {
    private static int arrayGame(int[] arr, int k) {
        int count = 0;
        int contender = 1;
        int winner = arr[0];

        while(count < k && contender < arr.length) {
            if(arr[contender] > winner) {
                count = 1;
                winner = arr[contender];
            } else {
                count++;
            }
            contender++;
        }

        return winner;
    }

    public static void main(String[] s) {
        int[] arr = {2,1,3,5,4,6,7};
        System.out.println(arrayGame(arr, 2));
        //Expected output: 5

    }
}
