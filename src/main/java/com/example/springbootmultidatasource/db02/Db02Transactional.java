package com.example.springbootmultidatasource.db02;

import org.springframework.core.annotation.AliasFor;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Transactional(transactionManager = Db02Config.DB02_TRANSACTION_MANAGER_NAME)
public @interface Db02Transactional {

    @AliasFor(attribute = "label", annotation = Transactional.class)
    String[] label() default {};

    @AliasFor(attribute = "propagation", annotation = Transactional.class)
    Propagation propagation() default Propagation.REQUIRED;

    @AliasFor(attribute = "isolation", annotation = Transactional.class)
    Isolation isolation() default Isolation.DEFAULT;

    @AliasFor(attribute = "timeout", annotation = Transactional.class)
    int timeout() default -1;

    @AliasFor(attribute = "readOnly", annotation = Transactional.class)
    boolean readOnly() default false;

    @AliasFor(attribute = "rollbackFor", annotation = Transactional.class)
    Class<? extends Throwable>[] rollbackFor() default {};

    @AliasFor(attribute = "noRollbackFor", annotation = Transactional.class)
    Class<? extends Throwable>[] noRollbackFor() default {};
}
