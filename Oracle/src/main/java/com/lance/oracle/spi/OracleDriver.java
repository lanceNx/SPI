package com.lance.oracle.spi;

import com.lance.database.spi.DataBaseDriver;

public class OracleDriver implements DataBaseDriver {
    public String connection(String host) {
        return "this is ORACLE connection " + host;
    }
}
