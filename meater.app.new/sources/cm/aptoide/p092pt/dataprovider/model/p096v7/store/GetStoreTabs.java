package cm.aptoide.p092pt.dataprovider.model.p096v7.store;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import java.util.List;

/* loaded from: classes.dex */
public class GetStoreTabs extends BaseV7Response {
    private List<Tab> list;

    public static class Tab {
        private Event event;
        private String label;
        private String tag;

        protected boolean canEqual(Object obj) {
            return obj instanceof Tab;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) obj;
            if (!tab.canEqual(this)) {
                return false;
            }
            String label = getLabel();
            String label2 = tab.getLabel();
            if (label != null ? !label.equals(label2) : label2 != null) {
                return false;
            }
            String tag = getTag();
            String tag2 = tab.getTag();
            if (tag != null ? !tag.equals(tag2) : tag2 != null) {
                return false;
            }
            Event event = getEvent();
            Event event2 = tab.getEvent();
            return event != null ? event.equals(event2) : event2 == null;
        }

        public Event getEvent() {
            return this.event;
        }

        public String getLabel() {
            return this.label;
        }

        public String getTag() {
            return this.tag;
        }

        public int hashCode() {
            String label = getLabel();
            int iHashCode = label == null ? 43 : label.hashCode();
            String tag = getTag();
            int iHashCode2 = ((iHashCode + 59) * 59) + (tag == null ? 43 : tag.hashCode());
            Event event = getEvent();
            return (iHashCode2 * 59) + (event != null ? event.hashCode() : 43);
        }

        public void setEvent(Event event) {
            this.event = event;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public String toString() {
            return "GetStoreTabs.Tab(label=" + getLabel() + ", tag=" + getTag() + ", event=" + getEvent() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetStoreTabs;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStoreTabs)) {
            return false;
        }
        GetStoreTabs getStoreTabs = (GetStoreTabs) obj;
        if (!getStoreTabs.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<Tab> list = getList();
        List<Tab> list2 = getStoreTabs.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public List<Tab> getList() {
        return this.list;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        List<Tab> list = getList();
        return (iHashCode * 59) + (list == null ? 43 : list.hashCode());
    }

    public void setList(List<Tab> list) {
        this.list = list;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetStoreTabs(list=" + getList() + ")";
    }
}
