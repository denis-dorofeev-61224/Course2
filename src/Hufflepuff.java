public class Hufflepuff extends Hogwarts {
    private int industriousnessLevel; // Новое поле-трудолюбие
    private int loyaltyLevel;//верность
    private int honestyLevel;//честность

    //конструктор для дочернего класса
    public Hufflepuff(String fullName, int powerOfMagic, int lengthOfTransgress, int industriousnessLevel, int loyaltyLevel, int honestyLevel) {
        super(fullName, powerOfMagic, lengthOfTransgress); // Вызов конструктора родительского класса
        this.industriousnessLevel = industriousnessLevel;
        this.loyaltyLevel = loyaltyLevel;
        this.honestyLevel = honestyLevel;
    }

    //геттеры для новых полей-трудолюбие,верность,честность
    public int getIndustriousnessLevel() {
        return industriousnessLevel;
    }

    public int getLoyaltyLevel() {
        return loyaltyLevel;
    }

    public int getHonestyLevel() {
        return honestyLevel;
    }

    //сеттеры для -трудолюбие,верность,честность
    public void setIndustriousnessLevel(int industriousnessLevel) {
        this.industriousnessLevel = industriousnessLevel;
    }

    public void setLoyaltyLevel(int loyaltyLevel) {
        this.loyaltyLevel = loyaltyLevel;
    }

    public void setHonestyLevel(int honestyLevel) {
        this.honestyLevel = honestyLevel;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Трудолюбие: " + industriousnessLevel +
                ", Верность: " + loyaltyLevel +
                ", Честность: " + honestyLevel;
    }
    //метод для сравнения студентов  факультета Пуффендуй
    public  static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2) {
        int score1 = student1.getIndustriousnessLevel() + student1.getLoyaltyLevel() + student1.getHonestyLevel();
        int score2 = student2.getIndustriousnessLevel() + student2.getLoyaltyLevel() + student2.getHonestyLevel();

        if (score1 > score2) {
            System.out.println(student1.getFullName() + " лучший Пуффендуец по сравнению с " + student2.getFullName());
        } else if (score1 < score2) {
            System.out.println(student2.getFullName() + " лучший Пуффендуец по сравнению с " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " одинаково хороши в Пуффендуе.");
        }
    }


}
