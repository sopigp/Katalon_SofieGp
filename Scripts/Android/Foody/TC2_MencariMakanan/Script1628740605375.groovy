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

//Mobile.startExistingApplication('com.foody.vn.activity', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android/Foody/Mencari_Makanan/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Foody/Mencari_Makanan/android.widget.TextView - Search for cuisine, name, address'), 
    0)

Mobile.setText(findTestObject('Object Repository/Android/Foody/Mencari_Makanan/android.widget.EditText - Search for cuisine, name, address'), 
    'ice cream', 0)

Mobile.tap(findTestObject('Object Repository/Android/Foody/Mencari_Makanan/android.widget.TextView - Midoricha - Ice Cream  Drink'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/Foody/Mencari_Makanan/android.widget.TextView - OK'), 0)

def actual = Mobile.getText(findTestObject('Object Repository/Android/Foody/Mencari_Makanan/android.widget.TextView - Midoricha - Ice Cream  Drink (1)'), 
    0)

def expected = Mobile.getText(findTestObject('Object Repository/Android/Foody/Mencari_Makanan/android.widget.TextView - Midoricha - Ice Cream  Drink (1)'), 
    0)

Mobile.verifyMatch(actual, expected, false)

Mobile.verifyElementText(findTestObject('Android/Foody/Mencari_Makanan/android.widget.TextView - Midoricha - Ice Cream  Drink (2)'), 
    expected2)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/android.widget.TextView - Log Out'), 0)

Mobile.tap(findTestObject('Android/Foody/Mencari_Makanan/android.widget.Button - Log Out'), 0)

Mobile.verifyElementText(findTestObject('Android/Foody/Mencari_Makanan/android.widget.TextView - Login'), expected3)

Mobile.closeApplication()

