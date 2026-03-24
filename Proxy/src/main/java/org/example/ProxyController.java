package org.example;

import org.springframework.web.bind.annotation.*;
import java.io.*;
import java.net.*;

@RestController
@CrossOrigin(origins = "*")
public class ProxyController {

    private String http;
    String service1 = System.getenv("SERVICE1") != http://ec2-54-164-70-12.compute-1.amazonaws.com:8081
    String service2 = System.getenv("SERVICE2") != http://ec2-13-221-232-82.compute-1.amazonaws.com:8082

    private String call(String url) throws Exception {
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setConnectTimeout(3000);
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line; StringBuilder sb = new StringBuilder();
        while ((line = in.readLine()) != null) sb.append(line);
        in.close();
        return sb.toString();


        @GetMapping("/fibonacci")
        public String fibonacci(@RequestParam int numero);{
            try { return call(service1 + "/fibonacci?numero=" + numero); }
            catch (Exception e) {
                try { return call(service2 + "/fibonacci?numero=" + numero); }
                catch (Exception ex) { return "Servicios caídos"; }
            }
        }
    }
}