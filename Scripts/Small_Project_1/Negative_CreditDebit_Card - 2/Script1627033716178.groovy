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

WebUI.verifyElementText(findTestObject('Small_Project_1/Credit_Debit_Payment/popup_buy_midtrans_pillow'), 'Get cozy with our new pillow!')

WebUI.click(findTestObject('Small_Project_1/btn_buy'))

WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_amount'))

WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_name'))

WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_email'))

WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_phone_number'))

WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_city'))

WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_address'))

WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_postal_code'))

def data = findTestData('Small_Project_1/CC_Positive_Shopping_Cart')

//1 itu kita ngambil data dari baris pertama
//row login lebih kecil atau sama dengan data (excel)
for (def rowlogin = 1; rowlogin <= data.getRowNumbers(); rowlogin++) {
    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_amount'), data.getValue('midtrans_pillow', 
            rowlogin))

    WebUI.verifyElementText(findTestObject('Small_Project_1/Shopping_Cart/lbl_amount'), GlobalVariable.amount)

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_name'), data.getValue('name', rowlogin))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_email'), data.getValue('email', rowlogin))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_phone_number'), data.getValue('phone_no', 
            rowlogin))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_city'), data.getValue('city', rowlogin))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_address'), data.getValue('address', rowlogin))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_postal_code'), data.getValue('postal_code', 
            rowlogin))

    WebUI.click(findTestObject('Small_Project_1/Shopping_Cart/btn_checkout'))

    WebUI.switchToFrame(findTestObject('Small_Project_1/lbl_iframe'), 15)

    WebUI.verifyElementText(findTestObject('Small_Project_1/Order_Summary/lbl_order_summary_amount'), GlobalVariable.amount)

    WebUI.verifyElementVisible(findTestObject('Small_Project_1/Order_Summary/lbl_order_summary'))

    WebUI.click(findTestObject('Small_Project_1/Order_Summary/lbl_shipping_details'))

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Order_Summary/lbl_shipping_details_address'), 5)

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Order_Summary/lbl_shipping_details_name'), 5)

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Order_Summary/lbl_shipping_details_email'), 5)

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Order_Summary/lbl_shipping_details_phone_no'), 5)

    WebUI.click(findTestObject('Small_Project_1/Order_Summary/lbl_oder_details'))

    WebUI.verifyElementText(findTestObject('Small_Project_1/Order_Summary/lbl_order_details_amount'), GlobalVariable.amount)

    WebUI.click(findTestObject('Small_Project_1/Order_Summary/btn_continue'))

    WebUI.verifyElementText(findTestObject('Small_Project_1/Credit_Debit_Payment/lbl_select_payment_cc'), 'Select Payment')

    WebUI.click(findTestObject('Small_Project_1/Credit_Debit_Payment/btn_select_payment_cc'))

    WebUI.setText(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_card_number_cc'), '4911 1111 1111 1113')

    WebUI.setText(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_expiry_date_cc'), data.getValue('expiry_date', 
            rowlogin))

    WebUI.setText(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_cvv_cc'), data.getValue('cvv', rowlogin))

    WebUI.verifyElementClickable(findTestObject('Small_Project_1/Credit_Debit_Payment/checklisbox_promo_10persen'))

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_email_credit_debit_card'), 5)

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_phone_no_credit_debit_card'), 5)

    WebUI.click(findTestObject('Small_Project_1/Credit_Debit_Payment/btn_pay_now'))

    WebUI.switchToFrame(findTestObject('Small_Project_1/Credit_Debit_Payment/lbl_iframe_issuing_bank'), 30)

    WebUI.enableSmartWait()

    WebUI.verifyElementText(findTestObject('Small_Project_1/Credit_Debit_Payment/lbl_issuing_bank_password'), 'Password:')

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/img_issuing_bank_timer'), 15)

    WebUI.verifyElementVisible(findTestObject('Small_Project_1/Credit_Debit_Payment/lbl_issuing_bank_timer'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/issuing_bank_timer'), 5)

    WebUI.setText(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_password_cc'), data.getValue('password', rowlogin))

    WebUI.click(findTestObject('Small_Project_1/Credit_Debit_Payment/btn_ok'))
}

