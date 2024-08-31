public class Slytherin extends Hogwarts {
    private int trickLevel;//новые поля хитрость
    private int determinationLevel;//решительность
    private int ambitionLevel;//амбициозность
    private int resourcefulnessLevel;//находчивость
    private int thirstForPowerLevel;//жажда власти

    //конструктор дочернего класса
    public Slytherin(String fullName, int powerOfMagic, int lengthOfTransgress, int trickLevel, int determinationLevel, int ambitionLevel, int resourcefulnessLevel, int thirstForPowerLevel) {
        super(fullName, powerOfMagic, lengthOfTransgress); // Вызов конструктора родительского класса
        this.trickLevel = trickLevel;
        this.determinationLevel = determinationLevel;
        this.ambitionLevel = ambitionLevel;
        this.resourcefulnessLevel = resourcefulnessLevel;
        this.thirstForPowerLevel = thirstForPowerLevel;
    }

    //геттеры и сеттеры дочернего класса Slytherin
    public int getTrickLevel() {
        return trickLevel;
    }

    public int getDeterminationLevel() {
        return determinationLevel;
    }

    public int getAmbitionLevel() {
        return ambitionLevel;
    }

    public int getResourcefulnessLevel() {
        return resourcefulnessLevel;
    }

    public int getThirstForPowerLevel() {
        return thirstForPowerLevel;
    }

    //сеттеры
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setDeterminationLevel(int determinationLevel) {
        this.determinationLevel = determinationLevel;
    }

    public void setAmbitionLevel(int ambitionLevel) {
        this.ambitionLevel = ambitionLevel;
    }

    public void setResourcefulnessLevel(int resourcefulnessLevel) {
        this.resourcefulnessLevel = resourcefulnessLevel;
    }

    public void setThirstForPowerLevel(int thirstForPowerLevel) {
        this.thirstForPowerLevel = thirstForPowerLevel;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Хитрость: " + trickLevel +
                ", Решительность: " + determinationLevel +
                ", Амбициозность: " + ambitionLevel +
                ", Находчивость: " + resourcefulnessLevel +
                ", Жажда власти: " + thirstForPowerLevel;
    }
    //метод для сравнения студентов факультета Слизерин
    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2) {
        int score1 = student1.getTrickLevel() + student1.getDeterminationLevel() + student1.getAmbitionLevel() + student1.getResourcefulnessLevel() + student1.getThirstForPowerLevel();
        int score2 = student2.getTrickLevel() + student2.getDeterminationLevel() + student2.getAmbitionLevel() + student2.getResourcefulnessLevel() + student2.getThirstForPowerLevel();

        if (score1 > score2) {
            System.out.println(student1.getFullName() + " лучший Слизеринец по сравнению с " + student2.getFullName());
        } else if (score1 < score2) {
            System.out.println(student2.getFullName() + " лучший Слизеринец по сравнению с " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " одинаково хороши в Слизерине.");
        }
    }

}
