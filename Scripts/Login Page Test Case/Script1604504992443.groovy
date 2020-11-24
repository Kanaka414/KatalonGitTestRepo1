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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser("http://sefdev.jdc.ao.dcn:8181/sef/#/login")

WebUI.setText(findTestObject('Login Page/UserIDTextbox'), "test")

WebUI.click(findTestObject('Login Page/ClearButton'))

WebUI.setText(findTestObject('Login Page/UserIDTextbox'), "TESTINA")

WebUI.setText(findTestObject('Login Page/PasswordTextbox'), "testing")

WebUI.click(findTestObject('Login Page/LoginButton'))

//WebUI.verifyEqual(errormessage, "You entered invalid credentials. Please try again. If you forgot your password, please contact: CourtForms@ao.uscourts.gov")

WebUI.closeBrowser()