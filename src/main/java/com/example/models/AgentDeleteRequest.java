/*
 * SiskomVoiceAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for AgentDeleteRequest type.
 */
public class AgentDeleteRequest {
    private String agentCode;

    /**
     * Default constructor.
     */
    public AgentDeleteRequest() {
    }

    /**
     * Initialization constructor.
     * @param  agentCode  String value for agentCode.
     */
    public AgentDeleteRequest(
            String agentCode) {
        this.agentCode = agentCode;
    }

    /**
     * Getter for AgentCode.
     * @return Returns the String
     */
    @JsonGetter("agent_code")
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Setter for AgentCode.
     * @param agentCode Value for String
     */
    @JsonSetter("agent_code")
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    /**
     * Converts this AgentDeleteRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AgentDeleteRequest [" + "agentCode=" + agentCode + "]";
    }

    /**
     * Builds a new {@link AgentDeleteRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AgentDeleteRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(agentCode);
        return builder;
    }

    /**
     * Class to build instances of {@link AgentDeleteRequest}.
     */
    public static class Builder {
        private String agentCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  agentCode  String value for agentCode.
         */
        public Builder(String agentCode) {
            this.agentCode = agentCode;
        }

        /**
         * Setter for agentCode.
         * @param  agentCode  String value for agentCode.
         * @return Builder
         */
        public Builder agentCode(String agentCode) {
            this.agentCode = agentCode;
            return this;
        }

        /**
         * Builds a new {@link AgentDeleteRequest} object using the set fields.
         * @return {@link AgentDeleteRequest}
         */
        public AgentDeleteRequest build() {
            return new AgentDeleteRequest(agentCode);
        }
    }
}