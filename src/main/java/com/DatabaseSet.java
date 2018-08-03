package com;

import com.google.common.collect.Sets;

import java.util.Set;

public class DatabaseSet {
    String name;
    String provider;
    String shardingStrategy;
    Set<Shard> shards = Sets.newHashSet();
}
