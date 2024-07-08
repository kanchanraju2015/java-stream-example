
import java.util.*;
import java.util.stream.Collectors;


public class flatmap 
{
public static void main(String args[])
{
List<String> name=Arrays.asList("ranchi","tata","patna","dhanbad");
//  MAP METHOD IS FOR NE TO ONE MAPPING ONLY
name.stream().map(x->x.toUpperCase()).forEach(System.out::println);// variable cannot be used 
//name.stream().map(x->x.toUpperCase()).forEach(System.out::println);// variable cannot be used 
List<String> data=name.stream().map(x->x.toUpperCase()).collect(Collectors.toList());// change to list 
System.out.println(data);









}
}
	