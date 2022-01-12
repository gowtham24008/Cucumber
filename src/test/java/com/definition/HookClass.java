package com.definition;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HookClass extends BaseClass{
 @Before
 public void beforeExecution() {
	launchBrowser();
	maximizeWindow();
}
 @After
 public void afterExecution() {
	quitbrowser();

}
}
