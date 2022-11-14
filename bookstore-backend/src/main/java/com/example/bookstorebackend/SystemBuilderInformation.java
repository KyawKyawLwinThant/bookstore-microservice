package com.example.bookstorebackend;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class SystemBuilderInformation implements InfoContributor {


    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("system-name",System.getProperty("os.name"));
    }
}
