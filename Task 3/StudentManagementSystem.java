package codsoft;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem 
{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Student> Student= new ArrayList<Student>(1);
    static int count=0;

    public static void main(String[] args) {
        int choice=0;
        while(choice<1 || choice>4)
        {
            menuOptions();

            choice= sc.nextInt();
            System.out.println();
            if(choice<1 || choice>4) 
            {
                System.out.println("INPUT IS NOT VALID !!\n");
            }
        }
        boolean Menu=true;
        int loopCount=0;
        while(Menu) 
        {
            if(loopCount>=1)
            {
                choice=0;
                while(choice<1 || choice>4) 
                {
                    menuOptions();
                    choice = sc.nextInt();
                }
            }
            switch (choice) {
                case 1: setStudents();
                        loopCount++;
                        break;
                case 2: displayStudents();
                        loopCount++;
                        break;
                case 3: modifyStudents();
                        loopCount++;
                        break;
                case 4: deleteStudents();
                        loopCount++;
                        break;
                case 5: Menu=false;
                        loopCount++;
                        break;
            }
        }
    }

    static void menuOptions(){
        System.out.println("Press 1--> Add Students into List");
        System.out.println("Press 2--> View Students List");
        System.out.println("Press 3--> Modify Record");
        System.out.println("Press 4--> Delete Record");
        System.out.println("Press 5--> Exit Student Management System");
    }
    static void setStudents(){
        System.out.println("Enter the number of students to be added:");
        int n=sc.nextInt();
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println("Enter the Name of student "+(count+1)+":");
            String enter=sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter the Roll-No of student "+(count+1)+":");
            int rollNo=sc.nextInt();
            System.out.println("Enter the Grade of student "+(count+1)+":");
            char grade=sc.next().charAt(0);
            System.out.println("Enter the DOB(MM-DD-YYYY) of student "+(count+1)+":");
            String DOB=sc.next();
            Student.add(new Student(name,rollNo,grade,DOB,count));
            System.out.println("Successfully added Student at INDEX-->"+count);
            if(i!=n-1) 
            {
                count++;
            }
            System.out.println();
        }
    }

    static void displayStudents(){
        if(Student.size()==0)
        {
            System.out.println("No Record Found! \n Please add some Records");
        }

        if(Student.size()!=0)
        {
            System.out.println();
            for(int i=0;i<=count;i++)
            {
                System.out.println("Index:"+Student.get(i).getIndex()+" Name:"+Student.get(i).getName()+" Roll-No:"+Student.get(i).getRollNo()+" Grade:"+Student.get(i).getGrade()+" PhoneNo:"+" DOB:"+Student.get(i).getDOB());
            }
            System.out.println("\n");
        }
    }

    static void modifyStudents(){
        System.out.println("Enter Index No of the Student:");
        int Index=sc.nextInt();
        boolean modifyMenu=true;
        while(modifyMenu){
            System.out.println("Press 1 --> Change Name!");
            System.out.println("Press 2 --> Change Roll-No!");
            System.out.println("Press 3 --> Change Grade !");
            System.out.println("Press 4 --> Change DOB!");
            System.out.println("Press 5 --> TO EXIT!");

            int choice=sc.nextInt();
            System.out.println();
            switch(choice){
                case 1: System.out.println("Enter new Name:");
                        String enter=sc.nextLine();
                        String name=sc.nextLine();
                        Student.get(Index).setName(name);
                        System.out.println("New Name added Successfully!");
                        break;
                case 2: System.out.println("Enter new Roll-No:");
                        int rollNo=sc.nextInt();
                        Student.get(Index).setRollNo(rollNo);
                        System.out.println("New Roll-No added Successfully!");
                        break;
                case 3: System.out.println("Enter new Grade:");
                        char grade=sc.next().charAt(0);
                        Student.get(Index).setGrade(grade);
                        System.out.println("New Grade displayed Successfully!");
                        break;
                case 4: System.out.println("Enter new DOB:");
                        String DOB=sc.next();
                        Student.get(Index).setDOB(DOB);
                        System.out.println("New DOB added Successfully!");
                        break;
                case 5: modifyMenu=false;
                        break;
            }



        }
    }
    static void deleteStudents(){
        System.out.println();
        System.out.println();
        System.out.println("Press 1 --> To delete a single Record");
        System.out.println("Press 2 --> To delete entire Record");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:System.out.println("Enter the index to be deleted:");
                   int index=sc.nextInt();
                   Student.remove(index);
                   System.out.println(" Record"+index+ " Delete Successful!\n");
                   count--;
                   break;
            case 2: Student.clear();
                    System.out.println("Entire Record Delete Successful!\n");
                    count=0;
                    break;
            default: System.out.println("Pressed Invalid Key!\n");
        }
    }
}