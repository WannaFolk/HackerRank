import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;                 //用于存放以后计算的分数
  
    Student(String firstName,String lastName,int id,int[] testScores){   //继承类的构造参数
         super(firstName,lastName,id);                                   //显式的来调用父类Person的构造函数
        this.testScores = testScores;        
    }

    
    String calculate(){                         //计算平均分并分类返回字符
        int total = 0;
        double grade = 0;
        for(int i =0;i<testScores.length;i++){    //存分数
             total += testScores[i];              //总分
        }
        grade = total / testScores.length;        //平均分
        if(grade>=90 && grade<=100)    return "O";  //根据平均分来返回不同的字符用于输出
        if(grade>=80 && grade<90)    return "E";
        if(grade>=70 && grade<80)    return "A";
        if(grade>=55 && grade<70)    return "P";
        if(grade>=40 && grade<55)    return "D";
        if(grade<40)    return "T";
        return null;                            //若均不在范围,则返回null  不可以是0
    }
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);     //容器输入输出
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
