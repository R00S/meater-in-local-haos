package cm.aptoide.p092pt.dataprovider.model.p096v7;

import java.util.List;

/* loaded from: classes.dex */
public class BaseV7EndlessListResponse<T> extends BaseV7EndlessResponse {
    private List<T> list;

    public BaseV7EndlessListResponse() {
        super(false);
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    protected boolean canEqual(Object obj) {
        return obj instanceof BaseV7EndlessListResponse;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV7EndlessListResponse)) {
            return false;
        }
        BaseV7EndlessListResponse baseV7EndlessListResponse = (BaseV7EndlessListResponse) obj;
        if (!baseV7EndlessListResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<T> list = getList();
        List<T> list2 = baseV7EndlessListResponse.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public List<T> getList() {
        return this.list;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse
    public int getNextSize() {
        return this.list != null ? 10 : 0;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse
    public int getTotal() {
        List<T> list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse
    public boolean hasData() {
        return this.list != null;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse, cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        List<T> list = getList();
        return (iHashCode * 59) + (list == null ? 43 : list.hashCode());
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override // cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response
    public String toString() {
        return "BaseV7EndlessListResponse(list=" + getList() + ")";
    }
}
