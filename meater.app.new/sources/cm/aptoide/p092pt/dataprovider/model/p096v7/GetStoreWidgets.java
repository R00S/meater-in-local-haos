package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.Review;
import java.util.List;

/* loaded from: classes.dex */
public class GetStoreWidgets extends BaseV7EndlessDataListResponse<WSWidget> {

    public static class WSWidget {
        public static final String ADS_TYPE = "ADS";
        public static final String APPS_GROUP_TYPE = "APPS_GROUP";
        public static final String CATEGORIES_TYPE = "DISPLAYS";
        public static final String COMMENTS_TYPE = "COMMENTS";
        public static final String REVIEWS_TYPE = "REVIEWS";
        public static final String STORE_GROUP = "STORES_GROUP";
        public static final String TIMELINE_TYPE = "TIMELINE";
        private List<Action> actions;
        private Data data;
        private String tag;
        private String title;
        private Type type;
        private String view;
        private Object viewObject;

        public static class Action {
            private Event event;
            private String label;
            private String tag;
            private String type;

            protected boolean canEqual(Object obj) {
                return obj instanceof Action;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                if (!action.canEqual(this)) {
                    return false;
                }
                String type = getType();
                String type2 = action.getType();
                if (type != null ? !type.equals(type2) : type2 != null) {
                    return false;
                }
                String label = getLabel();
                String label2 = action.getLabel();
                if (label != null ? !label.equals(label2) : label2 != null) {
                    return false;
                }
                String tag = getTag();
                String tag2 = action.getTag();
                if (tag != null ? !tag.equals(tag2) : tag2 != null) {
                    return false;
                }
                Event event = getEvent();
                Event event2 = action.getEvent();
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

            public String getType() {
                return this.type;
            }

            public int hashCode() {
                String type = getType();
                int iHashCode = type == null ? 43 : type.hashCode();
                String label = getLabel();
                int iHashCode2 = ((iHashCode + 59) * 59) + (label == null ? 43 : label.hashCode());
                String tag = getTag();
                int iHashCode3 = (iHashCode2 * 59) + (tag == null ? 43 : tag.hashCode());
                Event event = getEvent();
                return (iHashCode3 * 59) + (event != null ? event.hashCode() : 43);
            }

            public Action setEvent(Event event) {
                this.event = event;
                return this;
            }

            public Action setLabel(String str) {
                this.label = str;
                return this;
            }

            public Action setTag(String str) {
                this.tag = str;
                return this;
            }

            public Action setType(String str) {
                this.type = str;
                return this;
            }

            public String toString() {
                return "GetStoreWidgets.WSWidget.Action(type=" + getType() + ", label=" + getLabel() + ", tag=" + getTag() + ", event=" + getEvent() + ")";
            }
        }

        public static class Data {
            private List<Categories> categories;
            private String icon;
            private Layout layout;
            private String message;
            private Review.User user;

            public static class Categories {
                private int adsCount;
                private String graphic;
                private String icon;

                /* renamed from: id */
                private long f8534id;
                private String name;
                private String parentId;
                private String parentRefId;
                private String refId;

                protected boolean canEqual(Object obj) {
                    return obj instanceof Categories;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Categories)) {
                        return false;
                    }
                    Categories categories = (Categories) obj;
                    if (!categories.canEqual(this) || getId() != categories.getId()) {
                        return false;
                    }
                    String refId = getRefId();
                    String refId2 = categories.getRefId();
                    if (refId != null ? !refId.equals(refId2) : refId2 != null) {
                        return false;
                    }
                    String parentId = getParentId();
                    String parentId2 = categories.getParentId();
                    if (parentId != null ? !parentId.equals(parentId2) : parentId2 != null) {
                        return false;
                    }
                    String parentRefId = getParentRefId();
                    String parentRefId2 = categories.getParentRefId();
                    if (parentRefId != null ? !parentRefId.equals(parentRefId2) : parentRefId2 != null) {
                        return false;
                    }
                    String name = getName();
                    String name2 = categories.getName();
                    if (name != null ? !name.equals(name2) : name2 != null) {
                        return false;
                    }
                    String graphic = getGraphic();
                    String graphic2 = categories.getGraphic();
                    if (graphic != null ? !graphic.equals(graphic2) : graphic2 != null) {
                        return false;
                    }
                    String icon = getIcon();
                    String icon2 = categories.getIcon();
                    if (icon != null ? icon.equals(icon2) : icon2 == null) {
                        return getAdsCount() == categories.getAdsCount();
                    }
                    return false;
                }

                public int getAdsCount() {
                    return this.adsCount;
                }

                public String getGraphic() {
                    return this.graphic;
                }

                public String getIcon() {
                    return this.icon;
                }

                public long getId() {
                    return this.f8534id;
                }

                public String getName() {
                    return this.name;
                }

                public String getParentId() {
                    return this.parentId;
                }

                public String getParentRefId() {
                    return this.parentRefId;
                }

                public String getRefId() {
                    return this.refId;
                }

                public int hashCode() {
                    long id = getId();
                    String refId = getRefId();
                    int iHashCode = ((((int) (id ^ (id >>> 32))) + 59) * 59) + (refId == null ? 43 : refId.hashCode());
                    String parentId = getParentId();
                    int iHashCode2 = (iHashCode * 59) + (parentId == null ? 43 : parentId.hashCode());
                    String parentRefId = getParentRefId();
                    int iHashCode3 = (iHashCode2 * 59) + (parentRefId == null ? 43 : parentRefId.hashCode());
                    String name = getName();
                    int iHashCode4 = (iHashCode3 * 59) + (name == null ? 43 : name.hashCode());
                    String graphic = getGraphic();
                    int iHashCode5 = (iHashCode4 * 59) + (graphic == null ? 43 : graphic.hashCode());
                    String icon = getIcon();
                    return (((iHashCode5 * 59) + (icon != null ? icon.hashCode() : 43)) * 59) + getAdsCount();
                }

                public Categories setAdsCount(int i2) {
                    this.adsCount = i2;
                    return this;
                }

                public Categories setGraphic(String str) {
                    this.graphic = str;
                    return this;
                }

                public Categories setIcon(String str) {
                    this.icon = str;
                    return this;
                }

                public Categories setId(long j2) {
                    this.f8534id = j2;
                    return this;
                }

                public Categories setName(String str) {
                    this.name = str;
                    return this;
                }

                public Categories setParentId(String str) {
                    this.parentId = str;
                    return this;
                }

                public Categories setParentRefId(String str) {
                    this.parentRefId = str;
                    return this;
                }

                public Categories setRefId(String str) {
                    this.refId = str;
                    return this;
                }

                public String toString() {
                    return "GetStoreWidgets.WSWidget.Data.Categories(id=" + getId() + ", refId=" + getRefId() + ", parentId=" + getParentId() + ", parentRefId=" + getParentRefId() + ", name=" + getName() + ", graphic=" + getGraphic() + ", icon=" + getIcon() + ", adsCount=" + getAdsCount() + ")";
                }
            }

            protected boolean canEqual(Object obj) {
                return obj instanceof Data;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                if (!data.canEqual(this)) {
                    return false;
                }
                Layout layout = getLayout();
                Layout layout2 = data.getLayout();
                if (layout != null ? !layout.equals(layout2) : layout2 != null) {
                    return false;
                }
                String icon = getIcon();
                String icon2 = data.getIcon();
                if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                    return false;
                }
                String message = getMessage();
                String message2 = data.getMessage();
                if (message != null ? !message.equals(message2) : message2 != null) {
                    return false;
                }
                List<Categories> categories = getCategories();
                List<Categories> categories2 = data.getCategories();
                if (categories != null ? !categories.equals(categories2) : categories2 != null) {
                    return false;
                }
                Review.User user = getUser();
                Review.User user2 = data.getUser();
                return user != null ? user.equals(user2) : user2 == null;
            }

            public List<Categories> getCategories() {
                return this.categories;
            }

            public String getIcon() {
                return this.icon;
            }

            public Layout getLayout() {
                return this.layout;
            }

            public String getMessage() {
                return this.message;
            }

            public Review.User getUser() {
                return this.user;
            }

            public int hashCode() {
                Layout layout = getLayout();
                int iHashCode = layout == null ? 43 : layout.hashCode();
                String icon = getIcon();
                int iHashCode2 = ((iHashCode + 59) * 59) + (icon == null ? 43 : icon.hashCode());
                String message = getMessage();
                int iHashCode3 = (iHashCode2 * 59) + (message == null ? 43 : message.hashCode());
                List<Categories> categories = getCategories();
                int iHashCode4 = (iHashCode3 * 59) + (categories == null ? 43 : categories.hashCode());
                Review.User user = getUser();
                return (iHashCode4 * 59) + (user != null ? user.hashCode() : 43);
            }

            public Data setCategories(List<Categories> list) {
                this.categories = list;
                return this;
            }

            public Data setIcon(String str) {
                this.icon = str;
                return this;
            }

            public Data setLayout(Layout layout) {
                this.layout = layout;
                return this;
            }

            public Data setMessage(String str) {
                this.message = str;
                return this;
            }

            public Data setUser(Review.User user) {
                this.user = user;
                return this;
            }

            public String toString() {
                return "GetStoreWidgets.WSWidget.Data(layout=" + getLayout() + ", icon=" + getIcon() + ", message=" + getMessage() + ", categories=" + getCategories() + ", user=" + getUser() + ")";
            }
        }

        protected boolean canEqual(Object obj) {
            return obj instanceof WSWidget;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WSWidget)) {
                return false;
            }
            WSWidget wSWidget = (WSWidget) obj;
            if (!wSWidget.canEqual(this)) {
                return false;
            }
            Type type = getType();
            Type type2 = wSWidget.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            String title = getTitle();
            String title2 = wSWidget.getTitle();
            if (title != null ? !title.equals(title2) : title2 != null) {
                return false;
            }
            String tag = getTag();
            String tag2 = wSWidget.getTag();
            if (tag != null ? !tag.equals(tag2) : tag2 != null) {
                return false;
            }
            String view = getView();
            String view2 = wSWidget.getView();
            if (view != null ? !view.equals(view2) : view2 != null) {
                return false;
            }
            Object viewObject = getViewObject();
            Object viewObject2 = wSWidget.getViewObject();
            if (viewObject != null ? !viewObject.equals(viewObject2) : viewObject2 != null) {
                return false;
            }
            List<Action> actions = getActions();
            List<Action> actions2 = wSWidget.getActions();
            if (actions != null ? !actions.equals(actions2) : actions2 != null) {
                return false;
            }
            Data data = getData();
            Data data2 = wSWidget.getData();
            return data != null ? data.equals(data2) : data2 == null;
        }

        public List<Action> getActions() {
            return this.actions;
        }

        public Data getData() {
            return this.data;
        }

        public String getTag() {
            return this.tag;
        }

        public String getTitle() {
            return this.title;
        }

        public Type getType() {
            return this.type;
        }

        public String getView() {
            return this.view;
        }

        public Object getViewObject() {
            return this.viewObject;
        }

        public boolean hasActions() {
            List<Action> list = this.actions;
            return (list == null || list.size() <= 0 || this.actions.get(0).getEvent().getName() == null) ? false : true;
        }

        public int hashCode() {
            Type type = getType();
            int iHashCode = type == null ? 43 : type.hashCode();
            String title = getTitle();
            int iHashCode2 = ((iHashCode + 59) * 59) + (title == null ? 43 : title.hashCode());
            String tag = getTag();
            int iHashCode3 = (iHashCode2 * 59) + (tag == null ? 43 : tag.hashCode());
            String view = getView();
            int iHashCode4 = (iHashCode3 * 59) + (view == null ? 43 : view.hashCode());
            Object viewObject = getViewObject();
            int iHashCode5 = (iHashCode4 * 59) + (viewObject == null ? 43 : viewObject.hashCode());
            List<Action> actions = getActions();
            int iHashCode6 = (iHashCode5 * 59) + (actions == null ? 43 : actions.hashCode());
            Data data = getData();
            return (iHashCode6 * 59) + (data != null ? data.hashCode() : 43);
        }

        public WSWidget setActions(List<Action> list) {
            this.actions = list;
            return this;
        }

        public WSWidget setData(Data data) {
            this.data = data;
            return this;
        }

        public WSWidget setTag(String str) {
            this.tag = str;
            return this;
        }

        public WSWidget setTitle(String str) {
            this.title = str;
            return this;
        }

        public WSWidget setType(Type type) {
            this.type = type;
            return this;
        }

        public WSWidget setView(String str) {
            this.view = str;
            return this;
        }

        public WSWidget setViewObject(Object obj) {
            this.viewObject = obj;
            return this;
        }

        public String toString() {
            return "GetStoreWidgets.WSWidget(type=" + getType() + ", title=" + getTitle() + ", tag=" + getTag() + ", view=" + getView() + ", viewObject=" + getViewObject() + ", actions=" + getActions() + ", data=" + getData() + ")";
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof GetStoreWidgets;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetStoreWidgets) && ((GetStoreWidgets) obj).canEqual(this) && super.equals(obj);
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        return 59 + super.hashCode();
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessDataListResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "GetStoreWidgets()";
    }
}
