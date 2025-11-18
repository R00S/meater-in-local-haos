package E0;

import Ba.p;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"LE0/h;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Lta/d;", "scrollBy", "<init>", "(ILBa/p;)V", "delta", "Loa/F;", "e", "(FLta/d;)Ljava/lang/Object;", "d", "()V", "min", "max", "f", "(IILta/d;)Ljava/lang/Object;", "offset", "c", "(I)I", "g", "a", "I", "b", "LBa/p;", "<set-?>", "F", "()F", "scrollAmount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int viewportSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<Float, InterfaceC4588d<? super Float>, Object> scrollBy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scrollAmount;

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {306}, m = "scrollBy")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f3786B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f3787C;

        /* renamed from: E, reason: collision with root package name */
        int f3789E;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3787C = obj;
            this.f3789E |= Integer.MIN_VALUE;
            return h.this.e(0.0f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(int i10, p<? super Float, ? super InterfaceC4588d<? super Float>, ? extends Object> pVar) {
        this.viewportSize = i10;
        this.scrollBy = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(float r5, ta.InterfaceC4588d<? super oa.C4153F> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof E0.h.a
            if (r0 == 0) goto L13
            r0 = r6
            E0.h$a r0 = (E0.h.a) r0
            int r1 = r0.f3789E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3789E = r1
            goto L18
        L13:
            E0.h$a r0 = new E0.h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3787C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f3789E
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f3786B
            E0.h r5 = (E0.h) r5
            oa.C4173r.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            oa.C4173r.b(r6)
            Ba.p<java.lang.Float, ta.d<? super java.lang.Float>, java.lang.Object> r6 = r4.scrollBy
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r5)
            r0.f3786B = r4
            r0.f3789E = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.scrollAmount
            float r0 = r0 + r6
            r5.scrollAmount = r0
            oa.F r5 = oa.C4153F.f46609a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.h.e(float, ta.d):java.lang.Object");
    }

    /* renamed from: b, reason: from getter */
    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int c(int offset) {
        return Ha.g.k(offset - Da.a.c(this.scrollAmount), 0, this.viewportSize);
    }

    public final void d() {
        this.scrollAmount = 0.0f;
    }

    public final Object f(int i10, int i11, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.viewportSize;
        if (i12 > i13) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
        }
        float f10 = i10;
        float f11 = this.scrollAmount;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return C4153F.f46609a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objG = g(i10, interfaceC4588d);
        return objG == C4696b.e() ? objG : C4153F.f46609a;
    }

    public final Object g(float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objE = e(f10 - this.scrollAmount, interfaceC4588d);
        return objE == C4696b.e() ? objE : C4153F.f46609a;
    }
}
