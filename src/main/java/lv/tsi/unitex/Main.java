package lv.tsi.unitex;

import asg.cliche.ShellFactory;
import sun.awt.shell.ShellFolder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException { //posle propisanija commandLoop, nado bylo vstavitj throws
        ShellFactory.createConsoleShell("calc", "Calculator", new Calculator()).commandLoop();

    }
}
