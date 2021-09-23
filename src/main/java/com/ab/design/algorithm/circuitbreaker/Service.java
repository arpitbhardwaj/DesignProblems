package com.ab.design.algorithm.circuitbreaker;

import java.io.IOException;

public interface Service {
    String call() throws IOException;
}
