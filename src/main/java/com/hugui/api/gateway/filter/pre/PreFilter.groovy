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

	Logger log = LoggerFactory.getLogger(PreFilter.class);

	public Object run() {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

		log.info("this is a pre filter : send {} request to {}", request.getMethod(),
				request.getRequestURI().toString());

		return null;
	}

	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1000;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
