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
 *  * Copyright(c) Developed by John Alves at 2019/7/20 at 11:13:13 for quantic heart studios
 *
 */

package com.quanticheart.genericstypes.GenericMethods;

import com.quanticheart.genericstypes.GenericClasses.ObjectInterface.MyObject;
import com.quanticheart.genericstypes.GenericClasses.ObjectInterface.MyObject2;
import com.quanticheart.genericstypes.GenericClasses.ObjectInterface.MyObjectInterface;

import static com.quanticheart.genericstypes.Util.LogUtil.log;

public class TestGenericMethods {

    //Generics in method
    public static <T> boolean isEqual(MyObjectInterface<T> g1, MyObjectInterface<T> g2) {
        return g1.getT().equals(g2.getT());
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

    private MyObjectInterface<MyObject> obj1;
    private MyObjectInterface<MyObject2> obj2;
    private MyObjectInterface<MyObject> obj3;

    public TestGenericMethods() {

        //
        obj1 = new MyObjectInterface<>();
        obj1.setT(new MyObject());

        //
        obj2 = new MyObjectInterface<>();
        obj2.setT(new MyObject2());

        //
        obj3 = new MyObjectInterface<>();
        obj3.setT(new MyObject());

        verifyType();
    }

    private void verifyType() {

        if (TestGenericMethods.<MyObject>isEqual(obj1, obj3)) {
            log("object is String");
        }

        boolean isEqual = TestGenericMethods.<MyObject>isEqual(obj1, obj3);
        //above statement can be written simply as
        isEqual = TestGenericMethods.isEqual(obj1, obj3);
        //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
        //Compiler will infer the type that is needed

    }
}
