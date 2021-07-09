package Mod6.Task;

class Staff extends Company {
    protected String position;
    protected String name;
    protected int age;
    static int  staffMembers = 0;

    Staff() {
        super("Employee", true);
        System.out.println("Welcome our new part time worker!");

    }

    protected Staff(String position, String name, int age) {
//        Staff();
        super("Employee", true);
        this.position = position;
        this.name = name;
        this.age = age;
        message();
    }

    private void message() {
        if (active) {
            staffMembers++;
            System.out.println("Welcome our new staff member!");
            System.out.printf("This is our new %s %s. ", this.position, this.name );
            System.out.printf("%s is %d years old.\n", this.name, this.age);
        }
        else {
            staffMembers--;
            System.out.println("Farewell to our former staff member!");
            System.out.printf("%s doesn't work in our company anymore.\n", this.name);
        }
        System.out.println("We now have " + staffMembers + " staff member(s) in our Company!");
    }
    protected void action(){
        System.out.printf("%s is working hard.\n", this.position);

    }
}

class Board extends Staff {
    //    String position;
    static int boardMembers = 0;
    Board(String position, String name, int age){
        super.position = position;
        super.name = name;
        super.age = age;
        message();
    }

        private void message() {
            if (active) {
                boardMembers++;
                System.out.println("Welcome your new boss!");
                System.out.printf("This is our new %s %s. ", super.position, super.name );
                System.out.printf("%s is %d years old.\n", super.name, super.age);
            }
            else {
                boardMembers--;
                System.out.println("There must be only one!");
            }
        System.out.println("We now have " + boardMembers + " board member(s) in our Company!");
    }
    @Override
    protected void action(){
        System.out.printf("%s is making difficult decisions. \n", this.name);
    }
}
