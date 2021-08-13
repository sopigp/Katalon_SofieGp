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

Mobile.startExistingApplication('com.foody.vn.activity', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android/Foody/android.widget.ImageView'), 30)

Mobile.tap(findTestObject('Object Repository/Android/Foody/android.widget.TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Foody/android.widget.TextView - Connect with Facebook'), 0)

Mobile.setText(findTestObject('Object Repository/Android/Foody/android.widget.EditText'), 'peterpan_sofie_vhiterband@yahoo.com', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Android/Foody/android.widget.EditText (1)'), '7ZTatM+q3vAyZQd2ps7zRg==', 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Foody/android.widget.Button - Masuk'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Android/Foody/android.widget.Button - Lanjutkan'), 0, 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/Foody/android.widget.TextView - Sofie Pratiwi'), 0)

//Mobile.verifyElementText(findTestObject('Android/Foody/android.widget.TextView - Sofie Pratiwi'), 'Sofie Pratiwi')

def actual = Mobile.getText(findTestObject('Object Repository/Android/Foody/android.widget.TextView - Sofie Pratiwi'),
	0)

def expected = Mobile.getText(findTestObject('Object Repository/Android/Foody/android.widget.TextView - Sofie Pratiwi'),
	0)

Mobile.verifyMatch(actual, expected, false)

Mobile.tap(findTestObject('Object Repository/Android/Foody/android.widget.ImageView (1)'), 0)

