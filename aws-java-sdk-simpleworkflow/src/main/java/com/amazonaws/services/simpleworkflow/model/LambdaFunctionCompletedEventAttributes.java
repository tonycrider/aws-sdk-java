/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

/**
 * <p>
 * Provides details for the <code>LambdaFunctionCompleted</code> event.
 * </p>
 */
public class LambdaFunctionCompletedEventAttributes implements Serializable, Cloneable {

    /**
     * The ID of the <code>LambdaFunctionScheduled</code> event that was
     * recorded when this AWS Lambda function was scheduled. This information
     * can be useful for diagnosing problems by tracing back the chain of
     * events leading up to this event.
     */
    private Long scheduledEventId;

    /**
     * The ID of the <code>LambdaFunctionStarted</code> event recorded in the
     * history.
     */
    private Long startedEventId;

    /**
     * The result of the function execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String result;

    /**
     * The ID of the <code>LambdaFunctionScheduled</code> event that was
     * recorded when this AWS Lambda function was scheduled. This information
     * can be useful for diagnosing problems by tracing back the chain of
     * events leading up to this event.
     *
     * @return The ID of the <code>LambdaFunctionScheduled</code> event that was
     *         recorded when this AWS Lambda function was scheduled. This information
     *         can be useful for diagnosing problems by tracing back the chain of
     *         events leading up to this event.
     */
    public Long getScheduledEventId() {
        return scheduledEventId;
    }
    
    /**
     * The ID of the <code>LambdaFunctionScheduled</code> event that was
     * recorded when this AWS Lambda function was scheduled. This information
     * can be useful for diagnosing problems by tracing back the chain of
     * events leading up to this event.
     *
     * @param scheduledEventId The ID of the <code>LambdaFunctionScheduled</code> event that was
     *         recorded when this AWS Lambda function was scheduled. This information
     *         can be useful for diagnosing problems by tracing back the chain of
     *         events leading up to this event.
     */
    public void setScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
    }
    
    /**
     * The ID of the <code>LambdaFunctionScheduled</code> event that was
     * recorded when this AWS Lambda function was scheduled. This information
     * can be useful for diagnosing problems by tracing back the chain of
     * events leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledEventId The ID of the <code>LambdaFunctionScheduled</code> event that was
     *         recorded when this AWS Lambda function was scheduled. This information
     *         can be useful for diagnosing problems by tracing back the chain of
     *         events leading up to this event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LambdaFunctionCompletedEventAttributes withScheduledEventId(Long scheduledEventId) {
        this.scheduledEventId = scheduledEventId;
        return this;
    }

    /**
     * The ID of the <code>LambdaFunctionStarted</code> event recorded in the
     * history.
     *
     * @return The ID of the <code>LambdaFunctionStarted</code> event recorded in the
     *         history.
     */
    public Long getStartedEventId() {
        return startedEventId;
    }
    
    /**
     * The ID of the <code>LambdaFunctionStarted</code> event recorded in the
     * history.
     *
     * @param startedEventId The ID of the <code>LambdaFunctionStarted</code> event recorded in the
     *         history.
     */
    public void setStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
    }
    
    /**
     * The ID of the <code>LambdaFunctionStarted</code> event recorded in the
     * history.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startedEventId The ID of the <code>LambdaFunctionStarted</code> event recorded in the
     *         history.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LambdaFunctionCompletedEventAttributes withStartedEventId(Long startedEventId) {
        this.startedEventId = startedEventId;
        return this;
    }

    /**
     * The result of the function execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The result of the function execution (if any).
     */
    public String getResult() {
        return result;
    }
    
    /**
     * The result of the function execution (if any).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param result The result of the function execution (if any).
     */
    public void setResult(String result) {
        this.result = result;
    }
    
    /**
     * The result of the function execution (if any).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param result The result of the function execution (if any).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public LambdaFunctionCompletedEventAttributes withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScheduledEventId() != null) sb.append("ScheduledEventId: " + getScheduledEventId() + ",");
        if (getStartedEventId() != null) sb.append("StartedEventId: " + getStartedEventId() + ",");
        if (getResult() != null) sb.append("Result: " + getResult() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getScheduledEventId() == null) ? 0 : getScheduledEventId().hashCode()); 
        hashCode = prime * hashCode + ((getStartedEventId() == null) ? 0 : getStartedEventId().hashCode()); 
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LambdaFunctionCompletedEventAttributes == false) return false;
        LambdaFunctionCompletedEventAttributes other = (LambdaFunctionCompletedEventAttributes)obj;
        
        if (other.getScheduledEventId() == null ^ this.getScheduledEventId() == null) return false;
        if (other.getScheduledEventId() != null && other.getScheduledEventId().equals(this.getScheduledEventId()) == false) return false; 
        if (other.getStartedEventId() == null ^ this.getStartedEventId() == null) return false;
        if (other.getStartedEventId() != null && other.getStartedEventId().equals(this.getStartedEventId()) == false) return false; 
        if (other.getResult() == null ^ this.getResult() == null) return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false) return false; 
        return true;
    }
    
    @Override
    public LambdaFunctionCompletedEventAttributes clone() {
        try {
            return (LambdaFunctionCompletedEventAttributes) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    