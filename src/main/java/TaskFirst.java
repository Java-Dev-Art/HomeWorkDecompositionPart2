public class TaskFirst {
    public boolean compareNumbers(int firstValue, int secondValue, int thirdValue) {
        if (isOdd(firstValue) || isOdd(secondValue) || isOdd(thirdValue)) {
            return false;
        }
        return true;
    }

    private boolean isOdd(int number) {
        if (number > 2) {
            for (int i = 3; i <= number; i++) {
                if (number % 2 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}

