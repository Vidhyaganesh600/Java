package Sdp;

public class pg14 {
        public static void main(String[] args) {
            int result = MaxExponents(7, 12);
            System.out.println("Result: " + result); // Output: 8
        }
    
        static int MaxExponents(int a, int b) {
            int maxNumber = a;
            int maxExponent = getExponentOfTwo(a);
    
            for (int i = a + 1; i <= b; i++) {
                int exponent = getExponentOfTwo(i);
                if (exponent > maxExponent) {
                    maxExponent = exponent;
                    maxNumber = i;
                }
            }
            return maxNumber;
        }
    
        static int getExponentOfTwo(int num) {
            int exponent = 0;
            while (num % 2 == 0) {
                exponent++;
                num /= 2;
            }
            return exponent;
        }
}
