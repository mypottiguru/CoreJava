package Java8Features.MapAndReduce;

import java.util.ArrayList;
import java.util.List;

public class AvgSalWhoIsGradeA {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Kumar", 90000.00, "A"));
		list.add(new Employee(2, "Ravi", 70000.00, "A"));
		list.add(new Employee(3, "Rama", 60000.00, "B"));
		list.add(new Employee(4, "Seeta", 50000.00, "B"));
		list.add(new Employee(5, "Sreeni", 10000.00, "C"));

		Double avgSal = list.stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				                     .map(employee -> employee.getSal())
				                     .mapToDouble(i -> i)
				                     .average()
				                     .getAsDouble();

		System.out.println("avgSal:"+avgSal);
		
		Double sumSal = list.stream().filter(employee ->employee.getGrade().equalsIgnoreCase("A"))
				                     .map(employee -> employee.getSal())
				                     .mapToDouble(Double::doubleValue)
				                     .sum();
		
		System.out.println("sum Sal:"+sumSal);
	}

}
