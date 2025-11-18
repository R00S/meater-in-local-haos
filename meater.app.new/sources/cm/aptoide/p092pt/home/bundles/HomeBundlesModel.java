package cm.aptoide.p092pt.home.bundles;

import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class HomeBundlesModel {
    private final boolean complete;
    private final Error error;
    private final List<HomeBundle> list;
    private final boolean loading;
    private final int offset;

    public enum Error {
        NETWORK,
        GENERIC
    }

    public HomeBundlesModel(Error error) {
        this.error = error;
        this.loading = false;
        this.list = Collections.emptyList();
        this.offset = -1;
        this.complete = true;
    }

    public Error getError() {
        return this.error;
    }

    public List<HomeBundle> getList() {
        return this.list;
    }

    public int getOffset() {
        return this.offset;
    }

    public boolean hasErrors() {
        return this.error != null;
    }

    public boolean isComplete() {
        return this.complete;
    }

    public boolean isListEmpty() {
        return this.list.isEmpty();
    }

    public boolean isLoading() {
        return this.loading;
    }

    public HomeBundlesModel(List<HomeBundle> list, boolean z, int i2, boolean z2) {
        this.list = list;
        this.loading = z;
        this.offset = i2;
        this.error = null;
        this.complete = z2;
    }

    public HomeBundlesModel(boolean z) {
        this.loading = z;
        this.list = Collections.emptyList();
        this.error = null;
        this.offset = -1;
        this.complete = false;
    }
}
