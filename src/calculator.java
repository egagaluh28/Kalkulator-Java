public class calculator {

    ///Atribut
    private double num1;
    private double num2;

    ///Method
    public void Tambah(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;

        double result = num1 + num2;
        System.out.println("Result :" + result);
    }

    public void Kurang(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;

        double result = num1 - num2;
        System.out.println("Result :" + result);
    }

    public void Kali(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;

        double result = num1 * num2;
        System.out.println("Result :" + result);
        
    }
    
    public void Bagi(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;

        double result = num1 / num2;
        System.out.println("Result :" + result);
    }
}
