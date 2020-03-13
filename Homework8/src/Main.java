public class Main {

    public static void main(String[] args) {


    Company companyA = new Company();
    Company companyB = new Company();

    person Jack = new person();
    Jack.name= "Jack";
    Jack.balance = 200;
    Jack.company=companyA;


    person Andrew= new person();
    Andrew.name="Andrew";
    Andrew.balance=400;
    Andrew.company = companyA;

    person Antony= new person();
    Antony.balance= 3;
    Andrew.company= companyA;
    Antony.name="Antony";

    person Janine= new person();
    Janine.balance= 670;
    Janine.company=companyB;
    Janine.name="Janine";

    person Claire= new person();
    Claire.balance=460;
    Claire.company= companyB;
    Claire.name="Claire";

    Jack.sendmoney(Andrew,200);
        System.out.println(Jack.balance);


      Claire.sendmoney(Andrew,500);
        System.out.println(Claire.balance);
        System.out.println(Andrew.balance);

        person[] persons ={Jack, Andrew, Antony, Janine, Claire};
        Company[] companies ={companyA, companyB};


        person richest= Jack;

        for (int i = 0; i < persons.length-1; i++) {
            if (persons[i+1].balance> richest.balance){
                richest=persons[i+1];
            }


        }

        System.out.println(richest.name);
        int sumcompanyA=0;
        int sumcompanyB=0;
        for (int i = 0; i < persons.length; i++) {

           if (persons[i].company==companyA){
               sumcompanyA+= persons[i].balance;
           }
            if (persons[i].company==companyB){
                sumcompanyB+= persons[i].balance;
            }
        }

        if (sumcompanyA>sumcompanyB)
            System.out.println("Company A is richer");
        else
            System.out.println("Company B is richer");


    }

}

