package ru.soloboev.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.soloboev.MyThirdTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
