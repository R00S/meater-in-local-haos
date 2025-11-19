package u0;

import android.os.SystemClock;
import android.view.MotionEvent;
import h0.C3476g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.InterfaceC5116v;

/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lu0/I;", "Lu0/G;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "b", "LBa/l;", "n", "()LBa/l;", "s", "(LBa/l;)V", "onTouchEvent", "Lu0/P;", "value", "c", "Lu0/P;", "getRequestDisallowInterceptTouchEvent", "()Lu0/P;", "v", "(Lu0/P;)V", "requestDisallowInterceptTouchEvent", "d", "Z", "m", "()Z", "p", "(Z)V", "disallowIntercept", "Lu0/F;", "e", "Lu0/F;", "i", "()Lu0/F;", "pointerInputFilter", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4623I implements InterfaceC4621G {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Ba.l<? super MotionEvent, Boolean> onTouchEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C4630P requestDisallowInterceptTouchEvent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disallowIntercept;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC4620F pointerInputFilter = new b();

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lu0/I$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.I$a */
    private enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"u0/I$b", "Lu0/F;", "Loa/F;", "i", "()V", "Lu0/o;", "pointerEvent", "h", "(Lu0/o;)V", "Lu0/q;", "pass", "LU0/r;", "bounds", "e", "(Lu0/o;Lu0/q;J)V", "d", "Lu0/I$a;", "b", "Lu0/I$a;", "state", "", "c", "()Z", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.I$b */
    public static final class b extends AbstractC4620F {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a state = a.Unknown;

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Loa/F;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: u0.I$b$a */
        static final class a extends AbstractC3864v implements Ba.l<MotionEvent, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C4623I f50209B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4623I c4623i) {
                super(1);
                this.f50209B = c4623i;
            }

            public final void a(MotionEvent motionEvent) {
                this.f50209B.n().invoke(motionEvent);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return C4153F.f46609a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Loa/F;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: u0.I$b$b, reason: collision with other inner class name */
        static final class C0715b extends AbstractC3864v implements Ba.l<MotionEvent, C4153F> {

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4623I f50211C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0715b(C4623I c4623i) {
                super(1);
                this.f50211C = c4623i;
            }

            public final void a(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f50211C.n().invoke(motionEvent);
                } else {
                    b.this.state = this.f50211C.n().invoke(motionEvent).booleanValue() ? a.Dispatching : a.NotDispatching;
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return C4153F.f46609a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Loa/F;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: u0.I$b$c */
        static final class c extends AbstractC3864v implements Ba.l<MotionEvent, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C4623I f50212B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C4623I c4623i) {
                super(1);
                this.f50212B = c4623i;
            }

            public final void a(MotionEvent motionEvent) {
                this.f50212B.n().invoke(motionEvent);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return C4153F.f46609a;
            }
        }

        b() {
        }

        private final void h(C4649o pointerEvent) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listC.get(i10).p()) {
                    if (this.state == a.Dispatching) {
                        InterfaceC5116v layoutCoordinates = getLayoutCoordinates();
                        if (layoutCoordinates == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        C4625K.b(pointerEvent, layoutCoordinates.c0(C3476g.INSTANCE.c()), new a(C4623I.this));
                    }
                    this.state = a.NotDispatching;
                    return;
                }
            }
            InterfaceC5116v layoutCoordinates2 = getLayoutCoordinates();
            if (layoutCoordinates2 == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            C4625K.c(pointerEvent, layoutCoordinates2.c0(C3476g.INSTANCE.c()), new C0715b(C4623I.this));
            if (this.state == a.Dispatching) {
                int size2 = listC.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    listC.get(i11).a();
                }
                C4641g internalPointerEvent = pointerEvent.getInternalPointerEvent();
                if (internalPointerEvent == null) {
                    return;
                }
                internalPointerEvent.e(!C4623I.this.getDisallowIntercept());
            }
        }

        private final void i() {
            this.state = a.Unknown;
            C4623I.this.p(false);
        }

        @Override // u0.AbstractC4620F
        public boolean c() {
            return true;
        }

        @Override // u0.AbstractC4620F
        public void d() {
            if (this.state == a.Dispatching) {
                C4625K.a(SystemClock.uptimeMillis(), new c(C4623I.this));
                i();
            }
        }

        @Override // u0.AbstractC4620F
        public void e(C4649o pointerEvent, EnumC4651q pass, long bounds) {
            boolean z10;
            List<PointerInputChange> listC = pointerEvent.c();
            if (C4623I.this.getDisallowIntercept()) {
                z10 = true;
                break;
            }
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                PointerInputChange pointerInputChange = listC.get(i10);
                if (C4650p.b(pointerInputChange) || C4650p.d(pointerInputChange)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            if (this.state != a.NotDispatching) {
                if (pass == EnumC4651q.Initial && z10) {
                    h(pointerEvent);
                }
                if (pass == EnumC4651q.Final && !z10) {
                    h(pointerEvent);
                }
            }
            if (pass == EnumC4651q.Final) {
                int size2 = listC.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (!C4650p.d(listC.get(i11))) {
                        return;
                    }
                }
                i();
            }
        }
    }

    @Override // u0.InterfaceC4621G
    /* renamed from: i, reason: from getter */
    public AbstractC4620F getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    public final Ba.l<MotionEvent, Boolean> n() {
        Ba.l lVar = this.onTouchEvent;
        if (lVar != null) {
            return lVar;
        }
        C3862t.u("onTouchEvent");
        return null;
    }

    public final void p(boolean z10) {
        this.disallowIntercept = z10;
    }

    public final void s(Ba.l<? super MotionEvent, Boolean> lVar) {
        this.onTouchEvent = lVar;
    }

    public final void v(C4630P c4630p) {
        C4630P c4630p2 = this.requestDisallowInterceptTouchEvent;
        if (c4630p2 != null) {
            c4630p2.b(null);
        }
        this.requestDisallowInterceptTouchEvent = c4630p;
        if (c4630p == null) {
            return;
        }
        c4630p.b(this);
    }
}
