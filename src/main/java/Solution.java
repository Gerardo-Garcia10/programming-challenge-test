public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double sum = (t1 + t2 + t3 + t4);
        double average = sum / 4;
        return average;
    }

    public int roundAverage(double average) {
        int roundedAverage = (int) (average + 0.5);
        // remove 0 and return your answer
        return roundedAverage;
    }

    public boolean isPassing(int roundedAverage) {
        boolean isPassing;
        if (roundedAverage < 65) {
            isPassing = false;
        } else {
            isPassing = true;
        }
        return isPassing;
    }
       
        


    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        double totalStock = shares * price;
        // remove 0.0 and return your answer
        return totalStock;
    }


    public int roundValueChange(double totalStock) {
        int roundValueChange = (int) (Math.round(totalStock));
        // remove 0 and return your answer
        return roundValueChange;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        double number1 = (int)(userDouble/100);
        number1 += 1;
        number1 %= 10;
        number1 *= 100;
        double number2 = (int)(userDouble/10);
        number2 %= 10;
        number2 += 1;
        number2 %= 10;
        number2 *= 10;
        double number3 = (int)(userDouble);
        number3 %= 10;
        number3 += 1;
        number3 %= 10;
        double number4 = (int)(userDouble * 10);
        number4 %= 10;
        number4 += 1;
        number4 %= 10;
        number4 /= 10;
        double number5 = (int)(userDouble * 100);
        number5 %= 10;
        number5 += 1;
        number5 %= 10;
        number5 /= 100;
        return (number1 + number2 + number3 + number4 + number5);
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
