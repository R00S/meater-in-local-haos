package cm.aptoide.p092pt.search.analytics;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.search.model.SearchQueryModel;
import cm.aptoide.p092pt.search.model.Source;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class SearchAnalytics {
    public static final String AB_SEARCH_ACTION = "AB_Search_Action";
    public static final String AB_SEARCH_IMPRESSION = "AB_Search_Impression";
    public static final String APP_CLICK = "Search_Results_App_View_Click";
    private static final String EMPTY = "empty";
    public static final String GAMES_CATEGORY = "games";
    public static final String NO_RESULTS = "Search_No_Results";
    public static final String SEARCH = "Search";
    public static final String SEARCH_RESULT_CLICK = "Search_Result_Click";
    public static final String SEARCH_START = "Search_Start";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    /* renamed from: cm.aptoide.pt.search.analytics.SearchAnalytics$1 */
    static /* synthetic */ class C41611 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$search$model$Source;

        static {
            int[] iArr = new int[Source.values().length];
            $SwitchMap$cm$aptoide$pt$search$model$Source = iArr;
            try {
                iArr[Source.FROM_TRENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$search$model$Source[Source.FROM_AUTOCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$search$model$Source[Source.DEEPLINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$search$model$Source[Source.MANUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static final class AttributeKey {
        private static final String AB_TEST_GROUP = "ab_test_group";
        private static final String AB_TEST_ID = "ab_test_uid";
        private static final String APP_AAB = "app_aab";
        private static final String APP_AAB_INSTALL_TIME = "app_aab_install_time";
        private static final String APP_APPC = "app_appc";
        private static final String APP_IN_CATAPPULT = "app_in_catappult";
        private static final String APP_IS_GAME = "app_is_game";
        private static final String APP_MIGRATION = "app_migration";
        private static final String APP_OBB = "app_obb";
        private static final String APP_VERSION_CODE = "app_version_code";
        private static final String IS_AD = "is_ad";
        private static final String KEYWORD_INPUT = "inserted_keyword";
        private static final String PACKAGE_NAME = "package_name";
        private static final String POSITION = "position";
        private static final String QUERY = "search_term";
        private static final String SEARCH_TERM_POSITION = "search_term_position";
        private static final String SEARCH_TERM_SOURCE = "search_term_source";
        private static final String SOURCE = "source";

        private AttributeKey() {
        }
    }

    public SearchAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private Map<String, Object> createMapData(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private String parseSource(Source source) {
        int i2 = C41611.$SwitchMap$cm$aptoide$pt$search$model$Source[source.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "manual" : DeepLinkIntentReceiver.DEEP_LINK : "autocomplete" : "trending";
    }

    public void search(SearchQueryModel searchQueryModel) {
        search(searchQueryModel, 0);
    }

    public void searchAppClick(SearchQueryModel searchQueryModel, String str, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, String str2) {
        HashMap map = new HashMap();
        map.put("search_term", searchQueryModel.getFinalQuery());
        map.put("package_name", str);
        map.put("is_ad", Boolean.FALSE);
        map.put("position", Integer.valueOf(i2));
        this.analyticsManager.logEvent(map, APP_CLICK, AnalyticsManager.Action.CLICK, getViewName(true));
        sendRakkamSearchResults(searchQueryModel, false, str, false, z, i2, z2, z3, z4, "no_info", i3, z5, str2);
    }

    public void searchFromSuggestion(SearchQueryModel searchQueryModel, int i2) {
        search(searchQueryModel, i2);
    }

    public void searchNoResults(SearchQueryModel searchQueryModel) {
        this.analyticsManager.logEvent(createMapData("search_term", searchQueryModel.getFinalQuery()), NO_RESULTS, AnalyticsManager.Action.CLICK, getViewName(false));
        sendRakkamSearchResults(searchQueryModel, true, null, false, false, 0, false, false, false, "no_info", 0, false, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void searchStart(SearchSource searchSource, boolean z) {
        this.analyticsManager.logEvent(createMapData("source", searchSource.getIdentifier()), SEARCH_START, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendRakkamSearchResults(SearchQueryModel searchQueryModel, boolean z, String str, boolean z2, boolean z3, int i2, boolean z4, boolean z5, boolean z6, String str2, int i3, boolean z7, String str3) {
        HashMap map = new HashMap();
        map.put("search_term", searchQueryModel.getFinalQuery());
        map.put("inserted_keyword", searchQueryModel.getUserQuery());
        map.put("search_term_source", parseSource(searchQueryModel.getSource()));
        if (z) {
            map.put("package_name", EMPTY);
            map.put("position", EMPTY);
            map.put("is_ad", EMPTY);
            map.put("app_appc", EMPTY);
            map.put("app_aab", EMPTY);
            map.put("app_migration", EMPTY);
            map.put("app_aab_install_time", EMPTY);
            map.put("app_version_code", EMPTY);
            map.put("app_obb", EMPTY);
            map.put("app_in_catappult", EMPTY);
            map.put("app_is_game", EMPTY);
        } else {
            map.put("package_name", str);
            map.put("position", Integer.valueOf(i2));
            map.put("is_ad", Boolean.valueOf(z2));
            map.put("app_appc", Boolean.valueOf(z3));
            map.put("app_aab", Boolean.valueOf(z5));
            map.put("app_migration", Boolean.valueOf(z4));
            map.put("app_aab_install_time", str2);
            map.put("app_version_code", Integer.valueOf(i3));
            map.put("app_obb", Boolean.valueOf(z6));
            map.put("app_in_catappult", Boolean.valueOf(z7));
            if (!str3.isEmpty()) {
                map.put("app_is_game", Boolean.valueOf(str3.equals("games")));
            }
        }
        this.analyticsManager.logEvent(map, SEARCH_RESULT_CLICK, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    private void search(SearchQueryModel searchQueryModel, int i2) {
        HashMap map = new HashMap();
        map.put("search_term", searchQueryModel.getFinalQuery());
        map.put("search_term_source", parseSource(searchQueryModel.getSource()));
        map.put("inserted_keyword", searchQueryModel.getUserQuery());
        if (searchQueryModel.getSource() != Source.MANUAL) {
            map.put("search_term_position", Integer.toString(i2));
        }
        this.analyticsManager.logEvent(map, SEARCH, AnalyticsManager.Action.CLICK, getViewName(false));
    }
}
