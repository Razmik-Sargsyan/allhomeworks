public class Main {
    public static void main(String[] args) {


    Company companyA = new Company();
    Company companyB = new Company();

    person Jack = new person();
    Jack.balance = 200;
    Jack.company=companyA;


    person Andrew= new person();
    Andrew.balance=400;
    Andrew.company = companyA;

    person Antony= new person();
    Antony.balance= 3;
    Andrew.company= companyA;

    person Janine= new person();
    Janine.balance= 670;
    Janine.company=companyB;

    person Claire= new person();
    Claire.balance=460;
    Claire.company= companyB;

    Jack.sendmoney(Andrew,200);
        System.out.println(Jack.balance);
        System.out.println(Andrew.balance);
    }


}
