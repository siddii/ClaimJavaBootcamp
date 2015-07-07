/**
 * Created by siddique on 7/7/15.
 */
public class PassByTest {

    int primitiveValue;

    public void showValue(int primitive, PassByTest pb) {
        System.out.println("Show Value - primitive = " + primitive);
        System.out.println("Show Value - pb.primitiveValue = " + pb.primitiveValue);
        primitive = 1000;
        pb.primitiveValue = 1000;
    }


    public static void main(String[] args) {

        PassByTest pb = new PassByTest();
        int number = 10;
        pb.primitiveValue = 10;

        pb.showValue(number, pb);

        System.out.println("pb = " + pb.primitiveValue);
        System.out.println("primitiveValue = " + number);

    }

}
