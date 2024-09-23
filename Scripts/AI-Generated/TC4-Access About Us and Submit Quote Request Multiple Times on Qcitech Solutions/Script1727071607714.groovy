import katalon.common.submitTestingRequestForm
import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration
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

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link aboutUs - Navigate to page qcitech-solutions.png')

"Step 3: Click on link ourServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_ourServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link ourServices - Navigate to page qcitech-solutionshome.png')

"Step 4: Click on link learnMore -> Navigate to page 'qcitech-solutions/cloud-solutions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link learnMore - Navigate to page qcitech-solutionscloud-solutions.png')

"Step 5: Click on link back -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/cloud-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_cloud_solutions/link_back'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link back - Navigate to page qcitech-solutionshome.png')

"Step 6: Click on link contactUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_contactUs'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on link contactUs.png')

"Step 7: Fill out and submit the testing request form with details."

submitTestingRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on link aboutUs -> Navigate to page '/qcitech-solutions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_aboutUs'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link aboutUs - Navigate to page qcitech-solutions.png')

"Step 9: Click on link ourServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_ourServices'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on link ourServices - Navigate to page qcitech-solutionshome.png')

"Step 10: Click on link videos -> Navigate to page 'qcitech-solutions/videos'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_videos'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on link videos - Navigate to page qcitech-solutionsvideos.png')

"Step 11: Click on link contactUs -> Navigate to page 'qcitech-solutions/get-a-quote'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/videos?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_videos/link_contactUs'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on link contactUs - Navigate to page qcitech-solutionsget-a-quote.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Access About Us and Submit Quote Request Multiple Times on Qcitech Solutions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}