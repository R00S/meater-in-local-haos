package cm.aptoide.p092pt.dataprovider.model.p096v7.store;

import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import java.util.List;

/* loaded from: classes.dex */
public class GetStoreDisplays extends BaseV7Response {
    private List<EventImage> list;

    public static class EventImage {
        private Event event;
        private String graphic;
        private String label;

        protected boolean canEqual(Object obj) {
            return obj instanceof EventImage;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventImage)) {
                return false;
            }
            EventImage eventImage = (EventImage) obj;
            if (!eventImage.canEqual(this)) {
                return false;
            }
            String label = getLabel();
            String label2 = eventImage.getLabel();
            if (label != null ? !label.equals(label2) : label2 != null) {
                return false;
            }
            String graphic = getGraphic();
            String graphic2 = eventImage.getGraphic();
            if (graphic != null ? !graphic.equals(graphic2) : graphic2 != null) {
                return false;
            }
            Event event = getEvent();
            Event event2 = eventImage.getEvent();
            return event != null ? event.equals(event2) : event2 == null;
        }

        public Event getEvent() {
            return this.event;
        }

        public String getGraphic() {
            return this.graphic;
        }

        public String getLabel() {
            return this.label;
        }

        public int hashCode() {
            String label = getLabel();
            int iHashCode = label == null ? 43 : label.hashCode();
            String graphic = getGraphic();
            int iHashCode2 = ((iHashCode + 59) * 59) + (graphic == null ? 43 : graphic.hashCode());
            Event event = getEvent();
            return (iHashCode2 * 59) + (event != null ? event.hashCode() : 43);
        }

        public void setEvent(Event event) {
            this.event = event;
        }

        public void setGraphic(String str) {
            this.graphic = str;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public String toString() {
            return "GetStoreDisplays.EventImage(label=" + getLabel() + ", graphic=" + getGraphic() + ", event=" + getEvent() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetStoreDisplays;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStoreDisplays)) {
            return false;
        }
        GetStoreDisplays getStoreDisplays = (GetStoreDisplays) obj;
        if (!getStoreDisplays.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<EventImage> list = getList();
        List<EventImage> list2 = getStoreDisplays.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public List<EventImage> getList() {
        return this.list;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        List<EventImage> list = getList();
        return (iHashCode * 59) + (list == null ? 43 : list.hashCode());
    }

    public void setList(List<EventImage> list) {
        this.list = list;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetStoreDisplays(list=" + getList() + ")";
    }
}
