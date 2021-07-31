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

WebUI.navigateToUrl('https://www.cilsy.id/')

WebUI.click(findTestObject('Record_Play/Cilsy/Page_Kursus Online Server dan Jaringan  Cilsy.id/a_Daftar'))

WebUI.setText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Username_username'), 'tatisulastri')

WebUI.setText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Email_email'), 'tatisulastri@gmail.com')

WebUI.setEncryptedText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setEncryptedText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Konfirmasi Password_password_confirmation'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Nama Lengkap_full_name'), 
    'tati sulastri yahud')

WebUI.selectOptionByValue(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/select_1  2  3  4  5  6  7  8  9  10  11  1_9fd5f0'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/select_Januari  Februari  Maret  April  Mei_32c737'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/select_2021  2020  2019  2018  2017  2016  _4b2de2'), 
    '1990', true)

WebUI.setText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Kota Anda Tinggal_lokasi'), 
    'Jakarta Selatan')

WebUI.setText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Profesi Saat Ini_role'), 'Business Analyst')

WebUI.setText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Perusahaan atau Instansi_instansi'), 
    'Bank XXXX')

WebUI.setText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Nomor Whatsapp_no_telepon'), 
    '081977654444')

WebUI.setText(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/input_Minat Belajar_minat_belajar'), 
    'belajar yukkk')

WebUI.click(findTestObject('Record_Play/Cilsy/Page_Daftar  Cilsy.id/button_DAFTAR'))

WebUI.click(findTestObject('Record_Play/Cilsy/Page_Masuk  Cilsy.id/div_Well done Akun anda sudah terdaftar. Si_00324a'))

