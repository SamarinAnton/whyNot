package letscode.sarafan.controller;

import com.vk.api.sdk.client.Lang;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.UserAuthResponse;
import com.vk.api.sdk.objects.users.UserXtrCounters;
import com.vk.api.sdk.objects.wall.responses.GetResponse;
import com.vk.api.sdk.queries.users.UserField;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class MessageController {

    @ResponseBody
    @GetMapping("message")
    public String list() throws Exception{

//        String code = "b9937584f34f0c90cc";
//        Integer APP_ID = 6841360;
//        String CLIENT_SECRET = "1KJCMGPmDGWNubYu8iCu";
//        String REDIRECT_URI = "http://localhost:8080/login";    // scope ??
//
//        TransportClient transportClient = HttpTransportClient.getInstance();
//        VkApiClient vk = new VkApiClient(transportClient);
//
//        UserAuthResponse authResponse = vk.oauth()
//                .userAuthorizationCodeFlow(APP_ID, CLIENT_SECRET, REDIRECT_URI, code)
//                .execute();
//
//        UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
//
//        List<UserXtrCounters> users = vk.users().get(actor)
//                .userIds("1")
//                .fields(UserField.VERIFIED, UserField.SEX)
//                .lang(Lang.EN)
//                .execute();
//        return users.toString();
        return "qweqwe";
    }

    @GetMapping
    public String start() {
        return "start";
    }

    @ResponseBody
    @GetMapping("login")
    public String redirect(@RequestParam("code") String code) {
        return code;
    }
}

//http://localhost:8080/login?code=a5c0e6edde3dc752e4&state=bu1JmA
//https://oauth.vk.com/authorize?client_id=6841360&redirect_uri=http://localhost:8080/login&response_type=code&scope=friends%20offline&state=Ipk4PC