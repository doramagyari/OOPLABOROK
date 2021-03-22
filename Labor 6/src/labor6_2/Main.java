package labor6_2;

public class Main {
    public static void main(String[] args) {
        String name = new String("Magyari Dora");
        StackInheritance stack1 = new StackInheritance(name.length());
        for (int i = 0; i < name.length(); i++) {
            stack1.push(name.charAt(i));
        }
        while (!stack1.isEmpty()) {
            System.out.print(stack1.top());
            stack1.pop();
        }
        System.out.println();
        StackInheritance stack2 = new StackInheritance(10);
        for (int i = 10; i <= 100; i += 10) {
            stack2.push(i);
        }
        stack2.remove(5);
        stack2.remove(6);
        while (!stack2.isEmpty()) {
            System.out.print(stack2.top()+ " ");
            stack2.pop();
        }
        StackInheritance stack3 = new StackInheritance(5);
        stack3.push(name);
        stack3.push(13);
        stack3.push(17.52);
        stack3.push(name.charAt(0));
        stack3.push(false);
        while(!stack3.isEmpty()){
            System.out.print(stack3.top()+ " ");
            stack3.pop();
        }
    }
}
