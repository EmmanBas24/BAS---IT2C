package bas.it2c;

public class Output {
    
    int id;
    String name;
    int age;
    int bmi;
    String fp;

    void addFP( int i, int id, String name, int age, int bmi, String fp) {
     
    this.id = id;
        this.name = name;
        this.age = age;
        this.bmi = bmi;
        this.fp = fp;
        
    }
    public void viewFP(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "ID","Name","Age","BMI","Fitness Goals","Eligibility Status\n");
        System.out.printf("%-10d %-10s %-10d %-10d %-10s \n",
             this.id, this.name, this.age, this.bmi, this.fp);
    }
    
    
    
}
