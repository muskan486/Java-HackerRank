import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton
{
    public String str;
    private Singleton()
    {
        // non parameterized constructor.
    }
    private static Singleton singleton=new Singleton();
    public static Singleton getSingleInstance()
    {
        return singleton;
    }
