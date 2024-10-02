import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.submitTestingRequestForm
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

"Step 1: Navigate to qcitech-solutions/home"

TrueTestScripts.navigate("qcitech-solutions/home")

"Step 2: Click on link cloudDesktopSolutions -> Navigate to page 'qcitech-solutions/cloud-desktop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_cloudDesktopSolutions'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on link cloudDesktopSolutions - Navigate to page qcitech-solutionscloud-desktop.png')

"Step 3: Click on link back -> Navigate to page 'qcitech-solutions/home'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/cloud-desktop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_cloud_desktop/link_back'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on link back - Navigate to page qcitech-solutionshome.png')

"Step 4: Click on div containerBg"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/div_containerBg'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on div containerBg.png')

"Step 5: Click on link qcitechSolutionsTeam4 -> Navigate to page 'qcitech-solutions/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_qcitechSolutionsTeam4'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on link qcitechSolutionsTeam4 - Navigate to page qcitech-solutions.png')

"Step 6: Click on link getAquote"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_getAquote'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link getAquote.png')

"Step 7: Fill out and submit the testing request form with details."

submitTestingRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on span close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on span close.png')

"Step 9: Click on link videos -> Navigate to page 'qcitech-solutions/videos'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/link_videos'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on link videos - Navigate to page qcitech-solutionsvideos.png')

"Step 10: Click on link contactUs -> Navigate to page 'qcitech-solutions/get-a-quote'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/videos?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_videos/link_contactUs'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Click on link contactUs - Navigate to page qcitech-solutionsget-a-quote.png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Explore Cloud Desktop Solutions and Request a Quote_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}