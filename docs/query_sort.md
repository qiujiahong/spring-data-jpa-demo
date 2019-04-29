# 排序

排序可以使用PageRequest或者是Sort实现。


* PageRequest
```java
Page<User> users = userRepository.findAll(PageRequest.of(1, 20, Sort.by("name")));
```

* Sort 

```java
public interface UserRepository extends JpaRepository<User, Long> {

  @Query("select u from User u where u.lastname like ?1%")
  List<User> findByAndSort(String lastname, Sort sort);

  @Query("select u.id, LENGTH(u.firstname) as fn_len from User u where u.lastname like ?1%")
  List<Object[]> findByAsArrayAndSort(String lastname, Sort sort);
}

repo.findByAndSort("lannister", new Sort("firstname"));       //Valid Sort expression pointing to property in domain model.
        
repo.findByAndSort("stark", new Sort("LENGTH(firstname)"));      //Invalid Sort containing function call. Thows Exception.
     
repo.findByAndSort("targaryen", JpaSort.unsafe("LENGTH(firstname)")); //Valid Sort containing explicitly unsafe Order.

repo.findByAsArrayAndSort("bolton", new Sort("fn_len"));    //Valid Sort expression pointing to aliased function.
 
```