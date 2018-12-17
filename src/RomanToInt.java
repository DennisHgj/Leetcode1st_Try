public class RomanToInt {
    public enum Roman {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
        private int number;

        Roman(int i) {
            this.number = i;
        }
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i == s.length() - 1) {
                    result = result + 1;
                } else {
                    if (s.charAt(i + 1) == 'V') {
                        result = result + 4;
                        i = i + 1;
                    } else if (s.charAt(i + 1) == 'X') {
                        result = result + 9;
                        i = i + 1;
                    } else {
                        result = result + 1;
                    }
                }

            } else if (s.charAt(i) == 'V') {
                result = result + 5;
            } else if (s.charAt(i) == 'X') {
                if (i == s.length() - 1) {
                    result = result + 10;
                } else {
                    if (s.charAt(i + 1) == 'L') {
                        result = result + 40;
                        i = i + 1;
                    } else if (s.charAt(i + 1) == 'C') {
                        result = result + 90;
                        i = i + 1;
                    } else {
                        result = result + 10;
                    }
                }
            } else if (s.charAt(i) == 'L') {
                result = result + 50;
            } else if (s.charAt(i) == 'C') {
                if (i == s.length() - 1) {
                    result = result + 100;
                } else {
                    if (s.charAt(i + 1) == 'D') {
                        result = result + 400;
                        i = i + 1;
                    } else if (s.charAt(i + 1) == 'M') {
                        result = result + 900;
                        i = i + 1;
                    } else {
                        result = result + 100;
                    }
                }
            } else if (s.charAt(i) == 'D') {
                result = result + 500;
            } else if (s.charAt(i) == 'M') {
                result = result + 1000;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a = romanToInt("III");
        System.out.println(a);
    }
}
