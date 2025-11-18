package androidx.compose.ui.platform;

import Xb.C1841i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: GlobalSnapshotManager.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/l0;", "", "<init>", "()V", "Loa/F;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "c", "sent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2027l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2027l0 f23180a = new C2027l0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean started = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final AtomicBoolean sent = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final int f23183d = 8;

    /* compiled from: GlobalSnapshotManager.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.l0$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f23184B;

        /* renamed from: C, reason: collision with root package name */
        Object f23185C;

        /* renamed from: D, reason: collision with root package name */
        int f23186D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Zb.g<C4153F> f23187E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Zb.g<C4153F> gVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f23187E = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f23187E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:17:0x0038, B:19:0x0040, B:14:0x002b, B:20:0x0054, B:13:0x0026), top: B:27:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:17:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r5.f23186D
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r5.f23185C
                Zb.i r1 = (Zb.i) r1
                java.lang.Object r3 = r5.f23184B
                Zb.v r3 = (Zb.v) r3
                oa.C4173r.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L38
            L17:
                r6 = move-exception
                goto L5d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                oa.C4173r.b(r6)
                Zb.g<oa.F> r3 = r5.f23187E
                Zb.i r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
                r1 = r6
            L2b:
                r5.f23184B = r3     // Catch: java.lang.Throwable -> L17
                r5.f23185C = r1     // Catch: java.lang.Throwable -> L17
                r5.f23186D = r2     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L17
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
                if (r6 == 0) goto L54
                java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
                oa.F r6 = (oa.C4153F) r6     // Catch: java.lang.Throwable -> L17
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.C2027l0.a()     // Catch: java.lang.Throwable -> L17
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L17
                androidx.compose.runtime.snapshots.g$a r6 = androidx.compose.runtime.snapshots.g.INSTANCE     // Catch: java.lang.Throwable -> L17
                r6.n()     // Catch: java.lang.Throwable -> L17
                goto L2b
            L54:
                oa.F r6 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L17
                r6 = 0
                Zb.n.a(r3, r6)
                oa.F r6 = oa.C4153F.f46609a
                return r6
            L5d:
                throw r6     // Catch: java.lang.Throwable -> L5e
            L5e:
                r0 = move-exception
                Zb.n.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2027l0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: GlobalSnapshotManager.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.l0$b */
    static final class b extends AbstractC3864v implements Ba.l<Object, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Zb.g<C4153F> f23188B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Zb.g<C4153F> gVar) {
            super(1);
            this.f23188B = gVar;
        }

        public final void a(Object obj) {
            if (C2027l0.sent.compareAndSet(false, true)) {
                this.f23188B.w(C4153F.f46609a);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a(obj);
            return C4153F.f46609a;
        }
    }

    private C2027l0() {
    }

    public final void b() {
        if (started.compareAndSet(false, true)) {
            Zb.g gVarB = Zb.j.b(1, null, null, 6, null);
            C1841i.d(Xb.J.a(Q.INSTANCE.b()), null, null, new a(gVarB, null), 3, null);
            androidx.compose.runtime.snapshots.g.INSTANCE.k(new b(gVarB));
        }
    }
}
