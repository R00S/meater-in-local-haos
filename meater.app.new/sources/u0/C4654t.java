package u0;

import A0.A0;
import A0.B0;
import A0.C0830i;
import A0.InterfaceC0829h;
import A0.s0;
import A0.z0;
import androidx.compose.ui.platform.C2013e0;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import u0.C4652r;

/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\rJ*\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\rR\u001a\u0010&\u001a\u00020!8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010/R\u0016\u00109\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Lu0/t;", "Lb0/i$c;", "LA0/A0;", "LA0/s0;", "LA0/h;", "Lu0/u;", "icon", "", "overrideDescendants", "<init>", "(Lu0/u;Z)V", "Loa/F;", "u2", "()V", "v2", "l2", "k2", "o2", "p2", "()Lu0/t;", "n2", "q2", "m2", "Lu0/o;", "pointerEvent", "Lu0/q;", "pass", "LU0/r;", "bounds", "t0", "(Lu0/o;Lu0/q;J)V", "w0", "U1", "", "O", "Ljava/lang/String;", "t2", "()Ljava/lang/String;", "traverseKey", "value", "P", "Lu0/u;", "getIcon", "()Lu0/u;", "w2", "(Lu0/u;)V", "Q", "Z", "r2", "()Z", "x2", "(Z)V", "R", "cursorInBoundsOfNode", "Lu0/w;", "s2", "()Lu0/w;", "pointerIconService", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4654t extends i.c implements A0, s0, InterfaceC0829h {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final String traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4655u icon;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean overrideDescendants;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean cursorInBoundsOfNode;

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/t;", "it", "", "a", "(Lu0/t;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.t$a */
    static final class a extends AbstractC3864v implements Ba.l<C4654t, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O<C4654t> f50305B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.O<C4654t> o10) {
            super(1);
            this.f50305B = o10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4654t c4654t) {
            if (this.f50305B.f43978B == null && c4654t.cursorInBoundsOfNode) {
                this.f50305B.f43978B = c4654t;
            } else if (this.f50305B.f43978B != null && c4654t.getOverrideDescendants() && c4654t.cursorInBoundsOfNode) {
                this.f50305B.f43978B = c4654t;
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/t;", "it", "LA0/z0;", "a", "(Lu0/t;)LA0/z0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.t$b */
    static final class b extends AbstractC3864v implements Ba.l<C4654t, z0> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f50306B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.K k10) {
            super(1);
            this.f50306B = k10;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C4654t c4654t) {
            if (!c4654t.cursorInBoundsOfNode) {
                return z0.ContinueTraversal;
            }
            this.f50306B.f43974B = false;
            return z0.CancelTraversal;
        }
    }

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/t;", "it", "LA0/z0;", "a", "(Lu0/t;)LA0/z0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.t$c */
    static final class c extends AbstractC3864v implements Ba.l<C4654t, z0> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O<C4654t> f50307B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.jvm.internal.O<C4654t> o10) {
            super(1);
            this.f50307B = o10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(C4654t c4654t) {
            z0 z0Var = z0.ContinueTraversal;
            if (!c4654t.cursorInBoundsOfNode) {
                return z0Var;
            }
            this.f50307B.f43978B = c4654t;
            return c4654t.getOverrideDescendants() ? z0.SkipSubtreeAndContinueTraversal : z0Var;
        }
    }

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/t;", "it", "", "a", "(Lu0/t;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.t$d */
    static final class d extends AbstractC3864v implements Ba.l<C4654t, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O<C4654t> f50308B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.O<C4654t> o10) {
            super(1);
            this.f50308B = o10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4654t c4654t) {
            if (c4654t.getOverrideDescendants() && c4654t.cursorInBoundsOfNode) {
                this.f50308B.f43978B = c4654t;
            }
            return Boolean.TRUE;
        }
    }

    public C4654t(InterfaceC4655u interfaceC4655u, boolean z10) {
        this.icon = interfaceC4655u;
        this.overrideDescendants = z10;
    }

    private final void k2() {
        InterfaceC4657w interfaceC4657wS2 = s2();
        if (interfaceC4657wS2 != null) {
            interfaceC4657wS2.a(null);
        }
    }

    private final void l2() {
        InterfaceC4655u interfaceC4655u;
        C4654t c4654tQ2 = q2();
        if (c4654tQ2 == null || (interfaceC4655u = c4654tQ2.icon) == null) {
            interfaceC4655u = this.icon;
        }
        InterfaceC4657w interfaceC4657wS2 = s2();
        if (interfaceC4657wS2 != null) {
            interfaceC4657wS2.a(interfaceC4655u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m2() {
        C4153F c4153f;
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        B0.d(this, new a(o10));
        C4654t c4654t = (C4654t) o10.f43978B;
        if (c4654t != null) {
            c4654t.l2();
            c4153f = C4153F.f46609a;
        } else {
            c4153f = null;
        }
        if (c4153f == null) {
            k2();
        }
    }

    private final void n2() {
        C4654t c4654tP2;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (c4654tP2 = p2()) == null) {
                c4654tP2 = this;
            }
            c4654tP2.l2();
        }
    }

    private final void o2() {
        kotlin.jvm.internal.K k10 = new kotlin.jvm.internal.K();
        k10.f43974B = true;
        if (!this.overrideDescendants) {
            B0.f(this, new b(k10));
        }
        if (k10.f43974B) {
            l2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C4654t p2() {
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        B0.f(this, new c(o10));
        return (C4654t) o10.f43978B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C4654t q2() {
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        B0.d(this, new d(o10));
        return (C4654t) o10.f43978B;
    }

    private final InterfaceC4657w s2() {
        return (InterfaceC4657w) C0830i.a(this, C2013e0.i());
    }

    private final void u2() {
        this.cursorInBoundsOfNode = true;
        o2();
    }

    private final void v2() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (getIsAttached()) {
                m2();
            }
        }
    }

    @Override // b0.i.c
    public void U1() {
        v2();
        super.U1();
    }

    /* renamed from: r2, reason: from getter */
    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // A0.s0
    public void t0(C4649o pointerEvent, EnumC4651q pass, long bounds) {
        if (pass == EnumC4651q.Main) {
            int type = pointerEvent.getType();
            C4652r.Companion companion = C4652r.INSTANCE;
            if (C4652r.i(type, companion.a())) {
                u2();
            } else if (C4652r.i(pointerEvent.getType(), companion.b())) {
                v2();
            }
        }
    }

    @Override // A0.A0
    /* renamed from: t2, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // A0.s0
    public void w0() {
        v2();
    }

    public final void w2(InterfaceC4655u interfaceC4655u) {
        if (C3862t.b(this.icon, interfaceC4655u)) {
            return;
        }
        this.icon = interfaceC4655u;
        if (this.cursorInBoundsOfNode) {
            o2();
        }
    }

    public final void x2(boolean z10) {
        if (this.overrideDescendants != z10) {
            this.overrideDescendants = z10;
            if (z10) {
                if (this.cursorInBoundsOfNode) {
                    l2();
                }
            } else if (this.cursorInBoundsOfNode) {
                n2();
            }
        }
    }
}
