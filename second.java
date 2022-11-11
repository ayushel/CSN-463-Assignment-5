import java.util.Scanner;

class Customer {
    String name;
}

class Account {
    Customer customer;
    int balance;
    int accountNumber;
    RBI bank;

    public int getBalance() {
        return balance;
    }

    boolean widthdraw(int amount) {
        if (balance - amount >= bank.minimumBalanceAllowed && amount <= bank.maximumWithdrawalLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    boolean deposit(int amount) {
        balance += amount;
        return true;
    }
}

class RBI {
    int minimumInterestRate;
    int minimumBalanceAllowed;
    int maximumWithdrawalLimit;

    public void setMaximumWithdrawalLimit(int maximumWithdrawalLimit) {
        this.maximumWithdrawalLimit = maximumWithdrawalLimit;
    }

    public void setMinimumBalanceAllowed(int minimumBalanceAllowed) {
        this.minimumBalanceAllowed = minimumBalanceAllowed;
    }

    public void setMinimumInterestRate(int minimumInterestRate) {
        this.minimumInterestRate = minimumInterestRate;
    }

}

class SBI extends RBI {
    int minimumInterestRateSBI;
    int minimumBalanceAllowedSBI;
    int maximumWithdrawalLimitSBI;

    public void setMaximumWithdrawalLimitSBI(int maximumWithdrawalLimitSBI) {
        if (maximumWithdrawalLimitSBI <= maximumWithdrawalLimit)
            this.maximumWithdrawalLimitSBI = maximumWithdrawalLimitSBI;
        else
            this.maximumWithdrawalLimitSBI = maximumWithdrawalLimit;
    }

    public void setMinimumBalanceAllowedSBI(int minimumBalanceAllowedSBI) {
        if (minimumBalanceAllowedSBI >= minimumBalanceAllowed)
            this.minimumBalanceAllowedSBI = minimumBalanceAllowedSBI;
        else
            this.minimumBalanceAllowedSBI = minimumBalanceAllowed;
    }

    public void setMinimumInterestRateSBI(int minimumInterestRateSBI) {
        if (minimumInterestRateSBI >= minimumInterestRate)
            this.minimumInterestRateSBI = minimumInterestRateSBI;
        else
            this.minimumInterestRateSBI = minimumInterestRate;
    }
}

class second {
    public static void main(String[] args) {
        RBI rbi = new RBI();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the maximum withdrawl limit");
        int maximumWithdrawalLimit = input.nextInt();
        rbi.setMaximumWithdrawalLimit(maximumWithdrawalLimit);

        System.out.println("Enter the minimum balance allowed");
        int minimumBalanceAllowed = input.nextInt();
        rbi.setMinimumBalanceAllowed(minimumBalanceAllowed);

        System.out.println("Enter the minimum interest rate");
        int minimumInterestRate = input.nextInt();
        rbi.setMinimumInterestRate(minimumInterestRate);

        SBI sbi = new SBI();

        System.out.println("Enter the maximum withdrawl limit for SBI");
        int maximumWithdrawalLimitSBI = input.nextInt();
        sbi.setMaximumWithdrawalLimit(maximumWithdrawalLimitSBI);

        System.out.println("Enter the minimum balance allowed for SBI");
        int minimumBalanceAllowedSBI = input.nextInt();
        sbi.setMinimumBalanceAllowed(minimumBalanceAllowedSBI);

        System.out.println("Enter the minimum interest rate for SBI");
        int minimumInterestRateSBI = input.nextInt();
        sbi.setMinimumInterestRate(minimumInterestRateSBI);

        Customer customer = new Customer();
        customer.name = "Foo";

        Account account = new Account();
        account.accountNumber = (int) Math.random() * 100000;
        account.balance = 0;
        account.customer = customer;
        account.bank = sbi;

        System.out.println(account.deposit(50000));
        System.out.println(account.widthdraw(10000));
        System.out.println(account.getBalance());
    }
}