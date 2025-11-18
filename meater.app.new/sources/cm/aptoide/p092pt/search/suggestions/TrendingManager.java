package cm.aptoide.p092pt.search.suggestions;

import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.listapp.App;
import cm.aptoide.p092pt.search.model.Suggestion;
import java.util.List;
import p456rx.Single;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class TrendingManager {
    private static final int SUGGESTION_COUNT = 10;
    private static final int SUGGESTION_STORE_ID = 15;
    private final TrendingService trendingService;

    public TrendingManager(TrendingService trendingService) {
        this.trendingService = trendingService;
    }

    static /* synthetic */ Iterable lambda$getTrendingCursorSuggestions$4(List list) {
        return list;
    }

    static /* synthetic */ Iterable lambda$getTrendingListSuggestions$1(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapToSuggestion, reason: merged with bridge method [inline-methods] */
    public Suggestion m8627a(App app) {
        return new Suggestion(app.getName(), app.getIcon());
    }

    public Single<List<String>> getTrendingCursorSuggestions() {
        return this.trendingService.getTrendingApps(10, 15).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.suggestions.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((ListApps) obj).getDataList().getList();
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.suggestions.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                TrendingManager.lambda$getTrendingCursorSuggestions$4(list);
                return list;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.suggestions.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((App) obj).getName();
            }
        }).m40084Y0().m40057E().m40085Z0();
    }

    public Single<List<Suggestion>> getTrendingListSuggestions() {
        return this.trendingService.getTrendingApps(10, 15).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.suggestions.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((ListApps) obj).getDataList().getList();
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.suggestions.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                TrendingManager.lambda$getTrendingListSuggestions$1(list);
                return list;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.suggestions.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11026f.m8627a((App) obj);
            }
        }).m40084Y0().m40057E().m40085Z0();
    }
}
