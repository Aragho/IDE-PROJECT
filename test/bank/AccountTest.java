package bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest   {
    @Test
    public void newAccount_balanceIsZeroTest(){
        Account account = new Account();
        assertEquals(0, account.getBalance());

    }
    @Test
    public void deposit2kAndBalanceIs2KTest(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());

    }
    @Test
    public void depositMinus1kAndBalanceis2kTest(){
        Account account = new Account();
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
        account.deposit(-1_000);
        assertEquals(2000, account.getBalance());
    }
    @Test
    public void withdraw10kTest(){
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.withdraw(10_000);
        assertEquals(0, account.getBalance());

    }
    @Test
    public void withdraw1kAndBalanceis1kTest(){
        Account account = new Account();
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance());
        account.withdraw(1_000);
        assertEquals(1_000, account.getBalance());
    }
}
