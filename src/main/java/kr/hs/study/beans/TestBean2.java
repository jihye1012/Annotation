package kr.hs.study.beans;

import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class TestBean2 {
    private int data1;
    private DataBean data2;

    public TestBean2() {
    }

    public DataBean getData2() {
        return data2;
    }

    public void setData2(DataBean data2) {
        this.data2 = data2;
    }
}
