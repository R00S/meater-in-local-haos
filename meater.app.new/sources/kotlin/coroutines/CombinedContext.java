package kotlin.coroutines;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.io.Serializable;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9784d0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(m32266d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m32267d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", HttpUrl.FRAGMENT_ENCODE_SET, "containsAll", "context", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", RoomNotification.KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "minusKey", "size", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "Serialized", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.y.c, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class CombinedContext implements CoroutineContext, Serializable {

    /* renamed from: f */
    private final CoroutineContext f41521f;

    /* renamed from: g */
    private final CoroutineContext.b f41522g;

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m32267d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.y.c$a */
    private static final class a implements Serializable {

        /* renamed from: f */
        public static final C11584a f41523f = new C11584a(null);

        /* renamed from: g */
        private final CoroutineContext[] f41524g;

        /* compiled from: CoroutineContextImpl.kt */
        @Metadata(m32266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m32267d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "serialVersionUID", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: kotlin.y.c$a$a, reason: collision with other inner class name */
        public static final class C11584a {
            private C11584a() {
            }

            public /* synthetic */ C11584a(C9789g c9789g) {
                this();
            }
        }

        public a(CoroutineContext[] coroutineContextArr) {
            C9801m.m32346f(coroutineContextArr, "elements");
            this.f41524g = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f41524g;
            CoroutineContext coroutineContextPlus = EmptyCoroutineContext.f41531f;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.y.c$b */
    static final class b extends Lambda implements Function2<String, CoroutineContext.b, String> {

        /* renamed from: f */
        public static final b f41525f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, CoroutineContext.b bVar) {
            C9801m.m32346f(str, "acc");
            C9801m.m32346f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.y.c$c */
    static final class c extends Lambda implements Function2<C10775u, CoroutineContext.b, C10775u> {

        /* renamed from: f */
        final /* synthetic */ CoroutineContext[] f41526f;

        /* renamed from: g */
        final /* synthetic */ C9784d0 f41527g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CoroutineContext[] coroutineContextArr, C9784d0 c9784d0) {
            super(2);
            this.f41526f = coroutineContextArr;
            this.f41527g = c9784d0;
        }

        /* renamed from: b */
        public final void m39027b(C10775u c10775u, CoroutineContext.b bVar) {
            C9801m.m32346f(c10775u, "<anonymous parameter 0>");
            C9801m.m32346f(bVar, "element");
            CoroutineContext[] coroutineContextArr = this.f41526f;
            C9784d0 c9784d0 = this.f41527g;
            int i2 = c9784d0.f37169f;
            c9784d0.f37169f = i2 + 1;
            coroutineContextArr[i2] = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C10775u invoke(C10775u c10775u, CoroutineContext.b bVar) {
            m39027b(c10775u, bVar);
            return C10775u.f41439a;
        }
    }

    public CombinedContext(CoroutineContext coroutineContext, CoroutineContext.b bVar) {
        C9801m.m32346f(coroutineContext, "left");
        C9801m.m32346f(bVar, "element");
        this.f41521f = coroutineContext;
        this.f41522g = bVar;
    }

    /* renamed from: e */
    private final boolean m39023e(CoroutineContext.b bVar) {
        return C9801m.m32341a(get(bVar.getKey()), bVar);
    }

    /* renamed from: g */
    private final boolean m39024g(CombinedContext combinedContext) {
        while (m39023e(combinedContext.f41522g)) {
            CoroutineContext coroutineContext = combinedContext.f41521f;
            if (!(coroutineContext instanceof CombinedContext)) {
                C9801m.m32344d(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m39023e((CoroutineContext.b) coroutineContext);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
        return false;
    }

    /* renamed from: h */
    private final int m39025h() {
        int i2 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.f41521f;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i2;
            }
            i2++;
        }
    }

    private final Object writeReplace() {
        int iM39025h = m39025h();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[iM39025h];
        C9784d0 c9784d0 = new C9784d0();
        fold(C10775u.f41439a, new c(coroutineContextArr, c9784d0));
        if (c9784d0.f37169f == iM39025h) {
            return new a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) other;
                if (combinedContext.m39025h() != m39025h() || !combinedContext.m39024g(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.b, ? extends R> function2) {
        C9801m.m32346f(function2, "operation");
        return function2.invoke((Object) this.f41521f.fold(r, function2), this.f41522g);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        C9801m.m32346f(cVar, RoomNotification.KEY);
        CombinedContext combinedContext = this;
        while (true) {
            E e2 = (E) combinedContext.f41522g.get(cVar);
            if (e2 != null) {
                return e2;
            }
            CoroutineContext coroutineContext = combinedContext.f41521f;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.get(cVar);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f41521f.hashCode() + this.f41522g.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        C9801m.m32346f(cVar, RoomNotification.KEY);
        if (this.f41522g.get(cVar) != null) {
            return this.f41521f;
        }
        CoroutineContext coroutineContextMinusKey = this.f41521f.minusKey(cVar);
        return coroutineContextMinusKey == this.f41521f ? this : coroutineContextMinusKey == EmptyCoroutineContext.f41531f ? this.f41522g : new CombinedContext(coroutineContextMinusKey, this.f41522g);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.m39033a(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold(HttpUrl.FRAGMENT_ENCODE_SET, b.f41525f)) + ']';
    }
}
