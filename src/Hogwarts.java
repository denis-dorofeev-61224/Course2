public class Hogwarts {
    String fullName;
    int powerOfMagic;
    int lengthOfTransgress;

    //конструктор для общего класса
    public Hogwarts(String fullName, int powerOfMagic, int lengthOfTransgress) {
        this.fullName = fullName;
        this.lengthOfTransgress = lengthOfTransgress;
        this.powerOfMagic = powerOfMagic;
    }

    //геттеры
    public String getFullName() {
        return fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getLengthOfTransgress() {
        return lengthOfTransgress;
    }

    //сеттеры
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setLengthOfTransgress(int lengthOfTransgress) {
        this.lengthOfTransgress = lengthOfTransgress;
    }
        //переопределение метода toString
        @Override
        public String toString() {
            return "Имя: " + fullName +
                    ", Сила магии: " + powerOfMagic +
                    ", Длина трансгрессии: " + lengthOfTransgress;
        }


}
