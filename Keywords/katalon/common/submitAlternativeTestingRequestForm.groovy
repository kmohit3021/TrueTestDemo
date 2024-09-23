package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class submitAlternativeTestingRequestForm {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input fullName2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_fullName2'))
        
        "Step 2: Enter input value in input fullName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_fullName2'), data['input_fullName2'])
        
        "Step 3: Click on input email2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_email2'))
        
        "Step 4: Enter input value in input email2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_email2'), data['input_email2'])
        
        "Step 5: Click on input companyName2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_companyName2'))
        
        "Step 6: Enter input value in input companyName2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_companyName2'), data['input_companyName2'])
        
        "Step 7: Click on input phone2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_phone2'))
        
        "Step 8: Click on input position2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_position2'))
        
        "Step 9: Enter input value in input position2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_position2'), data['input_position2'])
        
        "Step 10: Click on input projectTimeline2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_projectTimeline2'))
        
        "Step 11: Enter input value in input projectTimeline2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_projectTimeline2'), data['input_projectTimeline2'])
        
        "Step 12: Click on select testingType2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/select_testingType2'))
        
        "Step 13: Click on div mobile"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_mobile'))
        
        "Step 14: Click on select testingTool2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/select_testingTool2'))
        
        "Step 15: Click on div uft"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_uft'))
        
        "Step 16: Click on input budget2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_budget2'))
        
        "Step 17: Enter input value in input budget2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_budget2'), data['input_budget2'])
        
        "Step 18: Click on textarea describeYourTestScenarios2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/textarea_describeYourTestScenarios2'))
        
        "Step 19: Enter input value in textarea describeYourTestScenarios2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/textarea_describeYourTestScenarios2'), data['textarea_describeYourTestScenarios2'])
        
        "Step 20: Click on button submit2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/button_submit2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_budget2'] = testData.getValue('input_budget2', rowIndex)
        data['input_companyName2'] = testData.getValue('input_companyName2', rowIndex)
        data['input_email2'] = testData.getValue('input_email2', rowIndex)
        data['input_fullName2'] = testData.getValue('input_fullName2', rowIndex)
        data['input_position2'] = testData.getValue('input_position2', rowIndex)
        data['input_projectTimeline2'] = testData.getValue('input_projectTimeline2', rowIndex)
        data['textarea_describeYourTestScenarios2'] = testData.getValue('textarea_describeYourTestScenarios2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_budget2'] = 'default_data'
        data['input_companyName2'] = 'default_data'
        data['input_email2'] = 'default_data'
        data['input_fullName2'] = 'default_data'
        data['input_position2'] = 'default_data'
        data['input_projectTimeline2'] = 'default_data'
        data['textarea_describeYourTestScenarios2'] = 'default_data'
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

