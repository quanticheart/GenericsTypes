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
 *  * Copyright(c) Developed by John Alves at 2019/7/20 at 7:42:25 for quantic heart studios
 *
 */

package com.quanticheart.genericstypes;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.quanticheart.genericstypes.GenericClasses.ObjectInterface.TestObjInter;
import com.quanticheart.genericstypes.GenericClasses.TestSimpleObj;
import com.quanticheart.genericstypes.GenericMethods.TestGenericMethods;
import com.quanticheart.genericstypes.GenericWildcard.TestWildcards;

public class Main extends Activity {

    /**
     * Generics Type Naming Convention
     * Naming convention helps us understanding code easily and having a naming convention
     * is one of the best practices of java programming language.
     * So generics also comes with it’s own naming conventions.
     * Usually type parameter names are single, uppercase letters to make
     * it easily distinguishable from java variables. The most commonly
     * used type parameter names are:
     * <p>
     * E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
     * K – Key (Used in Map)
     * N – Number
     * T – Type
     * V – Value (Used in Map)
     * S,U,V etc. – 2nd, 3rd, 4th types
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new TestSimpleObj();

        new TestObjInter();

        new TestGenericMethods();

        new TestWildcards();
    }
}
