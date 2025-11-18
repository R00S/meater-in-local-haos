package cm.aptoide.p092pt.store.view;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.themes.StoreTheme;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class StoreAddCommentDisplayable extends Displayable {
    private final int raisedButtonDrawable;
    private final long storeId;
    private final String storeName;
    private final StoreTheme storeTheme;

    public StoreAddCommentDisplayable() {
        this.storeId = -1L;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeTheme = StoreTheme.DEFAULT;
        this.raisedButtonDrawable = C1146R.drawable.aptoide_gradient_rounded;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getRaisedButtonDrawable() {
        return this.raisedButtonDrawable;
    }

    public long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public StoreTheme getStoreTheme() {
        return this.storeTheme;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.displayable_grid_add_store_comment;
    }

    public StoreAddCommentDisplayable(long j2, String str, StoreTheme storeTheme, int i2) {
        this.storeId = j2;
        this.storeName = str;
        this.storeTheme = storeTheme;
        this.raisedButtonDrawable = i2;
    }
}
