package com.MultiThreading_20;
/** Multithreading in Java :
 *  The process of executing multiple threads simultaneously is known as Multithreading.
 *
 *  Thread :
 *  It is a lightweight sub process. It is a smallest unit of processing.It uses
 *  shared memory area.
 *  Threads are independent of each other so it does not effect other thread.
 *  so if there is an exception in one thread then it will not affect the another
 *  thread.
 *
 *  Java provides Thread class to achieve multithreading in our program.
 *
 *  Thread Life Cycle :
 *  Threads have 4 sates. They may be in any one of the states.
 *  1.New :- When the object of thread class has been created then it is said to be in new state.
 *  2.Runnable :- When the start method is called then thread is said to be in Runnable state.
 *  Running :-
 *  3.Non-Runnable :- When thread is alive but it is not running.
 *  4.Terminated :- In this state, thread exits from run() method.
 *
 *  Important methods of Thread :
 *  1.start() - To start the thread
 *  2.run() - What will be the content of the thread
 *
 *  Creating thread in Java :
 *  There are two ways to do so :
 *  1.By extending Runnable interface   //thread class
 *  2.By implementing Runnable interface
 *
 *  Creating Thread by extending Thread
 * */
public class Multithreading1 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread is running "+i);
        }
    }
    public static void main(String args[]){
       Multithreading1 t1 = new Multithreading1();
       Multithreading1 t2 = new Multithreading1();
       t1.start();          //if we write t1.run() then it will work as a normal function
        //so just call start method it will start searching the run method automatically
       t2.start();
    }
}
//prev Applet
//next
