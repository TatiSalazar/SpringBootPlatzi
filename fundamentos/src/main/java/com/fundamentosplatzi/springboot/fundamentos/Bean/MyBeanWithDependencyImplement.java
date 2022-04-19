package com.fundamentosplatzi.springboot.fundamentos.Bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency {

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al metodo print with dependency");
        LOGGER.debug("el numero en la concatenacion es 5");
        System.out.println(myOperation.sum(5));
        System.out.println("hola desde impl de bean con dependency");

    }
}
