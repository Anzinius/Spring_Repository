package com.community;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api/users")
//public class HelloController{
//    @GetMapping
//   public static void main(String[] args){
//       System.out.println("HI");

/*
@Data
    public class ResponseVO<T> {
        private String message;
        private boolean check = true;
        private T response;
}

    @GetMapping
    public ResponseVO<?> getUsers() {
        ResponseVO<List<UserVO>> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("Test", "gunho BYE,,,,,"));

        resp.setResponse(list);
        return resp;
    }

    @GetMapping("/{id}")
    public ResponseVO<?> getUser(@PathVariable int id) {
        ResponseVO<UserVO> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("Test", "AnjiJJANG"));

        resp.setResponse(list.get(id));
        return resp;
    }
}
*/


public class HelloController {
    @GetMapping("/api/hello")
    public String hello() {
        return "hello";
    }
}
