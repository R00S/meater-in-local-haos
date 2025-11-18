package kotlin;

import Ba.l;
import Ba.p;
import W.c;
import Y.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: LazyLayoutItemContentFactory.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0018R\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"LC/o;", "", "LY/d;", "saveableStateHolder", "Lkotlin/Function0;", "LC/q;", "itemProvider", "<init>", "(LY/d;LBa/a;)V", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", "contentType", "Loa/F;", "b", "(ILjava/lang/Object;Ljava/lang/Object;)LBa/p;", "a", "LY/d;", "LBa/a;", "d", "()LBa/a;", "", "LC/o$a;", "Ljava/util/Map;", "lambdasCache", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d saveableStateHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<q> itemProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, a> lambdasCache = new LinkedHashMap();

    /* compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, d2 = {"LC/o$a;", "", "", "index", "key", "contentType", "<init>", "(LC/o;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "Loa/F;", "c", "()LBa/p;", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "b", "e", "<set-?>", "I", "f", "()I", "d", "LBa/p;", "_content", "content", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.o$a */
    private final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object contentType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private p<? super InterfaceC1554l, ? super Integer, C4153F> _content;

        /* compiled from: LazyLayoutItemContentFactory.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: C.o$a$a, reason: collision with other inner class name */
        static final class C0036a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C0976o f2064B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ a f2065C;

            /* compiled from: LazyLayoutItemContentFactory.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: C.o$a$a$a, reason: collision with other inner class name */
            static final class C0037a extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ a f2066B;

                /* compiled from: Effects.kt */
                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"C/o$a$a$a$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                /* renamed from: C.o$a$a$a$a, reason: collision with other inner class name */
                public static final class C0038a implements InterfaceC1508K {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a f2067a;

                    public C0038a(a aVar) {
                        this.f2067a = aVar;
                    }

                    @Override // kotlin.InterfaceC1508K
                    public void c() {
                        this.f2067a._content = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0037a(a aVar) {
                    super(1);
                    this.f2066B = aVar;
                }

                @Override // Ba.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InterfaceC1508K invoke(C1510L c1510l) {
                    return new C0038a(this.f2066B);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0036a(C0976o c0976o, a aVar) {
                super(2);
                this.f2064B = c0976o;
                this.f2065C = aVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                }
                q qVarInvoke = this.f2064B.d().invoke();
                int index = this.f2065C.getIndex();
                if ((index >= qVarInvoke.a() || !C3862t.b(qVarInvoke.b(index), this.f2065C.getKey())) && (index = qVarInvoke.c(this.f2065C.getKey())) != -1) {
                    this.f2065C.index = index;
                }
                int i11 = index;
                if (i11 != -1) {
                    interfaceC1554l.S(-660479623);
                    C0977p.a(qVarInvoke, P.a(this.f2064B.saveableStateHolder), i11, P.a(this.f2065C.getKey()), interfaceC1554l, 0);
                    interfaceC1554l.I();
                } else {
                    interfaceC1554l.S(-660272047);
                    interfaceC1554l.I();
                }
                Object key = this.f2065C.getKey();
                boolean zL = interfaceC1554l.l(this.f2065C);
                a aVar = this.f2065C;
                Object objF = interfaceC1554l.f();
                if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                    objF = new C0037a(aVar);
                    interfaceC1554l.J(objF);
                }
                C1516O.a(key, (l) objF, interfaceC1554l, 0);
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                a(interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        public a(int i10, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i10;
        }

        private final p<InterfaceC1554l, Integer, C4153F> c() {
            return c.b(1403994769, true, new C0036a(C0976o.this, this));
        }

        public final p<InterfaceC1554l, Integer, C4153F> d() {
            p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            p<InterfaceC1554l, Integer, C4153F> pVarC = c();
            this._content = pVarC;
            return pVarC;
        }

        /* renamed from: e, reason: from getter */
        public final Object getContentType() {
            return this.contentType;
        }

        /* renamed from: f, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: g, reason: from getter */
        public final Object getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0976o(d dVar, Ba.a<? extends q> aVar) {
        this.saveableStateHolder = dVar;
        this.itemProvider = aVar;
    }

    public final p<InterfaceC1554l, Integer, C4153F> b(int index, Object key, Object contentType) {
        a aVar = this.lambdasCache.get(key);
        if (aVar != null && aVar.getIndex() == index && C3862t.b(aVar.getContentType(), contentType)) {
            return aVar.d();
        }
        a aVar2 = new a(index, key, contentType);
        this.lambdasCache.put(key, aVar2);
        return aVar2.d();
    }

    public final Object c(Object key) {
        if (key == null) {
            return null;
        }
        a aVar = this.lambdasCache.get(key);
        if (aVar != null) {
            return aVar.getContentType();
        }
        q qVarInvoke = this.itemProvider.invoke();
        int iC = qVarInvoke.c(key);
        if (iC != -1) {
            return qVarInvoke.d(iC);
        }
        return null;
    }

    public final Ba.a<q> d() {
        return this.itemProvider;
    }
}
