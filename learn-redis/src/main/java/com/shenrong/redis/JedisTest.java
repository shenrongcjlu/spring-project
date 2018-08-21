package com.shenrong.redis;

import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);

        int i = 0;
        long start = System.currentTimeMillis();
        while (true) {
            long end = System.currentTimeMillis();
            if ((end - start) > 1000) {
                break;
            }
            i++;
            jedis.set("test" + i, i + "");
        }
        System.out.println("redis 每秒操作" + i);
    }
}
