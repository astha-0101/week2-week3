import java.util.*;

// Client class
class Client {
    String name;
    int riskScore;
    double accountBalance;

    public Client(String name, int riskScore, double accountBalance) {
        this.name = name;
        this.riskScore = riskScore;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return name + ":" + riskScore;
    }
}

public class week2week3 {


    public static void bubbleSort(Client[] arr) {
        int n = arr.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    // swap
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        System.out.println("Bubble Sort (Ascending): " + Arrays.toString(arr));
        System.out.println("Swaps: " + swaps);
    }

    //  Insertion Sort (Descending riskScore + accountBalance)
    public static void insertionSort(Client[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && compare(arr[j], key) < 0) {
                arr[j + 1] = arr[j]; // shift
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Insertion Sort (Descending): " + Arrays.toString(arr));
    }

    //  Comparison logic
    private static int compare(Client c1, Client c2) {
        if (c1.riskScore != c2.riskScore) {
            return Integer.compare(c1.riskScore, c2.riskScore);
        }
        return Double.compare(c1.accountBalance, c2.accountBalance);
    }

    //  Top 10 highest risk clients
    public static void topClients(Client[] arr) {
        System.out.println("\nTop Risk Clients:");

        int limit = Math.min(10, arr.length);

        for (int i = 0; i < limit; i++) {
            System.out.println((i + 1) + ". " + arr[i].name + " (" + arr[i].riskScore + ")");
        }
    }

    public static void main(String[] args) {

        Client[] clients = {
                new Client("clientC", 80, 50000),
                new Client("clientA", 20, 20000),
                new Client("clientB", 50, 30000)
        };

        // Copy arrays
        Client[] bubbleArr = Arrays.copyOf(clients, clients.length);
        Client[] insertionArr = Arrays.copyOf(clients, clients.length);

        // Sorting
        bubbleSort(bubbleArr);
        insertionSort(insertionArr);

        // Top risks
        topClients(insertionArr);
    }
}