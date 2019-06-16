package com.lance.mysql.spi;

import com.lance.database.spi.DataBaseDriver;

public class MysqlDriver implements DataBaseDriver {
    public String connection(String host) {
        return "this is MYSQL connection : " + host;
    }
}
