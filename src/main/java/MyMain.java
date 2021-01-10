public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int[] deck = new int[arr.length];
        for (int i = 0; i < deck.length; i++){
            if (i%2 == 0){
                deck[i] = arr[i/2];
            }
            else{
                deck[i] = arr[i/2 + deck.length/2];
            }
        }
        return deck;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        for (int i = 0; i < arr.length -1; i++){
            int random = (int)(Math.random() * (arr.length - i - 1)) + i + 1;
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
