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

Mobile.tap(findTestObject('Android/Calculator/btn_8'), 0)

Mobile.tap(findTestObject('Android/Calculator/opr_pengurangan'), 0)

Mobile.tap(findTestObject('Android/Calculator/btn_2'), 0)

Mobile.tap(findTestObject('Android/Calculator/equal'), 0)

String value = Mobile.getText(findTestObject('Android/Calculator/txt_view'), 0)

if (value == '6') {
    Mobile.verifyElementVisible(findTestObject('Android/Calculator/txt_view'), 0)
} else if (value != '6') {
    System.out.println('Output tidak sesuai')
} else {
    Mobile.tap(findTestObject('Android/Calculator/btn_clear'), 0)
}

Mobile.tap(findTestObject('Android/Calculator/btn_clear'), 0)

