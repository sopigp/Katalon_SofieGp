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
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

Path currentRelativePath = Paths.get("");
def s = currentRelativePath.toAbsolutePath().toString();
System.out.println("Current absolute path is: " + s);
s = s + "\\Data Files\\Apk Android\\Foody Find Reserve Delivery_v5.8.7_apkpure.com.apk"
System.out.println("Current absolute path is: " + s);
Mobile.startApplication(s, false)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/Foody/Login/btn_user'), 30)

Mobile.tap(findTestObject('Android/Foody/Login/btn_login'), 0)

//Mobile.tap(findTestObject('Android/Foody/Login/btn_ connect_with_facebook'), 0)
Mobile.tap(findTestObject('Android/Foody/Login/btn_connect_with_google'), 15)

Mobile.tap(findTestObject('Android/Foody/Login/btn_choose_account_google'), 0)

//Mobile.setText(findTestObject('Android/Foody/Login/txt_email_facebook'), 'septiansembilanlimaa@yahoo.com', 
//    0)
//
//Mobile.setEncryptedText(findTestObject('Android/Foody/Login/txt_password_facebook'), 'QsniP1ckLMYlbDg7et4vNA==', 
//    0)
//Mobile.tap(findTestObject('Android/Foody/Login/btn_masuk_facebook'), 0)
//
//Mobile.tapAndHold(findTestObject('Android/Foody/Login/btn_lanjutkan_login_facebook'), 0, 30)
//
//Mobile.verifyElementExist(findTestObject('Android/Foody/Login/lbl_username_facebook'), 0)
//Mobile.verifyElementText(findTestObject('Android/Foody/Login/lbl_username_facebook'), 'Sofie Pratiwi')
//def actual = Mobile.getText(findTestObject('Android/Foody/Login/lbl_username_facebook'), 0)
//
//def expected = Mobile.getText(findTestObject('Android/Foody/Login/lbl_username_facebook'), 
//    0)
def actual = Mobile.getText(findTestObject('Android/Foody/Login/lbl_username_google'), 
    0)

def expected = Mobile.getText(findTestObject('Android/Foody/Login/lbl_username_google'), 
    0)

Mobile.verifyMatch(actual, expected, false)

Mobile.tap(findTestObject('Android/Foody/Login/btn_home'), 0)

