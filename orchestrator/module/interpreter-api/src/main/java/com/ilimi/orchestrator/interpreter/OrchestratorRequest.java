package com.ilimi.orchestrator.interpreter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ilimi.orchestrator.dac.model.OrchestratorScript;

public class OrchestratorRequest implements Serializable {

	private static final long serialVersionUID = 6662469130673179559L;

	private String action;
	private List<OrchestratorScript> scripts;
	private OrchestratorScript script;
	private Map<String, Object> params;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<OrchestratorScript> getScripts() {
		return scripts;
	}

	public void setScripts(List<OrchestratorScript> scripts) {
		this.scripts = scripts;
	}

	public OrchestratorScript getScript() {
		return script;
	}

	public void setScript(OrchestratorScript script) {
		this.script = script;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public static enum ACTION_TYPES {
		INIT, EXECUTE;
	}

}
