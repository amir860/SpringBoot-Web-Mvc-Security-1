package com.tirmizee.backend.api.permission.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tirmizee.core.datatable.SortColumn;
import com.tirmizee.core.repository.PermissionRepository;

public class PermissionPageDTO {

	private Integer perId;
	
	@SortColumn(PermissionRepository.COL_PER_NAME)
	private String perName;
	
	@SortColumn(PermissionRepository.COL_PER_CODE)
	private String perCode;
	
	private String updateBy;
	
	@SortColumn(PermissionRepository.COL_CREATE_DATE)
	private String createBy;
	
	private java.sql.Date updateDate;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private java.sql.Date createDate;
	
	public Integer getPerId() {
		return perId;
	}
	public void setPerId(Integer perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public String getPerCode() {
		return perCode;
	}
	public void setPerCode(String perCode) {
		this.perCode = perCode;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public java.sql.Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(java.sql.Date updateDate) {
		this.updateDate = updateDate;
	}
	public java.sql.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.sql.Date createDate) {
		this.createDate = createDate;
	}
	
}