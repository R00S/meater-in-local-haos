package cm.aptoide.p092pt.dataprovider.model.p095v3;

/* loaded from: classes.dex */
public class Subscription {
    private String avatar;
    private String avatarHd;
    private String description;
    private String downloads;

    /* renamed from: id */
    private Number f8524id;
    private String items;
    private String name;
    private String theme;
    private String view;

    protected boolean canEqual(Object obj) {
        return obj instanceof Subscription;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (!subscription.canEqual(this)) {
            return false;
        }
        Number id = getId();
        Number id2 = subscription.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String name = getName();
        String name2 = subscription.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = subscription.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String downloads = getDownloads();
        String downloads2 = subscription.getDownloads();
        if (downloads != null ? !downloads.equals(downloads2) : downloads2 != null) {
            return false;
        }
        String theme = getTheme();
        String theme2 = subscription.getTheme();
        if (theme != null ? !theme.equals(theme2) : theme2 != null) {
            return false;
        }
        String description = getDescription();
        String description2 = subscription.getDescription();
        if (description != null ? !description.equals(description2) : description2 != null) {
            return false;
        }
        String items = getItems();
        String items2 = subscription.getItems();
        if (items != null ? !items.equals(items2) : items2 != null) {
            return false;
        }
        String view = getView();
        String view2 = subscription.getView();
        if (view != null ? !view.equals(view2) : view2 != null) {
            return false;
        }
        String avatarHd = getAvatarHd();
        String avatarHd2 = subscription.getAvatarHd();
        return avatarHd != null ? avatarHd.equals(avatarHd2) : avatarHd2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarHd() {
        return this.avatarHd;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDownloads() {
        return this.downloads;
    }

    public Number getId() {
        return this.f8524id;
    }

    public String getItems() {
        return this.items;
    }

    public String getName() {
        return this.name;
    }

    public String getTheme() {
        return this.theme;
    }

    public String getView() {
        return this.view;
    }

    public int hashCode() {
        Number id = getId();
        int iHashCode = id == null ? 43 : id.hashCode();
        String name = getName();
        int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
        String avatar = getAvatar();
        int iHashCode3 = (iHashCode2 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String downloads = getDownloads();
        int iHashCode4 = (iHashCode3 * 59) + (downloads == null ? 43 : downloads.hashCode());
        String theme = getTheme();
        int iHashCode5 = (iHashCode4 * 59) + (theme == null ? 43 : theme.hashCode());
        String description = getDescription();
        int iHashCode6 = (iHashCode5 * 59) + (description == null ? 43 : description.hashCode());
        String items = getItems();
        int iHashCode7 = (iHashCode6 * 59) + (items == null ? 43 : items.hashCode());
        String view = getView();
        int iHashCode8 = (iHashCode7 * 59) + (view == null ? 43 : view.hashCode());
        String avatarHd = getAvatarHd();
        return (iHashCode8 * 59) + (avatarHd != null ? avatarHd.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarHd(String str) {
        this.avatarHd = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDownloads(String str) {
        this.downloads = str;
    }

    public void setId(Number number) {
        this.f8524id = number;
    }

    public void setItems(String str) {
        this.items = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTheme(String str) {
        this.theme = str;
    }

    public void setView(String str) {
        this.view = str;
    }

    public String toString() {
        return "Subscription(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", downloads=" + getDownloads() + ", theme=" + getTheme() + ", description=" + getDescription() + ", items=" + getItems() + ", view=" + getView() + ", avatarHd=" + getAvatarHd() + ")";
    }
}
