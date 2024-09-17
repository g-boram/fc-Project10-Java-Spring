package org.example;

import jdk.jfr.ContentType;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReflectionTest {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    @Test
    void controllerScan() {
        Reflections reflections = new Reflections("org.example");

        Set<Class<?>> beans = new HashSet<>();
        beans.addAll(reflections.getTypesAnnotatedWith(ContentType.class));

        logger.debug("beans : [{}]", beans);
    }
}
