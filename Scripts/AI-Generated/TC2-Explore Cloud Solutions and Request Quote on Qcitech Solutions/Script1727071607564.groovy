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

"Step 1: Navigate to /qcitech-solutions"

TrueTestScripts.navigate("/qcitech-solutions")

"Step 2: Click on link ourServices -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_ourServices'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link ourServices - Navigate to page qcitech-solutionshome.png')

"Step 3: Click on link learnMore -> Navigate to page 'qcitech-solutions/cloud-solutions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_learnMore'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link learnMore - Navigate to page qcitech-solutionscloud-solutions.png')

"Step 4: Click on link back -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/cloud-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_cloud_solutions/link_back'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link back - Navigate to page qcitech-solutionshome.png')

"Step 5: Click on link onboardUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_onboardUs'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link onboardUs.png')

"Step 6: Fill out and submit the testing request form with details."

submitTestingRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on span close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on span close - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Explore Cloud Solutions and Request Quote on Qcitech Solutions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}