class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == -2147483648 && divisor == -1) {
            return 2147483647;
        }

        boolean negative = false;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            negative = true;
        }

        if (dividend > 0) {
            dividend = -dividend;
        }

        if (divisor > 0) {
            divisor = -divisor;
        }

        int answer = 0;

        while (dividend <= divisor) {
            int temp = divisor;
            int count = 1;

            while (dividend <= temp + temp && temp + temp < 0) {
                temp = temp + temp;
                count = count + count;
            }

            dividend = dividend - temp;
            answer = answer + count;
        }

        if (negative) {
            answer = -answer;
        }

        return answer;
    }
}
