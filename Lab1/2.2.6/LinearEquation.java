
import javax.swing.JOptionPane;
public class LinearEquation {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";
        String strNoti1 = "The first-degree equation (linear equation) with one variable: ax + b = 0";
        String strNoti2 = "Please input a != 0";
        

        JOptionPane.showMessageDialog(null, strNoti1, "Linear Equation", JOptionPane.INFORMATION_MESSAGE);

        strNum1 = JOptionPane.showInputDialog(null, "Please input a (a != 0)", "Input a", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        if (num1 == 0) {
            JOptionPane.showMessageDialog(null, strNoti2, "Error!", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        } else {
            strNotification += "a = " + strNum1;

        strNum2 = JOptionPane.showInputDialog(null, "Please input b = ", "Input b", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        strNotification += " and b = " + strNum2;

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        double num3 = (0 - num2)/num1;
        String strNoti3 = "x = -b/a = " + num3;

        JOptionPane.showMessageDialog(null, strNoti3, "Show x", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
        }
    }
    }

