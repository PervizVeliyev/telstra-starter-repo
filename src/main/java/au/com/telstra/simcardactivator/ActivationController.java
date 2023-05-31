package au.com.telstra.simcardactivator;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class ActivationController {
    private final RestTemplate restTemplate;
    @PostMapping("/activation")
    public void activate(@RequestBody ActivationRequest activationRequest){
        String url = "http://localhost:8444/actuate";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> requestEntity = new HttpEntity<>(activationRequest.getIccid(), headers);
        System.out.println(restTemplate.exchange(url, HttpMethod.POST, requestEntity, Boolean.class).getBody());
    }
}
