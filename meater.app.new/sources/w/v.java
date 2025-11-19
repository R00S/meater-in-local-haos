package w;

import A0.A0;
import A0.B0;
import A0.InterfaceC0840t;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import y0.InterfaceC5116v;

/* compiled from: FocusedBounds.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lw/v;", "Lb0/i$c;", "LA0/A0;", "LA0/t;", "<init>", "()V", "Loa/F;", "k2", "", "focused", "l2", "(Z)V", "Ly0/v;", "coordinates", "F", "(Ly0/v;)V", "O", "Z", "isFocused", "P", "O1", "()Z", "shouldAutoInvalidate", "Q", "Ly0/v;", "layoutCoordinates", "Lw/w;", "j2", "()Lw/w;", "observer", "", "U", "()Ljava/lang/Object;", "traverseKey", "R", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v extends i.c implements A0, InterfaceC0840t {

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: S, reason: collision with root package name */
    public static final int f51759S = 8;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5116v layoutCoordinates;

    /* compiled from: FocusedBounds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw/v$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w.v$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    private final w j2() {
        if (!getIsAttached()) {
            return null;
        }
        A0 a0A = B0.a(this, w.INSTANCE);
        if (a0A instanceof w) {
            return (w) a0A;
        }
        return null;
    }

    private final void k2() {
        w wVarJ2;
        InterfaceC5116v interfaceC5116v = this.layoutCoordinates;
        if (interfaceC5116v != null) {
            C3862t.d(interfaceC5116v);
            if (!interfaceC5116v.L() || (wVarJ2 = j2()) == null) {
                return;
            }
            wVarJ2.j2(this.layoutCoordinates);
        }
    }

    @Override // A0.InterfaceC0840t
    public void F(InterfaceC5116v coordinates) {
        this.layoutCoordinates = coordinates;
        if (this.isFocused) {
            if (coordinates.L()) {
                k2();
                return;
            }
            w wVarJ2 = j2();
            if (wVarJ2 != null) {
                wVarJ2.j2(null);
            }
        }
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // A0.A0
    /* renamed from: U */
    public Object getTraverseKey() {
        return INSTANCE;
    }

    public final void l2(boolean focused) {
        if (focused == this.isFocused) {
            return;
        }
        if (focused) {
            k2();
        } else {
            w wVarJ2 = j2();
            if (wVarJ2 != null) {
                wVarJ2.j2(null);
            }
        }
        this.isFocused = focused;
    }
}
