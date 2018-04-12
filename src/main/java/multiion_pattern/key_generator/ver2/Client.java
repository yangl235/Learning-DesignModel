package multiion_pattern.key_generator.ver2;

import multiion_pattern.key_generator.ver2.KeyGenerator;

public class Client {
    private static KeyGenerator keygen;

    public static void main(String[] args) {
        keygen = KeyGenerator.getInstance();
        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());
        System.out.println("key = " + keygen.getNextKey());

    }
}
