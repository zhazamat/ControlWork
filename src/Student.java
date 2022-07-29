public class Student {
    private String firstName;
    private String lastName;
private String group;
private Double averageMark;
    public Student(String firstName, String lastName,String group,Double averageMark) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
        this.averageMark=averageMark;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public Double getAverageMark() {
        return averageMark;
    }
    public void getAverageMarkException() throws Exception{
        if(getAverageMark()>5 || getAverageMark()<1){
            throw new Exception("IO Exception");}
        else
            System.out.println(getAverageMark());
    }
    public int getScholarship(){
        if(getAverageMark()==5.0){
            return 10000;
        }
        else
        return 7500;
    }

}
