import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
import katalon.common.submitAlternativeTestingRequestForm
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to qcitech-solutions/videos"

TrueTestScripts.navigate("qcitech-solutions/videos")

"Step 2: Click on link aboutUs -> Navigate to page '/qcitech-solutions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/videos?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_videos/link_aboutUs'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on link aboutUs - Navigate to page qcitech-solutions.png')

"Step 3: Click on span phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/span_phone'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on span phone.png')

"Step 4: Click on span phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/span_phone'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on span phone.png')

"Step 5: Click on span chat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/span_chat'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on span chat.png')

"Step 6: Click on span mail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/span_mail'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on span mail.png')

"Step 7: Click on link ourServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_ourServices'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on link ourServices - Navigate to page qcitech-solutionshome.png')

"Step 8: Click on link learnMore -> Navigate to page 'qcitech-solutions/cloud-solutions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on link learnMore - Navigate to page qcitech-solutionscloud-solutions.png')

"Step 9: Click on link back -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/cloud-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_cloud_solutions/link_back'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on link back - Navigate to page qcitech-solutionshome.png')

"Step 10: Click on link qcitechSolutionsTeam4 -> Navigate to page 'qcitech-solutions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_qcitechSolutionsTeam4'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on link qcitechSolutionsTeam4 - Navigate to page qcitech-solutions.png')

"Step 11: Click on link getAquote"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_getAquote'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on link getAquote.png')

"Step 12: Click on link buyService"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_buyService'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on link buyService.png')

"Step 13: Complete and submit an alternative testing request form."

submitAlternativeTestingRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on span close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on span close.png')

"Step 15: Click on link ourServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_ourServices'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on link ourServices - Navigate to page qcitech-solutionshome.png')

"Step 16: Click on link onboardUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_onboardUs'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on link onboardUs.png')

"Step 17: Complete and submit an alternative testing request form."

submitAlternativeTestingRequestForm.execute(data_path_1, Integer.valueOf(index_1))

"Step 18: Click on div close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on div close.png')

"Step 19: Click on link ourServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_ourServices'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on link ourServices - Navigate to page qcitech-solutionshome.png')

"Step 20: Click on button prevButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_prevButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on button prevButton.png')

"Step 21: Click on button nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21-Click on button nextButton.png')

"Step 22: Click on button nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22-Click on button nextButton.png')

"Step 23: Click on button nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23-Click on button nextButton.png')

"Step 24: Click on link onboardUs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_onboardUs2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24-Click on link onboardUs2.png')

"Step 25: Complete and submit an alternative testing request form."

submitAlternativeTestingRequestForm.execute(data_path_2, Integer.valueOf(index_2))

"Step 26: Click on span close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26-Click on span close - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Multiple Quote Requests Process on Qcitech Solutions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}