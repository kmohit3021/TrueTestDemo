package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class requestQuoteForTestingServices {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link qcitechSolutionsTeam4 -> Navigate to page 'qcitech-solutions/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_home/link_qcitechSolutionsTeam4'))
        
        "Step 2: Click on link getAquote -> Navigate to page 'qcitech-solutions/get-a-quote'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions/link_getAquote'))
        
        "Step 3: Click on input fullName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_fullName2'))
        
        "Step 4: Enter input value in input fullName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_fullName2'), data['input_fullName'])
        
        "Step 5: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_email2'))
        
        "Step 6: Enter input value in input email"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_email2'), data['input_email'])
        
        "Step 7: Click on input companyName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_companyName2'))
        
        "Step 8: Enter input value in input companyName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_companyName2'), data['input_companyName'])
        
        "Step 9: Click on input phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_phone2'))
        
        "Step 10: Click on input position"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_position2'))
        
        "Step 11: Enter input value in input position"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_position2'), data['input_position'])
        
        "Step 12: Click on input projectTimeline"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_projectTimeline2'))
        
        "Step 13: Enter input value in input projectTimeline"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_projectTimeline2'), data['input_projectTimeline'])
        
        "Step 14: Click on select testingType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/select_testingType2'))
        
        "Step 15: Click on div mobile"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_mobile'))
        
        "Step 16: Click on select testingTool"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/select_testingTool2'))
        
        "Step 17: Click on div uft"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_uft'))
        
        "Step 18: Click on input budget"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_budget2'))
        
        "Step 19: Enter input value in input budget"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_budget2'), data['input_budget'])
        
        "Step 20: Click on textarea describeYourTestScenarios"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/textarea_describeYourTestScenarios2'))
        
        "Step 21: Enter input value in textarea describeYourTestScenarios"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/textarea_describeYourTestScenarios2'), data['textarea_describeYourTestScenarios'])
        
        "Step 22: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/button_submit2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_budget'] = testData.getValue('input_budget', rowIndex)
        data['input_companyName'] = testData.getValue('input_companyName', rowIndex)
        data['input_email'] = testData.getValue('input_email', rowIndex)
        data['input_fullName'] = testData.getValue('input_fullName', rowIndex)
        data['input_position'] = testData.getValue('input_position', rowIndex)
        data['input_projectTimeline'] = testData.getValue('input_projectTimeline', rowIndex)
        data['textarea_describeYourTestScenarios'] = testData.getValue('textarea_describeYourTestScenarios', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_budget'] = 'default_data'
        data['input_companyName'] = 'default_data'
        data['input_email'] = 'default_data'
        data['input_fullName'] = 'default_data'
        data['input_position'] = 'default_data'
        data['input_projectTimeline'] = 'default_data'
        data['textarea_describeYourTestScenarios'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

