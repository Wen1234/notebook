package org.qducloud.bean;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Cuiql
 */
@EntityScan
public class Permission {
	private String id;
	private String permissionName;
	private String permissionUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionUrl() {
		return permissionUrl;
	}
	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
	}
	
}
