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

//Open SEF application in the browser
WebUI.openBrowser("https://sefdev.jdc.ao.dcn:8444/sef/#/login")

//User ID text box
WebUI.setText(findTestObject('Login Page/UserIDTextbox'), "TESTA")

//Password text box
WebUI.setText(findTestObject('Login Page/PasswordTextbox'), "testing")

//Login button click
WebUI.click(findTestObject('Login Page/LoginButton'))

//Home page SEF title verification
WebUI.verifyElementText(findTestObject('Object Repository/Home Page/SEF Title'), 'Statistics Electronic Forms (SEF)')

//Help link click
WebUI.click(findTestObject('Object Repository/Home Page/Help Link'))


//WebUI.Click(findTestObject('Object Repository/Home Page/Refresh Link'))

//Print Blank Worksheet for forms verification
WebUI.click(findTestObject('Object Repository/Home Page/Blank Worksheet/JS-11'))

WebUI.click(findTestObject('Object Repository/Home Page/Blank Worksheet/JS-11G'))

WebUI.click(findTestObject('Object Repository/Home Page/Blank Worksheet/JS-30'))

WebUI.click(findTestObject('Object Repository/Home Page/Blank Worksheet/JS-31'))

WebUI.click(findTestObject('Object Repository/Home Page/Blank Worksheet/JS-46'))

WebUI.click(findTestObject('Object Repository/Home Page/Blank Worksheet/B-102'))

//Reporting Forms- Court of Appeals
//WebUI.click(findTestObject('Home Page/Court of Appeals/Appeals Monthly Summary (JS-30)'))

//WebUI.click(findTestObject('Home Page/Court of Appeals/Writs of Certiorari (JS-31)'))

//WebUI.click(findTestObject('Home Page/Court of Appeals/Report on Complaint Under Title 28 USC Section 351-364 (JS-60)'))

//Reporting Forms- District Courts

//WebUI.click(findTestObject('Home Page/District Courts/District Courts- Petit Jury (JS-11)'))

//WebUI.click(findTestObject('Home Page/District Courts/District Courts- Grand Jury (JS-11G)'))

//WebUI.click(findTestObject('Home Page/District Courts/District Courts- Three-Judge Court (JS-46)'))

//WebUI.click(findTestObject('Home Page/Bankruptcy/Bankruptcy Court Trials (B-102)'))

//Footer link verification
WebUI.click(findTestObject('Object Repository/Home Page/Footer Link'))

//Logout link
WebUI.click(findTestObject('Object Repository/Home Page/Logout Link'))

//Close the browser
WebUI.closeBrowser()
