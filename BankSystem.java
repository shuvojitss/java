class Account {
    int acc_number;
    double acc_balance;
    Account(int acc_number, double acc_balance) {
        this.acc_number = acc_number;
        this.acc_balance = acc_balance;
    }
    void deposit(double amount) {
        acc_balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + acc_balance);
    }
    void withdraw(double amount) {
        if (acc_balance >= amount) {
            acc_balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + acc_balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    void displayBalance() {
        System.out.println("Account Number: " + acc_number + ", Balance: " + acc_balance);
    }
}
class savings_acc extends Account {
    double interest;
    final double MIN_BALANCE = 1000;
    savings_acc(int acc_number, double acc_balance, double interest) {
        super(acc_number, acc_balance);
        this.interest = interest;
    }
    void calculateInterest() {
        if (acc_balance >= MIN_BALANCE) {
            double interestAmount = acc_balance * (interest / 100);
            acc_balance += interestAmount;
            System.out.println("Interest added: " + interestAmount + ". New balance: " + acc_balance);
        } else {
            System.out.println("Balance is below minimum. No interest added.");
        }
    }
    void withdraw(double amount) {
        if (acc_balance - amount >= MIN_BALANCE) {
            acc_balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + acc_balance);
        } else {
            System.out.println("Cannot withdraw. Balance must not fall below the minimum balance of " + MIN_BALANCE);
        }
    }
}
class current_acc extends Account {
    double overdraftLimit;
    current_acc(int acc_number, double acc_balance, double overdraftLimit) {
        super(acc_number, acc_balance);
        this.overdraftLimit = overdraftLimit;
    }
    void withdraw(double amount) {
        if (acc_balance + overdraftLimit >= amount) {
            acc_balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + acc_balance);
        } else {
            System.out.println("Exceeded overdraft limit.");
        }
    }
    void displayOverdraftLimit() {
        System.out.println("Overdraft limit: " + overdraftLimit);
    }
}
class BankSystem {
    public static void main(String[] args) {
        savings_acc savings = new savings_acc(1001, 2000, 4);
        savings.displayBalance();
        savings.calculateInterest();
        savings.withdraw(500);
        savings.displayBalance();
        current_acc current = new current_acc(1002, 1500, 500);
        current.displayBalance();
        current.withdraw(1800);
        current.displayBalance();
        current.withdraw(500);
        current.displayOverdraftLimit();
    }
}



/*
Account Number: 1001, Balance: 2000.0
Interest added: 80.0. New balance: 2080.0
Withdrawn: 500.0. New balance: 1580.0
Account Number: 1001, Balance: 1580.0
Account Number: 1002, Balance: 1500.0
Withdrawn: 1800.0. New balance: -300.0
Account Number: 1002, Balance: -300.0
Exceeded overdraft limit.
Overdraft limit: 500.0
*/
