package com.jingpinke.indexAction;

import com.jingpinke.indexService.JingpinIIndexService;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
    private JingpinIIndexService jingpinIndexService;

    public JingpinIIndexService getJingpinIndexService() {
        return jingpinIndexService;
	}

    public void setJingpinIndexService(JingpinIIndexService jingpinIndexService) {
        this.jingpinIndexService = jingpinIndexService;
	}

	@Override
	public String execute() throws Exception {
		jingpinIndexService.JingpinHomeService();
		return SUCCESS;
	}
}
