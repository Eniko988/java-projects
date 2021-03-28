
package hw35;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author szebe
 *
 */

public class AnalyseList {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		Person person1 = new Person("Anna", 20, null);
		Person person2 = new Person("Béla", 67, null);
		Person person3 = new Person("Cecília", 28, "üzleti elemző");
		Person person4 = new Person("Dénes", 70, "projektmenedzser");
		Person person5 = new Person("Elemér", 50, "üzleti elemző");
		Person person6 = new Person("Ferenc", 46, "programozó");

		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);

		/**
		 *  Mely személyeknek nincs munkájuk?
		 */
		System.out.println(getPersonsWhoDontHaveJob(persons));
		System.out.println("------------");
		
		/**
		 *   Hány valamilyen foglalkozású személy van a listában?
		 */
		
		System.out.println(getPersonsJob(persons));
		System.out.println("------------");
		
		/** Milyen foglalkozások szerepelnek a listában?
		 */
		System.out.println(getJobTitle(persons));

	}

	/** 
	 * Mely személyeknek nincs munkájuk?
	 */

	public static List<Person> getPersonsWhoDontHaveJob(List<Person> persons) {
		return persons.stream()
				.filter(e -> e.getJobTitle() == null)
				.collect(Collectors.toList());
	}

	/**
	 *  Hány valamilyen foglalkozású személy van a listában?
	 */

	public static long getPersonsJob(List<Person> persons) {

		return persons.stream()
				.filter(e -> e.getJobTitle() != null)
				.distinct().count();

	}

	/**
	 *  Milyen foglalkozások szerepelnek a listában?
	 */

	public static List<String> getJobTitle(List<Person> persons) {
		return persons.stream()
				.filter(e -> e.getJobTitle() != null)
				.map(e -> e.getJobTitle()).distinct()
				.collect(Collectors.toList());
	}

}
