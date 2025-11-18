package kotlin;

import Ba.l;
import Ba.p;
import Y.g;
import Y.i;
import Y.j;
import Y.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C1509K0;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.r1;
import oa.C4153F;

/* compiled from: LazySaveableStateHolder.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\b2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R/\u0010(\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*¨\u0006,"}, d2 = {"LC/D;", "LY/g;", "LY/d;", "wrappedRegistry", "<init>", "(LY/g;)V", "parentRegistry", "", "", "", "", "restoredValues", "(LY/g;Ljava/util/Map;)V", "value", "", "a", "(Ljava/lang/Object;)Z", "key", "c", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "LY/g$a;", "d", "(Ljava/lang/String;LBa/a;)LY/g$a;", "b", "()Ljava/util/Map;", "Loa/F;", "content", "f", "(Ljava/lang/Object;LBa/p;LO/l;I)V", "e", "(Ljava/lang/Object;)V", "LY/g;", "<set-?>", "LO/p0;", "h", "()LY/d;", "i", "(LY/d;)V", "wrappedHolder", "", "Ljava/util/Set;", "previouslyComposedKeys", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class D implements g, Y.d {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g wrappedRegistry;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 wrappedHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<Object> previouslyComposedKeys;

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<Object, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ g f1981B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(1);
            this.f1981B = gVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            g gVar = this.f1981B;
            return Boolean.valueOf(gVar != null ? gVar.a(obj) : true);
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LC/D$b;", "", "<init>", "()V", "LY/g;", "parentRegistry", "LY/j;", "LC/D;", "", "", "", "a", "(LY/g;)LY/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.D$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: LazySaveableStateHolder.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LY/l;", "LC/D;", "it", "", "", "", "", "a", "(LY/l;LC/D;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: C.D$b$a */
        static final class a extends AbstractC3864v implements p<Y.l, D, Map<String, ? extends List<? extends Object>>> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f1982B = new a();

            a() {
                super(2);
            }

            @Override // Ba.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<String, List<Object>> invoke(Y.l lVar, D d10) {
                Map<String, List<Object>> mapB = d10.b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            }
        }

        /* compiled from: LazySaveableStateHolder.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "", "restored", "LC/D;", "a", "(Ljava/util/Map;)LC/D;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: C.D$b$b, reason: collision with other inner class name */
        static final class C0033b extends AbstractC3864v implements l<Map<String, ? extends List<? extends Object>>, D> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ g f1983B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0033b(g gVar) {
                super(1);
                this.f1983B = gVar;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D invoke(Map<String, ? extends List<? extends Object>> map) {
                return new D(this.f1983B, map);
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final j<D, Map<String, List<Object>>> a(g parentRegistry) {
            return k.a(a.f1982B, new C0033b(parentRegistry));
        }

        private Companion() {
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f1985C;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"C/D$c$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D f1986a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f1987b;

            public a(D d10, Object obj) {
                this.f1986a = d10;
                this.f1987b = obj;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f1986a.previouslyComposedKeys.add(this.f1987b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f1985C = obj;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            D.this.previouslyComposedKeys.remove(this.f1985C);
            return new a(D.this, this.f1985C);
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f1989C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f1990D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f1991E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Object obj, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f1989C = obj;
            this.f1990D = pVar;
            this.f1991E = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            D.this.f(this.f1989C, this.f1990D, interfaceC1554l, C1509K0.a(this.f1991E | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public D(g gVar) {
        this.wrappedRegistry = gVar;
        this.wrappedHolder = r1.c(null, null, 2, null);
        this.previouslyComposedKeys = new LinkedHashSet();
    }

    @Override // Y.g
    public boolean a(Object value) {
        return this.wrappedRegistry.a(value);
    }

    @Override // Y.g
    public Map<String, List<Object>> b() {
        Y.d dVarH = h();
        if (dVarH != null) {
            Iterator<T> it = this.previouslyComposedKeys.iterator();
            while (it.hasNext()) {
                dVarH.e(it.next());
            }
        }
        return this.wrappedRegistry.b();
    }

    @Override // Y.g
    public Object c(String key) {
        return this.wrappedRegistry.c(key);
    }

    @Override // Y.g
    public g.a d(String key, Ba.a<? extends Object> valueProvider) {
        return this.wrappedRegistry.d(key, valueProvider);
    }

    @Override // Y.d
    public void e(Object key) {
        Y.d dVarH = h();
        if (dVarH == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        dVarH.e(key);
    }

    @Override // Y.d
    public void f(Object obj, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-697180401);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.l(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-697180401, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
            }
            Y.d dVarH = h();
            if (dVarH == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            int i12 = i11 & 14;
            dVarH.f(obj, pVar, interfaceC1554lR, i11 & 126);
            boolean zL = interfaceC1554lR.l(this) | interfaceC1554lR.l(obj);
            Object objF = interfaceC1554lR.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new c(obj);
                interfaceC1554lR.J(objF);
            }
            C1516O.a(obj, (l) objF, interfaceC1554lR, i12);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new d(obj, pVar, i10));
        }
    }

    public final Y.d h() {
        return (Y.d) this.wrappedHolder.getValue();
    }

    public final void i(Y.d dVar) {
        this.wrappedHolder.setValue(dVar);
    }

    public D(g gVar, Map<String, ? extends List<? extends Object>> map) {
        this(i.a(map, new a(gVar)));
    }
}
