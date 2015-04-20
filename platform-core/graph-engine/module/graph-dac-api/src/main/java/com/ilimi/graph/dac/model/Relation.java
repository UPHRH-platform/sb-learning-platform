package com.ilimi.graph.dac.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;

import com.ilimi.graph.common.dto.BaseValueObject;
import com.ilimi.graph.common.exception.ServerException;
import com.ilimi.graph.dac.enums.SystemNodeTypes;
import com.ilimi.graph.dac.enums.SystemProperties;
import com.ilimi.graph.dac.exception.GraphDACErrorCodes;

public class Relation extends BaseValueObject {

    private static final long serialVersionUID = -7207054262120122453L;
    private long id;
    private String graphId;
    private String relationType;
    private String startNodeId;
    private String endNodeId;
    private String startNodeName;
    private String endNodeName;
    private Map<String, Object> metadata;

    public Relation(String startNodeId, String relationType, String endNodeId) {
        this.startNodeId = startNodeId;
        this.endNodeId = endNodeId;
        this.relationType = relationType;
    }

    public Relation(String graphId, Relationship neo4jRel) {
        if (null == neo4jRel)
            throw new ServerException(GraphDACErrorCodes.ERR_DAC_NULL_DB_REL_008.name(),
                    "Failed to create relation object. Relation from database is null.");
        this.graphId = graphId;

        Node startNode = neo4jRel.getStartNode();
        Node endNode = neo4jRel.getEndNode();
        this.startNodeId = (String) startNode.getProperty(SystemProperties.IL_UNIQUE_ID.name());
        this.endNodeId = (String) endNode.getProperty(SystemProperties.IL_UNIQUE_ID.name());

        String startNodeType = (String) startNode.getProperty(SystemProperties.IL_SYS_NODE_TYPE.name());
        String endNodeType = (String) endNode.getProperty(SystemProperties.IL_SYS_NODE_TYPE.name());
        if (StringUtils.equalsIgnoreCase(SystemNodeTypes.DATA_NODE.name(), startNodeType)) {
            String name = (String) startNode.getProperty("name", null);
            if (StringUtils.isNotBlank(name))
                this.startNodeName = name;
        }
        if (StringUtils.equalsIgnoreCase(SystemNodeTypes.DATA_NODE.name(), endNodeType)) {
            String name = (String) endNode.getProperty("name", null);
            if (StringUtils.isNotBlank(name))
                this.endNodeName = name;
        }
        this.relationType = neo4jRel.getType().name();
        this.metadata = new HashMap<String, Object>();
        Iterable<String> keys = neo4jRel.getPropertyKeys();
        if (null != keys && null != keys.iterator()) {
            for (String key : keys) {
                this.metadata.put(key, neo4jRel.getProperty(key));
            }
        }
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getStartNodeId() {
        return startNodeId;
    }

    public void setStartNodeId(String startNodeId) {
        this.startNodeId = startNodeId;
    }

    public String getEndNodeId() {
        return endNodeId;
    }

    public void setEndNodeId(String endNodeId) {
        this.endNodeId = endNodeId;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStartNodeName() {
        return startNodeName;
    }

    public void setStartNodeName(String startNodeName) {
        this.startNodeName = startNodeName;
    }

    public String getEndNodeName() {
        return endNodeName;
    }

    public void setEndNodeName(String endNodeName) {
        this.endNodeName = endNodeName;
    }
}
