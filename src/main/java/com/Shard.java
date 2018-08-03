package com;

public class Shard {
    String name;
    String databaseType;
    String sharding;
    String connectionString;

    public Shard(String name, String databaseType, String sharding, String connectionString) {
        this.name = name;
        this.databaseType = databaseType;
        this.sharding = sharding;
        this.connectionString = connectionString;
    }
}
