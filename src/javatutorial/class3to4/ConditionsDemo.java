package javatutorial.class3to4;
/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Mar 11, 2020 10:15:35 AM
* 
* a game
* 
*/
public class ConditionsDemo {
	
public static void main(String[] args) {
	
	// if then
	String gender = "girl";
	int age = 5;
	if(gender == "girl") {
		System.out.println("Girls love doll!");
	}
	if(gender == "boy") {
		System.out.println("Boys love models!");
	}
	
	// if else
	if(gender == "girl") {
		System.out.println("Girls love dolls!");
	}else {
		System.out.println("Boys love models!");
	}
	
	// else-if
	int testscore = 76;
    char grade;

    if (testscore >= 90) {
        grade = 'A';
    } else if (testscore >= 80) {
        grade = 'B';
    } else if (testscore >= 70) {
        grade = 'C';
    } else if (testscore >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }
    System.out.println("Grade = " + grade);
    
    //nested if
    if(gender == "girl") {
    	if(age >12) {
    		System.out.println("Girls love dress!");
    	}else {
    		System.out.println("Little girls loves dolls!");
    	}
    }
    
}

}
