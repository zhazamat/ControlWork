import java.util.List;

public class Main {
static void run(){
    Student []students=new Student[8];

    Student student1=new Student("Zhanargul","Azamat kyzy","MK-2",3.);
    Student student2=new Student("Aygul","Suyunali kyzy","MK-1",5.);
    Student student3=new Aspirant("Kanykei","Kalybaeva","ARC-1",4.);
    Student student4=new Aspirant("Ulan","Asanov","ARC-1",5.);
    Student student5=new Student("Myrzaiym","Azamat kyzy","MK-2",3.);
    Student student6=new Student("Datkaiym","Suyunali kyzy","MK-1",4.);
    Student student7=new Aspirant("Sagyn","Kalbaev","ARC-2",4.);
    Student student8=new Aspirant("Roman","Asanov","ARC-3",5.);
    students[0]=student1;
    students[1]=student2;
    students[2]=student3;
    students[3]=student4;
    students[4]=student5;
    students[5]=student6;
    students[6]=student7;
    students[7]=student8;
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    System.out.println(String.format("|%20s","Firstname")+String.format(" |%20s","Lastname")+String.format(" |%20s","Group")+String.format(" |%20s","Average")+String.format(" |%20s|","Scholarship"));
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    for(Student student:students){
        System.out.println(String.format("|%20s",student.getFirstName())+String.format(" |%20s",student.getLastName())+String.format(" |%20s",student.getGroup())+String.format(" |%20s",student.getAverageMark())+String.format(" |%20s|",student.getScholarship()));

    }
    System.out.println("---------------------------------------------------------------------------------------------------------------");

}
    public static void main(String[] args) throws Exception {
    run();
    }
}
