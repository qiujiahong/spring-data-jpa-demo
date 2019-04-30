# 自定义返回类型


## 前言

本文实现从数据库中把查询到的值传递给对象。

## 实现


*  自定义对象

```java
@Data
public class User1 {

    private Integer id;

    private String name;
    private String email;
    private String userType;

    public User1(Integer id, String name, String email, String userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}

```


* 定义dao类

```java
public interface UserRepository  extends JpaRepository<User,Integer> {
    //自定义类型，FROM 后面的是类名，而不是表名
    @Query(value = "SELECT new com.nick.datajpa.domain.User1(a.id, a.name, a.email, 'normal') FROM User a WHERE a.name = ?1")
    List<User1> findUser1s(String name);
}
```

