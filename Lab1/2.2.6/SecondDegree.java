import javax.swing.JOptionPane;
import java.lang.Math;
public class SecondDegree {
    public static void main(String[] args){
        String strNum1, strNum2, strNum3;
        String strNotification = "You've just entered: ";
        String strNoti1 = "The second-degree equation with one variable: a.x^2 + b.x + c = 0 (a!=0)";
        
        JOptionPane.showMessageDialog(null, strNoti1, "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);

        strNum1 = JOptionPane.showInputDialog(null, "Please input a", "Input a", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        if (num1 == 0) {
            String strNoti2 = "Please input a != 0";
            JOptionPane.showMessageDialog(null, strNoti2, "Error!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {

        strNum2 = JOptionPane.showInputDialog(null, "Please input b", "Input b", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input c", "Input c", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        double num3 = Double.parseDouble(strNum3);

            strNotification += "a = " + num1 + ", b = " + num2 + ", c = " + num3;

        JOptionPane.showMessageDialog(null, strNotification, "Show all numbers", JOptionPane.INFORMATION_MESSAGE);

        double num7 = num2*num2 - 4*num1*num3;  
        
        String strNoti2 = "denta = " + num7;

        JOptionPane.showMessageDialog(null, strNoti2, "Show all determinants", JOptionPane.INFORMATION_MESSAGE);

        if (num7 > 0) {
            double num8 = (-num2 + Math.sqrt(num7))/(2*num1);
            double num9 = (-num2 - Math.sqrt(num7))/(2*num1);
            String strNoti3 = "x1 = " + num8 + "and x2 = " + num9;
            JOptionPane.showMessageDialog(null, strNoti3, "Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }  else if (num7 == 0){
            double num10 = (-num2)/(2*num1);
            String strNoti4 = "x = " + num10;
            JOptionPane.showMessageDialog(null, strNoti4, "Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            String strNoti5 = "There is no solutions";
            JOptionPane.showMessageDialog(null, strNoti5, "No solutions!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        }

        
    }
}
