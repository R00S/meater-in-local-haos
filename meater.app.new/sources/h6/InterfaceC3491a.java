package h6;

import W5.b;
import e6.RecipeAnalyticsRequest;
import e6.RecipeAnalyticsResponse;
import e6.RecipeFilterRemote;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import nd.s;
import oc.E;
import pd.f;
import pd.k;
import pd.o;
import ta.InterfaceC4588d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\tJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh6/a;", "", "", "locale", "Lnd/s;", "Ljava/util/ArrayList;", "Le6/n;", "Lkotlin/collections/ArrayList;", "b", "(Ljava/lang/String;Lta/d;)Ljava/lang/Object;", "Loc/E;", "c", "", "Le6/l;", "request", "Le6/m;", "a", "(Ljava/util/List;Lta/d;)Ljava/lang/Object;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3491a {
    @W5.a(b.f18425C)
    @o("/v2/masterclass/analytics/bulk")
    Object a(@pd.a List<RecipeAnalyticsRequest> list, InterfaceC4588d<? super s<RecipeAnalyticsResponse>> interfaceC4588d);

    @W5.a(b.f18426D)
    @f("/{locale}/filters")
    @k({"Should-Cache:true"})
    Object b(@pd.s("locale") String str, InterfaceC4588d<? super s<ArrayList<RecipeFilterRemote>>> interfaceC4588d);

    @W5.a(b.f18426D)
    @f("/{locale}")
    @k({"Should-Cache:true"})
    Object c(@pd.s("locale") String str, InterfaceC4588d<? super s<E>> interfaceC4588d);
}
