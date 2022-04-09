public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("RFJ22", "Phat", 1000);
        System.out.println("id: " + a1.getId());
        System.out.println("name: " + a1.getName());
        System.out.println("balance: " + a1.getBalance());
        System.out.println("credit: " + a1.credit(100));
        System.out.println("debit: " + a1.debit(200));
        System.out.println(a1.toString());

        System.out.println("\n");

        Account a2 = new Account("RFJ92", "Huy", 5000);
        System.out.println("id: " + a2.getId());
        System.out.println("name: " + a2.getName());
        System.out.println("balance: " + a2.getBalance());
        System.out.println("credit: " + a2.credit(300));
        System.out.println("debit: " + a2.debit(10000));
        System.out.println(a2.toString());

        a1.transferTo(a2,200);
        System.out.println(a1.toString());
        System.out.println(a2.toString());


    }
}
