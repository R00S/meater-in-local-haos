package p456rx.p470p;

import p456rx.InterfaceC11241f;
import p456rx.exceptions.C11240a;
import p456rx.p461n.p462a.C11282h;

/* compiled from: SerializedObserver.java */
/* renamed from: rx.p.d */
/* loaded from: classes3.dex */
public class C11404d<T> implements InterfaceC11241f<T> {

    /* renamed from: f */
    private final InterfaceC11241f<? super T> f42992f;

    /* renamed from: g */
    private boolean f42993g;

    /* renamed from: h */
    private volatile boolean f42994h;

    /* renamed from: i */
    private a f42995i;

    /* compiled from: SerializedObserver.java */
    /* renamed from: rx.p.d$a */
    static final class a {

        /* renamed from: a */
        Object[] f42996a;

        /* renamed from: b */
        int f42997b;

        a() {
        }

        /* renamed from: a */
        public void m40558a(Object obj) {
            int i2 = this.f42997b;
            Object[] objArr = this.f42996a;
            if (objArr == null) {
                objArr = new Object[16];
                this.f42996a = objArr;
            } else if (i2 == objArr.length) {
                Object[] objArr2 = new Object[(i2 >> 2) + i2];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                this.f42996a = objArr2;
                objArr = objArr2;
            }
            objArr[i2] = obj;
            this.f42997b = i2 + 1;
        }
    }

    public C11404d(InterfaceC11241f<? super T> interfaceC11241f) {
        this.f42992f = interfaceC11241f;
    }

    @Override // p456rx.InterfaceC11241f
    public void onCompleted() {
        if (this.f42994h) {
            return;
        }
        synchronized (this) {
            if (this.f42994h) {
                return;
            }
            this.f42994h = true;
            if (!this.f42993g) {
                this.f42993g = true;
                this.f42992f.onCompleted();
                return;
            }
            a aVar = this.f42995i;
            if (aVar == null) {
                aVar = new a();
                this.f42995i = aVar;
            }
            aVar.m40558a(C11282h.m40216b());
        }
    }

    @Override // p456rx.InterfaceC11241f
    public void onError(Throwable th) {
        C11240a.m40140e(th);
        if (this.f42994h) {
            return;
        }
        synchronized (this) {
            if (this.f42994h) {
                return;
            }
            this.f42994h = true;
            if (!this.f42993g) {
                this.f42993g = true;
                this.f42992f.onError(th);
                return;
            }
            a aVar = this.f42995i;
            if (aVar == null) {
                aVar = new a();
                this.f42995i = aVar;
            }
            aVar.m40558a(C11282h.m40217c(th));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x002d, code lost:
    
        continue;
     */
    @Override // p456rx.InterfaceC11241f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onNext(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.f42994h
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r6)
            boolean r0 = r6.f42994h     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            return
        Lc:
            boolean r0 = r6.f42993g     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L24
            rx.p.d$a r0 = r6.f42995i     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L1b
            rx.p.d$a r0 = new rx.p.d$a     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            r6.f42995i = r0     // Catch: java.lang.Throwable -> L6f
        L1b:
            java.lang.Object r7 = p456rx.p461n.p462a.C11282h.m40221g(r7)     // Catch: java.lang.Throwable -> L6f
            r0.m40558a(r7)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            return
        L24:
            r0 = 1
            r6.f42993g = r0     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            rx.f<? super T> r1 = r6.f42992f     // Catch: java.lang.Throwable -> L66
            r1.onNext(r7)     // Catch: java.lang.Throwable -> L66
        L2d:
            monitor-enter(r6)
            rx.p.d$a r1 = r6.f42995i     // Catch: java.lang.Throwable -> L63
            r2 = 0
            if (r1 != 0) goto L37
            r6.f42993g = r2     // Catch: java.lang.Throwable -> L63
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            return
        L37:
            r3 = 0
            r6.f42995i = r3     // Catch: java.lang.Throwable -> L63
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r1 = r1.f42996a
            int r3 = r1.length
        L3e:
            if (r2 >= r3) goto L2d
            r4 = r1[r2]
            if (r4 != 0) goto L45
            goto L2d
        L45:
            rx.f<? super T> r5 = r6.f42992f     // Catch: java.lang.Throwable -> L53
            boolean r4 = p456rx.p461n.p462a.C11282h.m40215a(r5, r4)     // Catch: java.lang.Throwable -> L53
            if (r4 == 0) goto L50
            r6.f42994h = r0     // Catch: java.lang.Throwable -> L53
            return
        L50:
            int r2 = r2 + 1
            goto L3e
        L53:
            r1 = move-exception
            r6.f42994h = r0
            p456rx.exceptions.C11240a.m40140e(r1)
            rx.f<? super T> r0 = r6.f42992f
            java.lang.Throwable r7 = p456rx.exceptions.OnErrorThrowable.m40132a(r1, r7)
            r0.onError(r7)
            return
        L63:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r7
        L66:
            r1 = move-exception
            r6.f42994h = r0
            rx.f<? super T> r0 = r6.f42992f
            p456rx.exceptions.C11240a.m40142g(r1, r0, r7)
            return
        L6f:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6f
            goto L73
        L72:
            throw r7
        L73:
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: p456rx.p470p.C11404d.onNext(java.lang.Object):void");
    }
}
