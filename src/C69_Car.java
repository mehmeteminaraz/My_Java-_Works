public class C69_Car {


    public C69_Car(){
        System.out.println("parametresiz cons");
    }

    public C69_Car(String renk){
        System.out.println(renk + " araba uretildi");
    }

    public C69_Car(int yil){
        System.out.println(yil + " model araba uretildi");
    }

    public C69_Car(int yil, String renk){
        System.out.println(yil + " model "+ renk + " renginde bir araba uretildi");
    }
}
