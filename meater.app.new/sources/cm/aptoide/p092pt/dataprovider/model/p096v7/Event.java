package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.GetStoreWidgets;

/* loaded from: classes.dex */
public class Event {
    private String action;
    private GetStoreWidgets.WSWidget.Data data;
    private Name name;
    private Type type;

    public enum Name {
        listApps,
        listStores,
        getUser,
        getStore,
        getStoreWidgets,
        getMoreBundle,
        listReviews,
        listComments,
        getMyStoresSubscribed,
        getStoresRecommended,
        myStores,
        myUpdates,
        myExcludedUpdates,
        getAds,
        myDownloads,
        getAppCoinsAds,
        eSkills,
        facebook,
        twitch,
        twitter,
        youtube,
        getReviews
    }

    public enum Type {
        API,
        CLIENT,
        v3
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof Event;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (!event.canEqual(this)) {
            return false;
        }
        Type type = getType();
        Type type2 = event.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Name name = getName();
        Name name2 = event.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String action = getAction();
        String action2 = event.getAction();
        if (action != null ? !action.equals(action2) : action2 != null) {
            return false;
        }
        GetStoreWidgets.WSWidget.Data data = getData();
        GetStoreWidgets.WSWidget.Data data2 = event.getData();
        return data == null ? data2 == null : data.equals(data2);
    }

    public String getAction() {
        return this.action;
    }

    public GetStoreWidgets.WSWidget.Data getData() {
        return this.data;
    }

    public Name getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type = getType();
        int iHashCode = type == null ? 43 : type.hashCode();
        Name name = getName();
        int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
        String action = getAction();
        int iHashCode3 = (iHashCode2 * 59) + (action == null ? 43 : action.hashCode());
        GetStoreWidgets.WSWidget.Data data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public Event setAction(String str) {
        this.action = str;
        return this;
    }

    public Event setData(GetStoreWidgets.WSWidget.Data data) {
        this.data = data;
        return this;
    }

    public Event setName(Name name) {
        this.name = name;
        return this;
    }

    public Event setType(Type type) {
        this.type = type;
        return this;
    }

    public String toString() {
        return "Event(type=" + getType() + ", name=" + getName() + ", action=" + getAction() + ", data=" + getData() + ")";
    }
}
