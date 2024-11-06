package io.github.fiecueal.drawerfm;

import java.io.File;

/**
 * Holds the global state of the app. This class should never be instantiated
 * and should only have static vars and funcs.
 */
public class State {
    public static final String HOME_DIR = System.getProperty("user.home");
    private static String currentDir = HOME_DIR;

    public static String currentDir() {
        return currentDir;
    }

    public static void currentDir(String newDir) {
        //TODO assignments to currentDir should handle non-existent directories
        currentDir = newDir;
    }
}
