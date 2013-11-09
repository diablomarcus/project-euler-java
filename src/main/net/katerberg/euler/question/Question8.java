package net.katerberg.euler.question;

public class Question8 {

    public static void main(String args[]) {
        StringBuilder inputBuilder = new StringBuilder();
        inputBuilder.append("73167176531330624919225119674426574742355349194934");
        inputBuilder.append("96983520312774506326239578318016984801869478851843");
        inputBuilder.append("85861560789112949495459501737958331952853208805511");
        inputBuilder.append("12540698747158523863050715693290963295227443043557");
        inputBuilder.append("66896648950445244523161731856403098711121722383113");
        inputBuilder.append("62229893423380308135336276614282806444486645238749");
        inputBuilder.append("30358907296290491560440772390713810515859307960866");
        inputBuilder.append("70172427121883998797908792274921901699720888093776");
        inputBuilder.append("65727333001053367881220235421809751254540594752243");
        inputBuilder.append("52584907711670556013604839586446706324415722155397");
        inputBuilder.append("53697817977846174064955149290862569321978468622482");
        inputBuilder.append("83972241375657056057490261407972968652414535100474");
        inputBuilder.append("82166370484403199890008895243450658541227588666881");
        inputBuilder.append("16427171479924442928230863465674813919123162824586");
        inputBuilder.append("17866458359124566529476545682848912883142607690042");
        inputBuilder.append("24219022671055626321111109370544217506941658960408");
        inputBuilder.append("07198403850962455444362981230987879927244284909188");
        inputBuilder.append("84580156166097919133875499200524063689912560717606");
        inputBuilder.append("05886116467109405077541002256983155200055935729725");
        inputBuilder.append("71636269561882670428252483600823257530420752963450");
        String input = inputBuilder.toString();
        int result = 0;
        for (int i = 0; i < inputBuilder.length() - 4; i++) {
            int potentialResult = productOf(getValueAt(input, i), getValueAt(input, i + 1), getValueAt(input, i + 2), getValueAt(input, i + 3), getValueAt(input, i + 4));
            if (result < potentialResult) {
                result = potentialResult;
            }
        }

        System.out.println(result);
    }

    private static int getValueAt(String input, int position) {
        return Integer.parseInt(input.charAt(position) + "");
    }

    private static int productOf(int first, int second, int third, int fourth, int fifth) {

        return first * second * third * fourth * fifth;
    }
}
