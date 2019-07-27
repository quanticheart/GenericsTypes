/*
 *
 *  *                                     /@
 *  *                      __        __   /\/
 *  *                     /==\      /  \_/\/
 *  *                   /======\    \/\__ \__
 *  *                 /==/\  /\==\    /\_|__ \
 *  *              /==/    ||    \=\ / / / /_/
 *  *            /=/    /\ || /\   \=\/ /
 *  *         /===/   /   \||/   \   \===\
 *  *       /===/   /_________________ \===\
 *  *    /====/   / |                /  \====\
 *  *  /====/   /   |  _________    /      \===\
 *  *  /==/   /     | /   /  \ / / /         /===/
 *  * |===| /       |/   /____/ / /         /===/
 *  *  \==\             /\   / / /          /===/
 *  *  \===\__    \    /  \ / / /   /      /===/   ____                    __  _         __  __                __
 *  *    \==\ \    \\ /____/   /_\ //     /===/   / __ \__  ______  ____ _/ /_(_)____   / / / /__  ____ ______/ /_
 *  *    \===\ \   \\\\\\\/   ///////     /===/  / / / / / / / __ \/ __ `/ __/ / ___/  / /_/ / _ \/ __ `/ ___/ __/
 *  *      \==\/     \\\\/ / //////       /==/  / /_/ / /_/ / / / / /_/ / /_/ / /__   / __  /  __/ /_/ / /  / /_
 *  *      \==\     _ \\/ / /////        |==/   \___\_\__,_/_/ /_/\__,_/\__/_/\___/  /_/ /_/\___/\__,_/_/   \__/
 *  *        \==\  / \ / / ///          /===/
 *  *        \==\ /   / / /________/    /==/
 *  *          \==\  /               | /==/
 *  *          \=\  /________________|/=/
 *  *            \==\     _____     /==/
 *  *           / \===\   \   /   /===/
 *  *          / / /\===\  \_/  /===/
 *  *         / / /   \====\ /====/
 *  *        / / /      \===|===/
 *  *        |/_/         \===/
 *  *                       =
 *  *
 *  * Copyright(c) Developed by John Alves at 2019/7/21 at 11:57:52 for quantic heart studios
 *
 */

package com.quanticheart.genericstypes.GenericWildcard;

import com.quanticheart.genericstypes.GenericClasses.ObjectInterface.MyObject;
import com.quanticheart.genericstypes.GenericClasses.ObjectInterface.MyObject2;
import com.quanticheart.genericstypes.GenericClasses.ObjectInterface.MyObjectInterface;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.quanticheart.genericstypes.Util.LogUtil.log;

public class TestWildcards {

    private MyObjectInterface<MyObject> objectInterface;
    private MyObjectInterface<MyObject2> objectInterface2;

    public TestWildcards() {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        double sum = sum(ints);
        System.out.println("Sum of ints=" + sum);

        //
        objectInterface = new MyObjectInterface<>();
        objectInterface.setT(new MyObject());

        //
        objectInterface2 = new MyObjectInterface<>();
        objectInterface2.setT(new MyObject2());

        verifyType(objectInterface);
        verifyType(objectInterface2);

        //
        List<Integer> l1 = new ArrayList<>();
        addIntegers(l1);

        List<Object> l2 = new ArrayList<>();
        addIntegers(l2);

        List<Number> l3 = new ArrayList<>();
        addIntegers(l3);

        //
        List<Boolean> l4 = new ArrayList<>();
        addBoolean(l4);

        List<Object> l8 = new ArrayList<>();
        addText(l8);

        //
        List<String> l5 = new ArrayList<>();
        addText(l5);

        List<CharSequence> l6 = new ArrayList<>();
        addText(l6);

        List<Object> l7 = new ArrayList<>();
        addText(l7);

        //
        List<MyObject> l9 = new ArrayList<>();
        addMyClass(l9);

        List<Object> l10 = new ArrayList<>();
        addMyClass(l10);

        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number> numList = intList;  // OK. List<? extends Integer> is a subtype of List<? extends Number>
        List<? extends Object> objList = numList;

    }

    private static <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }

    private static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    private void verifyType(MyObjectInterface<?> object) {
        log("This object is " + object.toString());
    }

    private void addIntegers(List<? super Integer> list) {
        list.add(50);
    }

    private void addBoolean(List<? super Boolean> list) {
        list.add(true);
    }

    private void addText(List<? super String> list) {
        list.add("OK");
    }

    private void addMyClass(List<? super MyObject> list) {
        list.add(new MyObject());
    }

    public class Test<T extends Comparable<T>> {

        private T data;
        private Test<T> next;

        public Test(T d, Test<T> n) {
            this.data = d;
            this.next = n;
        }

        public T getData() { return this.data; }
    }

}
