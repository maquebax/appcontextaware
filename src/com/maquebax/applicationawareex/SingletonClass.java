package com.maquebax.applicationawareex;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Date;

public class SingletonClass implements ApplicationContextAware {
    ApplicationContext applicationContext;
    Date pDate;
    Date sDate;

    public Date getpDate() {
        return (Date) this.applicationContext.getBean("date");
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }



    public Date getsDate() {
        return sDate;
    }

    public void setsDate(Date sDate) {
        this.sDate = sDate;
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
