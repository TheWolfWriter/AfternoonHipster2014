package ctec.hipster.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import ctec.hipster.controller.HipsterAppController;
/**
 * The GUI for the project.
 * @author S. McKell Nichols
 * @version 1.0 11/17/14
 */
public class HipsterPanel extends JPanel
{
	/**
	 * Declares 'baseController' for the class.
	 */
	private HipsterAppController baseController;
	/**
	 * Declares 'albumBox' for the class.
	 */
	private JComboBox albumBox;
	/**
	 * Declares 'albumLabel' for the class.
	 */
	private JLabel albumLabel;
	/**
	 * Declares 'hipsterImage' for the class.
	 */
	private JLabel hipsterImage;
	/**
	 * Declares 'baseLayout' for the class.
	 */
	private SpringLayout baseLayout;
	
	/**
	 * Sets up the GUI for the project.
	 * @param baseController HipsterAppController
	 */
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album info here :D");
		hipsterImage = new JLabel("hipster selfie", new ImageIcon(this.getClass().getResource("/ctec/hipster/view/images/hipster.jpg")), JLabel.CENTER);
		albumBox = new JComboBox();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Sets up the box that lists the album names in the GUI.
	 */
	private void setupComboBox()
	{
		albumBox.setModel(new DefaultComboBoxModel(baseController.getSelfHipster().getHipsterAlbums()));
	}
	
	/**
	 * Sets up the entire panel GUI for the project.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.setSize(1000,300);
		this.setLayout(baseLayout);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}
	
	/**
	 * Place to set aside layout coding as you move things around in the design tab.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 47, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 156, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, hipsterImage, 34, SpringLayout.SOUTH, albumLabel);
		baseLayout.putConstraint(SpringLayout.WEST, hipsterImage, 82, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 110, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumBox, 45, SpringLayout.EAST, hipsterImage);
		
	}
	
	/**
	 * Sets up the listeners for the project.
	 * In this case, there's the text that informs the user if the album they choose makes them hipster or not.
	 */
	private void setupListeners()
	{
		albumBox.addItemListener(new ItemListener()
		{
			@Override
			public void itemStateChanged(ItemEvent arg0)
			{
				if(albumBox.getSelectedIndex() == 0)
				{
					albumLabel.setText("You are truly a hipster");
				}
				else if(albumBox.getSelectedIndex() <= 2)
				{
					albumLabel.setText("You may have some hipster quality");
				}
				else
				{
					albumLabel.setText("NOT A HIPSTER");
				}
			}
		});
	}

}
