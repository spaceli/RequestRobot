/*
 * MainFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package frame;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

import action.RobotAction;

/**
 *
 * @author  __USER__
 */
public class MainFrame extends javax.swing.JFrame {
	private ArrayList<String> urlList = null;
	private DefaultListModel listModel = null;
	private int timeGap;

	/** Creates new form MainFrame */
	public MainFrame() {
		initComponents();
		this.setLocation(300, 200);
		urlList = RobotAction.getUrlListFromFile();
		this.reloadData();
		controlButtonActionPerformed(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		urlTextField = new javax.swing.JTextField();
		addButton = new javax.swing.JButton();
		removeButton = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		urlJList = new javax.swing.JList();
		jLabel2 = new javax.swing.JLabel();
		timeCombox = new javax.swing.JComboBox();
		controlButton = new javax.swing.JButton();
		infoLabel = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("URLRequest\u673a\u5668\u4eba");

		jLabel1.setText("URL");

		addButton.setText("+");
		addButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addButtonActionPerformed(evt);
			}
		});

		removeButton.setText("-");
		removeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				removeButtonActionPerformed(evt);
			}
		});

		jScrollPane1.setViewportView(urlJList);

		jLabel2.setText("\u5206\u949f\u8bf7\u6c42\u4e00\u6b21");

		timeCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"1", "2", "5", "10", "20", "30", "45", "60", "90", "120" }));
		timeCombox.setSelectedIndex(1);

		controlButton.setText("\u5f00\u59cb");
		controlButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				controlButtonActionPerformed(evt);
			}
		});

		infoLabel.setText("\u76ee\u524d\u505c\u6b62");

		jMenu1.setText("\u67e5\u770b\u65e5\u5fd7");
		jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenu1MouseClicked(evt);
			}
		});
		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u67e5\u770bURLList");
		jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenu2MouseClicked(evt);
			}
		});
		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(4, 4, 4)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				timeCombox,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				infoLabel,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				170,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																urlTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																354,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				addButton)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				removeButton))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																layout
																		.createSequentialGroup()
																		.addGap(
																				33,
																				33,
																				33)
																		.addComponent(
																				controlButton)))
										.addContainerGap()).addComponent(
								jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 480,
								Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																timeCombox,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																controlButton)
														.addComponent(infoLabel))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(addButton)
														.addComponent(jLabel1)
														.addComponent(
																urlTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																removeButton))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												207,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {
		try {
			Runtime.getRuntime().exec("notepad.exe urlList.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {
		try {
			Runtime.getRuntime().exec("notepad.exe log.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * control button clickֹ
	 */
	private void controlButtonActionPerformed(java.awt.event.ActionEvent evt) {
		
		if (!RobotAction.isWorking) {

			RobotAction.isWorking = true;
			controlButton.setText("停止");
			
			new Thread(new Runnable() {
				@Override
				public void run() {
					int restTime = 0;
					while (RobotAction.isWorking) {
						infoLabel.setText("倒计时" + restTime + "秒");
						if (restTime <= 0) {
							timeGap = Integer.valueOf((String) timeCombox.getSelectedItem());
							restTime = timeGap * 60;
							new Thread(new Runnable() {

								@Override
								public void run() {
									try {
										RobotAction.sendRequest(urlList);
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
							}).start();

						}
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						restTime--;
					}
				}
			}).start();

			

		} else {
			
			RobotAction.isWorking = false;
			controlButton.setText("开始");
			
			new Thread(new Runnable() {
				@Override
				public void run() {
					int restTime = 30*60;
					while (!RobotAction.isWorking) {
						infoLabel.setText("倒计时" + restTime + "秒重新开始");
						if (restTime < 0) {
							break;
						}else {
							restTime --;
						}
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if(!RobotAction.isWorking){
						controlButtonActionPerformed(null);
					}
					
				}
			}).start();
		}

	}

	/**
	 * ɾ��url
	 * @param evt
	 */
	private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		int index = urlJList.getSelectedIndex();
		if (index == -1)
			return;
		urlList.remove(index);
		try {
			RobotAction.saveUrlList(urlList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.reloadData();
	}

	/**
	 * ����url
	 * @param evt
	 */
	private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (urlTextField.getText().equals(""))
			return;

		urlList.add(urlTextField.getText());
		try {
			RobotAction.saveUrlList(urlList);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.reloadData();
		urlTextField.setText("");
	}

	private void reloadData() {
		listModel = new DefaultListModel();
		urlJList.setModel(listModel);
		for (String url : urlList) {
			listModel.addElement(url);
		}

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton addButton;
	private javax.swing.JButton controlButton;
	private javax.swing.JLabel infoLabel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton removeButton;
	private javax.swing.JComboBox timeCombox;
	private javax.swing.JList urlJList;
	private javax.swing.JTextField urlTextField;
	// End of variables declaration//GEN-END:variables

}