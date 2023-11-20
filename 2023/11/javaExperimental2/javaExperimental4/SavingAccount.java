package javaExperimental4;


public class SavingAccount implements BankAccount{
    @Override
    public void deposit(){
        System.out.println("成功存款");
    }

    @Override
    public void withdraw() {
        System.out.println("成功取款");
    }

    public static class main {
        public static void main(String[] args) {
            SavingAccount account=new SavingAccount();
            account.deposit();
            account.withdraw();
        }
    }
}
