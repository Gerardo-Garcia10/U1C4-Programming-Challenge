public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        boolean endsLy = false;
        if (x.length() > 2) {
            if (x.substring(x.length() - 2).equals("ly")) {
            endsLy = true;
        }
    }
        return endsLy;
    }

    public String conCat(String s1, String s2) {
        String firstChar1 = "";
        String firstChar2 = "";
        if (s1.length() > 1) {
            firstChar1 = s1.substring(s1.length() - 1);
        }
        if (s2.length() > 1) {
        firstChar2 = s2.substring(0,1);
        }
        if (firstChar1.equals(firstChar2)) {
            s2 = s2.substring(1);
        }
        String finalString = s1 + s2;
        return finalString;
    }

    public String withoutX(String s1) {
        String firstChar = s1.substring(0,1);
        String lastChar = s1.substring(s1.length() -1);
        if (lastChar.equals("x")) {
            s1 = s1.substring(0, s1.length() - 1);
        }
        if (firstChar.equals("x")) {
            s1 = s1.substring(1);
        }
        return s1;
    }

    public String fizzString(String s1) {
        String firstChar = s1.substring(0,1);
        String lastChar = s1.substring(s1.length() - 1);
        boolean containsF = false;
        boolean containsB = false;
        String finalString = s1;
        if (firstChar.equals("f")) {
            containsF = true;
        }
        if (lastChar.equals("b")) {
            containsB = true;
        }
        if (containsF || containsB) {
            finalString = "";
            if (containsF) {
                finalString = finalString + "Fizz";
            }
            if (containsB) { 
                finalString = finalString + "Buzz";
            }
        }
        
        return finalString;
    }

    public String fizzString2(int x) {
        int test = x;
        String testString = "";
        boolean divisibleBy3 = false;
        boolean divisibleBy5 = false;
        if (test % 3 == 0) {
            divisibleBy3 = true;
        }
        if (test % 5 == 0) {
            divisibleBy5 = true;
        }
        if (divisibleBy3 || divisibleBy5) {
            if (divisibleBy3) {
                testString = testString + "Fizz";
            }
            if (divisibleBy5) {
                testString = testString + "Buzz";
            }
        } else {
            testString = "i" + test;
            testString = testString.substring(1);
        }
        testString = testString + "!";
        return testString;
    }

}
