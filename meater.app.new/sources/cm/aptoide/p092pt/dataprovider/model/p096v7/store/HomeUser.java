package cm.aptoide.p092pt.dataprovider.model.p096v7.store;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class HomeUser {

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date added;
    private String avatar;

    /* renamed from: id */
    private long f8543id;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date modified;
    private String name;

    protected boolean canEqual(Object obj) {
        return obj instanceof HomeUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeUser)) {
            return false;
        }
        HomeUser homeUser = (HomeUser) obj;
        if (!homeUser.canEqual(this) || getId() != homeUser.getId()) {
            return false;
        }
        String name = getName();
        String name2 = homeUser.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = homeUser.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        Date added = getAdded();
        Date added2 = homeUser.getAdded();
        if (added != null ? !added.equals(added2) : added2 != null) {
            return false;
        }
        Date modified = getModified();
        Date modified2 = homeUser.getModified();
        return modified != null ? modified.equals(modified2) : modified2 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getId() {
        return this.f8543id;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        long id = getId();
        String name = getName();
        int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
        String avatar = getAvatar();
        int iHashCode2 = (iHashCode * 59) + (avatar == null ? 43 : avatar.hashCode());
        Date added = getAdded();
        int iHashCode3 = (iHashCode2 * 59) + (added == null ? 43 : added.hashCode());
        Date modified = getModified();
        return (iHashCode3 * 59) + (modified != null ? modified.hashCode() : 43);
    }

    public HomeUser setAdded(Date date) {
        this.added = date;
        return this;
    }

    public HomeUser setAvatar(String str) {
        this.avatar = str;
        return this;
    }

    public HomeUser setId(long j2) {
        this.f8543id = j2;
        return this;
    }

    public HomeUser setModified(Date date) {
        this.modified = date;
        return this;
    }

    public HomeUser setName(String str) {
        this.name = str;
        return this;
    }

    public String toString() {
        return "HomeUser(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", added=" + getAdded() + ", modified=" + getModified() + ")";
    }
}
