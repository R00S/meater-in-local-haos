package cc;

import Xb.S0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\"*\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011\"&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lta/g;", "context", "", "b", "(Lta/g;)Ljava/lang/Object;", "countOrElement", "c", "(Lta/g;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "Loa/F;", "a", "(Lta/g;Ljava/lang/Object;)V", "Lcc/F;", "Lcc/F;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lta/g$b;", "LBa/p;", "countAll", "LXb/S0;", "findOne", "Lcc/N;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2365J {

    /* renamed from: a, reason: collision with root package name */
    public static final C2361F f31152a = new C2361F("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final Ba.p<Object, g.b, Object> f31153b = a.f31156B;

    /* renamed from: c, reason: collision with root package name */
    private static final Ba.p<S0<?>, g.b, S0<?>> f31154c = b.f31157B;

    /* renamed from: d, reason: collision with root package name */
    private static final Ba.p<C2369N, g.b, C2369N> f31155d = c.f31158B;

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lta/g$b;", "element", "a", "(Ljava/lang/Object;Lta/g$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cc.J$a */
    static final class a extends AbstractC3864v implements Ba.p<Object, g.b, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f31156B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof S0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXb/S0;", "found", "Lta/g$b;", "element", "a", "(LXb/S0;Lta/g$b;)LXb/S0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cc.J$b */
    static final class b extends AbstractC3864v implements Ba.p<S0<?>, g.b, S0<?>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f31157B = new b();

        b() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0<?> invoke(S0<?> s02, g.b bVar) {
            if (s02 != null) {
                return s02;
            }
            if (bVar instanceof S0) {
                return (S0) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcc/N;", "state", "Lta/g$b;", "element", "a", "(Lcc/N;Lta/g$b;)Lcc/N;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cc.J$c */
    static final class c extends AbstractC3864v implements Ba.p<C2369N, g.b, C2369N> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f31158B = new c();

        c() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2369N invoke(C2369N c2369n, g.b bVar) {
            if (bVar instanceof S0) {
                S0<?> s02 = (S0) bVar;
                c2369n.a(s02, s02.C(c2369n.context));
            }
            return c2369n;
        }
    }

    public static final void a(ta.g gVar, Object obj) {
        if (obj == f31152a) {
            return;
        }
        if (obj instanceof C2369N) {
            ((C2369N) obj).b(gVar);
            return;
        }
        Object objL = gVar.L(null, f31154c);
        C3862t.e(objL, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((S0) objL).P(gVar, obj);
    }

    public static final Object b(ta.g gVar) {
        Object objL = gVar.L(0, f31153b);
        C3862t.d(objL);
        return objL;
    }

    public static final Object c(ta.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f31152a;
        }
        if (obj instanceof Integer) {
            return gVar.L(new C2369N(gVar, ((Number) obj).intValue()), f31155d);
        }
        C3862t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((S0) obj).C(gVar);
    }
}
