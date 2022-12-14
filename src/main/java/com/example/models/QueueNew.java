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
 * This is a model class for QueueNew type.
 */
public class QueueNew {
    private boolean response;
    private Data5 data;

    /**
     * Default constructor.
     */
    public QueueNew() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  data  Data5 value for data.
     */
    public QueueNew(
            boolean response,
            Data5 data) {
        this.response = response;
        this.data = data;
    }

    /**
     * Getter for Response.
     * @return Returns the boolean
     */
    @JsonGetter("response")
    public boolean getResponse() {
        return response;
    }

    /**
     * Setter for Response.
     * @param response Value for boolean
     */
    @JsonSetter("response")
    public void setResponse(boolean response) {
        this.response = response;
    }

    /**
     * Getter for Data.
     * @return Returns the Data5
     */
    @JsonGetter("data")
    public Data5 getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for Data5
     */
    @JsonSetter("data")
    public void setData(Data5 data) {
        this.data = data;
    }

    /**
     * Converts this QueueNew into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "QueueNew [" + "response=" + response + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link QueueNew.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link QueueNew.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, data);
        return builder;
    }

    /**
     * Class to build instances of {@link QueueNew}.
     */
    public static class Builder {
        private boolean response;
        private Data5 data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  data  Data5 value for data.
         */
        public Builder(boolean response, Data5 data) {
            this.response = response;
            this.data = data;
        }

        /**
         * Setter for response.
         * @param  response  boolean value for response.
         * @return Builder
         */
        public Builder response(boolean response) {
            this.response = response;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  Data5 value for data.
         * @return Builder
         */
        public Builder data(Data5 data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link QueueNew} object using the set fields.
         * @return {@link QueueNew}
         */
        public QueueNew build() {
            return new QueueNew(response, data);
        }
    }
}
