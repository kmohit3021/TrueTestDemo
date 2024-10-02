import katalon.common.requestQuoteForTestingServices
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /qcitech-solutions"

TrueTestScripts.navigate("/qcitech-solutions")

"Step 2: Fill out the quote request form for testing services"

requestQuoteForTestingServices.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on span close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on span close.png')

"Step 4: Fill out the quote request form for testing services"

requestQuoteForTestingServices.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Click on p thankYouForChoosing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/p_thankYouForChoosing'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on p thankYouForChoosing.png')

"Step 6: Click on div close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_close'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on div close.png')

"Step 7: Click on link videos -> Navigate to page 'qcitech-solutions/videos'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_videos'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on link videos - Navigate to page qcitech-solutionsvideos.png')

"Step 8: Click on link ourServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/videos?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_videos/link_ourServices'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on link ourServices - Navigate to page qcitech-solutionshome.png')

"Step 9: Click on link onboardUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_onboardUs'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on link onboardUs.png')

"Step 10: Click on button nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on button nextButton.png')

"Step 11: Click on button nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on button nextButton.png')

"Step 12: Click on button prevButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_prevButton'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on button prevButton.png')

"Step 13: Click on button prevButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/button_prevButton'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on button prevButton - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Submit Quote Request and Navigate Services in Qcitech Solutions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}