package com.example.demo.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    JdbcTemplate template;

    @GetMapping("/query")
    @ResponseBody
    public List<Map<String, Object>> map(){
        List<Map<String, Object>> list = template.queryForList("select * from auction");
        return list;
    }

}
