package codsoft;
class Student
{
    String name;
    int rollNo;
    char grade;
    String DOB;
    int Index;
    Student(String name, int rollNo, char grade,String DOB,int Index)
    {
           this.name=name;
           this.rollNo=rollNo;
           this.grade=grade;
           this.DOB=DOB;
           this.Index=Index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    
    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) 
    {
        Index = index;
    }
}