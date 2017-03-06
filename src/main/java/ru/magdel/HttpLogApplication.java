package ru.magdel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@SpringBootApplication
@Controller
public class HttpLogApplication {

    private static final Logger logger = LoggerFactory.getLogger(HttpLogApplication.class);

    @GetMapping(path = "/log", produces = "text/plain")
    @ResponseBody
    public String logRequest(HttpServletRequest httpServletRequest) {
        StringBuilder sb = new StringBuilder();
        Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            sb.append(header)
                    .append(":")
                    .append(httpServletRequest.getHeader(header)).append("\n");
        }
        logger.info(httpServletRequest.getRequestURI());
        logger.info(sb.toString());
        return "LOG OK";
    }

    public static void main(String[] args) {
        SpringApplication.run(HttpLogApplication.class, args);
    }
}
