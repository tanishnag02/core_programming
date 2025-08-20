public class Third {

    public void myMethod() {
        int x = 1;
        int y = 2;
        int q = x + y;
        System.out.println(q);
    }

    public static void main(String[] args) {
        // Create object to call myMethod()
        Third obj = new Third();
        obj.myMethod();
    }
}

