package com;

import com.google.common.collect.Sets;

import java.util.Set;

public class DatabaseSet {
    String name;
    String provider;
    String shardingStrategy;
    Set<Shard> shards = Sets.newHashSet();

    public DatabaseSet(String name, String provider, String shardingStrategy, Set<Shard> shards) {
        this.name = name;
        this.provider = provider;
        this.shardingStrategy = shardingStrategy;
        this.shards = shards;
    }
}
