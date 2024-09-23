package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class submitTestingRequestForm {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input fullName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_fullName'))
        
        "Step 2: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_email'))
        
        "Step 3: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_email'))
        
        "Step 4: Click on input email"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_email'))
        
        "Step 5: Click on input phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_phone'))
        
        "Step 6: Click on input phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_phone'))
        
        "Step 7: Click on input phone"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_phone'))
        
        "Step 8: Click on input companyName"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_companyName'))
        
        "Step 9: Enter input value in input companyName"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_companyName'), data['input_companyName'])
        
        "Step 10: Click on input position"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_position'))
        
        "Step 11: Enter input value in input position"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_position'), data['input_position'])
        
        "Step 12: Click on input projectTimeline"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_projectTimeline'))
        
        "Step 13: Enter input value in input projectTimeline"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_projectTimeline'), data['input_projectTimeline'])
        
        "Step 14: Click on select testingType"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/select_testingType'))
        
        "Step 15: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_object'))
        
        "Step 16: Click on select testingTool"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/select_testingTool'))
        
        "Step 17: Click on div katalonStudio"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/div_katalonStudio'))
        
        "Step 18: Click on input budget"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_budget'))
        
        "Step 19: Enter input value in input budget"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/input_budget'), data['input_budget'])
        
        "Step 20: Click on textarea describeYourTestScenarios"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/textarea_describeYourTestScenarios'))
        
        "Step 21: Enter input value in textarea describeYourTestScenarios"
        
        WebUI.setText(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/textarea_describeYourTestScenarios'), data['textarea_describeYourTestScenarios'])
        
        "Step 22: Click on button submit"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_qcitech_solutions_get_a_quote/button_submit'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_budget'] = testData.getValue('input_budget', rowIndex)
        data['input_companyName'] = testData.getValue('input_companyName', rowIndex)
        data['input_position'] = testData.getValue('input_position', rowIndex)
        data['input_projectTimeline'] = testData.getValue('input_projectTimeline', rowIndex)
        data['textarea_describeYourTestScenarios'] = testData.getValue('textarea_describeYourTestScenarios', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_budget'] = 'default_data'
        data['input_companyName'] = 'default_data'
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

