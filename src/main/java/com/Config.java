package com;

import com.google.common.collect.Sets;

import java.util.Set;

public class Config {
    Set<DatabaseSet> databaseSets = Sets.newHashSet();

    public Config(Set<DatabaseSet> databaseSets) {
        this.databaseSets = databaseSets;
    }
}
