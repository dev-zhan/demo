package kz.springboot.springbootdemo.services.impl;

import kz.springboot.springbootdemo.services.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    private String testData;
    private int testIntdata;
    @Override
    public String getTestData() {
        return "Some test Data"+this.testData;
    }

    @Override
    public void setTestDataInt(int testDataInt) {
        this.testIntdata=testDataInt;
    }

    @Override
    public int getTestDataInt() {
        return this.testIntdata;
    }

    @Override
    public void setTestData(String testData) {
        this.testData=testData;
    }

    @Override
    public boolean auth(String email, String password) {
        return false;
    }
}
