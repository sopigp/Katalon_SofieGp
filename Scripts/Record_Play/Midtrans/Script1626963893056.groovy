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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/a_BUY NOW'))

WebUI.click(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/div_CHECKOUT'))

WebUI.click(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/a_Continue'))

WebUI.click(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/a_CreditDebit CardPay with Visa, MasterCard_b6120b'))

WebUI.setText(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/input_sample-store-1626963912_cardnumber'), 
    '4811 1111 1111 1114')

WebUI.setText(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/input'), '01 / 25')

WebUI.setText(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/input_1'), '123')

WebUI.click(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/a_Pay Now'))

WebUI.setText(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/input_Password_PaRes'), '112233')

WebUI.click(findTestObject('Object Repository/Record_Play/Midtrans/Page_Sample Store/button_OK'))

WebUI.click(findTestObject('Record_Play/Midtrans/Page_Sample Store/lbl_transaction successful'))

WebUI.click(findTestObject('Record_Play/Midtrans/Page_Sample Store/trx_success_timer'))

