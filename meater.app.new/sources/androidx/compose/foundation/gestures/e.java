package androidx.compose.foundation.gestures;

import h0.C3476g;
import kotlin.C5046z;
import kotlin.Metadata;
import t0.InterfaceC4536a;
import ta.InterfaceC4588d;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/e;", "Lt0/a;", "Lx/z;", "scrollingLogic", "", "enabled", "<init>", "(Lx/z;Z)V", "Lh0/g;", "consumed", "available", "Lt0/e;", "source", "u1", "(JJI)J", "LU0/y;", "d0", "(JJLta/d;)Ljava/lang/Object;", "B", "Lx/z;", "getScrollingLogic", "()Lx/z;", "C", "Z", "getEnabled", "()Z", "a", "(Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e implements InterfaceC4536a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C5046z scrollingLogic;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {865}, m = "onPostFling-RZ2iAVY")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        long f22094B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f22095C;

        /* renamed from: E, reason: collision with root package name */
        int f22097E;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22095C = obj;
            this.f22097E |= Integer.MIN_VALUE;
            return e.this.d0(0L, 0L, this);
        }
    }

    public e(C5046z c5046z, boolean z10) {
        this.scrollingLogic = c5046z;
        this.enabled = z10;
    }

    public final void a(boolean z10) {
        this.enabled = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t0.InterfaceC4536a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d0(long r3, long r5, ta.InterfaceC4588d<? super U0.y> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.e.a
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.e$a r3 = (androidx.compose.foundation.gestures.e.a) r3
            int r4 = r3.f22097E
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f22097E = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.e$a r3 = new androidx.compose.foundation.gestures.e$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.f22095C
            java.lang.Object r7 = ua.C4696b.e()
            int r0 = r3.f22097E
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.f22094B
            oa.C4173r.b(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            oa.C4173r.b(r4)
            boolean r4 = r2.enabled
            if (r4 == 0) goto L52
            x.z r4 = r2.scrollingLogic
            r3.f22094B = r5
            r3.f22097E = r1
            java.lang.Object r4 = r4.n(r5, r3)
            if (r4 != r7) goto L47
            return r7
        L47:
            U0.y r4 = (U0.y) r4
            long r3 = r4.getPackedValue()
            long r3 = U0.y.k(r5, r3)
            goto L58
        L52:
            U0.y$a r3 = U0.y.INSTANCE
            long r3 = r3.a()
        L58:
            U0.y r3 = U0.y.b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.e.d0(long, long, ta.d):java.lang.Object");
    }

    @Override // t0.InterfaceC4536a
    public long u1(long consumed, long available, int source) {
        return this.enabled ? this.scrollingLogic.r(available) : C3476g.INSTANCE.c();
    }
}
