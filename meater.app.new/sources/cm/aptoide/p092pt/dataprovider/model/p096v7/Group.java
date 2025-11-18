package cm.aptoide.p092pt.dataprovider.model.p096v7;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class Group {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date added;
    private String graphic;
    private String icon;

    /* renamed from: id */
    private long f8536id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date modified;
    private String name;
    private Parent parent;
    private Stats stats;
    private String title;

    public static class Parent {
        private String graphic;
        private String icon;

        /* renamed from: id */
        private long f8537id;
        private String name;
        private String title;

        protected boolean canEqual(Object obj) {
            return obj instanceof Parent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Parent)) {
                return false;
            }
            Parent parent = (Parent) obj;
            if (!parent.canEqual(this) || getId() != parent.getId()) {
                return false;
            }
            String name = getName();
            String name2 = parent.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String title = getTitle();
            String title2 = parent.getTitle();
            if (title != null ? !title.equals(title2) : title2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = parent.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String graphic = getGraphic();
            String graphic2 = parent.getGraphic();
            return graphic != null ? graphic.equals(graphic2) : graphic2 == null;
        }

        public String getGraphic() {
            return this.graphic;
        }

        public String getIcon() {
            return this.icon;
        }

        public long getId() {
            return this.f8537id;
        }

        public String getName() {
            return this.name;
        }

        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            long id = getId();
            String name = getName();
            int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
            String title = getTitle();
            int iHashCode2 = (iHashCode * 59) + (title == null ? 43 : title.hashCode());
            String icon = getIcon();
            int iHashCode3 = (iHashCode2 * 59) + (icon == null ? 43 : icon.hashCode());
            String graphic = getGraphic();
            return (iHashCode3 * 59) + (graphic != null ? graphic.hashCode() : 43);
        }

        public void setGraphic(String str) {
            this.graphic = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(long j2) {
            this.f8537id = j2;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "Group.Parent(id=" + getId() + ", name=" + getName() + ", title=" + getTitle() + ", icon=" + getIcon() + ", graphic=" + getGraphic() + ")";
        }
    }

    public static class Stats {
        private int groups;
        private int items;

        protected boolean canEqual(Object obj) {
            return obj instanceof Stats;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            return stats.canEqual(this) && getGroups() == stats.getGroups() && getItems() == stats.getItems();
        }

        public int getGroups() {
            return this.groups;
        }

        public int getItems() {
            return this.items;
        }

        public int hashCode() {
            return ((getGroups() + 59) * 59) + getItems();
        }

        public void setGroups(int i2) {
            this.groups = i2;
        }

        public void setItems(int i2) {
            this.items = i2;
        }

        public String toString() {
            return "Group.Stats(groups=" + getGroups() + ", items=" + getItems() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof Group;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Group)) {
            return false;
        }
        Group group = (Group) obj;
        if (!group.canEqual(this) || getId() != group.getId()) {
            return false;
        }
        String name = getName();
        String name2 = group.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String title = getTitle();
        String title2 = group.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String icon = getIcon();
        String icon2 = group.getIcon();
        if (icon != null ? !icon.equals(icon2) : icon2 != null) {
            return false;
        }
        String graphic = getGraphic();
        String graphic2 = group.getGraphic();
        if (graphic != null ? !graphic.equals(graphic2) : graphic2 != null) {
            return false;
        }
        Date added = getAdded();
        Date added2 = group.getAdded();
        if (added != null ? !added.equals(added2) : added2 != null) {
            return false;
        }
        Date modified = getModified();
        Date modified2 = group.getModified();
        if (modified != null ? !modified.equals(modified2) : modified2 != null) {
            return false;
        }
        Parent parent = getParent();
        Parent parent2 = group.getParent();
        if (parent != null ? !parent.equals(parent2) : parent2 != null) {
            return false;
        }
        Stats stats = getStats();
        Stats stats2 = group.getStats();
        return stats != null ? stats.equals(stats2) : stats2 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getId() {
        return this.f8536id;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Parent getParent() {
        return this.parent;
    }

    public Stats getStats() {
        return this.stats;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        long id = getId();
        String name = getName();
        int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (name == null ? 43 : name.hashCode());
        String title = getTitle();
        int iHashCode2 = (iHashCode * 59) + (title == null ? 43 : title.hashCode());
        String icon = getIcon();
        int iHashCode3 = (iHashCode2 * 59) + (icon == null ? 43 : icon.hashCode());
        String graphic = getGraphic();
        int iHashCode4 = (iHashCode3 * 59) + (graphic == null ? 43 : graphic.hashCode());
        Date added = getAdded();
        int iHashCode5 = (iHashCode4 * 59) + (added == null ? 43 : added.hashCode());
        Date modified = getModified();
        int iHashCode6 = (iHashCode5 * 59) + (modified == null ? 43 : modified.hashCode());
        Parent parent = getParent();
        int iHashCode7 = (iHashCode6 * 59) + (parent == null ? 43 : parent.hashCode());
        Stats stats = getStats();
        return (iHashCode7 * 59) + (stats != null ? stats.hashCode() : 43);
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setGraphic(String str) {
        this.graphic = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(long j2) {
        this.f8536id = j2;
    }

    public void setModified(Date date) {
        this.modified = date;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "Group(id=" + getId() + ", name=" + getName() + ", title=" + getTitle() + ", icon=" + getIcon() + ", graphic=" + getGraphic() + ", added=" + getAdded() + ", modified=" + getModified() + ", parent=" + getParent() + ", stats=" + getStats() + ")";
    }
}
