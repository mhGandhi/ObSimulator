public class Main {
    public static void main(String[] args) {
        RSystem rootRSystem = new RootRSystem();
        RSystem exampleRSystem1 = new ExampleRSystem(rootRSystem);
        RSystem exampleRSystem2 = new ExampleRSystem(exampleRSystem1);

        System.out.println("rel Pos: "+exampleRSystem2.getPosition());
        System.out.println("abs Pos: "+exampleRSystem2.getAbsolutePosition());

        exampleRSystem1.getPosition().x++;

        System.out.println("rel Pos: "+exampleRSystem2.getPosition());
        System.out.println("abs Pos: "+exampleRSystem2.getAbsolutePosition());

    }
}