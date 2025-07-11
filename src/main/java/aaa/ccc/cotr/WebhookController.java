package aaa.ccc.cotr;


import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public String receive() {
        return "Webhook received.";
    }

}
