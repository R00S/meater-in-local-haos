package cm.aptoide.p092pt.view.app;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AppsList {
    private final Error error;
    private final List<Application> list;
    private final boolean loading;
    private final int offset;

    public enum Error {
        NETWORK,
        GENERIC
    }

    public AppsList(Error error) {
        this.error = error;
        this.loading = false;
        this.list = Collections.emptyList();
        this.offset = -1;
    }

    public Error getError() {
        return this.error;
    }

    public List<Application> getList() {
        return this.list;
    }

    public int getOffset() {
        return this.offset;
    }

    public boolean hasErrors() {
        return this.error != null;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public AppsList(List<Application> list, boolean z, int i2) {
        this.list = list;
        this.loading = z;
        this.offset = i2;
        this.error = null;
    }

    public AppsList(boolean z) {
        this.loading = z;
        this.list = Collections.emptyList();
        this.error = null;
        this.offset = -1;
    }
}
