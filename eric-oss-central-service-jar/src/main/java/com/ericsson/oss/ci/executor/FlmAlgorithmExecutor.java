/*
 *------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2019
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *------------------------------------------------------------------------------
 */
package com.ericsson.oss.ci.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Algorithm executor.
 */
public class FlmAlgorithmExecutor {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlmAlgorithmExecutor.class);

    private String algorithmName;

    /**
     * method to start flm algorithm execution.
     */
    public void executeActivity() {
        setAlgorithmName("FLM Algorithm");

        LOGGER.info("Starting " + getAlgorithmName());
        // do stuff
        LOGGER.info("Finished " + getAlgorithmName());
    }

    void setAlgorithmName(final String algorithmName) {
        this.algorithmName = algorithmName;
    }

    String getAlgorithmName() {
        return algorithmName;
    }

}
