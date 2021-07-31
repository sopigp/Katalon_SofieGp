import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

String username = faker.name().username()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url_OrangeHRM)

WebUI.setText(findTestObject('Manual/OrangeHRM/input_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Manual/OrangeHRM/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Manual/OrangeHRM/btn_login'))

WebUI.click(findTestObject('Manual/OrangeHRM/Panel_Admin'))

WebUI.click(findTestObject('Manual/OrangeHRM/submenu_user_management'))

WebUI.click(findTestObject('Manual/OrangeHRM/btn_add_user'))

WebUI.selectOptionByValue(findTestObject('Manual/OrangeHRM/lb_add_user_role'), '2', false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Manual/OrangeHRM/input_add_employee_name'), 'Chenzira Chuki')

WebUI.setText(findTestObject('Manual/OrangeHRM/input_add_username'), username)

WebUI.setEncryptedText(findTestObject('Manual/OrangeHRM/input_add_password'), 'J8hO3f19N9LNbX9UEGtokg==')

WebUI.setEncryptedText(findTestObject('Manual/OrangeHRM/input_add_confirmpassword'), 'J8hO3f19N9LNbX9UEGtokg==')

WebUI.click(findTestObject('Manual/OrangeHRM/btn_add_save'))

WebUI.verifyElementVisible(findTestObject('Manual/OrangeHRM/notif_add_success'))

WebUI.verifyElementVisible(findTestObject('Manual/OrangeHRM/verify_panel_username'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Manual/OrangeHRM/verify_panel_username'))

WebUI.click(findTestObject('Manual/OrangeHRM/btn_logout'))

WebUI.closeWindowUrl(GlobalVariable.url_OrangeHRM)

WebUI.closeBrowser()

