package kr.hs.study;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext("kr.hs.study.beans");
        TestBean1 obj1=ctx.getBean(TestBean1.class);
        TestBean2 obj2=ctx.getBean(TestBean2.class);
        obj2.setData2(new DataBean());
        System.out.println(obj2.getData2());
    }
}