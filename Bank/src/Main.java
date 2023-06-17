
//package hashmap;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Map<String, Client> clients = createClientsMap();
        //Map <Integer, Client> accounts = createAccountsMap();
        Scanner sc = new Scanner(System.in);
        Map<String, Client> clients = new HashMap<>();
        Map<Integer, Client> accounts = new HashMap<>();

        Client petrov = new Client("Петров", 11);
        Client snegirev = new Client("Снегирев", 22);
        Client popov = new Client("Попов", 50);
        Client sidorov = new Client("Сидоров", 60);
        Client ivanov = new Client("Иванов", 18);


        clients.put("Петров", petrov);
        clients.put("Снегирев", snegirev);

        Account ac1 = new Account(123, 2200, "Петров");
        Account ac2 = new Account(124, 10000, "Снегирев");
        Account ac3 = new Account(125, 2300, "Петров");

        accounts.put(123, petrov);
        petrov.accountsList.add(ac1);

        accounts.put(124, snegirev);
        snegirev.accountsList.add(ac2);

        accounts.put(125, petrov);
        petrov.accountsList.add(ac3);

        /*TODO сделать возможность выбора операций/действий 
        System.out.println("выберите операцию(введите номер без скобки): \n" +
                "1)найти клиента по ID аккаунта \n" +
                "2)найти все аккаунты клиента по имени");
        int answer = Integer.parseInt(sc.next());

        if (answer == 1) {
            findClient(accounts, sc);
        } else if (answer == 2)
            findAccounts(clients, sc);
        }*/

        findClient(accounts, sc);
        findAccounts(clients, sc);
        sc.close();
    }

    public static Map<String, Client> createClientsMap() {
        Map<String, Client> clients = new HashMap<>();
        Map<Integer, Client> accounts = new HashMap<>();

        Client petrov = new Client("Петров", 11);
        Client snegirev = new Client("Снегирев", 22);
        Client popov = new Client("Попов", 50);
        Client sidorov = new Client("Сидоров", 60);
        Client ivanov = new Client("Иванов", 18);


        clients.put("Петров", petrov);
        clients.put("Снегирев", snegirev);

        return clients;
    }

    public static Map<Integer, Client> createAccountsMap() {

        Map<String, Client> clients = new HashMap<>();
        Map<Integer, Client> accounts = new HashMap<>();

        Client petrov = new Client("Петров", 11);
        Client snegirev = new Client("Снегирев", 22);
        Client popov = new Client("Попов", 50);
        Client sidorov = new Client("Сидоров", 60);
        Client ivanov = new Client("Иванов", 18);


        clients.put("Петров", petrov);
        clients.put("Снегирев", snegirev);

        Account ac1 = new Account(123, 2200, "petrov");
        Account ac2 = new Account(124, 10000, "snegirev");
        Account ac3 = new Account(125, 2300, "petrov");

        accounts.put(123, petrov);
        petrov.accountsList.add(ac1);

        accounts.put(124, snegirev);
        snegirev.accountsList.add(ac2);

        accounts.put(125, petrov);
        petrov.accountsList.add(ac3);

        return accounts;
    }


    static void findAccounts(Map clients, Scanner sc) {
        Client client = new Client();

        //Scanner sc = new Scanner(System.in);
        System.out.println("введите имя владельца");
        String name = sc.next();
        // sc.close();

        client = (Client) clients.get(name);
        client.accountsList.forEach(account -> System.out.println(
                "ID аккаунта: " + account.accountID +
                        "  баланс: " + account.amountOfMoney + "  имя владельца: " + account.holdersName));
    }

    static void findClient(Map accounts, Scanner sc) {

        Client client = new Client();

        // Scanner sc1 = new Scanner(System.in);
        System.out.println("введите ID аккаунта");
        int id = Integer.parseInt(sc.next());
        // sc1.close();

        client = (Client) accounts.get(id);

        System.out.println("Владелец: " + client.name + " " + client.age + " лет");


    }


}