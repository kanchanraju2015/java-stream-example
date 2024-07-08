import java.util.List;

public class Employee
{
String name;
List<String> city;

public Employee(String name, List<String> city) {
	super();
	this.name = name;
	this.city = city;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", city=" + city + "]";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getCity() {
	return city;
}
public void setCity(List<String> city) {
	this.city = city;
}
}
