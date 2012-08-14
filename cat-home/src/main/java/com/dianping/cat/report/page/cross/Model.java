package com.dianping.cat.report.page.cross;

import java.util.ArrayList;
import java.util.Collection;

import com.dianping.cat.consumer.cross.model.entity.CrossReport;
import com.dianping.cat.report.page.AbstractReportModel;
import com.dianping.cat.report.page.cross.display.HostInfo;
import com.dianping.cat.report.page.cross.display.MethodInfo;
import com.dianping.cat.report.page.cross.display.ProjectInfo;
import com.dianping.cat.report.view.StringSortHelper;

public class Model extends AbstractReportModel<Action, Context> {
	
	private String m_callSort;
	
	private String m_queryName;
	
	private HostInfo m_hostInfo;
	
	private MethodInfo m_methodInfo;
	
	private ProjectInfo m_projectInfo;

	private CrossReport m_report;
	
	private String m_serviceSort;
	
	public Model(Context ctx) {
		super(ctx);
	}

	public String getCallSort() {
		return m_callSort;
	}

	@Override
	public Action getDefaultAction() {
		return Action.HOURLY_PROJECT;
	}
	
	@Override
   public String getDomain() {
		if (m_report == null) {
			return getDisplayDomain();
		} else {
			return m_report.getDomain();
		}
	}

	@Override
   public Collection<String> getDomains() {
		if (m_report == null) {
			return new ArrayList<String>();
		} else {
			return StringSortHelper.sortDomain(m_report.getDomainNames());
		}
	}
	
	public HostInfo getHostInfo() {
		return m_hostInfo;
	}

	public Collection<String> getIps(){
		if (m_report == null) {
			return new ArrayList<String>();
		} else {
			return StringSortHelper.sortDomain(m_report.getIps());
		}
	}

	public MethodInfo getMethodInfo() {
		return m_methodInfo;
	}

	public ProjectInfo getProjectInfo() {
		return m_projectInfo;
	}

	public CrossReport getReport() {
		return m_report;
	}

	public String getServiceSort() {
		return m_serviceSort;
	}
	

	public void setCallSort(String callSort) {
		m_callSort = callSort;
	}

	public void setHostInfo(HostInfo hostInfo) {
		m_hostInfo = hostInfo;
	}

	public void setMethodInfo(MethodInfo methodInfo) {
		m_methodInfo = methodInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		m_projectInfo = projectInfo;
	}

	public void setReport(CrossReport report) {
		m_report = report;
	}

	public void setServiceSort(String serviceSort) {
		m_serviceSort = serviceSort;
	}

	public String getQueryName() {
		return m_queryName;
	}

	public void setQueryName(String queryName) {
		m_queryName = queryName;
	}
	
}
