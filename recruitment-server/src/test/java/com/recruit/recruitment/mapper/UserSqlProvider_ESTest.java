/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 11:16:07 GMT 2020
 */

package com.recruit.recruitment.mapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.recruit.recruitment.mapper.UserSqlProvider;
import com.recruit.recruitment.model.pojo.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class UserSqlProvider_ESTest extends UserSqlProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      // Undeclared exception!
      try { 
        userSqlProvider0.updateByPrimaryKeySelective((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.mapper.UserSqlProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      // Undeclared exception!
      try { 
        userSqlProvider0.insertSelective((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.mapper.UserSqlProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      User user0 = new User();
      user0.setUsername("INSERT INTO user");
      String string0 = userSqlProvider0.updateByPrimaryKeySelective(user0);
      assertEquals("UPDATE user\nSET username = #{username,jdbcType=VARCHAR}\nWHERE (userid = #{userid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      User user0 = new User();
      user0.setPassword("UPDATE user\nWHERE (userid = #{userid,jdbcType=INTEGER})");
      String string0 = userSqlProvider0.updateByPrimaryKeySelective(user0);
      assertEquals("UPDATE user\nSET password = #{password,jdbcType=VARCHAR}\nWHERE (userid = #{userid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      User user0 = new User();
      user0.setMail("INSERT INTO user");
      String string0 = userSqlProvider0.updateByPrimaryKeySelective(user0);
      assertEquals("UPDATE user\nSET mail = #{mail,jdbcType=VARCHAR}\nWHERE (userid = #{userid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      User user0 = new User();
      user0.setUsername("INSERT INTO user");
      String string0 = userSqlProvider0.insertSelective(user0);
      assertEquals("INSERT INTO user\n (username)\nVALUES (#{username,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      User user0 = new User();
      user0.setPassword("UPDATE user\nWHERE (userid = #{userid,jdbcType=INTEGER})");
      String string0 = userSqlProvider0.insertSelective(user0);
      assertEquals("INSERT INTO user\n (password)\nVALUES (#{password,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      User user0 = new User();
      user0.setMail("INSERT INTO user");
      String string0 = userSqlProvider0.insertSelective(user0);
      assertEquals("INSERT INTO user\n (mail)\nVALUES (#{mail,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      UserSqlProvider userSqlProvider0 = new UserSqlProvider();
      User user0 = new User();
      Integer integer0 = new Integer(105);
      user0.setUserid(integer0);
      String string0 = userSqlProvider0.insertSelective(user0);
      assertEquals("INSERT INTO user\n (userid)\nVALUES (#{userid,jdbcType=INTEGER})", string0);
  }
}
