package ari.java.demo.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

@Service
public class RandomService {

    public String randomString() {
        return RandomStringUtils.randomAlphabetic(10);
    }

    public int randomInt() {
        return RandomUtils.nextInt();
    }
}
