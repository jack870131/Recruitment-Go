/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 11:30:55 GMT 2020
 */

package com.recruit.recruitment.model.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.recruit.recruitment.model.pojo.Notification;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Notification_ESTest extends Notification_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = new Integer(1);
      notification0.setUserid(integer0);
      Integer integer1 = notification0.getUserid();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = new Integer((-1732));
      notification0.setUserid(integer0);
      Integer integer1 = notification0.getUserid();
      assertEquals((-1732), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = new Integer((-1));
      notification0.setUserid(integer0);
      Integer integer1 = notification0.getUserid();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = new Integer(0);
      notification0.setNotificationid(integer0);
      Integer integer1 = notification0.getNotificationid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = new Integer(1);
      notification0.setNotificationid(integer0);
      Integer integer1 = notification0.getNotificationid();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = new Integer((-1));
      notification0.setNotificationid(integer0);
      Integer integer1 = notification0.getNotificationid();
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setContent("<n4,%7)Zn_Z6]`");
      String string0 = notification0.getContent();
      assertEquals("<n4,%7)Zn_Z6]`", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setContent((String) null);
      assertNull(notification0.getUserid());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setContent("");
      String string0 = notification0.getContent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Notification notification0 = new Notification();
      boolean boolean0 = notification0.getIfDiscussion();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = new Integer(0);
      notification0.setUserid(integer0);
      Integer integer1 = notification0.getUserid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = notification0.getNotificationid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Notification notification0 = new Notification();
      Integer integer0 = notification0.getUserid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Notification notification0 = new Notification();
      String string0 = notification0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Notification notification0 = new Notification();
      notification0.setIfDiscussion(true);
      boolean boolean0 = notification0.getIfDiscussion();
      assertTrue(boolean0);
  }
}
