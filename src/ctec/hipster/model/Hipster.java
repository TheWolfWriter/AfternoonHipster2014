package ctec.hipster.model;
/**
 * Hipster object for the Hispter Project 2014.
 * @author S. McKell Nichols
 * @version 1.1 11/13/14
 */
public class Hipster
{
	/**
	 * Initializes 'name'.
	 */
	private String name;
	/**
	 * Initializes 'age'.
	 */
	private int age;
	/**
	 * Initializes 'hipsterAlbums'.
	 */
	private String [] hipsterAlbums;
	
	/**
	 * Sets the name, age, and hipsterAlbum for Hipster.
	 */
	public Hipster()
	{
		name = "";
		age = -99;
		hipsterAlbums = null;
	}
	
	/**
	 * Sets the name, age, and hipsterAlbum for Hipster with parameters.
	 * @param name This.name
	 * @param age This.age
	 */
	public Hipster(String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = null;
	}
	
	/**
	 * "Gets" the name for the user.
	 * @return name The name of the user.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * "Sets" the name for the user.
	 * @param name The name for the user.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * "Gets" the age of the user.
	 * @return The age of the user.
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * "Sets" the age of the user.
	 * @param age The age of the user.
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**
	 * "Gets" hipsterAlbums
	 * @return hipsterAlbums
	 */
	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}
	
	/**
	 * "Sets" hipsterAlbums
	 * @param hipsterAlbums
	 */
	public void setHipsterAlbums(String[] hipsterAlbums)
	{
		this.hipsterAlbums = hipsterAlbums;
	}
	
}
