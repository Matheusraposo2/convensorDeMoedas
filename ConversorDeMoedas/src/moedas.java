import javax.swing.JOptionPane;

public class moedas {
	public static void main(String[] args) {
		String real = JOptionPane.showInputDialog("Valor em real: ");
		String moeda = JOptionPane.showInputDialog("Valor da cotacão: ");
		
		Double dReal = Double.parseDouble(real);
		Double dMoeda = Double.parseDouble(moeda);
		
		double conversao = dReal * dMoeda;
		
		JOptionPane.showMessageDialog(null, "O valor da conversão atual é: " + conversao +  " Reais");
	}
}
