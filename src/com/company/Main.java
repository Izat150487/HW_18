package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow(500, 4, "female", "Lolly");
        Cow cow2 = new Cow(325, 6, "male", "Pitty");
        Cow cow3 = new Cow(480, 3, "male", "Kitty");
        Cow cow4 = new Cow(300, 2, "female", "Pepe");
        Cow cow5 = new Cow(450, 6, "male", "Molly");
        Cow cow6 = new Cow(385, 4, "female", "Humy");
        Cow[] cows1 = new Cow[]{cow1, cow2, cow3, cow4, cow5};
        Cow[] cows2 = new Cow[]{cow6};

        Sheep sheep1 = new Sheep(35, 4, "female", "Lucky");
        Sheep sheep2 = new Sheep(50, 3, "male", "Teddy");
        Sheep sheep3 = new Sheep(70, 5, "female", "Suzzy");
        Sheep sheep4 = new Sheep(22, 1, "male", "Bob");
        Sheep[] sheep_1 = new Sheep[]{sheep1, sheep2, sheep3};
        Sheep[] sheep_2 = new Sheep[]{sheep4};

        Horse horse1 = new Horse(500, 5, "female", "Blaedy", "Black");
        Horse horse2 = new Horse(325, 7, "male", "Whitty", "White");
        Horse horse3 = new Horse(400, 4, "female", "Grace", "Gray");
        Horse[] horses_1 = new Horse[]{horse1, horse2};
        Horse[] horses_2 = new Horse[]{horse3};

        Farm farm1 = new Farm("John", "Jetioguz", horses_1, sheep_1, cows1);
        Farm farm2 = new Farm("Jane", "Barskoon", horses_2, sheep_2, cows2);

        System.out.println("Farm1: "+farm1.toString());

        System.out.println("=========================================================================================");
        
        System.out.println("Farm2: "+farm2.toString());
    }
}
