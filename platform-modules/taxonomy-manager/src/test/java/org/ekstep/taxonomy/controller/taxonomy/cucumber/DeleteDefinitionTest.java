package org.ekstep.taxonomy.controller.taxonomy.cucumber;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.ekstep.taxonomy.base.test.BaseCucumberTest;
import org.junit.Ignore;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Ignore
@WebAppConfiguration
@ContextConfiguration({ "classpath:servlet-context.xml" })
public class DeleteDefinitionTest extends BaseCucumberTest{
	
	private String taxonomyId;
	private String objectType;	
	public void createDef() {	   	
		MockMvc mockMvc;	 
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		String contentString = "{  \"definitionNodes\": [    {      \"objectType\": \"Game\",      \"properties\": [        {          \"propertyName\": \"name\",          \"title\": \"Name\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": true,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text', 'order': 1 }\"        },        {          \"propertyName\": \"code\",          \"title\": \"Code\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": true,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text', 'order': 2 }\"        },        {          \"propertyName\": \"identifier\",          \"title\": \"Identifier\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Hidden\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 3 }\"        },        {          \"propertyName\": \"description\",          \"title\": \"Description\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'textarea', 'order': 4 }\"        },        {          \"propertyName\": \"language\",          \"title\": \"Language\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text', 'order': 5 }\"        },        {          \"propertyName\": \"appIcon\",          \"title\": \"App Icon\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"URL\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'table', 'order': 7 }\"        },        {          \"propertyName\": \"appIconLabel\",          \"title\": \"App Icon Label\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{'inputType': 'table', 'order': 8 }\"        },        {          \"propertyName\": \"posterImage\",          \"title\": \"Poster Image\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"URL\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'table',  'order': 8 }\"        },        {          \"propertyName\": \"status\",          \"title\": \"Status\",          \"description\": \"\",          \"category\": \"lifeCycle\",          \"dataType\": \"Select\",          \"range\": [            \"Draft\",            \"Review\",            \"Active\",            \"Retired\",            \"Mock\"          ],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"Draft\",          \"renderingHints\": \"{ 'inputType': 'select',  'order': 9 }\"        },        {          \"propertyName\": \"currentVersion\",          \"title\": \"Current Version\",          \"description\": \"\",          \"category\": \"lifeCycle\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'select',  'order': 9 }\"        },        {          \"propertyName\": \"validators\",          \"title\": \"Validators\",          \"description\": \"\",          \"category\": \"lifeCycle\",          \"dataType\": \"List\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'table',  'order': 12 }\"        },        {          \"propertyName\": \"releaseNotes\",          \"title\": \"Release Notes\",          \"description\": \"\",          \"category\": \"lifeCycle\",          \"dataType\": \"List\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'table',  'order': 10 }\"        },        {          \"propertyName\": \"developer\",          \"title\": \"Developer\",          \"description\": \"Person or Organisation\",          \"category\": \"ownership\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": true,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"owner\",          \"title\": \"Owner\",          \"description\": \"\",          \"category\": \"ownership\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": true,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"copyright\",          \"title\": \"Copyright\",          \"description\": \"\",          \"category\": \"ownership\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"cost\",          \"title\": \"Cost\",          \"description\": \"\",          \"category\": \"ownership\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"license\",          \"title\": \"License\",          \"description\": \"\",          \"category\": \"ownership\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"genieVersion\",          \"title\": \"Genie Version\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"os\",          \"title\": \"OS\",          \"description\": \"Android or iOS\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"osVersionCompatibility\",          \"title\": \"OS Version Compatibility\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"size\",          \"title\": \"Size\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"format\",          \"title\": \"Format\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"location\",          \"title\": \"Location\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"duration\",          \"title\": \"Duration\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"resources\",          \"title\": \"Resources\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Multi-Select\",          \"range\": [            \"Audio Input\",            \"Audio Output\",            \"Touch\",            \"GPS\",            \"Motion Sensor\",            \"Compass\"          ],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'select',  'order': 14 }\"        },        {          \"propertyName\": \"idealScreenSize\",          \"title\": \"Ideal Screen Size\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"minResolution\",          \"title\": \"Min Resolution\",          \"description\": \"\",          \"category\": \"technical\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"purpose\",          \"title\": \"Purpose\",          \"description\": \"\",          \"category\": \"pedagogy\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"studyLevel\",          \"title\": \"Study Level\",          \"description\": \"\",          \"category\": \"pedagogy\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"learnerLevel\",          \"title\": \"Learner Level\",          \"description\": \"\",          \"category\": \"pedagogy\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"bloomsTaxonomyLevel\",          \"title\": \"Bloom's taxonomy level\",          \"description\": \"\",          \"category\": \"pedagogy\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 14 }\"        },        {          \"propertyName\": \"interactivityLevel\",          \"title\": \"Interactivity Level\",          \"description\": \"\",          \"category\": \"gameExperience\",          \"dataType\": \"Select\",          \"range\": [            \"High\",            \"Medium\",            \"Low\"          ],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'select',  'order': 14 }\"        },        {          \"propertyName\": \"popularity\",          \"title\": \"Popularity\",          \"description\": \"\",          \"category\": \"analytics\",          \"dataType\": \"Number\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 19 }\"        },        {          \"propertyName\": \"rating\",          \"title\": \"Rating\",          \"description\": \"\",          \"category\": \"analytics\",          \"dataType\": \"Number\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 20 }\"        },        {          \"propertyName\": \"quality\",          \"title\": \"Quality\",          \"description\": \"\",          \"category\": \"analytics\",          \"dataType\": \"Number\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 20 }\"        },        {          \"propertyName\": \"lastUpdatedBy\",          \"title\": \"Last Updated By\",          \"description\": \"\",          \"category\": \"audit\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 21 }\"        },        {          \"propertyName\": \"lastUpdatedOn\",          \"title\": \"Last Updated On\",          \"description\": \"\",          \"category\": \"audit\",          \"dataType\": \"Date\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 22 }\"        },        {          \"propertyName\": \"version\",          \"title\": \"Version\",          \"description\": \"\",          \"category\": \"audit\",          \"dataType\": \"Number\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 23 }\"        },        {          \"propertyName\": \"versionDate\",          \"title\": \"Version Date\",          \"description\": \"\",          \"category\": \"audit\",          \"dataType\": \"Date\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 24 }\"        },        {          \"propertyName\": \"versionCreatedBy\",          \"title\": \"Version Created By\",          \"description\": \"\",          \"category\": \"audit\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 25 }\"        },        {          \"propertyName\": \"downloads\",          \"title\": \"Downloads\",          \"description\": \"\",          \"category\": \"pedagogy\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 25 }\"        },        {          \"propertyName\": \"totalGamingTime\",          \"title\": \"Total Gaming Time\",          \"description\": \"\",          \"category\": \"pedagogy\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 25 }\"        },        {          \"propertyName\": \"avgGamingTime\",          \"title\": \"Avg Gaming Time\",          \"description\": \"\",          \"category\": \"pedagogy\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Readonly\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'order': 25 }\"        }      ],      \"inRelations\": [],      \"outRelations\": [        {          \"relationName\": \"associatedTo\",          \"title\": \"Related Games (OR) Associated Concepts (OR) Screenshots\",          \"description\": \"\",          \"required\": false,          \"objectTypes\": [            \"Game\",            \"Concept\",            \"Media\"          ],          \"renderingHints\": \"{ 'order': 26 }\"        }      ],      \"systemTags\": [        {          \"name\": \"Screener\",          \"description\": \"Type of game\"        },        {          \"name\": \"Game\",          \"description\": \"Type of game\"        },        {          \"name\": \"Literacy\",          \"description\": \"Subject area\"        },        {          \"name\": \"Numeracy\",          \"description\": \"Subject area\"        },        {          \"name\": \"Non Cognitive\",          \"description\": \"Subject area\"        },        {          \"name\": \"Mandatory\",          \"description\": \"Is the game mandatory?\"        },        {          \"name\": \"Online Game\",          \"description\": \"Game playing type\"        },        {          \"name\": \"Offline Game\",          \"description\": \"Game playing type\"        },        {          \"name\": \"Audio Interaction\",          \"description\": \"Interactivity Type\"        },        {          \"name\": \"Visual Interaction\",          \"description\": \"Interactivity Type\"        },        {          \"name\": \"Textual Interaction\",          \"description\": \"Interactivity Type\"        },        {          \"name\": \"Touch Interaction\",          \"description\": \"Interactivity Type\"        },        {          \"name\": \"No Intervention\",          \"description\": \"Intervention Type\"        },        {          \"name\": \"Optional Intervention\",          \"description\": \"Intervention Type\"        },        {          \"name\": \"Mandatory Intervention\",          \"description\": \"Intervention Type\"        },        {          \"name\": \"Multi-Player\",          \"description\": \"Collaboration \"        },        {          \"name\": \"Single-Player\",          \"description\": \"Collaboration \"        }      ]    },    {      \"objectType\": \"Media\",      \"properties\": [        {          \"propertyName\": \"title\",          \"title\": \"Title\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 1 }\"        },        {          \"propertyName\": \"identifier\",          \"title\": \"Identifier\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": true,          \"displayProperty\": \"Hidden\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 2 }\"        },        {          \"propertyName\": \"description\",          \"title\": \"Description\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 3 }\"        },        {          \"propertyName\": \"mediaUrl\",          \"title\": \"Media URL\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": true,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 4 }\"        },        {          \"propertyName\": \"mediaType\",          \"title\": \"Media Type\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Select\",          \"range\": [            \"image\",            \"video\"          ],          \"required\": true,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 5 }\"        },        {          \"propertyName\": \"mimeType\",          \"title\": \"Mime Type\",          \"description\": \"\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": true,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 6 }\"        },        {          \"propertyName\": \"posterImage\",          \"title\": \"Poster Image\",          \"description\": \"Poster image for videos\",          \"category\": \"general\",          \"dataType\": \"Text\",          \"range\": [],          \"required\": false,          \"indexed\": false,          \"displayProperty\": \"Editable\",          \"defaultValue\": \"\",          \"renderingHints\": \"{ 'inputType': 'text',  'order': 7 }\"        }      ],      \"inRelations\": [        {          \"relationName\": \"associatedTo\",          \"title\": \"Related Games\",          \"description\": \"\",          \"required\": false,          \"objectTypes\": [            \"Game\"          ],          \"renderingHints\": \"{'order': 8}\"        }      ],      \"outRelations\": [],      \"systemTags\": []    }  ]}";
	    Map<String, String> params = new HashMap<String, String>();
		Map<String, String> header = new HashMap<String, String>();
		String path = "/taxonomy/numeracy/definition";
		header.put("user-id", "ilimi");
    	ResultActions actions = resultActionPost(contentString, path, params, MediaType.APPLICATION_JSON, header, mockMvc);      
        try {
			actions.andExpect(status().isOk());
			System.out.println("Created Definition.......");
		} catch (Exception e) {
			e.printStackTrace();
		}    
	 }
	
	@Before
    public void setup() throws IOException {
        initMockMVC();
    }
	
	@When("Taxonomy id is (.*) and objectType ID is (.*)$")
	public void getInputData(String taxonomyId, String objectType){
		this.taxonomyId = taxonomyId;
		this.objectType = objectType;
		
		try {
			createDef();
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("Delete the (.*) definition and get status (.*)$")
	public void deleteDefination(String objecttype, String status){		
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String> header = new HashMap<String, String>();
		String path = "/taxonomy/"+this.taxonomyId+"/definition/"+ this.objectType;
		System.out.println("URL Path:" + path);
		header.put("user-id", "ilimi");
		ResultActions actions = resultActionDelete(path, params, MediaType.APPLICATION_JSON, header, mockMvc);      
		try {
			actions.andExpect(status().isOk());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("Unable to delete the definition and get status (\\d+)")
	public void wrongObjectType(int status){
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String> header = new HashMap<String, String>();
		String path = "/taxonomy/"+taxonomyId+"/definition/"+ objectType;
		header.put("user-id", "ilimi");
		ResultActions actions = resultActionDelete(path, params, MediaType.APPLICATION_JSON, header, mockMvc);      
		try {
			actions.andExpect(status().is(status));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
