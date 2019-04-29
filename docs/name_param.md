# 名字参数

默认情况下jpa使用基于位置编号的参数绑定方式，同时也可以使用名称参数来绑定；  

```java
public interface UserRepository extends JpaRepository<User, Long> {

  @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
  User findByLastnameOrFirstname(@Param("lastname") String lastname,
                                 @Param("firstname") String firstname);
}
```