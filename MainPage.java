import java.util.Scanner;

public class MainPage {

    public static void main(String[] args){          //////////main method

        int post=1;
        int item=1;

        Scanner input = new Scanner(System.in);

        System.out.println("\n\t\t\t\t Hello from Pos Laju");

        System.out.println("*******************");

        System.out.print("Post on the Next day(1) or Same day(2)?: ");
        post = input.nextInt();

        if(post ==1){
            NextDay();
        }
        else{
            SameDay();
        }

        System.out.print("Post using Box & Envelope(1) or Pos Ekspres(2)?: ");
        item = input.nextInt();

        if(item ==1){
            PrepaidBoxEnvelope();
        }
        else{
            PosEkspres();
        }
    }


    public static void NextDay() {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int c = 0;
        double Zone = 0.0, weight = 0.0, type = 0.0, charge = 0.0;

        System.out.print("\nHow many time you want to use: ");
        int size = sc.nextInt();
        int[] choice = new int[size];

        System.out.print("\n- No 1- Next Day Delivery + ");

        while (i < choice.length && choice[i] != -1) {

            for (i = 0; i < choice.length; i++) {

                System.out.print("\n\nPlease Enter Choice: ");
                choice[i] = sc.nextInt();

                if (choice[i] < 1 && choice[i] > 4) {
                    System.out.println("Invalid choice");
                }

                if (choice[i] == -1) {
                    System.out.print("Please stop button");
                    charge = 0;
                }

                if (choice[i] == 1) {

                    System.out.print("Enter your Zone: ");
                    Zone = sc.nextDouble();

                    if (Zone == 1) {
                        System.out.print("Enter your weight: ");
                        weight = sc.nextInt();

                        if (weight <= 500 && weight <= 2000) {
                            charge = 4.90;
                        } else if (weight > 500 && weight <= 2000) {
                            charge = 4.90 + 0.8 * ((weight - 500) / 250);
                        } else if (weight > 2000 && weight <= 2500) {
                            charge = 10.50;
                        }
                        if (weight > 2500) ;
                        {
                            charge = 10.50 + 0.50 * ((weight - 2500) / 500);
                        }
                        System.out.printf("\n%10s%15s%15s", "Zone", "weight", "charge(RM)");
                        System.out.printf("\n%8.0f%13.0f%16.2f", Zone, weight, charge);
                    } else if (Zone == 2) {

                        System.out.print("Enter weight: ");
                        weight = sc.nextInt();

                        if (weight <= 500 && weight <= 2000) {
                            charge = 5.40;
                        } else if (weight > 500 && weight <= 2000) {
                            charge = 5.40 + 1.00 * ((weight - 500) / 250);
                        } else if (weight > 2000 && weight <= 2500) {
                            charge = 16.00;
                        } else if (weight > 2000) {
                            charge = 16.00 + 2.00 * ((weight - 2500) / 500);
                        }
                        System.out.printf("\n%10s%15s%15s", "Zone", "weight", "charge(RM)");
                        System.out.printf("\n%8.0f%13.0f%16.2f", Zone, weight, charge);
                    } else if (Zone == 3) {

                        System.out.print("Enter weight: ");
                        weight = sc.nextInt();

                        if (weight <= 500 && weight <= 2000) {
                            charge = 6.90;
                        } else if (weight > 500 && weight <= 2000) {
                            charge = 6.90;
                        } else if (weight > 500 && weight <= 2500) {
                            charge = 21.00;
                        } else if (weight > 2500) {
                            charge = 21.00 + 3.00 * ((weight - 2500) / 500);
                        }

                        System.out.printf("\n%10s%15s%15s", "Zone", "weight", "charge(RM)");
                        System.out.printf("\n%8.0f%13.0f%16.2f", Zone, weight, charge);
                    } else if (Zone == 4) {

                        System.out.print("Enter weight: ");
                        weight = sc.nextInt();
                        if (weight <= 500 && weight <= 2000) {
                            charge = 7.40;
                        } else if (weight > 500 && weight <= 2000) {
                            charge = 7.40 + 1.50 * ((weight - 500) / 250);
                        } else if (weight > 2000 && weight <= 2500) {
                            charge = 26.00;
                        } else if (weight > 2500) {
                            charge = 26.00 + 3.50 * ((weight - 2500) / 500);
                        }
                        System.out.printf("\n%10s%15s%15s", "Zone", "weight", "charge(RM)");
                        System.out.printf("\n%8.0f%13.0f%16.2f", Zone, weight, charge);
                    } else if (Zone == 5) {

                        System.out.print("Enter weight: ");
                        weight = sc.nextInt();

                        if (weight <= 500 && weight <= 2000) {
                            charge = 7.00;
                        } else if (weight > 500 && weight <= 2000) {
                            charge = 7.90 + 2.00 * ((weight - 500) / 250);
                        } else if (weight > 2000 && weight <= 2500) {
                            charge = 31.00;
                        } else if (weight > 2500) {
                            charge = 31.00 + 4.00 * ((weight - 2500) / 500);
                        }
                        System.out.printf("\n%10s%15s%15s", "Zone", "weight", "charge(RM)");
                        System.out.printf("\n%8.0f%13.0f%16.2f", Zone, weight, charge);
                    } else {
                        System.out.println("\nInvalid Zone");

                    }
                }
            }
        }
    }


    public static void SameDay() {

        Scanner input = new Scanner(System.in);

        int local = 0;
        int weight;
        double Total = 0;

        System.out.printf("Enter weight (gm): ");
        weight = input.nextInt();

        if(weight < 500) {
            System.out.print("Post to local town(0) or cross town(1): ");
            local = input.nextInt();

            if(local==0){
                Total = 10.90;
                System.out.println("\nPost to : Local Town");
            }else{
                Total = 12.90;
                System.out.println("\nPost to : Cross Town");
            }
        }
        else if(weight >= 500 && weight <= 750){
            System.out.print("Post to local town(0) or cross town(1): ");
            local = input.nextInt();

            if(local==0){
                Total = 11.70;
                System.out.println("\nPost to : Local Town");
            }else{
                Total = 13.90;
                System.out.println("\nPost to : Cross Town");
            }
        }
        else if(weight > 750 && weight <= 1000){
            System.out.print("Post to local town(0) or cross town(1): ");
            local = input.nextInt();

            if(local==0){
                Total = 1.50;
                System.out.println("\nPost to : Local Town");
            }else{
                Total = 14.90;
                System.out.println("\nPost to : Cross Town");
            }
        }

        //System.out.println("\n =================== Output Same Day =================");
        System.out.println("Weight: " + weight);
        System.out.println("Total Charge: " + Total);
    }


    public static void PrepaidBoxEnvelope(){

        System.out.println("========== PREPAID BOX & ENVELOPE ==========");
        System.out.println("\n\t  1.  Envelope S     :  RM  7.31");
        System.out.println("\t  2.  Envelope L     :  RM 10.49");
        System.out.println("\t  3.  Prepaid Box S  :  RM 13.78");
        System.out.println("\t  4.  Prepaid Box M  :  RM 21.20");
        System.out.println("\t  5.  Prepaid Box L  :  RM 31.80");
        System.out.println("\n============================================");

        Scanner input = new Scanner(System.in);

        int weight;
        double parcelPrice = 0;
        int parcelAmount;

        System.out.print("\n Amount of parcel needed: ");
        parcelAmount = input.nextInt();

        System.out.print(" Item's weight: ");
        weight = input.nextInt();

        if(weight <= 500)
        {
            parcelPrice = parcelAmount * 7.31;
            System.out.print(" Envelope Type: Envelope S");
        }
        else if(weight > 500 && weight <= 1000)
        {
            parcelPrice = parcelAmount * 10.41;
            System.out.print(" Envelope Type: Envelope L");
        }
        else if(weight > 1000 && weight <= 2000)
        {
            parcelPrice = parcelAmount * 13.78;
            System.out.print(" Box Type: Prepaid Box S");
        }
        else if(weight > 2000 && weight <= 5000)
        {
            parcelPrice = parcelAmount * 21.20;
            System.out.print(" Box Type: Prepaid Box M");
        }
        else
        {
            parcelPrice = parcelAmount * 31.80;
            System.out.print(" Box Type: Prepaid Box L");
        }

        System.out.printf(" Total charged: RM "  + parcelPrice);
    }


    public static void PosEkspres(){

        Scanner sc=new Scanner (System.in);

        int quantity,customer=1,weight;
        double totalprice,price;
        int code;

        System.out.printf ("\n%16s%16s%16s%16s%16s","JENIS", "LG"," LE(C5)"," LD(B4)"," LK");
        System.out.printf ("\n%16s%16s%16s%16s%16s","SAIZ"," 220mmx110mm"," 229mmx162mm","353mmx250mm"," 340mmx250mm");
        System.out.printf ("\n%16s%16s%16s%16s%16s","BERAT MAX(gm)"," 100"," 250"," 500"," 1000");
        System.out.printf ("\n%16s%16s%16s%16s%16s","KETEBALAN MAX"," 3mm"," 5mm"," 10mm"," 25mm");
        System.out.printf ("\n%16s%16s%16s%16s%16s","HARGA(RM)"," 3.18"," 3.71"," 4.77"," 7.42");
        System.out.printf ("\n%16s%16s%16s%16s%16s","KOD JENIS","LG=1","LE(C5)=2","LD(B4)","LK=5\n");


        System.out.println (" Enter the code of documents or letters:");
        code=sc.nextInt();

        System.out.println (" Enter the weight(gm):");
        weight=sc.nextInt();

        if (code==1)
            if (weight<=100)
                System.out.print ("PRICE : RM3.18");
            else
                System.out.println ("MAX WEIGHT IS 100GM");


        if (code==2)
            if (weight<=250)
                System.out.print ("PRICE : RM3.71");
            else
                System.out.println ("MAX WEIGHT IS 250GM");

        if (code==3)
            if (weight<=500)
                System.out.print ("PRICE : RM4.77");
            else
                System.out.println ("MAX WEIGHT IS 500GM");

        if (code==4)
            if (weight<=1000)
                System.out.print ("PRICE : RM7.42");
            else
                System.out.println ("MAX WEIGHT IS 1000GM");

    }
}