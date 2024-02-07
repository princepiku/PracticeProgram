public class Employee implements java.io.Serializable
{
	private int id;
	private String name;
	
	public Employee(){}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String alex[])
	{
		Employee e = new Employee();
		e.setId(179);
		e.setName("Prince Kumar");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}

}
