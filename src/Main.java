public class Main {
    public static void main(String[] args) {
        String oneCharacter = "J";
        System.out.println("oneCharacter: " + oneCharacter);
        char oneCharacter2 = 'K';
        System.out.println("oneCharacter2: " + oneCharacter2);
        int i = 4;
        int j = 3;
        System.out.println( i + ++j );
        System.out.println( i++ + j++ );
        System.out.println( ++i + j++ );
        System.out.println( i + j );
    }
}