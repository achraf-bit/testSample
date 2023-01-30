package auth

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	@Keyword
	def loginSuperAdmin() {
		login(GlobalVariable.SuperAdminEmail, GlobalVariable.SuperAdminPassword)
	}

	def login(String username, String password) {
		WebUI.openBrowser(GlobalVariable.UrlTMS)
		WebUI.setText(findTestObject('Object Repository/Login Page/input_Email'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Login Page/input_Password'), password)
		WebUI.click(findTestObject('Object Repository/Login Page/button_Log in'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Home Page/logo/logo MyTower'), 20)
	}

	@Keyword
	def loginFromHomePage() {
		WebUI.waitForElementVisible(findTestObject('Order Page/Advanced Search/input_Select_User'),0)
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Select_User'), 'Mey')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_User'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Sign_In'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Home Page/logo/logo MyTower'), 20)
	}
}
