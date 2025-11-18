package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.C9906a;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9921o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10083b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10104t;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10121i;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10221q;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10316z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.EnumC10270b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10272c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10323g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10081a<A, C> extends AbstractC10083b<A, a<? extends A, ? extends C>> implements InterfaceC10272c<A, C> {

    /* renamed from: b */
    private final InterfaceC10323g<InterfaceC10101q, a<A, C>> f38334b;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$a */
    public static final class a<A, C> extends AbstractC10083b.a<A> {

        /* renamed from: a */
        private final Map<C10104t, List<A>> f38335a;

        /* renamed from: b */
        private final Map<C10104t, C> f38336b;

        /* renamed from: c */
        private final Map<C10104t, C> f38337c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<C10104t, ? extends List<? extends A>> map, Map<C10104t, ? extends C> map2, Map<C10104t, ? extends C> map3) {
            C9801m.m32346f(map, "memberAnnotations");
            C9801m.m32346f(map2, "propertyConstants");
            C9801m.m32346f(map3, "annotationParametersDefaultValues");
            this.f38335a = map;
            this.f38336b = map2;
            this.f38337c = map3;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10083b.a
        /* renamed from: a */
        public Map<C10104t, List<A>> mo33845a() {
            return this.f38335a;
        }

        /* renamed from: b */
        public final Map<C10104t, C> m33846b() {
            return this.f38337c;
        }

        /* renamed from: c */
        public final Map<C10104t, C> m33847c() {
            return this.f38336b;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$b */
    static final class b extends Lambda implements Function2<a<? extends A, ? extends C>, C10104t, C> {

        /* renamed from: f */
        public static final b f38338f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C invoke(a<? extends A, ? extends C> aVar, C10104t c10104t) {
            C9801m.m32346f(aVar, "$this$loadConstantFromProperty");
            C9801m.m32346f(c10104t, "it");
            return aVar.m33846b().get(c10104t);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$c */
    public static final class c implements InterfaceC10101q.d {

        /* renamed from: a */
        final /* synthetic */ AbstractC10081a<A, C> f38339a;

        /* renamed from: b */
        final /* synthetic */ HashMap<C10104t, List<A>> f38340b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10101q f38341c;

        /* renamed from: d */
        final /* synthetic */ HashMap<C10104t, C> f38342d;

        /* renamed from: e */
        final /* synthetic */ HashMap<C10104t, C> f38343e;

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.a$c$a */
        public final class a extends b implements InterfaceC10101q.e {

            /* renamed from: d */
            final /* synthetic */ c f38344d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, C10104t c10104t) {
                super(cVar, c10104t);
                C9801m.m32346f(c10104t, RoomInstalled.SIGNATURE);
                this.f38344d = cVar;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.e
            /* renamed from: c */
            public InterfaceC10101q.a mo33851c(int i2, C10159b c10159b, InterfaceC10741z0 interfaceC10741z0) {
                C9801m.m32346f(c10159b, "classId");
                C9801m.m32346f(interfaceC10741z0, "source");
                C10104t c10104tM34035e = C10104t.f38485a.m34035e(m33852d(), i2);
                List<A> arrayList = this.f38344d.f38340b.get(c10104tM34035e);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f38344d.f38340b.put(c10104tM34035e, arrayList);
                }
                return this.f38344d.f38339a.m33886y(c10159b, interfaceC10741z0, arrayList);
            }
        }

        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.a$c$b */
        public class b implements InterfaceC10101q.c {

            /* renamed from: a */
            private final C10104t f38345a;

            /* renamed from: b */
            private final ArrayList<A> f38346b;

            /* renamed from: c */
            final /* synthetic */ c f38347c;

            public b(c cVar, C10104t c10104t) {
                C9801m.m32346f(c10104t, RoomInstalled.SIGNATURE);
                this.f38347c = cVar;
                this.f38345a = c10104t;
                this.f38346b = new ArrayList<>();
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.c
            /* renamed from: a */
            public void mo32695a() {
                if (!this.f38346b.isEmpty()) {
                    this.f38347c.f38340b.put(this.f38345a, this.f38346b);
                }
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.c
            /* renamed from: b */
            public InterfaceC10101q.a mo32696b(C10159b c10159b, InterfaceC10741z0 interfaceC10741z0) {
                C9801m.m32346f(c10159b, "classId");
                C9801m.m32346f(interfaceC10741z0, "source");
                return this.f38347c.f38339a.m33886y(c10159b, interfaceC10741z0, this.f38346b);
            }

            /* renamed from: d */
            protected final C10104t m33852d() {
                return this.f38345a;
            }
        }

        c(AbstractC10081a<A, C> abstractC10081a, HashMap<C10104t, List<A>> map, InterfaceC10101q interfaceC10101q, HashMap<C10104t, C> map2, HashMap<C10104t, C> map3) {
            this.f38339a = abstractC10081a;
            this.f38340b = map;
            this.f38341c = interfaceC10101q;
            this.f38342d = map2;
            this.f38343e = map3;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.d
        /* renamed from: a */
        public InterfaceC10101q.c mo33849a(C10163f c10163f, String str, Object obj) {
            C cMo33840G;
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(str, "desc");
            C10104t.a aVar = C10104t.f38485a;
            String strM35455k = c10163f.m35455k();
            C9801m.m32345e(strM35455k, "name.asString()");
            C10104t c10104tM34031a = aVar.m34031a(strM35455k, str);
            if (obj != null && (cMo33840G = this.f38339a.mo33840G(str, obj)) != null) {
                this.f38343e.put(c10104tM34031a, cMo33840G);
            }
            return new b(this, c10104tM34031a);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10101q.d
        /* renamed from: b */
        public InterfaceC10101q.e mo33850b(C10163f c10163f, String str) {
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(str, "desc");
            C10104t.a aVar = C10104t.f38485a;
            String strM35455k = c10163f.m35455k();
            C9801m.m32345e(strM35455k, "name.asString()");
            return new a(this, aVar.m34034d(strM35455k, str));
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$d */
    static final class d extends Lambda implements Function2<a<? extends A, ? extends C>, C10104t, C> {

        /* renamed from: f */
        public static final d f38348f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C invoke(a<? extends A, ? extends C> aVar, C10104t c10104t) {
            C9801m.m32346f(aVar, "$this$loadConstantFromProperty");
            C9801m.m32346f(c10104t, "it");
            return aVar.m33847c().get(c10104t);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.a$e */
    static final class e extends Lambda implements Function1<InterfaceC10101q, a<? extends A, ? extends C>> {

        /* renamed from: f */
        final /* synthetic */ AbstractC10081a<A, C> f38349f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC10081a<A, C> abstractC10081a) {
            super(1);
            this.f38349f = abstractC10081a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a<A, C> invoke(InterfaceC10101q interfaceC10101q) {
            C9801m.m32346f(interfaceC10101q, "kotlinClass");
            return this.f38349f.m33836F(interfaceC10101q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10081a(InterfaceC10330n interfaceC10330n, InterfaceC10099o interfaceC10099o) {
        super(interfaceC10099o);
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10099o, "kotlinClassFinder");
        this.f38334b = interfaceC10330n.mo36520h(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final a<A, C> m33836F(InterfaceC10101q interfaceC10101q) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        interfaceC10101q.mo34027c(new c(this, map, interfaceC10101q, map3, map2), m33880q(interfaceC10101q));
        return new a<>(map, map2, map3);
    }

    /* renamed from: H */
    private final C m33837H(AbstractC10316z abstractC10316z, C10135n c10135n, EnumC10270b enumC10270b, AbstractC10344e0 abstractC10344e0, Function2<? super a<? extends A, ? extends C>, ? super C10104t, ? extends C> function2) {
        C cInvoke;
        InterfaceC10101q interfaceC10101qM33879o = m33879o(abstractC10316z, m33883v(abstractC10316z, true, true, C10150b.f39189A.mo35368d(c10135n.m34885b0()), C10121i.m34257f(c10135n)));
        if (interfaceC10101qM33879o == null) {
            return null;
        }
        C10104t c10104tM33881r = m33881r(c10135n, abstractC10316z.m36498b(), abstractC10316z.m36500d(), enumC10270b, interfaceC10101qM33879o.mo34025a().m33914d().m35361d(C10091g.f38445a.m33976a()));
        if (c10104tM33881r == null || (cInvoke = function2.invoke(this.f38334b.invoke(interfaceC10101qM33879o), c10104tM33881r)) == null) {
            return null;
        }
        return C9921o.m32844d(abstractC10344e0) ? mo33841I(cInvoke) : cInvoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10083b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public a<A, C> mo33844p(InterfaceC10101q interfaceC10101q) {
        C9801m.m32346f(interfaceC10101q, "binaryClass");
        return this.f38334b.invoke(interfaceC10101q);
    }

    /* renamed from: E */
    protected final boolean m33839E(C10159b c10159b, Map<C10163f, ? extends AbstractC10211g<?>> map) {
        C9801m.m32346f(c10159b, "annotationClassId");
        C9801m.m32346f(map, "arguments");
        if (!C9801m.m32341a(c10159b, C9906a.f37442a.m32692a())) {
            return false;
        }
        AbstractC10211g<?> abstractC10211g = map.get(C10163f.m35454x("value"));
        C10221q c10221q = abstractC10211g instanceof C10221q ? (C10221q) abstractC10211g : null;
        if (c10221q == null) {
            return false;
        }
        C10221q.b bVarMo36023b = c10221q.mo36023b();
        C10221q.b.C11561b c11561b = bVarMo36023b instanceof C10221q.b.C11561b ? (C10221q.b.C11561b) bVarMo36023b : null;
        if (c11561b == null) {
            return false;
        }
        return m33884w(c11561b.m36056b());
    }

    /* renamed from: G */
    protected abstract C mo33840G(String str, Object obj);

    /* renamed from: I */
    protected abstract C mo33841I(C c2);

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10272c
    /* renamed from: e */
    public C mo33842e(AbstractC10316z abstractC10316z, C10135n c10135n, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10135n, "proto");
        C9801m.m32346f(abstractC10344e0, "expectedType");
        return m33837H(abstractC10316z, c10135n, EnumC10270b.PROPERTY, abstractC10344e0, d.f38348f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10272c
    /* renamed from: k */
    public C mo33843k(AbstractC10316z abstractC10316z, C10135n c10135n, AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10316z, "container");
        C9801m.m32346f(c10135n, "proto");
        C9801m.m32346f(abstractC10344e0, "expectedType");
        return m33837H(abstractC10316z, c10135n, EnumC10270b.PROPERTY_GETTER, abstractC10344e0, b.f38338f);
    }
}
