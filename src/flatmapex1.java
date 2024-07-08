import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapex1 
{
public static void main(String args[])
{
Employee e1=new Employee("ranjan",Arrays.asList("ranchi","tata","patna"));	
Employee e2=new Employee("manish",Arrays.asList("ramgarh","bokaro","dhanbad"));	
Employee e3=new Employee("ajit",Arrays.asList("banaras","ramgarh","delhi"));
List<Employee> data=new ArrayList<>();
data.add(e1);
data.add(e2);
data.add(e3);
//System.out.println(data);
//List<String> names=data.stream().map(x->x.getName()).collect(Collectors.toList());
//System.out.println(names);
//List<List<String>> mno=data.stream().map(p->p.getCity()).collect(Collectors.toList());
//System.out.println(mno);// creates the stream of string here 
//System.out.println("*********FLATMAP EXAMPLE******************");
//  THIS IS ONE TO MANY MAPPING USE FLAT MAP 
List<String> ph=data.stream().flatMap(k->k.getCity().stream()).collect(Collectors.toList());
System.out.println(ph);
}
}
