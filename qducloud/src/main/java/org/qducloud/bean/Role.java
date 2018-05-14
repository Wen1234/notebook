package org.qducloud.bean;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
/**
 * @author Cuiql
 */
@EntityScan
public class Role {
	private String id;
	private String roleName;
	private List<Permission> permission;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<Permission> getPermission() {
		return permission;
	}
	public void setPermission(List<Permission> permission) {
		this.permission = permission;
	}
	
}
