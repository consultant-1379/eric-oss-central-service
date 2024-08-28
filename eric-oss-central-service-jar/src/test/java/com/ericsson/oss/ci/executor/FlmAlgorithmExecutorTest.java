/*
 *------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
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

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit Tests for {@link FlmAlgorithmExecutor} class.
 */
public class FlmAlgorithmExecutorTest {

    private final FlmAlgorithmExecutor objectUnderTest = new FlmAlgorithmExecutor();

    @Before
    public void setUp() {
        objectUnderTest.setAlgorithmName("Algorithm Name");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void executeActivity() {
        Assert.assertEquals("Algorithm Name", objectUnderTest.getAlgorithmName());
    }
}
