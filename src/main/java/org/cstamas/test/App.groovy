package org.cstamas.test;

import java.io.FileInputStream
import java.io.IOException

class App 
{
    public static void main( String[] args ) throws IOException
    {
        try (FileInputStream fis = new FileInputStream('test')) {
        }
    }
}
