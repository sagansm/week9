package me.ssagan.streamapp._main;

import me.ssagan.streamapp.entity.Animal;
import me.ssagan.streamapp.service.AnimalService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cow", 1));
        animals.add(new Animal("pig", 2));
        animals.add(new Animal("cat", 3));
        animals.add(new Animal("dog", 4));
        animals.add(new Animal("duck", 5));
        animals.add(new Animal("tiger", 6));
        animals.add(new Animal("zebra", 7));
        animals.add(new Animal("elephant", 8));
        animals.add(new Animal("hippo", 9));
        animals.add(new Animal("horse", 10));
        animals.add(new Animal("lion", 11));

        System.out.println("Enter your choice:");
        System.out.println("0 - Exit");
        System.out.println("1 - Age of lion");
        System.out.println("2 - Animals in ascending age order");
        System.out.println("3 - Animals with age more then 4");
        System.out.println("4 - Map of animals");
        System.out.println("5 - Animal string");

        Scanner scanner = new Scanner(System.in);
        int menuIndex;
        while (true) {
            menuIndex = scanner.nextInt();
            if (menuIndex == 0) {
                break;
            }
            switch (menuIndex) {
                case 1:
                    AnimalService.showLionAge(animals);
                    break;
                case 2:
                    AnimalService.showAnimalsAscendingAge(animals);
                    break;
                case 3:
                    AnimalService.showAnimalsAgeMoreFour(animals);
                    break;
                case 4:
                    AnimalService.showAnimalMap(animals);
                    break;
                case 5:
                    AnimalService.showAnimalString(animals);
                    break;
            }
            System.out.println("-------------------");
        }
    };
}
