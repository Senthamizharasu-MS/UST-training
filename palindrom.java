public class palindrom {
    public static void main(String[] args) {
        char Arr[] = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        boolean pali = true;
        for (int i = 0; i < Arr.length / 2; i++) {
            if (Arr[i] != Arr[Arr.length - i - 1]) {
                pali = false;
                break;
            }
        }
    } 
}
