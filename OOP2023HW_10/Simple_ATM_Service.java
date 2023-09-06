/**
 * A class that implements the ATM_Service interface to provide simple ATM services, including checking account balance and
 * withdrawing money. Withdrawals are restricted to be in thousands, with one-thousand dollar bills provided only.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class Simple_ATM_Service implements ATM_Service {

    /**
     * Checks whether the balance in the account is sufficient to withdraw the specified amount of money.
     * If the balance is insufficient, throws an exception named ATM_Exception with type of BALANCE_NOT_ENOUGH.
     *
     * @param account the account to be checked for balance.
     * @param money   the amount of money to be withdrawn from the account.
     * @return true if the balance is sufficient; otherwise, false.
     * @throws ATM_Exception if the account balance is insufficient for the withdrawal.
     */
    @Override
    public boolean checkBalance(Account account, int money) throws ATM_Exception {
        if (account.getBalance() < money) {
            throw new ATM_Exception(ATM_Exception.ExceptionTYPE.BALANCE_NOT_ENOUGH);
        }
        return true;
    }

    /**
     * Checks if the amount of money can be divided by 1000. If not, throws an exception named ATM_Exception
     * with type of AMOUNT_INVALID.
     *
     * @param money the amount of money to be checked for validity.
     * @return true if the amount is valid; otherwise, false.
     * @throws ATM_Exception if the amount is not a multiple of 1000.
     */
    @Override
    public boolean isValidAmount(int money) throws ATM_Exception {
        if (money % 1000 != 0) {
            throw new ATM_Exception(ATM_Exception.ExceptionTYPE.AMOUNT_INVALID);
        }
        return true;
    }

    /**
     * Withdraws the specified amount of money from the account.
     *
     * @param account the account from which money is to be withdrawn.
     * @param money   the amount of money to be withdrawn.
     */
    @Override
    public void withdraw(Account account, int money) {
        try {
            // check if the balance is sufficient for the withdrawal
            this.checkBalance(account, money);
            // check if the amount to withdraw is valid
            this.isValidAmount(money);
            // withdraw the money and update the account balance
            account.setBalance(account.getBalance() - money);
        } catch (ATM_Exception e) {
            // if an exception is thrown, print the error message
            System.out.println(e.getMessage());
        }
        // print the updated balance, whether the withdrawal was successful or not
        System.out.println("updated balance : " + account.getBalance());
    }
}