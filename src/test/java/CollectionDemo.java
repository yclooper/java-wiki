import org.junit.Test;
import wiki.jvm.CGLibOOM;
import wiki.reflect.Student;
import wiki.thk.Color;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * Created by chen on 2020/5/25.
 */
public class CollectionDemo {

    @Test
    public void func1() {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer, Integer>(2,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > 2;
            }
        };
        map.put(2, 2);
        map.put(1, 1);
        System.out.println(map.toString());
        map.put(1, 1);
        System.out.println(map.toString());
        map.put(3, 2);
        System.out.println(map.toString());
    }
    @Test
    public void fun2(){
        PriorityQueue<Integer> heap = new PriorityQueue<>(3,(o1, o2) -> o2-o1);
        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(5);
        heap.add(5);
        heap.add(5);

        System.out.println(heap.poll());
    }

    @Test
    public void func3(){
        Arrays.stream(Color.values()).forEach(System.out::println);
    }

    @Test
    public void func4() {
        List<String> list = List.of("1", "2", "3");
        list.add("4");
        list.forEach(System.out::println);

        List<Object> objects = Collections.synchronizedList(new ArrayList<>());
    }

    @Test
    public void func5() {
    }
}
