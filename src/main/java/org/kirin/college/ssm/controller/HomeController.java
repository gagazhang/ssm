package org.kirin.college.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value = "v",required = false) String version,
                        String loginName, String password){
        Method m = null;
        try{
            String currentMethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            m = getVersionMethod(currentMethodName,version);
            return (String) m.invoke(this,loginName,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "has error";
    }

    public Method getVersionMethod(String currMethodName,String version) throws NoSuchMethodException {
        Class c = this.getClass();
        Method m = null;
        if(StringUtils.isEmpty(version)){
            m = c.getMethod(currMethodName,String.class,String.class);
        }else{
            m = c.getMethod(currMethodName + version,String.class,String.class);
        }
        return m;
    }

    public String login(String loginName, String password){
        return "this is login";
    }

    public String login2(String loginName, String password){
        return "this is login2";
    }
}
