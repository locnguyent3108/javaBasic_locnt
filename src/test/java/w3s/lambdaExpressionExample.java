package w3s;

public class lambdaExpressionExample {

    @FunctionalInterface
    interface Hello {
        public String sayHello();
    }

//    public static void main(String[] args) {
//        Hello s = () -> {
//            return "Hello lamda";
//        };
//        System.out.println(s.sayHello());
//    }

    @FunctionalInterface
    interface Hello1 {
        public String sayHello(String name);
    }

    public static void main(String[] args) {
        Hello1 s = name -> {
            return "Hello " + name;
        };
        System.out.println(s.sayHello("Locnguyent"));

    }


}
