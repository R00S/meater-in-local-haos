package cm.aptoide.p092pt.store.view.p104my;

import android.content.Context;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class StoreDisplayable extends Displayable {
    private int firstStatsLabel;
    private long firstStatsNumber;
    private boolean isLongTime;
    private String message;
    private int secondStatsLabel;
    private long secondStatsNumber;
    private boolean statsClickable;
    private Store store;
    private StoreContext storeContext;
    private int textColor;

    public StoreDisplayable() {
    }

    private String getStoreDescription() {
        return this.message;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getExploreButtonText() {
        return this.isLongTime ? C1146R.string.create_store_displayable_explore_long_term_button : C1146R.string.create_store_displayable_explore_button;
    }

    int getFirstStatsLabel() {
        return this.firstStatsLabel;
    }

    long getFirstStatsNumber() {
        return this.firstStatsNumber;
    }

    int getSecondStatsLabel() {
        return this.secondStatsLabel;
    }

    long getSecondStatsNumber() {
        return this.secondStatsNumber;
    }

    public Store getStore() {
        return this.store;
    }

    public StoreContext getStoreContext() {
        return this.storeContext;
    }

    public String getSuggestionMessage(Context context) {
        return this.isLongTime ? getStoreDescription() : context.getString(C1146R.string.create_store_displayable_explore_message);
    }

    public int getTextColor() {
        return this.textColor;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.store_displayable_layout;
    }

    public boolean isStatsClickable() {
        return this.statsClickable;
    }

    public StoreDisplayable(Store store, StoreContext storeContext, long j2, long j3, int i2, int i3, boolean z, String str, int i4) {
        this.store = store;
        this.storeContext = storeContext;
        this.firstStatsNumber = j2;
        this.secondStatsNumber = j3;
        this.firstStatsLabel = i2;
        this.secondStatsLabel = i3;
        this.statsClickable = z;
        this.message = str;
        this.textColor = i4;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.add(5, -7);
        this.isLongTime = store.getAdded().before(calendar.getTime());
    }
}
