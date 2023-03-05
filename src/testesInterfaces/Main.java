package testesInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inteiros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 16, 17, 30);
        inteiros.stream().filter(new Primos()).forEach(integer -> System.out.println(integer));
        System.out.println("Multiplos: ");
        inteiros.stream().filter(new Multiplos3()).forEach(integer -> System.out.println(integer));

    }
}

