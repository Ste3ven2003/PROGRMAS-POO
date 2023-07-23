package contadortickets;

public class principal {
    public static void main(String[] args) {
        contadortickets ticket1 = new contadortickets("10/06/2023", "1105905960");
        contadortickets ticket2 = new contadortickets("10/05/2023","1104061395");
        contadortickets ticket3 = new contadortickets("10/01/2023","1204062322");
        contadortickets ticket4 = new contadortickets("12/01/2023","1204062329");
        contadortickets ticket5 = new contadortickets("11/01/2023","1204882329");
        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket3);
        System.out.println(ticket4);
        System.out.println(ticket5);
    }
    
}

