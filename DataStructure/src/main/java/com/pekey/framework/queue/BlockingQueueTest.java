package com.pekey.framework.queue;

import java.time.LocalDateTime;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <h2>12306 售票</h2>
 * 通过ArrayBlockingQueue队列模拟（FIFO 先进先出的数据结构），买卖票的情况</br>
 * <li>put()向队列中增加元素，当元素满了之后会阻塞插入</li>
 * <li>take()若队列不为空直接取数据，当队列为空则阻塞获取</li>
 */
public class BlockingQueueTest {
    public static class BuyTickets {
        /**
         * 定义100张车票
         */
        BlockingQueue<String> tickets = new ArrayBlockingQueue<String>(6);

        //印刷车票
        public void produce() throws InterruptedException {
            tickets.put("A ticket!");
        }

        //客户买票
        public String consume() throws InterruptedException {
            String ticket = tickets.take();
            return ticket;
        }

        //获取当前票的数量
        public int getTicketNum() {
            return tickets.size();
        }
    }

    public static void testTickets() {
        final BuyTickets ticket = new BuyTickets();
//        定义生产者
        class Producer implements Runnable {

            public void run() {
                try {
                    while (true) {
                        System.out.println("官方开始放票:" + LocalDateTime.now());
                        ticket.produce();
                        System.out.println("印刷车票完毕：" + LocalDateTime.now());
                        System.out.println("当前车票的车票数量为：" + ticket.getTicketNum() + "个");
                        // 休眠300ms
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        // 定义买票用户
        class Consumer implements Runnable {
            public void run() {
                try {
                    while (true) {
                        // 开始买票
                        System.out.println("用户开始准备抢票：" + LocalDateTime.now());
                        ticket.consume();
                        System.out.println("抢票完毕：" + LocalDateTime.now());
                        System.out.println("抢票后剩余票数：" + ticket.getTicketNum() + "个");
                        // 休眠1000ms
                        Thread.sleep(300);
                    }
                } catch (InterruptedException ex) {
                }
            }
        }

        ExecutorService service = Executors.newCachedThreadPool();
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        service.submit(producer);
        service.submit(consumer);
        // 程序运行10s后，所有任务停止
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        service.shutdownNow();

    }

    public static void main(String[] args) {
        BlockingQueueTest.testTickets();
    }
}

