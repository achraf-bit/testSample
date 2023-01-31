package modules

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

public class Delivery {
	@Keyword
	def accessToDelivery() {
		def buttonModules = findTestObject('Object Repository/Home Page/Navbar/Module/button Modules')
		println(buttonModules)
		if(buttonModules == null ) {
			throw new RuntimeException("button modules not found")
		}
		WebUI.click(buttonModules)
		WebUI.click(findTestObject('Object Repository/Home Page/Navbar/Module/button Delivery'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Delivery Page/Dashboard/table Elements'), 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Delivery Page/Dashboard/table Elements'))
	}
}
