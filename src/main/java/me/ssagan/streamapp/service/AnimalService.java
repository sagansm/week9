package me.ssagan.streamapp.service;

import me.ssagan.streamapp.entity.Animal;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalService {

    //1. Если в коллекции есть лев, то выведите его возраст,
    //   если нет - выбросите исключение `IllegalArgumentException`
    public static void showLionAge(List<Animal> animals) {
        String animalName = "lion";
        System.out.print("Age of " + animalName + ": ");
        System.out.println(
                animals
                        .stream()
                        .filter(animal -> animal.getName().equals(animalName))
                        .findAny()
                        .orElseThrow(() -> new IllegalArgumentException(animalName))
                        .getAge());
    }

    //2. Выведите на экран всех животных из коллекции в порядке возрастания их возраста
    public static void showAnimalsAscendingAge(List<Animal> animals) {
        System.out.println("Animals in ascending age order");
        animals
                .stream()
                .sorted((animal1, animal2) -> animal1.getAge() - animal2.getAge())
                .forEach((animal -> System.out.println(animal)));
    }

    //3. Посчитайте сколько животных в коллекции, у которых возраст больше 4
    public static void showAnimalsAgeMoreFour(List<Animal> animals) {
        System.out.println("Animals with age more then 4: " +
                animals
                        .stream()
                        .filter((animal -> animal.getAge() > 4))
                        .count());
    }

    public static void showAnimalMap(List<Animal> animals) {
        //4. Создайте Map из коллекции животных. Ключ - название животного, значение - экземпляр животного.
        // Выведите все пары ключ-значение в консоль
        System.out.println("Map of animals: ");
        animals
                .stream()
                .collect(Collectors.toMap(a -> a.getName(), a -> a))
                .forEach((s, animal) -> System.out.println("Key: " + s + "; Value: " + animal));
    }

    public static void showAnimalString(List<Animal> animals) {
        //5. Выведите названия всех животных одной строкой (используйте reduce())
        System.out.println("Animals in string: ");
        System.out.println(
                animals
                        .stream()
                        .map((animal -> animal.getName()))
                        .reduce((animalName1, animalName2) -> animalName1 + "; " + animalName2).get());
    }
}
