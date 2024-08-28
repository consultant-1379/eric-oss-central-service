/*
 * *------------------------------------------------------------------------------
 * ******************************************************************************
 *  COPYRIGHT Ericsson 2019
 *
 *  The copyright to the computer program(s) herein is the property of
 *  Ericsson Inc. The programs may be used and/or copied only with written
 *  permission from Ericsson Inc. or in accordance with the terms and
 *  conditions stipulated in the agreement/contract under which the
 *  program(s) have been supplied.
 * ******************************************************************************
 * ------------------------------------------------------------------------------
 */
package com.ericsson.oss.ci.service.startup;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import com.ericsson.oss.ci.executor.FlmAlgorithmExecutor;

/**
 * Startup EJB.
 */
@Singleton
@Startup
public class FlmServiceStartupBean {

    @PostConstruct
    void onStartUp() {

        final FlmAlgorithmExecutor executor = new FlmAlgorithmExecutor();
        executor.executeActivity();
    }
}
