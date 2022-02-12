public class Main {

    public static void main(String[] args) {
        LinkedList<String> people = new LinkedList<>();

        people.add("joro");
        people.add("pesho");
        people.add("misho");

        Node<String>node = people.getHead();

        while (node != null){
            if (node.getElement().equals("pesho")){
                people.remove(node);
            }else{
                System.out.println(node.getElement());
            }
            node = node.getNext();
        }

        System.out.println();

        node = people.getHead();
        while (node != null){
            System.out.println(node.getElement());
            node = node.getNext();
        }
        System.out.println(people.getSize());
    }
}
