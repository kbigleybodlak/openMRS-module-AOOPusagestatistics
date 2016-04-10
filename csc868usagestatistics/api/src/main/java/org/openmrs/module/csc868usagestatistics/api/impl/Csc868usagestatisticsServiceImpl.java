/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.csc868usagestatistics.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.csc868usagestatistics.api.Csc868usagestatisticsService;
import org.openmrs.module.csc868usagestatistics.api.db.Csc868usagestatisticsDAO;

/**
 * It is a default implementation of {@link Csc868usagestatisticsService}.
 */
public class Csc868usagestatisticsServiceImpl extends BaseOpenmrsService implements Csc868usagestatisticsService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private Csc868usagestatisticsDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(Csc868usagestatisticsDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public Csc868usagestatisticsDAO getDao() {
	    return dao;
    }
}