package w;

import A0.C0830i;
import A0.InterfaceC0829h;
import A0.h0;
import A0.i0;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.O;
import oa.C4153F;
import y0.X;
import y0.Y;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0005R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lw/u;", "Lb0/i$c;", "LA0/h;", "LA0/h0;", "<init>", "()V", "Ly0/X;", "j2", "()Ly0/X;", "", "focused", "Loa/F;", "k2", "(Z)V", "V1", "e1", "Ly0/X$a;", "O", "Ly0/X$a;", "pinnedHandle", "P", "Z", "isFocused", "Q", "O1", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u extends i.c implements InterfaceC0829h, h0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private X.a pinnedHandle;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O<X> f51756B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ u f51757C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O<X> o10, u uVar) {
            super(0);
            this.f51756B = o10;
            this.f51757C = uVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
        public final void a() {
            this.f51756B.f43978B = C0830i.a(this.f51757C, Y.a());
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    private final X j2() {
        O o10 = new O();
        i0.a(this, new a(o10, this));
        return (X) o10.f43978B;
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // b0.i.c
    public void V1() {
        X.a aVar = this.pinnedHandle;
        if (aVar != null) {
            aVar.c();
        }
        this.pinnedHandle = null;
    }

    @Override // A0.h0
    public void e1() {
        X xJ2 = j2();
        if (this.isFocused) {
            X.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.c();
            }
            this.pinnedHandle = xJ2 != null ? xJ2.a() : null;
        }
    }

    public final void k2(boolean focused) {
        if (focused) {
            X xJ2 = j2();
            this.pinnedHandle = xJ2 != null ? xJ2.a() : null;
        } else {
            X.a aVar = this.pinnedHandle;
            if (aVar != null) {
                aVar.c();
            }
            this.pinnedHandle = null;
        }
        this.isFocused = focused;
    }
}
