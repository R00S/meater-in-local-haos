package cm.aptoide.p092pt.editorialList;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class EditorialCardListModel {
    private final List<CurationCard> curationCards;
    private final Error error;
    private final boolean loading;
    private final int offset;
    private final int total;

    public enum Error {
        NETWORK,
        GENERIC
    }

    public EditorialCardListModel(Error error) {
        this.error = error;
        this.loading = false;
        this.offset = 0;
        this.total = 0;
        this.curationCards = Collections.emptyList();
    }

    public List<CurationCard> getCurationCards() {
        return this.curationCards;
    }

    public Error getError() {
        return this.error;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public EditorialCardListModel(boolean z) {
        this.loading = z;
        this.error = null;
        this.offset = 0;
        this.total = 0;
        this.curationCards = Collections.emptyList();
    }

    public EditorialCardListModel(List<CurationCard> list, int i2, int i3) {
        this.curationCards = list;
        this.offset = i2;
        this.total = i3;
        this.error = null;
        this.loading = false;
    }
}
