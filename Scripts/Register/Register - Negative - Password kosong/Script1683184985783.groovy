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

WebUI.navigateToUrl('http://kasirdemo.belajarqa.com')

WebUI.click(findTestObject('Object Repository/Register/Negative/Password_kosong/a_register'))

WebUI.setText(findTestObject('Object Repository/Register/Negative/Password_kosong/input_nama toko_name'), 'Satu angka')

WebUI.setText(findTestObject('Object Repository/Register/Negative/Password_kosong/input_email_email'), 'satuangka@gmail.com')

WebUI.click(findTestObject('Object Repository/Register/Negative/Password_kosong/button_daftar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Register/Negative/Password_kosong/div_password is not allowed to be empty'))

