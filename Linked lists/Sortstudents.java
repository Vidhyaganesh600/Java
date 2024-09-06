import java.util.*;
class Student{
    private int roll;
    private String name;
    private int marks;
    public void setRoll(int roll){
        this.roll=roll;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getMarks(){
        return marks;
    }
}
public class Sortstudents {
    public static void main(String[] args){
        List stu=new ArrayList();
        Student st1=new Student();
        st1.setRoll(101);
        st1.setName("Ankush");
        st1.setMarks(50);
        Student st2=new Student();
        st2.setRoll(102);
        st2.setName("Vignesh");
        st2.setMarks(25);
        stu.add(st1);
        stu.add(st2);
        ListIterator listItr=(ListIterator)stu.listIterator();
        while(listItr.hasNext()){
            Student stud=(Student)listItr.next();
            System.out.println(stud.getRoll());
            System.out.println(stud.getName());
            System.out.println(stud.getMarks());
        }
        while(listItr.hasPrevious()){
            Student stud=(Student)listItr.previous();
            System.out.println(stud.getRoll());
            System.out.println(stud.getName());
            System.out.println(stud.getMarks());
        }
    }
    
}
