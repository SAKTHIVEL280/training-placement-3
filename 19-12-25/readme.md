# divide two integers - leetcode 29
You are given:

a dividend (number to be divided)

a divisor (number you divide by)

You must find the quotient (result of division)

Restrictions

❌ You are not allowed to use:

/

*

%

Rules

Ignore the decimal part
7 / 3 = 2.333 → 2

Result must stay within 32-bit integer range

Key Idea (Very Important)

Division is just repeated subtraction.

Example:

10 ÷ 3

10 - 3 = 7  (1 time)
7  - 3 = 4  (2 times)
4  - 3 = 1  (3 times)


We subtracted 3 times, so the answer is 3.

But subtracting one by one is slow, so we subtract big chunks using powers of 2.

Why We Use Negative Numbers

Java has a problem:

Integer.MIN_VALUE = -2147483648
Integer.MAX_VALUE =  2147483647


MIN_VALUE has no positive equivalent.

So the safest trick is:
👉 convert everything to negative numbers

Negative range is larger → no overflow.

Step-by-Step Java Code (Very Basic)
class Solution {
    public int divide(int dividend, int divisor) {


This is just where the code starts.

Step 1: Handle Overflow Case
if (dividend == -2147483648 && divisor == -1) {
    return 2147483647;
}


Why?

-2147483648 ÷ -1 = 2147483648 ❌ (too big)


So we return the maximum allowed number.

Step 2: Decide the Sign (Positive or Negative)
boolean negative = false;

if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
    negative = true;
}


Rule:

One negative → answer negative

Both same sign → answer positive

Step 3: Convert Both Numbers to Negative
if (dividend > 0) {
    dividend = -dividend;
}

if (divisor > 0) {
    divisor = -divisor;
}


Now:

dividend is negative

divisor is negative

Step 4: Actual Division Using Subtraction
int answer = 0;


This will store the result.

Step 5: Subtract in Big Steps
while (dividend <= divisor) {
    int temp = divisor;
    int count = 1;


We start with:

temp → current subtraction value

count → how many times we subtract

Step 6: Double the Divisor (Fast Subtraction)
    while (dividend <= temp + temp && temp + temp < 0) {
        temp = temp + temp;
        count = count + count;
    }


Example:

dividend = -10
divisor  = -3

temp becomes:
-3 → -6 → stop


This speeds up the process.

Step 7: Subtract and Count
    dividend = dividend - temp;
    answer = answer + count;
}


Repeat until dividend becomes smaller than divisor.

Step 8: Apply the Sign
if (negative) {
    answer = -answer;
}

return answer;

---


# find first and last position of element in sorted array - leetcode 34

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = -1;
        int e = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (s == -1) {
                    s = i;
                }
                e = i;
            }
        }
        return new int[]{s, e};
    }
}
