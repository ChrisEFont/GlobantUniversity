/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author chris
 */
public class MyException extends Exception {

    /**
     * Creates a new instance of <code>MyEcxeption</code> without detail
     * message.
     */
    public MyException() {
    }

    /**
     * Constructs an instance of <code>MyEcxeption</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MyException(String msg) {
        super(msg);
    }
}
