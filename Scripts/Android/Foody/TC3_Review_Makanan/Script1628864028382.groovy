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

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_review'), 0)

Mobile.setText(findTestObject('Android/Foody/Review_Makanan/txt_title'), 'review aku', 0)

Mobile.setText(findTestObject('Android/Foody/Review_Makanan/txt_describe'), 'waw enak beud', 0)

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_post'), 0)

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_rate'), 0)

Mobile.setSliderValue(findTestObject('Android/Foody/Review_Makanan/sb_location'), 80, 0)

Mobile.setSliderValue(findTestObject('Android/Foody/Review_Makanan/sb_price'), 80, 0)

Mobile.setSliderValue(findTestObject('Android/Foody/Review_Makanan/sb_quality'), 80, 0)

Mobile.setSliderValue(findTestObject('Android/Foody/Review_Makanan/sb_service'), 80, 0)

Mobile.setSliderValue(findTestObject('Android/Foody/Review_Makanan/sb_decoration'), 80, 0)

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_done'), 0)

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_post'), 0)

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_close'), 0)

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_back_review'), 0)

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_back_review'), 0)

Mobile.tap(findTestObject('Android/Foody/Review_Makanan/btn_back_search'), 0)

