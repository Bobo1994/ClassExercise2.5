import javax.swing.JOptionPane;
public class Money{
	public static void main(String [] args){
	String input =JOptionPane.showInputDialog(null,"Enter 1,5,or 10 dollars in bill");
	int dollar=Integer.parseInt(input);
	int nickel=dollar*20;
	int quarter =dollar*4;
	int dime =dollar*10;
	int penny =dollar*100;
	JOptionPane.showMessageDialog(null,"The return amounts are "+nickel+" nickels "+"\nOr "+quarter+" quarters"+"\nOr "+dime +" dimes"+ "\nOr "+penny+"ipennies");




}
}
