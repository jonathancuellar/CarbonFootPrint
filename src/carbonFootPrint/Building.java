/*Create three small classes unrelated by inheritance—classes Building, Car
and Bicycle. Give each class some unique appropriate attributes and behaviors that it does not have
in common with other classes. Write an interface CarbonFootprint with a getCarbonFootprint
method.Have each of your classes implement that interface, so that its getCarbonFootprint method
calculates an appropriate carbon footprint for that class (check out a few websites that explain how
to calculate carbon footprints).Write an application that creates objects of each of the three classes,
places references to those objects in ArrayList<CarbonFootprint>, then iterates through the Array-
List, polymorphically invoking each object’s getCarbonFootprint method. For each object, print
some identifying information and the object’s carbon footprint.
*/
package carbonFootPrint;

public class Building implements CarbonFootPrint
{
	
	private int numberOfStories;
	private String buildingName;
	
	public Building(int nos, String bn)
	{
		numberOfStories = nos;
		buildingName = bn;
	}
	
	public void setNumberOfStories(int nos)
	{
		numberOfStories = nos;
	}
	
	public int getNumberOfStories()
	{
		return numberOfStories;
	}
	
	public void setBuildingName(String bn)
	{
		buildingName = bn;
	}
	
	public String getBuildingName()
	{
		return buildingName;
	}
	
	@Override
	public void getCarbonFootPrint()
	{
		
	}

}
