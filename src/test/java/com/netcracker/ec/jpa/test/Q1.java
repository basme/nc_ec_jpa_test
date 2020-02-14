package com.netcracker.ec.jpa.test;

import com.netcracker.ec.jpa.test.config.HibernateConfig;
import com.netcracker.ec.jpa.test.service.injects.InjectingServiceOne;
import com.netcracker.ec.jpa.test.service.injects.InjectingServiceTwo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.annotation.Resource;
import javax.persistence.FlushModeType;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = { HibernateConfig.class },
        loader = AnnotationConfigContextLoader.class)
public class Q1 {

    @Resource
    private InjectingServiceOne injectingServiceOne;

    @Resource
    private InjectingServiceTwo injectingServiceTwo;

    @Test
    public void test() {
        injectingServiceOne.getManager().setFlushMode(FlushModeType.COMMIT);
        assertThat(injectingServiceTwo.getManager().getFlushMode(), is(FlushModeType.COMMIT));
    }

}
