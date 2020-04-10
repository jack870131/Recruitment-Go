/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 11:20:30 GMT 2020
 */

package com.recruit.recruitment.mapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.recruit.recruitment.mapper.NotificationSqlProvider;
import com.recruit.recruitment.model.pojo.Notification;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NotificationSqlProvider_ESTest extends NotificationSqlProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotificationSqlProvider notificationSqlProvider0 = new NotificationSqlProvider();
      // Undeclared exception!
      try { 
        notificationSqlProvider0.updateByPrimaryKeySelective((Notification) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.mapper.NotificationSqlProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NotificationSqlProvider notificationSqlProvider0 = new NotificationSqlProvider();
      // Undeclared exception!
      try { 
        notificationSqlProvider0.insertSelective((Notification) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.mapper.NotificationSqlProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NotificationSqlProvider notificationSqlProvider0 = new NotificationSqlProvider();
      Notification notification0 = new Notification();
      notification0.setContent("INSERT INTO notification");
      String string0 = notificationSqlProvider0.updateByPrimaryKeySelective(notification0);
      assertEquals("UPDATE notification\nSET content = #{content,jdbcType=VARCHAR}\nWHERE (notificationid = #{notificationid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NotificationSqlProvider notificationSqlProvider0 = new NotificationSqlProvider();
      Notification notification0 = new Notification();
      Integer integer0 = new Integer((-1200));
      notification0.setUserid(integer0);
      String string0 = notificationSqlProvider0.updateByPrimaryKeySelective(notification0);
      assertEquals("UPDATE notification\nSET userid = #{userid,jdbcType=INTEGER}\nWHERE (notificationid = #{notificationid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NotificationSqlProvider notificationSqlProvider0 = new NotificationSqlProvider();
      Notification notification0 = new Notification();
      notification0.setContent("INSERT INTO notification");
      String string0 = notificationSqlProvider0.insertSelective(notification0);
      assertEquals("INSERT INTO notification\n (content)\nVALUES (#{content,jdbcType=VARCHAR})", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NotificationSqlProvider notificationSqlProvider0 = new NotificationSqlProvider();
      Notification notification0 = new Notification();
      Integer integer0 = new Integer((-1200));
      notification0.setUserid(integer0);
      String string0 = notificationSqlProvider0.insertSelective(notification0);
      assertEquals("INSERT INTO notification\n (userid)\nVALUES (#{userid,jdbcType=INTEGER})", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NotificationSqlProvider notificationSqlProvider0 = new NotificationSqlProvider();
      Notification notification0 = new Notification();
      Integer integer0 = new Integer((-1200));
      notification0.setNotificationid(integer0);
      String string0 = notificationSqlProvider0.insertSelective(notification0);
      assertEquals("INSERT INTO notification\n (notificationid)\nVALUES (#{notificationid,jdbcType=INTEGER})", string0);
  }
}
