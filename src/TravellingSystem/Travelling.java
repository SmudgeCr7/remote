package TravellingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Travelling {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 20));
		frame.setBounds(0, 0, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 1158, 60);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Ticket Travelling System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(194, 82, 165, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(87, 156, -15, -26);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 129, 575, 23);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(586, 129, 21, 511);
		frame.getContentPane().add(separator_2);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnStandard.setBounds(12, 156, 127, 25);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTick = new JRadioButton("Single Ticket");
		rdbtnSingleTick.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnSingleTick.setBounds(220, 156, 172, 25);
		frame.getContentPane().add(rdbtnSingleTick);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnAdult.setBounds(451, 156, 127, 25);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnEconomy.setBounds(12, 224, 127, 25);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnReturnTick = new JRadioButton("Return Ticket");
		rdbtnReturnTick.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnReturnTick.setBounds(220, 224, 165, 25);
		frame.getContentPane().add(rdbtnReturnTick);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnChild.setBounds(451, 224, 127, 25);
		frame.getContentPane().add(rdbtnChild);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFirstClass.setBounds(12, 297, 150, 25);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Chengalpet", "Villupuram", "Dalmia", "Trichy"}));
		comboBox.setBounds(231, 298, 329, 31);
		frame.getContentPane().add(comboBox);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(22, 339, 565, 16);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 355, 104, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sub Total");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(12, 433, 104, 25);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Total");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(12, 502, 104, 25);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(12, 559, 565, 16);
		frame.getContentPane().add(separator_3_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(244, 355, 207, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(244, 433, 207, 31);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(244, 506, 207, 31);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double tax=19.50;
				double MilesK8=25.10; 
				double MilesK12=25.78;
				double MilesK20=45.23;
				double MilesK30=55.98;
				double totalcost,eco=3.85, fclass=5.60;
				if(rdbtnStandard.isSelected() && rdbtnSingleTick.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * MilesK8)/100;
					String sTax=String.format("$%.2f", totalcost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8);
					textField_1.setText(subTotal);
					String total=String.format("$%.2f", totalcost+MilesK8);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("STD");
					textField_4.setText("ONE WAY");
					textField_5.setText("ONE");
					textField_6.setText("NIL");
				}
				else if(rdbtnStandard.isSelected() && rdbtnReturnTick.isSelected() && rdbtnAdult.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * (MilesK8*2)/100);
					String sTax=String.format("$%.2f", totalcost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8*2);
					textField_1.setText(subTotal);
					String total=String.format("&%.2f", (totalcost+MilesK8)*2);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("STD");
					textField_4.setText("ONE WAY");
					textField_5.setText("ONE");
					textField_6.setText("NIL");
				}
				else if(rdbtnStandard.isSelected() && rdbtnSingleTick.isSelected() && rdbtnChild.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=((tax * MilesK8)/100);
					String sTax=String.format("$%.2f", totalcost-18);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8);
					textField_1.setText(subTotal);
					String total=String.format("&%.2f", (totalcost+MilesK8)-18);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("STD");
					textField_4.setText("ONE WAY");
					textField_5.setText("NIL");
					textField_6.setText("ONE");
				}
				else if(rdbtnStandard.isSelected() && rdbtnReturnTick.isSelected() && rdbtnChild.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * (MilesK8*2)/100);
					String sTax=String.format("$%.2f", totalcost-18);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8*2);
					textField_1.setText(subTotal);
					String total=String.format("$%.2f", (totalcost+MilesK8 *2)-18);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("STD");
					textField_4.setText("ONE WAY");
					textField_5.setText("NIL");
					textField_6.setText("ONE");
				}
				
				///
				else	if(rdbtnEconomy.isSelected() && rdbtnSingleTick.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * (MilesK8+eco))/100;
					String sTax=String.format("$%.2f", totalcost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8+eco);
					textField_1.setText(subTotal);
					String total=String.format("$%.2f", totalcost+MilesK8+eco);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("ECO");
					textField_4.setText("ONE WAY");
					textField_5.setText("ONE");
					textField_6.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTick.isSelected() && rdbtnAdult.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * (MilesK8+eco *2)/100);
					String sTax=String.format("$%.2f", totalcost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8+eco*2);
					textField_1.setText(subTotal);
					String total=String.format("&%.2f", (totalcost+MilesK8+eco)*2);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("ECO");
					textField_4.setText("ONE WAY");
					textField_5.setText("ONE");
					textField_6.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnSingleTick.isSelected() && rdbtnChild.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=((tax * MilesK8+eco)/100);
					String sTax=String.format("$%.2f", totalcost-18);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8+eco);
					textField_1.setText(subTotal);
					String total=String.format("&%.2f", (totalcost+MilesK8+eco)-18);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("ECO");
					textField_4.setText("ONE WAY");
					textField_5.setText("NIL");
					textField_6.setText("ONE");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTick.isSelected() && rdbtnChild.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * (MilesK8+eco*2)/100);
					String sTax=String.format("$%.2f", totalcost-18);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8+eco*2);
					textField_1.setText(subTotal);
					String total=String.format("$%.2f", (totalcost+MilesK8+eco*2)-18);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("ECO");
					textField_4.setText("ONE WAY");
					textField_5.setText("NIL");
					textField_6.setText("ONE");
				}
				///
				else	if(rdbtnFirstClass.isSelected() && rdbtnSingleTick.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * (MilesK8+fclass))/100;
					String sTax=String.format("$%.2f", totalcost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8+fclass);
					textField_1.setText(subTotal);
					String total=String.format("$%.2f", totalcost+MilesK8+fclass);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("FCLASS");
					textField_4.setText("ONE WAY");
					textField_5.setText("ONE");
					textField_6.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTick.isSelected() && rdbtnAdult.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * (MilesK8+fclass*2)/100);
					String sTax=String.format("$%.2f", totalcost);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8+fclass*2);
					textField_1.setText(subTotal);
					String total=String.format("&%.2f", (totalcost+MilesK8+fclass)*2);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("FCLASS");
					textField_4.setText("ONE WAY");
					textField_5.setText("ONE");
					textField_6.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnSingleTick.isSelected() && rdbtnChild.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=((tax * MilesK8+fclass)/100);
					String sTax=String.format("$%.2f", totalcost-18);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8+fclass);
					textField_1.setText(subTotal);
					String total=String.format("&%.2f", (totalcost+MilesK8+fclass)-18);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("fclass");
					textField_4.setText("ONE WAY");
					textField_5.setText("NIL");
					textField_6.setText("ONE");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTick.isSelected() && rdbtnChild.isSelected() 
						&& comboBox.getSelectedItem().equals("Trichy"))
				{
					totalcost=(tax * (MilesK8+fclass*2)/100);
					String sTax=String.format("$%.2f", totalcost-18);
					textField.setText(sTax);
					String subTotal=String.format("$%.2f", MilesK8+fclass*2);
					textField_1.setText(subTotal);
					String total=String.format("$%.2f", (totalcost+MilesK8+fclass*2)-18);
					textField_2.setText(total);
					textField_12.setText(total);
					textField_3.setText("FCLASS");
					textField_4.setText("ONE WAY");
					textField_5.setText("NIL");
					textField_6.setText("ONE");
				}
			}
		});
		btnNewButton.setToolTipText("Total Cost Of Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:MM:SS");
				textField_10.setText(tTime.format(timer.getTime()));
				SimpleDateFormat tdate=new SimpleDateFormat("dd:MM:yyyy");
				textField_9.setText(tdate.format(timer.getTime()));
				textField_7.setText("MADURAI");
				textField_8.setText(comboBox.getSelectedItem()+"*");
				int num1;
				String q1="";
				num1=1325+(int) (Math.random()*4238);
				q1+=num1+1325;
				textField_11.setText(q1);
				
				textField_13.setText("ANY");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(12, 588, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setToolTipText("Reset System");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnSingleTick.setSelected(false);
				rdbtnReturnTick.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				comboBox.setSelectedItem("Destination");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20)); 
		btnNewButton_1.setBounds(219, 588, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setToolTipText("Exit System");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Ticketing Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(430, 588, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(586, 129, 640, 23);
		frame.getContentPane().add(separator_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_3.setBounds(596, 150, 127, 31);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(758, 150, 127, 31);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(897, 150, 127, 31);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(1053, 150, 127, 31);
		frame.getContentPane().add(textField_6);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(586, 200, 640, 23);
		frame.getContentPane().add(separator_1_1_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Child");
		lblNewLabel_3_3.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_3_3.setBounds(1073, 86, 97, 30);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Adult");
		lblNewLabel_3_3_1.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_3_3_1.setBounds(913, 86, 97, 30);
		frame.getContentPane().add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Ticket");
		lblNewLabel_3_3_2.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_3_3_2.setBounds(758, 86, 97, 30);
		frame.getContentPane().add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("Class");
		lblNewLabel_3_3_3.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_3_3_3.setBounds(604, 86, 97, 30);
		frame.getContentPane().add(lblNewLabel_3_3_3);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setBounds(897, 200, 21, 511);
		frame.getContentPane().add(separator_2_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(758, 236, 127, 31);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(758, 339, 127, 31);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(758, 437, 127, 31);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(758, 537, 127, 31);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(973, 301, 127, 31);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_12.setColumns(10);
		textField_12.setBounds(973, 414, 127, 31);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Dialog", Font.BOLD, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(973, 537, 127, 31);
		frame.getContentPane().add(textField_13);
		
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(596, 243, 90, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("To");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(596, 339, 90, 24);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Date");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(596, 434, 90, 24);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("Time");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_4.setBounds(596, 544, 90, 24);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Ticket No");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_5.setBounds(984, 257, 127, 24);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Price");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_6.setBounds(984, 372, 90, 24);
		frame.getContentPane().add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Route");
		lblNewLabel_3_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3_7.setBounds(984, 490, 90, 24);
		frame.getContentPane().add(lblNewLabel_3_7);
		
	
		
		
		
	
	}
}
