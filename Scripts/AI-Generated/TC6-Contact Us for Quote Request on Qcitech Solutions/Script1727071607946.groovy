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

"Step 2: Click on link contactUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_contactUs'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link contactUs.png')

"Step 3: Fill out and submit the testing request form with details."

submitTestingRequestForm.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on span close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qcitech-solutions/get-a-quote?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/span_close'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on span close - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Contact Us for Quote Request on Qcitech Solutions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}