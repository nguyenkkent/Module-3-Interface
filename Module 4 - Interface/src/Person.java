
public class Person implements Comparable<Person>
{

	private String firstName, lastName;
	private int id;
	
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + id + ")";
	}
	
	@Override
	public int compareTo(Person other)
	{
		if (this.lastName.compareToIgnoreCase(other.lastName) != 0) // last names are different
		{
			return this.lastName.compareToIgnoreCase(other.lastName);
		}
		else // both last names are the same
		{
			if (this.firstName.compareToIgnoreCase(other.firstName) != 0) // first names are different
			{
				return this.firstName.compareToIgnoreCase(other.firstName);
			}
			else // both first names are the same
			{
				return Integer.compare(this.id, other.id);
			}
		}
	}
	
}
