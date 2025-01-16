package ClassPraticeStaticMethod;
class Bank
{
    private String BankName;
    private int AccountNo;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Bank o=new Bank();
        o.setBankName("Canara Bank");
        System.out.println(o.getBankName());
        o.setAccountNo(1111222233);
        System.out.println(o.getAccountNo());
    }
}
