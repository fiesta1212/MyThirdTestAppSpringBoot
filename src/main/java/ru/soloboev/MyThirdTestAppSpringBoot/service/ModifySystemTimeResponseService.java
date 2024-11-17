package ru.soloboev.MyThirdTestAppSpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.soloboev.MyThirdTestAppSpringBoot.model.Response;
import ru.soloboev.MyThirdTestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService
        implements ModifyResponseService {
    @Override
    public Response modify(Response response){
        response.setSystemTime(DateTimeUtil.getCustomFormat()
                .format(new Date()));
        return response;
    }
}