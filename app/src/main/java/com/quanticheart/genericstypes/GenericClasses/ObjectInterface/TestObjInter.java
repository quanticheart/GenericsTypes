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
 *  * Copyright(c) Developed by John Alves at 2019/7/20 at 10:13:57 for quantic heart studios
 *
 */

package com.quanticheart.genericstypes.GenericClasses.ObjectInterface;

import static com.quanticheart.genericstypes.Util.LogUtil.log;

public class TestObjInter {

    /**
     * MyObjectInterface receive Generic type with <> for create auto cast in tun time
     * do not need to do type conversion and can remove the ClassCastException at run time
     */
    private MyObjectInterface objectSimple;
    private MyObjectInterface<MyObject> objectInterface;
    private MyObjectInterface<MyObject2> objectInterface2;

    public TestObjInter() {
        //
        objectSimple = new MyObjectInterface();

        //
        objectInterface = new MyObjectInterface<>();
        objectInterface.setT(new MyObject());

        //
        objectInterface2 = new MyObjectInterface<>();
        objectInterface2.setT(new MyObject2());

        verifyType();
    }

    private void verifyType() {

        log("MyObject in objectSimple");
        log(objectSimple.toString());

        log("MyObject in objectInterface");
        log(objectInterface.toString());
        MyObject object = objectInterface.getT();

        log("MyObject in objectInterface2");
        log(objectInterface2.toString());
        MyObject2 object2 = objectInterface2.getT();

    }
}
