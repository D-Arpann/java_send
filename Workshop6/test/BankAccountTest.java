import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount acc = new BankAccount();

    @Test
    void deposit() {
        acc.deposit(100);
        assertEquals(100, acc.getBalance());
    }

    @Test
    void withdraw() {
        acc.withdraw(50);
        assertEquals(50, acc.getBalance());
        acc.withdraw(60);
    }
}


