public class Gryffindor extends Hogwarts {
    private int braveryLevel; // Новое поле-храбрость
    private int honorLevel;//честь
    private int nobilityLevel;//благородство

    // Конструктор для дочернего класса
    public Gryffindor(String fullName, int powerOfMagic, int lengthOfTransgress, int braveryLevel, int nobilityLevel, int honorLevel) {
        super(fullName, powerOfMagic, lengthOfTransgress); // Вызов конструктора родительского класса
        this.braveryLevel = braveryLevel; // Инициализация новых  полей
        this.nobilityLevel = nobilityLevel;
        this.honorLevel = honorLevel;
    }

    // Геттеры для новых  полей-храбрость,честь,благородство
    public int getBraveryLevel() {
        return braveryLevel;
    }

    public int getHonorLevel() {
        return honorLevel;
    }

    public int getNobilityLevel() {
        return nobilityLevel;
    }

    // Сеттеры для новых полей-храбрость,честь,благородство
    public void setBraveryLevel(int braveryLevel) {
        this.braveryLevel = braveryLevel;
    }

    public void setHonorLevel(int honorLevel) {
        this.honorLevel = honorLevel;
    }

    public void setNobilityLevel(int nobilityLevel) {
        this.nobilityLevel = nobilityLevel;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Храбрость: " + braveryLevel +
                ", Честь: " + honorLevel +
                ", Благородство: " + nobilityLevel;
    }
    //метод для сравнения студентов факультета Гриффендор

    public static void  compareGryffindorStudents(Gryffindor student1, Gryffindor student2) {
        int score1 = student1.getBraveryLevel() + student1.getHonorLevel() + student1.getNobilityLevel();
        int score2 = student2.getBraveryLevel() + student2.getHonorLevel() + student2.getNobilityLevel();

        if (score1 > score2) {
            System.out.println(student1.getFullName() + " лучший Гриффиндорец по сравнению с " + student2.getFullName());
        } else if (score1 < score2) {
            System.out.println(student2.getFullName() + " лучший Гриффиндорец по сравнению с " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " одинаково хороши в Гриффиндоре.");
        }
    }



}
