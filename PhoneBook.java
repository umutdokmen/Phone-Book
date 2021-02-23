import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
class PersonInfo{
	static String[] phoneBookElement(List<String[]> string,int location){
		return (string.get(location));
	}
	Scanner scan = new Scanner(System.in);
	static List<String[]> phoneBook=new ArrayList<String[]>();
	public void getInfo(){
		String[] infoArray= {"No name","No surname","No address","No work phone number","No home phone number","No cell phone number"};
		while(true) {	
			System.out.printf("Press 1 to add name,\nPress 2 to add surname,\nPress 3 to add address\nPress 4 to add work phone\nPress 5 to add home phone\nPress 6 to add cell phone\nPress 7 to exit\n");
			int select=scan.nextInt();
			scan.nextLine();
			if(select==1) {
				System.out.println("Please enter name: ");
				infoArray[0]=scan.nextLine();
			}
			else if(select==2) {
				System.out.println("Please enter surname: ");
				infoArray[1]=scan.nextLine();
			}
			else if(select==3) {
				System.out.println("Please enter address: ");
				infoArray[2]=scan.nextLine();
			}
			else if(select==4) {
				System.out.println("Please enter phone number(work): ");
				infoArray[3]=scan.nextLine();
			}
			else if(select==5) {
				System.out.println("Please enter phone number(home): ");
				infoArray[4]=scan.nextLine();

			}
			else if(select==6) {
				System.out.println("Please enter phone number(cell): ");
				infoArray[5]=scan.nextLine();				
			}
			else if(select==7) {
				phoneBook.add(infoArray);
				break;
			}
			else {
				System.out.println("Please enter a valid number!");
			}
		}
	}
	public static void showInfo(String[] personalData) {
		System.out.println("Name: "+ personalData[0]);
		System.out.println("Surname: "+ personalData[1]);
		System.out.println("Address: "+personalData[2]);
		System.out.println("Phone number(work): "+personalData[3]);
		System.out.println("Phone number(home): "+personalData[4]);
		System.out.println("Phone number(cell): "+personalData[5]);
	}	
}


public class PhoneBook {

	public static void main(String[] args) {

		while(true) {
			Scanner scan = new Scanner(System.in);
			int selection=0;
			PersonInfo person=new PersonInfo();
			String nameAsked;
			System.out.printf("1.Search a person \n2.Search a phone number \n3.Create new person \n4.List all \n5.Exit \nEnter the number associated with the task: ");
			selection=scan.nextInt();
			scan.nextLine();
			if(selection==1 || selection==2) {
				int personControl;
				int counter=0;
				if(selection==1) {
					System.out.println("Please enter a name or surname: ");
					nameAsked=scan.nextLine();
					for(personControl=0;personControl<PersonInfo.phoneBook.size();personControl++) {
						for(int length=0;length<3;length++) {
							if(PersonInfo.phoneBookElement(PersonInfo.phoneBook, personControl)[length].equals(nameAsked)) {
								counter++;
								System.out.printf("%d -) \n",counter);
								PersonInfo.showInfo(PersonInfo.phoneBook.get(personControl));
							}
						}
						if(counter>=10) {
							break;
						}
					}
					if(counter==0) {
						System.out.println("No Match!");
					}
				}
				else {

					System.out.println("Please enter a number: ");
					nameAsked=scan.nextLine();
					for(personControl=0;personControl<PersonInfo.phoneBook.size();personControl++) {
						for(int length=3;length<6;length++) {
							if((String)Array.get((PersonInfo.phoneBookElement(PersonInfo.phoneBook,personControl)),length)==nameAsked) {
								counter++;
								System.out.printf("%d -) \n",counter);
								PersonInfo.showInfo(PersonInfo.phoneBook.get(personControl));
							}
						}
						if(counter>=10) {
							break;
						}
						if(counter==0) {
							System.out.println("No Match!");
						}
					}
				}
			}
			else if(selection==3) {
				person.getInfo();
			}
			else if(selection==4) {
				int count=1;
				for(int personToPrint=0;personToPrint<PersonInfo.phoneBook.size();personToPrint++) {
					System.out.printf("%d -) \n",count);
					PersonInfo.showInfo(PersonInfo.phoneBook.get(personToPrint));
					count++;
				}
			}
			else if(selection==5) {
				break;
			}
			else {
				System.out.println("Please enter a valid number.");
			}
		}
	}
}
