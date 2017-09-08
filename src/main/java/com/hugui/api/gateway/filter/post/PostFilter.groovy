package com.hugui.api.gateway.filter.pre;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 
 * @author hugui
 *
 */

public class PostFilter extends ZuulFilter {

	Logger log = LoggerFactory.getLogger(PostFilter.class);

	public Object run() {

		log.info("this is a post filter");

		return null;
	}

	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 2000;
	}

	@Override
	public String filterType() {
		return "post";
	}

}
