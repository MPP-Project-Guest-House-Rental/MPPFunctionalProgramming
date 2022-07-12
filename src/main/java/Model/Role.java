package Model;

import Model.Enum.RoleType;

import java.util.Objects;

public abstract class Role {
    private Long id;

    private RoleType roleType;
    private AppUser user;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }

    public Role() {

    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) && roleType == role.roleType;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}