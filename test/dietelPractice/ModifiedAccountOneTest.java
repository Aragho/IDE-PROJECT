package dietelPractice;

import dietelpractice.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModifiedAccountOneTest {
    Car.ModifiedAccount account;

    @BeforeEach
    public void setUp() {
        account = new Car.ModifiedAccount("Adenike", "Adetoro", 2222);

    }

    @Test
    public void testToCreateAccount() {
        assertEquals("Adenike Adetoro", account.getName());

    }

    @Test
    public void testToCreateTwoAccounts() {
        assertEquals("Adenike Adetoro", account.getName());
        Car.ModifiedAccount account2 = new Car.ModifiedAccount("omodara", "ayodele", 1234);
        assertEquals("omodara ayodele", account2.getName());
        assertEquals(2, account.countAccountsCreated());
    }

    @Test
    public void testToDeposit() {
       assertEquals(0, account.getBalance());
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());
    }

    @Test
    public void testToWithdraw() {
        assertEquals(0, account.getBalance());
        account.withdraw(10_000);
        assertEquals(0, account.getBalance());
    }

//    @Test
//    public void testToWithdrawMoreThanBalance() {
//        account.deposit(2_000);
//        assertEquals(2_000, account.getBalance());
//        account.withdraw(5_000);
//        assertEquals(2_000, account.getBalance());
//    }
}