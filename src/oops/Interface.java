package oops;

interface Payment {
    void pay();
}

class GooglePay implements Payment {
    public void pay() {
        System.out.println("Payment done using Google Pay");
    }
}

public class Interface {
    public static void main(String[] args) {
        Payment payment = new GooglePay();
        payment.pay();
    }
}
