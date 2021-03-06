package com.liuning.web.aspect;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BusiLog {

    String name() default "";

    boolean ignore() default false;
}
