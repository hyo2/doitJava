package practice;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("Terry1","Jindo"));
		dog.add(new Dog("Terry2","Jindo"));
		dog.add(new Dog("Terry3","Jindo"));
		dog.add(new Dog("Terry4","Jindo"));
		dog.add(new Dog("Terry5","Jindo"));
		
		for(Dog d: dog) {
			System.out.print(d.showDogInfo()+" ");
		}
		
		System.out.println();
		
		for(int i = 0; i < dog.size(); i++) {
			System.out.print(dog.get(i).showDogInfo()+" ");
		}
	}

}
