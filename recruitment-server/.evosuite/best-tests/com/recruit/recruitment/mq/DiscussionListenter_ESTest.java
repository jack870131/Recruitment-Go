/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 09 22:29:56 GMT 2020
 */

package com.recruit.recruitment.mq;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.recruit.recruitment.model.entity.MailMessage;
import com.recruit.recruitment.mq.DiscussionListenter;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.springframework.mail.javamail.JavaMailSender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiscussionListenter_ESTest extends DiscussionListenter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiscussionListenter discussionListenter0 = new DiscussionListenter();
      MailMessage mailMessage0 = mock(MailMessage.class, new ViolatedAssumptionAnswer());
      Injector.inject(discussionListenter0, (Class<?>) DiscussionListenter.class, "mailMessage", (Object) mailMessage0);
      JavaMailSender javaMailSender0 = mock(JavaMailSender.class, new ViolatedAssumptionAnswer());
      Injector.inject(discussionListenter0, (Class<?>) DiscussionListenter.class, "mailSender", (Object) javaMailSender0);
      Injector.validateBean(discussionListenter0, (Class<?>) DiscussionListenter.class);
      // Undeclared exception!
      try { 
        discussionListenter0.executeSms((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.recruit.recruitment.mq.DiscussionListenter", e);
      }
  }
}
