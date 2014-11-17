package ctec.hipster.view;

import javax.swing.JFrame;

import ctec.hipster.controller.HipsterAppController;
/**
 * The frame for the project.
 * @author S. McKell Nichols
 * @version 1.0 11/17/14
 */
public class HipsterFrame extends JFrame
{
	/**
	 * Declares the basePanel for the class.
	 */
	private HipsterPanel basePanel;
	
	/**
	 * Creates the frame for the project.
	 * @param baseController
	 */
	public HipsterFrame(HipsterAppController baseController)
	{
		this.basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Sets up the frame for the project.
	 * This includes anything like size, the content, colors, etc.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000, 400);
		this.setResizable(false);
		this.setVisible(true);
	}

}
