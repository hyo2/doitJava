package practice;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("Terry1", "Jindo");
		dog[1] = new Dog("Terry2", "Jindo");
		dog[2] = new Dog("Terry3", "Jindo");
		dog[3] = new Dog("Terry4", "Jindo");
		dog[4] = new Dog("Terry5", "Jindo");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(dog[i].showDogInfo()+" ");
		}
		
		System.out.println("\n");
		
		for(Dog d: dog) {
			System.out.print(d.showDogInfo()+" ");
		}
	}

}
