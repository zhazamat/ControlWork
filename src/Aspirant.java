public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group,Double averageMark) {
        super(firstName, lastName, group,averageMark);
    }

    @Override
    public int getScholarship() {
        if(getAverageMark()==5)
            return  20000;
        else
        return 17500;
    }
}
