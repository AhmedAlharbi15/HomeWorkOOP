//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Account account1 = new Account("111023234", "Ahmed");
        System.out.println("Account 1 details: " + account1);

        account1.credit(1000);
        System.out.println("After crediting 1000: " + account1);

        account1.debit(500);
        System.out.println("After debiting 500: " + account1);

        Account account2 = new Account("A002", "Omar", 5000);
        System.out.println("Account 2 details: " + account2);

        account1.transferTo(account2, 200);
        System.out.println("After transferring 200 from account1 to account2:");
        System.out.println("Account 1 details: " + account1);
        System.out.println("Account 2 details: " + account2);


        Employee employee1 = new Employee("E001", "Alice", 50000);
        System.out.println("Employee 1 details: " + employee1);

        System.out.println("Employee 1 annual salary: " + employee1.getAnnualSalary());

        employee1.raiseSalary(10);
        System.out.println("After raising salary by 10%: " + employee1);
    }


    }





