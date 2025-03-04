/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 09 22:29:04 GMT 2020
 */

package com.recruit.recruitment.config;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class WebSecurityConfig_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.recruit.recruitment.config.WebSecurityConfig"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(WebSecurityConfig_ESTest_scaffolding.class.getClassLoader() ,
      "org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter$DefaultPasswordEncoderAuthenticationManagerBuilder",
      "org.springframework.security.authentication.AuthenticationManager",
      "org.springframework.security.config.annotation.web.configurers.DefaultLoginPageConfigurer",
      "org.springframework.security.core.userdetails.UserDetailsService",
      "org.springframework.security.config.annotation.SecurityConfigurerAdapter",
      "org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter$3",
      "org.springframework.security.config.annotation.ObjectPostProcessor",
      "org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer",
      "org.springframework.security.config.annotation.web.WebSecurityConfigurer",
      "org.springframework.security.config.annotation.SecurityBuilder",
      "org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter",
      "org.springframework.security.config.annotation.AbstractConfiguredSecurityBuilder",
      "org.springframework.web.accept.ContentNegotiationStrategy",
      "org.springframework.security.authentication.AuthenticationTrustResolver",
      "org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder",
      "org.springframework.security.crypto.password.PasswordEncoder",
      "org.springframework.security.config.annotation.SecurityConfigurer",
      "com.recruit.recruitment.config.WebSecurityConfig",
      "org.springframework.security.config.annotation.AbstractSecurityBuilder",
      "org.springframework.security.authentication.AuthenticationEventPublisher",
      "org.springframework.security.config.annotation.authentication.ProviderManagerBuilder"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(WebSecurityConfig_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter",
      "com.recruit.recruitment.config.WebSecurityConfig",
      "org.springframework.context.annotation.AdviceMode",
      "org.springframework.beans.factory.annotation.Autowire",
      "org.springframework.security.config.http.SessionCreationPolicy",
      "org.springframework.http.HttpMethod"
    );
  }
}
