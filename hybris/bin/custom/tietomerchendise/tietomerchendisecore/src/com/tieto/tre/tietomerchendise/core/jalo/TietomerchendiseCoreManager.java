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
package com.tieto.tre.tietomerchendise.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.tieto.tre.tietomerchendise.core.constants.TietomerchendiseCoreConstants;
import com.tieto.tre.tietomerchendise.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
@SuppressWarnings("PMD")
public class TietomerchendiseCoreManager extends GeneratedTietomerchendiseCoreManager
{
	public static final TietomerchendiseCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TietomerchendiseCoreManager) em.getExtension(TietomerchendiseCoreConstants.EXTENSIONNAME);
	}
}
