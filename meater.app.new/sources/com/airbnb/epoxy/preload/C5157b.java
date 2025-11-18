package com.airbnb.epoxy.preload;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AbstractC5133d;
import com.airbnb.epoxy.AbstractC5149l;
import com.airbnb.epoxy.AbstractC5153n;
import com.airbnb.epoxy.AbstractC5166s;
import com.airbnb.epoxy.C5128a0;
import com.airbnb.epoxy.C5154o;
import com.airbnb.epoxy.preload.InterfaceC5158c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10775u;
import kotlin.TypeCastException;
import kotlin.collections.C10782c0;
import kotlin.collections.C10808p0;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;

/* compiled from: EpoxyPreloader.kt */
/* renamed from: com.airbnb.epoxy.preload.b */
/* loaded from: classes.dex */
public final class C5157b<P extends InterfaceC5158c> extends RecyclerView.AbstractC0607t {

    /* renamed from: a */
    public static final a f12265a = new a(null);

    /* renamed from: b */
    private IntRange f12266b;

    /* renamed from: c */
    private IntProgression f12267c;

    /* renamed from: d */
    private int f12268d;

    /* renamed from: e */
    private int f12269e;

    /* renamed from: f */
    private final Map<Class<? extends AbstractC5166s<?>>, AbstractC5156a<?, ?, ? extends P>> f12270f;

    /* renamed from: g */
    private final C5159d<P> f12271g;

    /* renamed from: h */
    private final C5161f f12272h;

    /* renamed from: i */
    private final AbstractC5133d f12273i;

    /* renamed from: j */
    private final int f12274j;

    /* compiled from: EpoxyPreloader.kt */
    /* renamed from: com.airbnb.epoxy.preload.b$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final <P extends InterfaceC5158c> C5157b<P> m9339a(AbstractC5149l abstractC5149l, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10775u> function2, int i2, List<? extends AbstractC5156a<? extends AbstractC5166s<?>, ? extends InterfaceC5163h, ? extends P>> list) {
            C9801m.m32347g(abstractC5149l, "epoxyAdapter");
            C9801m.m32347g(function0, "requestHolderFactory");
            C9801m.m32347g(function2, "errorHandler");
            C9801m.m32347g(list, "modelPreloaders");
            return new C5157b<>(abstractC5149l, (Function0) function0, function2, i2, (List) list);
        }

        /* renamed from: b */
        public final <P extends InterfaceC5158c> C5157b<P> m9340b(AbstractC5153n abstractC5153n, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10775u> function2, int i2, List<? extends AbstractC5156a<? extends AbstractC5166s<?>, ? extends InterfaceC5163h, ? extends P>> list) {
            C9801m.m32347g(abstractC5153n, "epoxyController");
            C9801m.m32347g(function0, "requestHolderFactory");
            C9801m.m32347g(function2, "errorHandler");
            C9801m.m32347g(list, "modelPreloaders");
            return new C5157b<>(abstractC5153n, function0, function2, i2, list);
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    private C5157b(AbstractC5133d abstractC5133d, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10775u> function2, int i2, List<? extends AbstractC5156a<?, ?, ? extends P>> list) {
        this.f12273i = abstractC5133d;
        this.f12274j = i2;
        IntRange.a aVar = IntRange.f37222j;
        this.f12266b = aVar.m32402a();
        this.f12267c = aVar.m32402a();
        this.f12268d = -1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C9848l.m32419b(C10808p0.m38793e(C10819v.m38911u(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(((AbstractC5156a) obj).m9329b(), obj);
        }
        this.f12270f = linkedHashMap;
        this.f12271g = new C5159d<>(this.f12274j, function0);
        this.f12272h = new C5161f(this.f12273i, function2);
        if (this.f12274j > 0) {
            return;
        }
        throw new IllegalArgumentException(("maxItemsToPreload must be greater than 0. Was " + this.f12274j).toString());
    }

    /* renamed from: a */
    private final IntProgression m9333a(int i2, int i3, boolean z) {
        int i4 = z ? i3 + 1 : i2 - 1;
        int i5 = this.f12274j;
        return IntProgression.f37214f.m32396a(m9334c(i4), m9334c((z ? i5 - 1 : 1 - i5) + i4), z ? 1 : -1);
    }

    /* renamed from: c */
    private final int m9334c(int i2) {
        return Math.min(this.f12268d - 1, Math.max(i2, 0));
    }

    /* renamed from: d */
    private final boolean m9335d(int i2) {
        return Math.abs(i2) > 75;
    }

    /* renamed from: e */
    private final boolean m9336e(int i2) {
        return i2 == -1 || i2 >= this.f12268d;
    }

    /* renamed from: f */
    private final void m9337f(int i2) {
        AbstractC5166s<?> abstractC5166sM9198b = C5128a0.m9198b(this.f12273i, i2);
        if (!(abstractC5166sM9198b instanceof AbstractC5166s)) {
            abstractC5166sM9198b = null;
        }
        if (abstractC5166sM9198b != null) {
            AbstractC5156a<?, ?, ? extends P> abstractC5156a = this.f12270f.get(abstractC5166sM9198b.getClass());
            AbstractC5156a<?, ?, ? extends P> abstractC5156a2 = abstractC5156a instanceof AbstractC5156a ? abstractC5156a : null;
            if (abstractC5156a2 != null) {
                Iterator it = this.f12272h.m9349c(abstractC5156a2, abstractC5166sM9198b, i2).iterator();
                while (it.hasNext()) {
                    abstractC5156a2.m9331d(abstractC5166sM9198b, this.f12271g.m9342b(), (C5162g) it.next());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m9338b() {
        this.f12271g.m9341a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
    public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        C9801m.m32347g(recyclerView, "recyclerView");
        this.f12269e = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
    public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        C9801m.m32347g(recyclerView, "recyclerView");
        if ((i2 == 0 && i3 == 0) || m9335d(i2) || m9335d(i3)) {
            return;
        }
        RecyclerView.AbstractC0594g adapter = recyclerView.getAdapter();
        this.f12268d = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.AbstractC0602o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (m9336e(iFindFirstVisibleItemPosition) || m9336e(iFindLastVisibleItemPosition)) {
            IntRange.a aVar = IntRange.f37222j;
            this.f12266b = aVar.m32402a();
            this.f12267c = aVar.m32402a();
            return;
        }
        IntRange intRange = new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
        if (C9801m.m32341a(intRange, this.f12266b)) {
            return;
        }
        IntProgression intProgressionM9333a = m9333a(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, intRange.getF37215g() > this.f12266b.getF37215g() || intRange.getF37216h() > this.f12266b.getF37216h());
        Iterator it = C10782c0.m38619y0(intProgressionM9333a, this.f12267c).iterator();
        while (it.hasNext()) {
            m9337f(((Number) it.next()).intValue());
        }
        this.f12266b = intRange;
        this.f12267c = intProgressionM9333a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5157b(AbstractC5153n abstractC5153n, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10775u> function2, int i2, List<? extends AbstractC5156a<?, ?, ? extends P>> list) {
        C9801m.m32347g(abstractC5153n, "epoxyController");
        C9801m.m32347g(function0, "requestHolderFactory");
        C9801m.m32347g(function2, "errorHandler");
        C9801m.m32347g(list, "modelPreloaders");
        C5154o adapter = abstractC5153n.getAdapter();
        C9801m.m32342b(adapter, "epoxyController.adapter");
        this(adapter, function0, function2, i2, list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5157b(AbstractC5149l abstractC5149l, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, C10775u> function2, int i2, List<? extends AbstractC5156a<?, ?, ? extends P>> list) {
        this((AbstractC5133d) abstractC5149l, (Function0) function0, function2, i2, (List) list);
        C9801m.m32347g(abstractC5149l, "adapter");
        C9801m.m32347g(function0, "requestHolderFactory");
        C9801m.m32347g(function2, "errorHandler");
        C9801m.m32347g(list, "modelPreloaders");
    }
}
