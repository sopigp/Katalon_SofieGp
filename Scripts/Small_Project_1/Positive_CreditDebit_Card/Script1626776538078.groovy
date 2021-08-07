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

def data = findTestData('Small_Project_1/CC_Positive_Shopping_Cart')

//def data = data.replaceAll(",", "")
for (def row_datafiles = 1; row_datafiles <= data.getRowNumbers(); row_datafiles++) {
    WebUI.click(findTestObject('Small_Project_1/btn_buy'))

    WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_amount'))

    WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_name'))

    WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_email'))

    WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_phone_number'))

    WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_city'))

    WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_address'))

    WebUI.clearText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_postal_code'))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_amount'), data.getValue('midtrans_pillow', 
            row_datafiles))

    harga_web = WebUI.getText(findTestObject('Small_Project_1/Shopping_Cart/lbl_amount'))

    String actual = '25,000'

    harga_web = harga_web.replace('Rp.', '')

    harga_web = harga_web.replace(' ', '')

    harga_web = harga_web.replace(',', '')

    WebUI.verifyMatch(harga_web, data.getValue('midtrans_pillow', row_datafiles), false)

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_name'), data.getValue('name', row_datafiles))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_email'), data.getValue('email', row_datafiles))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_phone_number'), data.getValue('phone_no', 
            row_datafiles))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_city'), data.getValue('city', row_datafiles))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_address'), data.getValue('address', row_datafiles))

    WebUI.setText(findTestObject('Small_Project_1/Shopping_Cart/shopping_cart_postal_code'), data.getValue('postal_code', 
            row_datafiles))

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

    WebUI.setText(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_card_number_cc'), data.getValue('card_number', 
            row_datafiles))

    WebUI.setText(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_expiry_date_cc'), data.getValue('expiry_date', 
            row_datafiles))

    WebUI.setText(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_cvv_cc'), data.getValue('cvv', row_datafiles))

    WebUI.verifyElementClickable(findTestObject('Small_Project_1/Credit_Debit_Payment/checklisbox_promo_10persen'))

    if (data.getValue('promo', row_datafiles) == 'A') {
        WebUI.check(findTestObject('Small_Project_1/Credit_Debit_Payment/checklisbox_promo_10persen'))
    } else if (data.getValue('promo', row_datafiles) == 'B') {
        WebUI.check(findTestObject('Small_Project_1/Credit_Debit_Payment/checklistbox_potongan_10rp_cc'))
    }
    
    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_email_credit_debit_card'), 5)

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_phone_no_credit_debit_card'), 5)

    WebUI.click(findTestObject('Small_Project_1/Credit_Debit_Payment/btn_pay_now'))

    WebUI.switchToFrame(findTestObject('Small_Project_1/Credit_Debit_Payment/lbl_iframe_issuing_bank'), 30)

    WebUI.enableSmartWait()

    WebUI.verifyElementText(findTestObject('Small_Project_1/Credit_Debit_Payment/lbl_issuing_bank_password'), 'Password:')

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/img_issuing_bank_timer'), 15)

    WebUI.verifyElementVisible(findTestObject('Small_Project_1/Credit_Debit_Payment/lbl_issuing_bank_timer'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/issuing_bank_timer'), 5)

    WebUI.setText(findTestObject('Small_Project_1/Credit_Debit_Payment/txt_password_cc'), data.getValue('password', row_datafiles))

    WebUI.click(findTestObject('Small_Project_1/Credit_Debit_Payment/btn_ok'))

    WebUI.enableSmartWait()

    WebUI.switchToDefaultContent()

    WebUI.verifyElementPresent(findTestObject('Small_Project_1/Credit_Debit_Payment/popup_status_transaction'), 5)

    //	membandingkan aktual & expect
    WebUI.verifyMatch(GlobalVariable.popup_success_transaction, data.getValue('expected_result', row_datafiles), false)
}

