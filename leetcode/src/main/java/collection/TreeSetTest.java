package collection;

import java.util.Iterator;
import java.util.TreeSet;
class Dog implements Comparable<Dog>{
    int size;
    public Dog(int s){
        size = s;
    }
    public String toString(){
        return size + "";
    }

    @Override
    public int compareTo(Dog o) {
        return size - o.size;
    }
}
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> tree  = new TreeSet<>();
        tree.add(12);
        tree.add(63);
        tree.add(45);
        tree.add(34);
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.println( iterator.next() + " ");
        }
        TreeSet<Dog> iteratorDog = new TreeSet<>();
        iteratorDog.add(new Dog(1));
        iteratorDog.add(new Dog(3));
        iteratorDog.add(new Dog(2));

        Iterator<Dog> iterator1 = iteratorDog.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next()+" ");
        }

    }
}
