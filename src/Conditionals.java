class Conditionals {
    void checkCondition() {
        int num = 11;
        if (num == 0) {
            System.out.println("num is 0");
        } else  {
            System.out.println("num is not zero");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Conditionals cond = new Conditionals();
        cond.checkCondition();
    }
}