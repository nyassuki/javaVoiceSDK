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
 * This is a model class for Blast type.
 */
public class Blast {
    private boolean response;
    private Rcode rcode;

    /**
     * Default constructor.
     */
    public Blast() {
    }

    /**
     * Initialization constructor.
     * @param  response  boolean value for response.
     * @param  rcode  Rcode value for rcode.
     */
    public Blast(
            boolean response,
            Rcode rcode) {
        this.response = response;
        this.rcode = rcode;
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
     * Getter for Rcode.
     * @return Returns the Rcode
     */
    @JsonGetter("rcode")
    public Rcode getRcode() {
        return rcode;
    }

    /**
     * Setter for Rcode.
     * @param rcode Value for Rcode
     */
    @JsonSetter("rcode")
    public void setRcode(Rcode rcode) {
        this.rcode = rcode;
    }

    /**
     * Converts this Blast into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Blast [" + "response=" + response + ", rcode=" + rcode + "]";
    }

    /**
     * Builds a new {@link Blast.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Blast.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(response, rcode);
        return builder;
    }

    /**
     * Class to build instances of {@link Blast}.
     */
    public static class Builder {
        private boolean response;
        private Rcode rcode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  response  boolean value for response.
         * @param  rcode  Rcode value for rcode.
         */
        public Builder(boolean response, Rcode rcode) {
            this.response = response;
            this.rcode = rcode;
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
         * Setter for rcode.
         * @param  rcode  Rcode value for rcode.
         * @return Builder
         */
        public Builder rcode(Rcode rcode) {
            this.rcode = rcode;
            return this;
        }

        /**
         * Builds a new {@link Blast} object using the set fields.
         * @return {@link Blast}
         */
        public Blast build() {
            return new Blast(response, rcode);
        }
    }
}