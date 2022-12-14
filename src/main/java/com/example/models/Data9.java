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
 * This is a model class for Data9 type.
 */
public class Data9 {
    private int id;
    private String aiName;
    private String createDate;

    /**
     * Default constructor.
     */
    public Data9() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  aiName  String value for aiName.
     * @param  createDate  String value for createDate.
     */
    public Data9(
            int id,
            String aiName,
            String createDate) {
        this.id = id;
        this.aiName = aiName;
        this.createDate = createDate;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for AiName.
     * @return Returns the String
     */
    @JsonGetter("ai_name")
    public String getAiName() {
        return aiName;
    }

    /**
     * Setter for AiName.
     * @param aiName Value for String
     */
    @JsonSetter("ai_name")
    public void setAiName(String aiName) {
        this.aiName = aiName;
    }

    /**
     * Getter for CreateDate.
     * @return Returns the String
     */
    @JsonGetter("create_date")
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Setter for CreateDate.
     * @param createDate Value for String
     */
    @JsonSetter("create_date")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * Converts this Data9 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Data9 [" + "id=" + id + ", aiName=" + aiName + ", createDate=" + createDate + "]";
    }

    /**
     * Builds a new {@link Data9.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Data9.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, aiName, createDate);
        return builder;
    }

    /**
     * Class to build instances of {@link Data9}.
     */
    public static class Builder {
        private int id;
        private String aiName;
        private String createDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  aiName  String value for aiName.
         * @param  createDate  String value for createDate.
         */
        public Builder(int id, String aiName, String createDate) {
            this.id = id;
            this.aiName = aiName;
            this.createDate = createDate;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for aiName.
         * @param  aiName  String value for aiName.
         * @return Builder
         */
        public Builder aiName(String aiName) {
            this.aiName = aiName;
            return this;
        }

        /**
         * Setter for createDate.
         * @param  createDate  String value for createDate.
         * @return Builder
         */
        public Builder createDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        /**
         * Builds a new {@link Data9} object using the set fields.
         * @return {@link Data9}
         */
        public Data9 build() {
            return new Data9(id, aiName, createDate);
        }
    }
}
