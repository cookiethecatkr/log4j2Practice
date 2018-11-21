package com.jcg.logging;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4j2Example {
	
	private static final Logger LOG = LogManager.getLogger(Log4j2Example.class);
	
	public static void main(String[] args) {
		
		LOG.debug("debug");
		LOG.info("info");
		LOG.warn("warn");
		LOG.error("error");
		LOG.fatal("fatal");
		LOG.info("Appending string : {}.","Hello, World");
		
	}
}
