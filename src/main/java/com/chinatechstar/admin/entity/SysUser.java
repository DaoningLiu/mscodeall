package com.chinatechstar.admin.entity;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.chinatechstar.component.commons.entity.TimeEntity;
import com.chinatechstar.component.commons.validator.InsertValidator;
import com.chinatechstar.component.commons.validator.TelephoneNumber;
import com.chinatechstar.component.commons.validator.UpdateValidator;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * 用户信息的实体类
 * 
 * @版权所有 广东国星科技有限公司 www.mscodecloud.com
 */
public class SysUser extends TimeEntity implements Serializable {

	private static final long serialVersionUID = 9220528102879200417L;
	@NotNull(groups = { UpdateValidator.class })
	private Long id;// ID
	@NotBlank(groups = { InsertValidator.class, UpdateValidator.class })
	@Size(max = 64, min = 3, groups = { InsertValidator.class, UpdateValidator.class })
	private String username;// 用户名
	@NotBlank(groups = { InsertValidator.class })
	@Size(max = 31, min = 6, groups = { InsertValidator.class, UpdateValidator.class })
	private String password;// 密码
	@NotBlank(groups = { InsertValidator.class, UpdateValidator.class })
	@Email(groups = { InsertValidator.class, UpdateValidator.class })
	@Size(max = 100, groups = { InsertValidator.class, UpdateValidator.class })
	private String email;// 邮箱
	@NotBlank(groups = { InsertValidator.class, UpdateValidator.class })
	@TelephoneNumber(groups = { InsertValidator.class, UpdateValidator.class })
	@Size(max = 20, groups = { InsertValidator.class, UpdateValidator.class })
	private String mobile;// 手机号
	@NotBlank(groups = { InsertValidator.class, UpdateValidator.class })
	@Size(max = 10, min = 1, groups = { InsertValidator.class, UpdateValidator.class })
	private String prefix;// 手机号国家代码
	private Long[] roleId;// 角色ID
	@NotNull(groups = { InsertValidator.class, UpdateValidator.class })
	private Long orgId;// 所属机构ID
	@NotNull(groups = { InsertValidator.class, UpdateValidator.class })
	private Short status;// 状态 0：禁用 1：正常
	private String tenantCode;// 租户编码
	private String captcha;// 验证码
	private String provinceRegionCode;// 省份区域代码
	private String cityRegionCode;// 地市区域代码
	private String tenantName;// 租户名称

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Long[] getRoleId() {
		return roleId;
	}

	public void setRoleId(Long[] roleId) {
		this.roleId = roleId;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getTenantCode() {
		return tenantCode;
	}

	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getProvinceRegionCode() {
		return provinceRegionCode;
	}

	public void setProvinceRegionCode(String provinceRegionCode) {
		this.provinceRegionCode = provinceRegionCode;
	}

	public String getCityRegionCode() {
		return cityRegionCode;
	}

	public void setCityRegionCode(String cityRegionCode) {
		this.cityRegionCode = cityRegionCode;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		SysUser item = (SysUser) o;
		return Objects.equal(id, item.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("id", id).add("username", username).add("password", password).add("email", email).add("mobile", mobile)
				.add("prefix", prefix).add("roleId", roleId).add("orgId", orgId).add("status", status).add("tenantCode", tenantCode).add("captcha", captcha).add("provinceRegionCode", provinceRegionCode).add("cityRegionCode", cityRegionCode).add("tenantName", tenantName)
				.add("createTime", super.getCreateTime()).toString();
	}

}
