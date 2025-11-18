package cm.aptoide.p092pt.dataprovider.model.p096v7;

import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.p092pt.utils.AptoideUtils;

/* loaded from: classes.dex */
public enum Type {
    _EMPTY(1, true),
    APPS_GROUP(3, false),
    STORES_GROUP(3, false),
    FOLLOW_STORE(3, false),
    DISPLAYS(2, true),
    ADS(3, false),
    HOME_META(1, true),
    COMMENTS_GROUP(1, true),
    APPCOINS_ADS(3, false),
    APPS_TOP_GROUP(3, false),
    APPCOINS_FEATURED(3, false),
    REVIEWS_GROUP(1, false),
    STORE_META(1, true),
    MY_STORE_META(1, true),
    MY_STORES_SUBSCRIBED(3, false),
    STORES_RECOMMENDED(3, false),
    MY_STORE(1, true),
    ACTION_ITEM(1, true),
    NEWS_ITEM(1, true),
    NEW_APP(1, false),
    NEW_APP_VERSION(1, false),
    IN_GAME_EVENT(1, true),
    APP_COMING_SOON(1, true);

    private final int defaultPerLineCount;
    private final boolean fixedPerLineCount;

    Type(int i2, boolean z) {
        this.defaultPerLineCount = i2;
        this.fixedPerLineCount = z;
    }

    public int getDefaultPerLineCount() {
        return this.defaultPerLineCount;
    }

    public int getPerLineCount(Resources resources, WindowManager windowManager) {
        int defaultPerLineCount = isFixedPerLineCount() ? getDefaultPerLineCount() : (int) ((AptoideUtils.ScreenU.getScreenWidthInDip(windowManager, resources) / 360.0f) * getDefaultPerLineCount());
        if (defaultPerLineCount > 0) {
            return defaultPerLineCount;
        }
        return 1;
    }

    public boolean isFixedPerLineCount() {
        return this.fixedPerLineCount;
    }
}
