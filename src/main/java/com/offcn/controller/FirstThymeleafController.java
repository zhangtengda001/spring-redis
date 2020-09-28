package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstThymeleafController {

    public void test(){
        System.out.println("你好啊");
    }

    @GetMapping("/indexPage")
    public String indexPage(Model model){
        String aa="你好，欢迎";
       model.addAttribute("aa",aa);
       return "index";

    }

    @GetMapping("/twodexPage")
    public String twodexPage(Model model){

        User user=new User();
        user.setId(1);
        user.setName("哒哒");
        user.setAge(12);
        model.addAttribute("user",user);
        return "index1";
    }

    @GetMapping("/threedexPage")
    public String threedexPage(Model model){

        List<User> userList=new ArrayList<User>();
        User user=new User();
        user.setAge(13);
        user.setName("妹妹1");
        user.setId(2);
        userList.add(user);

        User user1=new User();
        user1.setAge(14);
        user1.setName("妹妹2");
        user1.setId(3);
        userList.add(user1);


        User user2=new User();
        user2.setAge(15);
        user2.setName("妹妹3");
        user2.setId(4);
        userList.add(user2);
        model.addAttribute("userList",userList);
        return "index2";

    }

    @GetMapping("/four")
    public String fourdexPage(Model model){

        model.addAttribute("userName", "优就业");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index3";
    }


    @GetMapping("/five")
    public String fivedexPage(Model model){

        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index4";
    }

    @GetMapping("/six")
    public String sixdexPage(Model model){

        return "index5";
    }

}
