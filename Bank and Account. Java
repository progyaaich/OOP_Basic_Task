import java.util.ArrayList;

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    public String toString() {
        return "Account " + accountNumber + " Balance: $" + balance;
    }
}

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account acc) {
        accounts.add(acc);
    }

    void removeAccount(Account acc) {
        accounts.remove(acc);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account("101", 1000);
        Account a2 = new Account("102", 2000);

        bank.addAccount(a1);
        bank.addAccount(a2);

        a1.deposit(500);
        a2.withdraw(1000);

        System.out.println(a1);
        System.out.println(a2);
    }
}
