package exception.custom;

public class Account {

	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) throws DepositMinusMoneyException {
		if(money < 0) {
			throw new DepositMinusMoneyException("음수로 입금할 수 없습니다.");
		}
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(this.balance < money) {
			throw new BalanceInsufficientException("잔고부족");
		}
		this.balance -= money;
	}
}
