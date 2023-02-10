public class Main {
    public static void main(String[] args) {

        System.out.println(Main.isPalindrome(1221));

    }

    public static boolean isPalindrome(int x) {
        boolean flag = true;

        String temp = Integer.toString(x);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] =  temp.charAt(i) - '0';
        }

        int middle = numbers.length / 2;

        for (int i=0; i <= middle; i++) {
            if (numbers[i] != numbers[numbers.length-i-1]) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}