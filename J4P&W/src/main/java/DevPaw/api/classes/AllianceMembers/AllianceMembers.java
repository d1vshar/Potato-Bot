package DevPaw.api.classes.AllianceMembers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllianceMembers {
	public boolean success;
	public List<ANation> nations = null;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}