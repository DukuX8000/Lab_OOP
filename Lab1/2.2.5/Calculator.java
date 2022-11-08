import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        String strSum = num1 + " + " + num2 + " = " + sum;

        JOptionPane.showMessageDialog(null, strSum, "Show sum", JOptionPane.INFORMATION_MESSAGE);

        double dif = num1 - num2;
        String strDif = num1 + " - " + num2 + " = " + + dif;
        JOptionPane.showMessageDialog(null, strDif, "Show difference", JOptionPane.INFORMATION_MESSAGE);

        double pro = num1 * num2;
        String strPro = num1 + " * " + num2 + " = " + + pro;
        JOptionPane.showMessageDialog(null, strPro, "Show product", JOptionPane.INFORMATION_MESSAGE);

        double quo = num1 / num2;
        String strQuo = num1 + " / " + num2 + " = " + + quo;
        JOptionPane.showMessageDialog(null, strQuo, "Show quotient", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
