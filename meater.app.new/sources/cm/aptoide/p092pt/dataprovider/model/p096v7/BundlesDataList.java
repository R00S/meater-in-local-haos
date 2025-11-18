package cm.aptoide.p092pt.dataprovider.model.p096v7;

import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import java.util.List;

/* loaded from: classes.dex */
public class BundlesDataList {
    private int count;
    private Integer limit;
    private List<Bundle> list;
    private int next;
    private int offset;
    private int total;

    public static class Bundle {
        private List<App> apps;
        private String tag;
        private String title;
        private String type;

        public List<App> getApps() {
            return this.apps;
        }

        public String getTag() {
            return this.tag;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setApps(List<App> list) {
            this.apps = list;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public int getCount() {
        return this.count;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public List<Bundle> getList() {
        return this.list;
    }

    public int getNext() {
        return this.next;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getTotal() {
        return this.total;
    }

    public void setCount(int i2) {
        this.count = i2;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setList(List<Bundle> list) {
        this.list = list;
    }

    public void setNext(int i2) {
        this.next = i2;
    }

    public void setOffset(int i2) {
        this.offset = i2;
    }

    public void setTotal(int i2) {
        this.total = i2;
    }
}
