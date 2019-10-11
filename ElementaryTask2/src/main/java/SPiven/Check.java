package SPiven;

public class Check {

    Declaration declaration = new Declaration();


    public static void check(Envelope envelope1,Envelope envelope2) {

        Declaration.declaration(envelope1,envelope2);
        if (envelope1.getHeight() > envelope2.getHeight() && envelope1.getWidth() > envelope2.getWidth()) {//||envelope1.getHeight()<envelope2.getHeight()&&envelope1.getWidth()<envelope2.getWidth()){
            System.out.println("It`s true. Envelope will fit into another envelope");
        } else if (envelope1.getHeight() > envelope2.getWidth() && envelope1.getWidth() > envelope2.getHeight()) {//||envelope1.getHeight()<envelope2.getWidth()&&envelope1.getWidth()<envelope2.getHeight()){
            System.out.println("It`s true. Envelope will fit into another envelope");

        } else System.out.println("It`s false. The Envolope won`t fit into another envelope");
        System.out.println("");
        System.out.println("Conclusion:\nThe Envelope 1 Width and Height values: " + envelope1.getHeight() + " and  " + envelope1.getWidth());
        System.out.println("The Envelope 2 Width and Height values: " + envelope2.getHeight() + " and " + envelope2.getWidth());

    }

}
