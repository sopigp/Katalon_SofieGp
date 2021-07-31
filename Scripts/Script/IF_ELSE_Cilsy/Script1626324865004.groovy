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

def inputEmail = 'qaengineer@mailinator.com'

def inputPassword = 'tester123'

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.cilsy.id/')

WebUI.click(findTestObject('Manual/Cilsy/navbar_masuk'))

WebUI.setText(findTestObject('Manual/Cilsy/input_email'), email)

WebUI.setText(findTestObject('Manual/Cilsy/input_password'), password)

WebUI.click(findTestObject('Manual/Cilsy/btn_masuk'))



if ((inputEmail == email) && (inputPassword == password)) {
    //Berhasil masuk ke homepage
    WebUI.click(findTestObject('Manual/Cilsy/Icon_usersetting'))

    //Periksa apakah muncul username
    WebUI.verifyElementText(findTestObject('Manual/Cilsy/navbar_user_profile'), 'QA Engineer')

    WebUI.verifyElementPresent(findTestObject('Manual/Cilsy/navbar_dashboard'), 0)
	
} else if ((inputEmail != email) && (inputPassword != password)) {
    WebUI.verifyElementText(findTestObject('Manual/Cilsy/alert_danger_login'), 'These credentials do not match our records.')
	
} else {
    WebUI.verifyElementText(findTestObject('Manual/Cilsy/alert_danger_login'), 'These credentials do not match our records.')
}

WebUI.closeBrowser()

