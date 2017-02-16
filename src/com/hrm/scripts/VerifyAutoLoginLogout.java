package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;

public class VerifyAutoLoginLogout extends BaseTest
{
	@Test
	public void login(){
		log.info("This script will automatically login and logout");
	}
}