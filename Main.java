package Mod6.Task;

public class Main {
    public static void main(String[] args) {
        Board bigBoss = new Board("CEO", "Mr. Roboto", 44 );
        Board accountant = new Board("accountant", "Melissa", 33);
        Staff worker2 = new Staff("manager", "John", 26 );
        Staff worker3 = new Staff("sysadmin", "Dan", 31);
        Staff worker4 = new Staff("security", "Boris the Blade", 48);
        Staff worker5 = new Staff("courier", "Sam", 18);
        Staff worker7 = new Staff("janitor", "Robert Paulsen",65);

        worker2.action();
        worker5.action();
        bigBoss.action();

        Client buyer1 = new Client("Mrs Murple", "private person");
        Client buyer2 = new Client("Big Brand", "company");

        buyer1.purchase(145);
        buyer2.purchase(2200);
    }
}
