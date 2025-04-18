
import java.util.Scanner;

class Bank {
    private int balance = 0;
    private boolean loggedIn = false;
    private int loggedInIndex = -1;

    private final int[] accounts = {13062006, 8012005};
    private final int[] balances = {67000, 68000};
    private final String[] accountHolders = {"Janhavi Molkar", "Aditi Mishra"};

    public String login(int account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == account) {
                loggedIn = true;
                loggedInIndex = i;
                balance = balances[i];
                return accountHolders[i];
            }
        }
        return null;
    }

    public void logout() {
        loggedIn = false;
        loggedInIndex = -1;
        balance = 0;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0 && loggedIn) {
            balance += amount;
            balances[loggedInIndex] = balance;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance && loggedIn) {
            balance -= amount;
            balances[loggedInIndex] = balance;
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("🏦 Welcome to the Simple Banking System!");

        while (true) {
            System.out.print("🔑 Enter Account Number to Login (or 0 to exit): ");
            int acc = scanner.nextInt();

            if (acc == 0) {
                System.out.println("👋 Exiting... Thank you!");
                break;
            }

            String holder = bank.login(acc);
            if (holder != null) {
                System.out.println("✅ Login Successful. Welcome, " + holder + "!");

                while (bank.isLoggedIn()) {
                    System.out.println("\nChoose an option:");
                    System.out.println("1. 💰 Check Balance");
                    System.out.println("2. 📥 Deposit");
                    System.out.println("3. 📤 Withdraw");
                    System.out.println("4. 🔒 Logout");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("💵 Current Balance: $" + bank.getBalance());
                            break;
                        case 2:
                            System.out.print("📥 Enter amount to deposit: ");
                            int dep = scanner.nextInt();
                            bank.deposit(dep);
                            System.out.println("✅ Deposited. New Balance: $" + bank.getBalance());
                            break;
                        case 3:
                            System.out.print("📤 Enter amount to withdraw: ");
                            int wd = scanner.nextInt();
                            if (wd <= bank.getBalance()) {
                                bank.withdraw(wd);
                                System.out.println("✅ Withdrawn. New Balance: $" + bank.getBalance());
                            } else {
                                System.out.println("❌ Insufficient Balance!");
                            }
                            break;
                        case 4:
                            bank.logout();
                            System.out.println("🔓 Logged out successfully.\n");
                            break;
                        default:
                            System.out.println("❌ Invalid choice. Try again.");
                    }
                }
            } else {
                System.out.println("❌ Invalid account number! Try again.");
            }
        }

        scanner.close();
    }
}
