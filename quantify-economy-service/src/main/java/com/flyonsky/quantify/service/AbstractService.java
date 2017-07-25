package com.flyonsky.quantify.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor={Exception.class})
public abstract class AbstractService {
	
	protected static final Logger LOG = LoggerFactory.getLogger(AbstractService.class);

	protected static final String DEFAULT_CHARSET = "UTF-8";
	
}
