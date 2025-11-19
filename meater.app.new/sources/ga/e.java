package ga;

import android.view.O;
import ja.C3756a;
import ka.C3815c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.InterfaceC4588d;

/* compiled from: PersistentLiveDataPublisher.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lga/e;", "Lga/c;", "Lja/a;", "defaultState", "Landroidx/lifecycle/O;", "savedStateHandle", "", "_tag", "<init>", "(Lja/a;Landroidx/lifecycle/O;Ljava/lang/String;)V", "g", "()Lja/a;", "state", "Loa/F;", "h", "(Lja/a;)V", "", "pushStateUpdate", "b", "(Lja/a;ZLta/d;)Ljava/lang/Object;", "Landroidx/lifecycle/O;", "uniflow-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends c {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final O savedStateHandle;

    /* compiled from: PersistentLiveDataPublisher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.uniflow.android.livedata.PersistentLiveDataPublisher", f = "PersistentLiveDataPublisher.kt", l = {27}, m = "publishState")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f42137B;

        /* renamed from: C, reason: collision with root package name */
        Object f42138C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f42139D;

        /* renamed from: F, reason: collision with root package name */
        int f42141F;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f42139D = obj;
            this.f42141F |= Integer.MIN_VALUE;
            return e.this.b(null, false, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C3756a defaultState, O savedStateHandle, String str) {
        super(defaultState, str);
        C3862t.g(defaultState, "defaultState");
        C3862t.g(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        g();
    }

    private final C3756a g() {
        C3756a c3756a = (C3756a) this.savedStateHandle.e(getTag());
        if (c3756a == null) {
            return null;
        }
        C3815c.f43834a.a(getTag() + " --> restore --> " + c3756a);
        e().o(c3756a);
        return c3756a;
    }

    private final void h(C3756a state) {
        this.savedStateHandle.i(getTag(), state);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ga.c, ia.InterfaceC3641f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(ja.C3756a r5, boolean r6, ta.InterfaceC4588d<? super oa.C4153F> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ga.e.a
            if (r0 == 0) goto L13
            r0 = r7
            ga.e$a r0 = (ga.e.a) r0
            int r1 = r0.f42141F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42141F = r1
            goto L18
        L13:
            ga.e$a r0 = new ga.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f42139D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f42141F
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f42138C
            ja.a r5 = (ja.C3756a) r5
            java.lang.Object r6 = r0.f42137B
            ga.e r6 = (ga.e) r6
            oa.C4173r.b(r7)
            goto L4a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            oa.C4173r.b(r7)
            r0.f42137B = r4
            r0.f42138C = r5
            r0.f42141F = r3
            java.lang.Object r6 = super.b(r5, r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r6 = r4
        L4a:
            r6.h(r5)
            oa.F r5 = oa.C4153F.f46609a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.e.b(ja.a, boolean, ta.d):java.lang.Object");
    }
}
