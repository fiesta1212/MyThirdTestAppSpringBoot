package ru.soloboev.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.soloboev.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}