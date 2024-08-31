public class Main {
    public static void main(String[] args) {

        System.out.println("Hello JavaDeveloper!");
        // Создание студентов факультета Гриффиндор
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 85, 70, 90, 80, 95);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 95, 75, 85, 90, 85);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 91, 76, 56, 89, 90);

        //создание студентов факультета Пуффендуй
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 80, 65, 85, 95, 80);
        Hufflepuff jastinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 69, 60, 80, 78, 61);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 60, 60, 70, 70, 78);

        //создание студентов факультета Когтевран
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 90, 75, 95, 85, 90, 80);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 85, 70, 90, 80, 85, 75);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 80, 65, 85, 75, 80, 70);


        //создание студентов с факультета Слизерин
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 85, 70, 90, 80, 85, 75, 95);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 80, 65, 85, 75, 80, 70, 85);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 70, 60, 75, 60, 65, 50, 70);

        //ЗДЕСЬ,ХОТЬ ЭТОГО И НЕТ В УСЛОВИИ-Я ХОЧУ ВЫВЕСТИ В КОНСОЛЬ ВСЮ ИНФУ О СТУДЕНТАХ ШКОЛЫ

        // Вывод информации о студентах Гриффиндора
        System.out.println("Гриффиндор:");
        System.out.println(harryPotter.getFullName() + " - Храбрость: " + harryPotter.getBraveryLevel() + ", Честь: " + harryPotter.getHonorLevel() + ", Благородство: " + harryPotter.getNobilityLevel());
        System.out.println(hermioneGranger.getFullName() + " - Храбрость: " + hermioneGranger.getBraveryLevel() + ", Честь: " + hermioneGranger.getHonorLevel() + ", Благородство: " + hermioneGranger.getNobilityLevel());
        System.out.println(ronWeasley.getFullName() + " - Храбрость: " + ronWeasley.getBraveryLevel() + ", Честь: " + ronWeasley.getHonorLevel() + ", Благородство: " + ronWeasley.getNobilityLevel());

        // Вывод информации о студентах Пуффендуя
        System.out.println("\nПуффендуй:");
        System.out.println(cedricDiggory.getFullName() + " - Трудолюбие: " + cedricDiggory.getIndustriousnessLevel() + ", Верность: " + cedricDiggory.getLoyaltyLevel() + ", Честность: " + cedricDiggory.getHonestyLevel());
        System.out.println(jastinFinchFletchley.getFullName() + " - Трудолюбие: " + jastinFinchFletchley.getIndustriousnessLevel() + ", Верность: " + jastinFinchFletchley.getLoyaltyLevel() + ", Честность: " + jastinFinchFletchley.getHonestyLevel());
        System.out.println(zachariasSmith.getFullName() + " - Трудолюбие: " + zachariasSmith.getIndustriousnessLevel() + ", Верность: " + zachariasSmith.getLoyaltyLevel() + ", Честность: " + zachariasSmith.getHonestyLevel());

        // Вывод информации о студентах Когтеврана
        System.out.println("\nКогтевран:");
        System.out.println(choChang.getFullName() + " - Ум: " + choChang.getSmartLevel() + ", Мудрость: " + choChang.getWiseLevel() + ", Остроумие: " + choChang.getWittyLevel() + ", Креативность: " + choChang.getCreativeLevel());
        System.out.println(padmaPatil.getFullName() + " - Ум: " + padmaPatil.getSmartLevel() + ", Мудрость: " + padmaPatil.getWiseLevel() + ", Остроумие: " + padmaPatil.getWittyLevel() + ", Креативность: " + padmaPatil.getCreativeLevel());
        System.out.println(marcusBelby.getFullName() + " - Ум: " + marcusBelby.getSmartLevel() + ", Мудрость: " + marcusBelby.getWiseLevel() + ", Остроумие: " + marcusBelby.getWittyLevel() + ", Креативность: " + marcusBelby.getCreativeLevel());

        // Вывод информации о студентах Слизерина
        System.out.println("\nСлизерин:");
        System.out.println(dracoMalfoy.getFullName() + " - Хитрость: " + dracoMalfoy.getTrickLevel() + ", Решительность: " + dracoMalfoy.getDeterminationLevel() + ", Амбициозность: " + dracoMalfoy.getAmbitionLevel() + ", Находчивость: " + dracoMalfoy.getResourcefulnessLevel() + ", Жажда власти: " + dracoMalfoy.getThirstForPowerLevel());
        System.out.println(grahamMontague.getFullName() + " - Хитрость: " + grahamMontague.getTrickLevel() + ", Решительность: " + grahamMontague.getDeterminationLevel() + ", Амбициозность: " + grahamMontague.getAmbitionLevel() + ", Находчивость: " + grahamMontague.getResourcefulnessLevel() + ", Жажда власти: " + grahamMontague.getThirstForPowerLevel());
        System.out.println(gregoryGoyle.getFullName() + " - Хитрость: " + gregoryGoyle.getTrickLevel() + ", Решительность: " + gregoryGoyle.getDeterminationLevel() + ", Амбициозность: " + gregoryGoyle.getAmbitionLevel() + ", Находчивость: " + gregoryGoyle.getResourcefulnessLevel() + ", Жажда власти: " + gregoryGoyle.getThirstForPowerLevel());
        System.out.println("===================================");
        //ВЫЗОВ МЕТОДА С ИНФОЙ О СТУДЕНТЕ
        System.out.println(padmaPatil);
        System.out.println("===================================");
        //МЕТОДЫ СРАВНЕНИЯ СТУДЕНТОВ ПО ФАКУЛЬТЕТАМ
        // Правильный вызов методов сравнения
        Gryffindor.compareGryffindorStudents(harryPotter, hermioneGranger);
        Hufflepuff.compareHufflepuffStudents(cedricDiggory, zachariasSmith);
        Ravenclaw.compareRavenclawStudents(choChang, padmaPatil);
        Slytherin.compareSlytherinStudents(dracoMalfoy, grahamMontague);
        System.out.println("===================================");

        // Вызов метода для сравнения студентов по основным полям
        compareStudentsByMagicAndTransgress(harryPotter, dracoMalfoy);
    }

    // Метод для сравнения студентов по полям powerOfMagic и lengthOfTransgress
    public static void compareStudentsByMagicAndTransgress(Hogwarts student1, Hogwarts student2) {
        int score1 = student1.getPowerOfMagic() + student1.getLengthOfTransgress();
        int score2 = student2.getPowerOfMagic() + student2.getLengthOfTransgress();

        if (score1 > score2) {
            System.out.println(student1.getFullName() + " сильнее по магической силе и трансгрессии по сравнению с " + student2.getFullName());
        } else if (score1 < score2) {
            System.out.println(student2.getFullName() + " сильнее по магической силе и трансгрессии по сравнению с " + student1.getFullName());
        } else {
            System.out.println(student1.getFullName() + " и " + student2.getFullName() + " одинаково сильны в магической силе и трансгрессии.");
        }


    }

}