package com.app.clean_architecture.infrastructure.redis.gateway;

import com.app.clean_architecture.application.property.RedisProperty;
import com.app.clean_architecture.application.stereotype.Gateway;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.core.RedisTemplate;

@Gateway
public class RedisGatewayImpl<T> implements RedisGateway {

    private final RedisTemplate<String, Object> redisTemplate;
    private final ObjectMapper objectMapper;
    private final RedisProperty redisProperty;

    public RedisGatewayImpl(RedisTemplate<String, Object> redisTemplate, ObjectMapper objectMapper, RedisProperty redisProperty) {
        this.redisTemplate = redisTemplate;
        this.objectMapper = objectMapper;
        this.redisProperty = redisProperty;
    }

    @Override
    public T saveToRedis(String keys, Object value) {
        return null;
    }

    @Override
    public T fetchFromRedis(String keys) {
        return null;
    }

    @Override
    public void removeFromRedis(String keys) {

    }

}
