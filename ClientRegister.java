public class ClientRegister {
    public static void main(String args[]) {
        CashClient client1 = new CashClient("Lisa", "101070-1111");
        AccountClient client2 = new AccountClient("Benny", "101070-1111");
        AccountClient client3 = new AccountClient("Barney", "040474-1571", "Someroad 3");
        Client client4 = new Client("Client", "111170-1111", "Road 4");

        client1.payCash(70);
        client2.deposit(100);
        client3.deposit(500);
        client2.withdraw(20);

        System.out.println(client2);
        System.out.println(client3);
    }
}

class Client {

    String clientName, clientId, clientAddress;

    // 2 constructors
    Client(String name, String id) {
        clientName = name;
        clientId = id;
    }

    Client(String name, String id, String address) {
        clientName = name;
        clientId = id;
        clientAddress = address;
    }

    // returnName method
    String returnName() {
        return clientName;
    }

    // returnID method
    String returnID() {
        return clientId;
    }
}

class CashClient extends Client {

    CashClient(String name, String id) {
        super(name, id);
    }

    // payCash method <- receives a sum as parameter and prints the text
    void payCash(int amount) {
        System.out.println(clientName + "(" + clientId + "): Amount paid " + amount + " euros.");
    }
}

class AccountClient extends Client {

    // one attribute <- keeps track of the balance on the client account
    double track;

    AccountClient(String name, String id) {
        super(name, id);
        track = 0;

    }

    AccountClient(String name, String id, String address) {
        super(name, id, address);
        track = 0;
    }

    // deposit method <- which adds the given number to the account balance
    double deposit(double amountOfDeposit) {
        track += amountOfDeposit;
        return track;
    }

    // withdraw method <- subtracts the given number from the account balance.
    double withdraw(double amountOfWithdraw) {
        track -= amountOfWithdraw;
        return track;
    }

    // toString method
    public String toString() {
        return clientName + "(" + clientId + "): " + track;
    }
}
