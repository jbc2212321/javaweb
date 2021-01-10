package com.jbc;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;

public class testRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);

        List<String>list=jedis.lrange("list",0,-1);
        for (String s:list){
            System.out.println(s);
        }
    }
}
