package ctec.hipster.controller;

import ctec.hipster.model.Hipster;
import ctec.hipster.view.HipsterFrame;
/**
 * HipsterAppController for the 2014 Hipster day project
 * @author S. McKell Nichols
 * @version 1.0 11/12/14 Basic framework only
 */
public class HipsterAppController
{
	/**
	 * Declares the baseFrame for the class.
	 */
	private HipsterFrame baseFrame;
	/**
	 * Declares selfHipster for the class.
	 */
	private Hipster selfHipster;
	/**
	 * Declares myAlbums for the class.
	 */
	private String [] myAlbums;
	
	/**
	 * Declares selfHipster and baseFrame, and builds the array for the albums throughout the project.
	 */
	public HipsterAppController()
	{
		selfHipster = new Hipster("McKell", 18);
		buildAlbumArray();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		
	}
	
	/**
	 * The list of "hipster" songs for the project.
	 */
	private void buildAlbumArray()
	{
		myAlbums = new String[4];
		myAlbums[0] = "Of Monsters and Men: My Head is An Animal";
		myAlbums[1] = "Bastille: All This Bad Blood";
		myAlbums[2] = "Imagine Dragons: Night Visions";
		myAlbums[3] = "M83: Hurry Up We're Dreaming";
		selfHipster.setHipsterAlbums(myAlbums);
		
		//hipster
		//only on one line
		String [] otherAlbums = {"stuff", "other", "way for", "hipster array"};
		
		//ultra hipster
		String [] weirdAlbums;
		
		weirdAlbums = new String [] {"weird", "sad", "sda", "ashdjflksaldf"};
	}
	
	/**
	 * "Gets" the selfHipster for the project.
	 * @return selfHipster
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
}
