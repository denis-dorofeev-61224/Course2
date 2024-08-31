public class Ravenclaw extends Hogwarts{
    private int smartLevel;// новые поля умён
    private int wiseLevel;// мудр
    private int wittyLevel;//остроумен
    private int creativeLevel;// креативен

    //конструктор для дочернего класса
    public Ravenclaw(String fullName, int powerOfMagic, int lengthOfTransgress,int smartLevel,int wiseLevel,int wittyLevel,int creativeLevel){
        super(fullName, powerOfMagic, lengthOfTransgress); // Вызов конструктора родительского класса
        this.smartLevel=smartLevel;
        this.wiseLevel=wiseLevel;
        this.wittyLevel=wittyLevel;
        this.creativeLevel=creativeLevel;
    }
    // геттеры и сеттеры дочернего класса
    public int getSmartLevel(){
        return smartLevel;
    }
    public int getWiseLevel(){
        return wiseLevel;
    }
    public int getWittyLevel(){
        return wittyLevel;
    }
    public int getCreativeLevel(){
        return creativeLevel;
    }
    //сеттеры для умён,мудр,остроумен,креативен
    public void setSmartLevel(int smartLevel){
        this.smartLevel=smartLevel;
    }
    public void setWiseLevel(int wiseLevel){
        this.wiseLevel=wiseLevel;
    }
    public void setWittyLevel(int wittyLevel){
        this.wittyLevel=wittyLevel;
    }
    public void setCreativeLevel(int creativeLevel){
        this.creativeLevel=creativeLevel;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Ум: " + smartLevel +
                ", Мудрость: " + wiseLevel +
                ", Остроумие: " + wittyLevel +
                ", Креативность: " + creativeLevel;
    }
    //метод для сравнения студентов факультета Когтевран
    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2) {
        int score1 = student1.getSmartLevel() + student1.getWiseLevel() + student1.getWittyLevel() + student1.getCreativeLevel();
        int score2 = student2.getSmartLevel() + student2.getWiseLevel() + student2.getWittyLevel() + student2.getCreativeLevel();

        if (score1 > score2) {
            System.out.println(student1.getFullName() + " лучший Когтевранец по сравнению с " + student2.getFullName());
        } else if (score1 < score2) {
            System.out.println(student2.getFullName() + " лучший Когтевранец по сравнению с " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " одинаково хороши в Когтевране.");
        }
    }




}
