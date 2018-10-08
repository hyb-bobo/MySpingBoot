//package com.shanghai.springboot;
//
//import com.shanghai.springboot.domain.Tuser;
//import com.shanghai.springboot.mapper.TuserMapper;
//import com.shanghai.springboot.mapper.UserRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = MySpringBootApplication.class)
//public class MapperTest {
//    @Autowired
//    private TuserMapper userMapper;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void test() {
//        List<Tuser> users = userMapper.queryUserList();
//        System.out.println(users);
//    }
//
//    @Test
//    public void test1() {
//        List<Tuser> users = userRepository.findAll();
//        System.out.println(users);
//    }
//
//    public static void main(String[] args) {
//        List<Tuser> tusers = new ArrayList<Tuser>();
//        List<Tuser> tusersA = new ArrayList<Tuser>();
//        for (int i=0;i<10;i++){
//            Tuser u = new Tuser();
//            u.setName("aaaaa"+i*i);
//            u.setPassword("aaaaa"+i);
//            tusers.add(u);
//        }
//
//        for (int i=0;i<10;i++){
//            Tuser u = new Tuser();
//            u.setName("aaaaa"+i);
//            tusersA.add(u);
//        }
//
//        for(int j=0;j<10;j++){
////            tusersA.get(j).getName().equals();
//
//        }
//    }
//}