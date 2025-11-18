package Y;

import Ba.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.collections.M;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: SaveableStateHolder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 !2\u00020\u0001:\u0002\u001a!B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0016R\u00020\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"LY/e;", "LY/d;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "h", "()Ljava/util/Map;", "key", "Lkotlin/Function0;", "Loa/F;", "content", "f", "(Ljava/lang/Object;LBa/p;LO/l;I)V", "e", "(Ljava/lang/Object;)V", "a", "Ljava/util/Map;", "LY/e$d;", "b", "registryHolders", "LY/g;", "c", "LY/g;", "g", "()LY/g;", "i", "(LY/g;)V", "parentSaveableStateRegistry", "d", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e implements Y.d {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final j<e, ?> f19151e = k.a(a.f19155B, b.f19156B);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, d> registryHolders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g parentSaveableStateRegistry;

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"LY/l;", "LY/e;", "it", "", "", "", "", "", "a", "(LY/l;LY/e;)Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements p<l, e, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f19155B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<Object, Map<String, List<Object>>> invoke(l lVar, e eVar) {
            return eVar.h();
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "", "", "it", "LY/e;", "a", "(Ljava/util/Map;)LY/e;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Map<Object, Map<String, ? extends List<? extends Object>>>, e> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f19156B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(Map<Object, Map<String, List<Object>>> map) {
            return new e(map);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LY/e$c;", "", "<init>", "()V", "LY/j;", "LY/e;", "Saver", "LY/j;", "a", "()LY/j;", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Y.e$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final j<e, ?> a() {
            return e.f19151e;
        }

        private Companion() {
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J5\u0010\u000b\u001a\u00020\n2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\r\u0010\u001a¨\u0006\u001c"}, d2 = {"LY/e$d;", "", "key", "<init>", "(LY/e;Ljava/lang/Object;)V", "", "", "", "", "map", "Loa/F;", "b", "(Ljava/util/Map;)V", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", "Z", "getShouldSave", "()Z", "c", "(Z)V", "shouldSave", "LY/g;", "LY/g;", "()LY/g;", "registry", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldSave = true;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final g registry;

        /* compiled from: SaveableStateHolder.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<Object, Boolean> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ e f19161B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f19161B = eVar;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                g parentSaveableStateRegistry = this.f19161B.getParentSaveableStateRegistry();
                return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.a(obj) : true);
            }
        }

        public d(Object obj) {
            this.key = obj;
            this.registry = i.a((Map) e.this.savedStates.get(obj), new a(e.this));
        }

        /* renamed from: a, reason: from getter */
        public final g getRegistry() {
            return this.registry;
        }

        public final void b(Map<Object, Map<String, List<Object>>> map) {
            if (this.shouldSave) {
                Map<String, List<Object>> mapB = this.registry.b();
                if (mapB.isEmpty()) {
                    map.remove(this.key);
                } else {
                    map.put(this.key, mapB);
                }
            }
        }

        public final void c(boolean z10) {
            this.shouldSave = z10;
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: Y.e$e, reason: collision with other inner class name */
    static final class C0279e extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f19163C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ d f19164D;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Y/e$e$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: Y.e$e$a */
        public static final class a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f19165a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f19166b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f19167c;

            public a(d dVar, e eVar, Object obj) {
                this.f19165a = dVar;
                this.f19166b = eVar;
                this.f19167c = obj;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f19165a.b(this.f19166b.savedStates);
                this.f19166b.registryHolders.remove(this.f19167c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0279e(Object obj, d dVar) {
            super(1);
            this.f19163C = obj;
            this.f19164D = dVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            boolean zContainsKey = e.this.registryHolders.containsKey(this.f19163C);
            Object obj = this.f19163C;
            if (!zContainsKey) {
                e.this.savedStates.remove(this.f19163C);
                e.this.registryHolders.put(this.f19163C, this.f19164D);
                return new a(this.f19164D, e.this, this.f19163C);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f19169C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f19170D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f19171E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Object obj, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f19169C = obj;
            this.f19170D = pVar;
            this.f19171E = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            e.this.f(this.f19169C, this.f19170D, interfaceC1554l, C1509K0.a(this.f19171E | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> h() {
        Map<Object, Map<String, List<Object>>> mapT = M.t(this.savedStates);
        Iterator<T> it = this.registryHolders.values().iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(mapT);
        }
        if (mapT.isEmpty()) {
            return null;
        }
        return mapT;
    }

    @Override // Y.d
    public void e(Object key) {
        d dVar = this.registryHolders.get(key);
        if (dVar != null) {
            dVar.c(false);
        } else {
            this.savedStates.remove(key);
        }
    }

    @Override // Y.d
    public void f(Object obj, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1198538093);
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
                C1560o.S(-1198538093, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)");
            }
            interfaceC1554lR.x(207, obj);
            Object objF = interfaceC1554lR.f();
            InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
            if (objF == companion.a()) {
                g gVar = this.parentSaveableStateRegistry;
                if (!(gVar != null ? gVar.a(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objF = new d(obj);
                interfaceC1554lR.J(objF);
            }
            d dVar = (d) objF;
            C1576w.a(i.d().d(dVar.getRegistry()), pVar, interfaceC1554lR, (i11 & 112) | C1503H0.f12626i);
            C4153F c4153f = C4153F.f46609a;
            boolean zL = interfaceC1554lR.l(this) | interfaceC1554lR.l(obj) | interfaceC1554lR.l(dVar);
            Object objF2 = interfaceC1554lR.f();
            if (zL || objF2 == companion.a()) {
                objF2 = new C0279e(obj, dVar);
                interfaceC1554lR.J(objF2);
            }
            C1516O.a(c4153f, (Ba.l) objF2, interfaceC1554lR, 6);
            interfaceC1554lR.d();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new f(obj, pVar, i10));
        }
    }

    /* renamed from: g, reason: from getter */
    public final g getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    public final void i(g gVar) {
        this.parentSaveableStateRegistry = gVar;
    }

    public e(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registryHolders = new LinkedHashMap();
    }

    public /* synthetic */ e(Map map, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
