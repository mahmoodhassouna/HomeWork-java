/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_2;

import java.nio.IntBuffer;

/**
 *
 * @author Hassouna
 */
public class buffer {

    public static void main(String[] args) {

        IntBuffer buf = IntBuffer.allocate(10);
        buf.put(4);
        buf.put(2);
        buf.put(0);
        buf.put(0);
        buf.put(2);
        buf.put(0);
        buf.put(0);
        buf.put(2);
        buf.put(0);
        buf.put(0);
        String n = "4200200200";

        buf.flip();
        while (buf.hasRemaining()) {

            System.out.print(buf.get());

        }
        System.out.println("");
    }
}
