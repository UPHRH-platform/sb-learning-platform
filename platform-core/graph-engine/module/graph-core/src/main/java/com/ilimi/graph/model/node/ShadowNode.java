package com.ilimi.graph.model.node;

import java.util.Map;

import com.ilimi.graph.common.mgr.BaseGraphManager;
import com.ilimi.graph.dac.enums.SystemNodeTypes;

public class ShadowNode extends AbstractNode {

    public ShadowNode(BaseGraphManager manager, String graphId, String nodeId, Map<String, Object> metadata) {
        super(manager, graphId, nodeId, metadata);
    }

    @Override
    public String getSystemNodeType() {
        return SystemNodeTypes.SHADOW_NODE.name();
    }

    @Override
    public String getFunctionalObjectType() {
        return null;
    }

}
