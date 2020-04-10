/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 11:18:31 GMT 2020
 */

package com.recruit.recruitment.model.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.recruit.recruitment.model.pojo.Post;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Post_ESTest extends Post_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Post post0 = new Post();
      post0.setSalarytype(".uo18y?d,^r?lWD|3");
      String string0 = post0.getSalarytype();
      assertEquals(".uo18y?d,^r?lWD|3", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Post post0 = new Post();
      post0.setSalarytype("");
      String string0 = post0.getSalarytype();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer((-1251));
      post0.setSalary(integer0);
      Integer integer1 = post0.getSalary();
      assertEquals((-1251), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(0);
      post0.setSalary(integer0);
      Integer integer1 = post0.getSalary();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(4);
      post0.setSalary(integer0);
      Integer integer1 = post0.getSalary();
      assertEquals(4, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(2952);
      post0.setSalary(integer0);
      Integer integer1 = post0.getSalary();
      assertEquals(2952, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(0);
      post0.setPostid(integer0);
      Integer integer1 = post0.getPostid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(35);
      post0.setPostid(integer0);
      Integer integer1 = post0.getPostid();
      assertEquals(35, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer((-3704));
      post0.setPostid(integer0);
      Integer integer1 = post0.getPostid();
      assertEquals((-3704), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(0);
      post0.setPicknum(integer0);
      Integer integer1 = post0.getPicknum();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer((-1251));
      post0.setPicknum(integer0);
      Integer integer1 = post0.getPicknum();
      assertEquals((-1251), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(497);
      post0.setPicknum(integer0);
      Integer integer1 = post0.getPicknum();
      assertEquals(497, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Post post0 = new Post();
      post0.setLocation("");
      String string0 = post0.getLocation();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Post post0 = new Post();
      post0.setJobname("5*X1]OPoRe,w!W4<f");
      String string0 = post0.getJobname();
      assertEquals("5*X1]OPoRe,w!W4<f", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Post post0 = new Post();
      post0.setJobname("");
      String string0 = post0.getJobname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Post post0 = new Post();
      post0.setDue("t#LEmJ,3km,fm");
      String string0 = post0.getDue();
      assertEquals("t#LEmJ,3km,fm", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Post post0 = new Post();
      post0.setDue("");
      String string0 = post0.getDue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Post post0 = new Post();
      post0.setDescription("Invalid vlong (");
      String string0 = post0.getDescription();
      assertEquals("Invalid vlong (", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Post post0 = new Post();
      post0.setDescription("");
      String string0 = post0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Post post0 = new Post();
      post0.setCriteria("] returned null which is not allowed and probably means it screwed up the stream.");
      String string0 = post0.getCriteria();
      assertEquals("] returned null which is not allowed and probably means it screwed up the stream.", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Post post0 = new Post();
      post0.setCriteria("");
      String string0 = post0.getCriteria();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Post post0 = new Post();
      post0.setCompanyname("$oUUm[Vc2b");
      String string0 = post0.getCompanyname();
      assertEquals("$oUUm[Vc2b", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Post post0 = new Post();
      post0.setCompanyname("");
      String string0 = post0.getCompanyname();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Post post0 = new Post();
      post0.setCategory("lSV.H_:5%");
      String string0 = post0.getCategory();
      assertEquals("lSV.H_:5%", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Post post0 = new Post();
      post0.setCategory("");
      String string0 = post0.getCategory();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(702);
      post0.setAuthorid(integer0);
      Integer integer1 = post0.getAuthorid();
      assertEquals(702, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer(0);
      post0.setAuthorid(integer0);
      Integer integer1 = post0.getAuthorid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = new Integer((-1175));
      post0.setAuthorid(integer0);
      Integer integer1 = post0.getAuthorid();
      assertEquals((-1175), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Post post0 = new Post();
      post0.setCriteria((String) null);
      assertNull(post0.getDue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Post post0 = new Post();
      post0.setDescription((String) null);
      assertNull(post0.getCriteria());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Post post0 = new Post();
      post0.setSalarytype((String) null);
      assertNull(post0.getDescription());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Post post0 = new Post();
      post0.setCategory((String) null);
      assertNull(post0.getAuthorid());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Post post0 = new Post();
      post0.setLocation((String) null);
      assertNull(post0.getCategory());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Post post0 = new Post();
      post0.setLocation("Post{postid=null, authorid=null, companyname='null', jobname='null', location='null', category='null', salary=null, salarytype='null', description='null', criteria='null', due=null, picknum=null}");
      String string0 = post0.getLocation();
      assertEquals("Post{postid=null, authorid=null, companyname='null', jobname='null', location='null', category='null', salary=null, salarytype='null', description='null', criteria='null', due=null, picknum=null}", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Post post0 = new Post();
      post0.setJobname((String) null);
      assertNull(post0.getDescription());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Post post0 = new Post();
      post0.setCompanyname((String) null);
      assertNull(post0.getSalarytype());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.getCriteria();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.getSalarytype();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.getJobname();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = post0.getSalary();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = post0.getPostid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.getDue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.getLocation();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = post0.getAuthorid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.toString();
      assertEquals("Post{postid=null, authorid=null, companyname='null', jobname='null', location='null', category='null', salary=null, salarytype='null', description='null', criteria='null', due=null, picknum=null}", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.getCategory();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Post post0 = new Post();
      Integer integer0 = post0.getPicknum();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Post post0 = new Post();
      String string0 = post0.getCompanyname();
      assertNull(string0);
  }
}
