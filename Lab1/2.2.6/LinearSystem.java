import javax.swing.JOptionPane;
public class LinearSystem {
    public static void main(String[] args){
        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
        String strNotification = "You've just entered: ";
        String strNoti1 = "The system of first-degree equation (linear equation) with two variables: a11.x1 + a12.x2 = b1 and a21.x1 + a22.x2 = b2";

        JOptionPane.showMessageDialog(null, strNoti1, "Linear System", JOptionPane.INFORMATION_MESSAGE);

        strNum1 = JOptionPane.showInputDialog(null, "Please input a11", "Input a11", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input a12", "Input a12", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input b1", "Input b1", JOptionPane.INFORMATION_MESSAGE);
        strNum4 = JOptionPane.showInputDialog(null, "Please input a21", "Input a21", JOptionPane.INFORMATION_MESSAGE);
        strNum5 = JOptionPane.showInputDialog(null, "Please input a22", "Input a22", JOptionPane.INFORMATION_MESSAGE);
        strNum6 = JOptionPane.showInputDialog(null, "Please input b2", "Input b2", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double num3 = Double.parseDouble(strNum3);
        double num4 = Double.parseDouble(strNum4);
        double num5 = Double.parseDouble(strNum5);
        double num6 = Double.parseDouble(strNum6);
            strNotification += "a11 = " + num1 + ", a12 = " + num2 + ", b1 = " + num3 + ", a21 = " + num4 + ", a22 = " + num5 + ", b2 = " + num6;

        JOptionPane.showMessageDialog(null, strNotification, "Show all numbers", JOptionPane.INFORMATION_MESSAGE);

        double num7 = num1*num5 - num4*num2; /* D */
        double num8 = num3*num5 - num6*num2;
        double num9 = num1*num6 - num4*num3;

        String strNoti2 = "D = " + num7 + " and " + "D1 = " + num8 + " and D2 = " + num9;
        JOptionPane.showMessageDialog(null, strNoti2, "Show all determinants", JOptionPane.INFORMATION_MESSAGE);

        if (num7 == 0) {
            if (num8 == 0 && num9 == 0){
                String strNoti3 = "There is infinitely many solutions";
                JOptionPane.showMessageDialog(null, strNoti3, "Infinitely solutions!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                String strNoti4 = "There is no solution";
                JOptionPane.showMessageDialog(null, strNoti4, "No solutions!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        } else {
            double num10 = num8/num7;
            double num11 = num9/num7;
            String strNoti5 = "x1 = " + num10 + " and x2 = " + num11;
            JOptionPane.showMessageDialog(null, strNoti5, "Show x1 and x2", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }  
    }
}
