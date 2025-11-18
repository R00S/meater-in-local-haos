package cm.aptoide.analytics.implementation.navigation;

import cm.aptoide.analytics.AnalyticsLogger;
import cm.aptoide.analytics.implementation.PageViewsAnalytics;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class NavigationTracker {
    private static final String TAG = "NavigationTracker";
    private List<ScreenTagHistory> historyList;
    private final AnalyticsLogger logger;
    private PageViewsAnalytics pageViewsAnalytics;
    private final ViewNameFilter viewNameFilter;

    public NavigationTracker(List<ScreenTagHistory> list, ViewNameFilter viewNameFilter, PageViewsAnalytics pageViewsAnalytics, AnalyticsLogger analyticsLogger) {
        this.historyList = list;
        this.viewNameFilter = viewNameFilter;
        this.pageViewsAnalytics = pageViewsAnalytics;
        this.logger = analyticsLogger;
    }

    private boolean filter(ScreenTagHistory screenTagHistory) {
        return this.viewNameFilter.filter(screenTagHistory.getFragment());
    }

    public ScreenTagHistory getCurrentScreen() {
        if (this.historyList.isEmpty()) {
            return new ScreenTagHistory();
        }
        return this.historyList.get(r0.size() - 1);
    }

    public String getCurrentViewName() {
        if (this.historyList.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return this.historyList.get(r0.size() - 1).getFragment();
    }

    public List<ScreenTagHistory> getHistoryList() {
        return this.historyList;
    }

    public String getPrettyScreenHistory() {
        StringBuilder sb = new StringBuilder();
        List<ScreenTagHistory> list = this.historyList;
        Collections.reverse(list);
        for (ScreenTagHistory screenTagHistory : list) {
            sb.append("[");
            sb.append(screenTagHistory.toString());
            sb.append("]");
        }
        return sb.toString();
    }

    public ScreenTagHistory getPreviousScreen() {
        if (this.historyList.size() < 2) {
            return new ScreenTagHistory();
        }
        List<ScreenTagHistory> list = this.historyList;
        return list.get(list.size() - 2);
    }

    public String getPreviousViewName() {
        if (this.historyList.size() < 2) {
            return "NoHistory";
        }
        List<ScreenTagHistory> list = this.historyList;
        return list.get(list.size() - 2).getFragment();
    }

    public String getViewName(boolean z) {
        try {
            return z ? getCurrentViewName() : getPreviousViewName();
        } catch (NullPointerException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public void registerScreen(ScreenTagHistory screenTagHistory) {
        if (screenTagHistory == null || !filter(screenTagHistory)) {
            return;
        }
        this.historyList.add(screenTagHistory);
        this.pageViewsAnalytics.sendPageViewedEvent(getViewName(true), getViewName(false), screenTagHistory.getStore());
        this.logger.logDebug(TAG, "NavigationTracker size: " + this.historyList.size() + "   Registering screen: " + screenTagHistory);
    }
}
