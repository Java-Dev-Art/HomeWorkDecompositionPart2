public class TaskArmstrongNumber {

    public boolean isArmstrong(int number) {
        int sum = 0;
        for (char c : separateNumber(number)) {
            sum += Math.pow(Integer.parseInt(String.valueOf(c)), separateNumber(number).length);
        }
        return isArmstrong(sum, number);
    }

    private char[] separateNumber(int number) {
        String stringArmstrong = String.valueOf(number);
        return stringArmstrong.toCharArray();
    }

    private boolean isArmstrong(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return true;
        } else {
            return false;
        }
    }
}

