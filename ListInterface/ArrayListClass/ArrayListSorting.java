package ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ArrayListSorting {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("Ascending Order:"+list);
		
		Collections.reverse(list);
		System.out.println("Desending Order:"+list);		
		
		
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1, "sreeni", 100000));
		employee.add(new Employee(3, "raghav", 300000));
		employee.add(new Employee(2, "kumar", 200000));
		employee.add(new Employee(4, "mohan", 400000));

		Collections.sort(employee, new MySort());
		System.out.println(employee);
		
		Collections.sort(employee, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Employee e1 = (Employee)o1;
				Employee e2 = (Employee)o2;
				if(e1.getSalary() > e2.getSalary())
				{
					return 1;
				}else if(e1.getSalary() < e2.getSalary())
				{
					return -1;
				}else {
					return 0;
				}
			}
		});
		System.out.println(employee);
		
		Collections.sort(employee, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary())); 

		System.out.println(employee);
	}

}

class MySort implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}
}
