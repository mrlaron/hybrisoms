/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.tieto.tre.tietomerchendise.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.tieto.tre.tietomerchendise.fulfilmentprocess.constants.TietomerchendiseFulfilmentProcessConstants;

import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class TietomerchendiseFulfilmentProcessManager extends GeneratedTietomerchendiseFulfilmentProcessManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( TietomerchendiseFulfilmentProcessManager.class.getName() );
	
	public static final TietomerchendiseFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TietomerchendiseFulfilmentProcessManager) em.getExtension(TietomerchendiseFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
