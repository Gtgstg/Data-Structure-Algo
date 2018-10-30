public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(1243);
        t.insert(1254352);
        t.insert(124);
        t.insert(1255);
    t.traverseInOrder();
        System.out.println();
    System.out.println(t.get(1243));
        System.out.println(t.get(12423443));
        System.out.println(t.get(124));
        System.out.println(t.min());
        System.out.println(t.max());
        t.delete(124);
        t.traverseInOrder();
    }
}
