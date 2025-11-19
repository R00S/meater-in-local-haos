package kotlin;

import K0.b;
import O0.r;
import O0.s;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C3862t;
import ta.InterfaceC4588d;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0013\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"LL0/h;", "", "<init>", "()V", "LL0/k;", "font", "LL0/H;", "platformFontLoader", "result", "", "forever", "Loa/F;", "e", "(LL0/k;LL0/H;Ljava/lang/Object;Z)V", "LL0/h$a;", "d", "(LL0/k;LL0/H;)LL0/h$a;", "Lkotlin/Function1;", "Lta/d;", "block", "g", "(LL0/k;LL0/H;ZLBa/l;Lta/d;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "PermanentFailure", "LK0/b;", "LL0/h$b;", "b", "LK0/b;", "resultCache", "LK0/c;", "c", "LK0/c;", "permanentCache", "LO0/s;", "LO0/s;", "cacheLock", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object PermanentFailure = a.b(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b<Key, a> resultCache = new b<>(16);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final K0.c<Key, a> permanentCache = new K0.c<>(0, 1, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s cacheLock = r.a();

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LL0/h$b;", "", "LL0/k;", "font", "loaderKey", "<init>", "(LL0/k;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LL0/k;", "getFont", "()LL0/k;", "b", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.h$b, reason: from toString */
    public static final /* data */ class Key {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC1340k font;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object loaderKey;

        public Key(InterfaceC1340k interfaceC1340k, Object obj) {
            this.font = interfaceC1340k;
            this.loaderKey = obj;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return C3862t.b(this.font, key.font) && C3862t.b(this.loaderKey, key.loaderKey);
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @f(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {398}, m = "runCached")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.h$c */
    static final class c extends d {

        /* renamed from: B, reason: collision with root package name */
        Object f9015B;

        /* renamed from: C, reason: collision with root package name */
        Object f9016C;

        /* renamed from: D, reason: collision with root package name */
        boolean f9017D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f9018E;

        /* renamed from: G, reason: collision with root package name */
        int f9020G;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9018E = obj;
            this.f9020G |= Integer.MIN_VALUE;
            return C1337h.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(C1337h c1337h, InterfaceC1340k interfaceC1340k, InterfaceC1315H interfaceC1315H, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        c1337h.e(interfaceC1340k, interfaceC1315H, obj, z10);
    }

    public final a d(InterfaceC1340k font, InterfaceC1315H platformFontLoader) {
        a aVarD;
        Key key = new Key(font, platformFontLoader.c());
        synchronized (this.cacheLock) {
            aVarD = this.resultCache.d(key);
            if (aVarD == null) {
                aVarD = this.permanentCache.b(key);
            }
        }
        return aVarD;
    }

    public final void e(InterfaceC1340k font, InterfaceC1315H platformFontLoader, Object result, boolean forever) {
        Key key = new Key(font, platformFontLoader.c());
        synchronized (this.cacheLock) {
            try {
                if (result == null) {
                    this.permanentCache.h(key, a.a(this.PermanentFailure));
                } else if (forever) {
                    this.permanentCache.h(key, a.a(a.b(result)));
                } else {
                    this.resultCache.e(key, a.a(a.b(result)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(kotlin.InterfaceC1340k r6, kotlin.InterfaceC1315H r7, boolean r8, Ba.l<? super ta.InterfaceC4588d<java.lang.Object>, ? extends java.lang.Object> r9, ta.InterfaceC4588d<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof kotlin.C1337h.c
            if (r0 == 0) goto L13
            r0 = r10
            L0.h$c r0 = (kotlin.C1337h.c) r0
            int r1 = r0.f9020G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9020G = r1
            goto L18
        L13:
            L0.h$c r0 = new L0.h$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9018E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f9020G
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.f9017D
            java.lang.Object r6 = r0.f9016C
            L0.h$b r6 = (kotlin.C1337h.Key) r6
            java.lang.Object r7 = r0.f9015B
            L0.h r7 = (kotlin.C1337h) r7
            oa.C4173r.b(r10)
            goto L7d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            oa.C4173r.b(r10)
            L0.h$b r10 = new L0.h$b
            java.lang.Object r7 = r7.c()
            r10.<init>(r6, r7)
            O0.s r6 = r5.cacheLock
            monitor-enter(r6)
            K0.b<L0.h$b, L0.h$a> r7 = r5.resultCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.d(r10)     // Catch: java.lang.Throwable -> L5d
            L0.h$a r7 = (kotlin.C1337h.a) r7     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L5f
            K0.c<L0.h$b, L0.h$a> r7 = r5.permanentCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.b(r10)     // Catch: java.lang.Throwable -> L5d
            L0.h$a r7 = (kotlin.C1337h.a) r7     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r7 = move-exception
            goto Lb3
        L5f:
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getResult()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            return r7
        L67:
            oa.F r7 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            r0.f9015B = r5
            r0.f9016C = r10
            r0.f9017D = r8
            r0.f9020G = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L79
            return r1
        L79:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7d:
            O0.s r9 = r7.cacheLock
            monitor-enter(r9)
            if (r10 != 0) goto L90
            K0.c<L0.h$b, L0.h$a> r8 = r7.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = r7.PermanentFailure     // Catch: java.lang.Throwable -> L8e
            L0.h$a r7 = kotlin.C1337h.a.a(r7)     // Catch: java.lang.Throwable -> L8e
            r8.h(r6, r7)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r6 = move-exception
            goto Lb1
        L90:
            if (r8 == 0) goto La0
            K0.c<L0.h$b, L0.h$a> r7 = r7.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = kotlin.C1337h.a.b(r10)     // Catch: java.lang.Throwable -> L8e
            L0.h$a r8 = kotlin.C1337h.a.a(r8)     // Catch: java.lang.Throwable -> L8e
            r7.h(r6, r8)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            K0.b<L0.h$b, L0.h$a> r7 = r7.resultCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = kotlin.C1337h.a.b(r10)     // Catch: java.lang.Throwable -> L8e
            L0.h$a r8 = kotlin.C1337h.a.a(r8)     // Catch: java.lang.Throwable -> L8e
            r7.e(r6, r8)     // Catch: java.lang.Throwable -> L8e
        Lad:
            oa.F r6 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r9)
            return r10
        Lb1:
            monitor-exit(r9)
            throw r6
        Lb3:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1337h.g(L0.k, L0.H, boolean, Ba.l, ta.d):java.lang.Object");
    }

    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    @Aa.b
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0016"}, d2 = {"LL0/h$a;", "", "result", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "", "d", "(Ljava/lang/Object;)I", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Z", "isPermanentFailure", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: L0.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object result;

        private /* synthetic */ a(Object obj) {
            this.result = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && C3862t.b(obj, ((a) obj2).getResult());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.result, obj);
        }

        /* renamed from: g, reason: from getter */
        public final /* synthetic */ Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return d(this.result);
        }

        public String toString() {
            return f(this.result);
        }

        public static Object b(Object obj) {
            return obj;
        }
    }
}
