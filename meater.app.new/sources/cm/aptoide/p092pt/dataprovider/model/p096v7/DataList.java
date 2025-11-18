package cm.aptoide.p092pt.dataprovider.model.p096v7;

import java.util.List;

/* loaded from: classes.dex */
public class DataList<T> {
    private int count;
    private int hidden;
    private Integer limit;
    private List<T> list;
    private boolean loaded;
    private int next;
    private int offset;
    private int total;

    protected boolean canEqual(Object obj) {
        return obj instanceof DataList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataList)) {
            return false;
        }
        DataList dataList = (DataList) obj;
        if (!dataList.canEqual(this) || getTotal() != dataList.getTotal() || getCount() != dataList.getCount() || getOffset() != dataList.getOffset()) {
            return false;
        }
        Integer limit = getLimit();
        Integer limit2 = dataList.getLimit();
        if (limit != null ? !limit.equals(limit2) : limit2 != null) {
            return false;
        }
        if (getNext() != dataList.getNext() || getHidden() != dataList.getHidden() || isLoaded() != dataList.isLoaded()) {
            return false;
        }
        List<T> list = getList();
        List<T> list2 = dataList.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public int getCount() {
        return this.count;
    }

    public int getHidden() {
        return this.hidden;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public List<T> getList() {
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

    public int hashCode() {
        int total = ((((getTotal() + 59) * 59) + getCount()) * 59) + getOffset();
        Integer limit = getLimit();
        int iHashCode = (((((((total * 59) + (limit == null ? 43 : limit.hashCode())) * 59) + getNext()) * 59) + getHidden()) * 59) + (isLoaded() ? 79 : 97);
        List<T> list = getList();
        return (iHashCode * 59) + (list != null ? list.hashCode() : 43);
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public void setCount(int i2) {
        this.count = i2;
    }

    public void setHidden(int i2) {
        this.hidden = i2;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setLoaded(boolean z) {
        this.loaded = z;
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

    public String toString() {
        return "DataList(total=" + getTotal() + ", count=" + getCount() + ", offset=" + getOffset() + ", limit=" + getLimit() + ", next=" + getNext() + ", hidden=" + getHidden() + ", loaded=" + isLoaded() + ", list=" + getList() + ")";
    }
}
