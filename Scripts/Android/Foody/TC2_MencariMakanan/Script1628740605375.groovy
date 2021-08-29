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

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/btn_home'), 30)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/field_search'), 10)

Mobile.setText(findTestObject('Android/Foody/Mencari_Makanan/field_search_edit'), 'ice cream', 0)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/lbl_food_product'), 30)

def actual = Mobile.getText(findTestObject('Android/Foody/Mencari_Makanan/lbl_detil_food_product'), 0)

def expected = Mobile.getText(findTestObject('Android/Foody/Mencari_Makanan/lbl_detil_food_product'), 0)

Mobile.verifyMatch(actual, expected, false)

Mobile.verifyElementText(findTestObject('Android/Foody/Mencari_Makanan/lbl_food_product_below'), expected2)

