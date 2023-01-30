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

public class Order {
	@Keyword
	def accessToOrders() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/Home Page/Navbar/Module/button Modules'), 0)
		WebUI.click(findTestObject('Object Repository/Home Page/Navbar/Module/button Modules'))
		WebUI.click(findTestObject('Object Repository/Home Page/Navbar/Module/button Order'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Order Page/Dashboard/table Elements'), 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order Page/Dashboard/table Elements'))
	}
	@Keyword
	def advancedSearch() {
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Advanced_Search'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_SAP_Order'), '2322002661')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_SAP_Order'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.verifyElementVisible(findTestObject('Order Page/Advanced Search/verify_element'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Customer_Po'), 'S02718')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_EDI_Order'), 'PUR0112862')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Delivery'), '0160441944')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_SoldTo'), '51100387')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_SoldTo Name'), 'CHANEL LTD.HONG KONG')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Ship To'), '51100428')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Ship To Name'), 'CHANEL (Kuala Lumpur) SDN BHD')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Ship To Country'), 'Malaysia')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Country'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Campaign'), '98Z')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Campaign Name'), 'EXP - CAMPAGNES DISTRIBUTION LIMITE')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Order Status'), 'Pending')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_Item'), '87242')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_item2'), '87244')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.setText(findTestObject('Order Page/Advanced Search/input_item3'), '87240')
		WebUI.click(findTestObject('Order Page/Advanced Search/div_Element'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.click(findTestObject('Order Page/Advanced Search/input_Creation Date'))
		WebUI.click(findTestObject('Order Page/Advanced Search/select_Month'))
		WebUI.click(findTestObject('Order Page/Advanced Search/Element_Month'))
		WebUI.click(findTestObject('Order Page/Advanced Search/div_day'))
		WebUI.click(findTestObject('Order Page/Advanced Search/input_Creation Date (Date To)'))
		WebUI.click(findTestObject('Order Page/Advanced Search/select_Month_date_To'))
		WebUI.click(findTestObject('Order Page/Advanced Search/Element_Month'))
		WebUI.click(findTestObject('Order Page/Advanced Search/div_25'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.verifyElementVisible(findTestObject('Order Page/Advanced Search/verify_element'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
		WebUI.click(findTestObject('Order Page/Advanced Search/input_Due Date'))
		WebUI.click(findTestObject('Order Page/Advanced Search/select_Month (1)'))
		WebUI.click(findTestObject('Order Page/Advanced Search/Element_Month_Due_Date'))
		WebUI.click(findTestObject('Order Page/Advanced Search/div_day_Due_Date'))
		WebUI.click(findTestObject('Order Page/Advanced Search/input_Due Date (Date To)'))
		WebUI.click(findTestObject('Order Page/Advanced Search/select_Month_date_To2'))
		WebUI.click(findTestObject('Order Page/Advanced Search/Element_Month_Due_Date'))
		WebUI.click(findTestObject('Order Page/Advanced Search/div_15'))
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Search'))
		WebUI.verifyElementVisible(findTestObject('Order Page/Advanced Search/verify_element'))
		WebUI.scrollToElement(findTestObject('Order Page/Advanced Search/verify_element'), 0)
		WebUI.delay(4)
		WebUI.click(findTestObject('Order Page/Advanced Search/button_Clear_All_Fields'))
	}
}
