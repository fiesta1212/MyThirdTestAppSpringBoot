package ru.soloboev.MyThirdTestAppSpringBoot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.soloboev.MyThirdTestAppSpringBoot.model.Request;

import java.time.Duration;
import java.time.Instant;

@Service("ModifyRequestServiceSystemTime")
public class ModifyRequestServiceSystemTime implements ModifyRequestService {
    private static final Logger log = LoggerFactory.getLogger(ModifyRequestServiceSystemTime.class);
    @Override
    public void modify(Request request) {
        // Текущее время в Сервисе 2
        Instant currentInstant = Instant.now();
        // Проверка: было ли установлено время в Сервисе 1
        if (request.getReceivedTime() != null) {
            // Вычисляем разницу во времени между Сервисом 1 и Сервисом 2
            long timeDifferenceMillis = Duration.between(request.getReceivedTime(), currentInstant).toMillis();
            // Логируем разницу во времени
            log.info("Time difference from Service 1 to Service 2: {} ms", timeDifferenceMillis);
        } else {
            // Логируем предупреждение, если время в Сервисе 1 не установлено
            log.warn("ReceivedTime in Request is null. Unable to calculate time difference.");
        }
        return;
    }
}