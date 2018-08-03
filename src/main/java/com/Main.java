package com;

import java.util.List;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] s) {
        Config config = readConfig();
        String sql = readSQL();
        RoutingResult routingResult = new Router().route(config, sql);
        List<Future> executorResult = new SQLExecutor().execute(routingResult);
        Iterable it = new Merger().merge(executorResult);

    }
}
