package androidx.compose.ui.platform;

import b0.k;
import kotlin.C1491B0;
import kotlin.InterfaceC1555l0;
import kotlin.Metadata;
import ta.g;

/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/x0;", "Lb0/k;", "<init>", "()V", "", "<set-?>", "B", "LO/l0;", "z", "()F", "c", "(F)V", "scaleFactor", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2050x0 implements b0.k {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1555l0 scaleFactor = C1491B0.a(1.0f);

    @Override // ta.g
    public <R> R L(R r10, Ba.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) k.a.a(this, r10, pVar);
    }

    @Override // ta.g
    public ta.g N(g.c<?> cVar) {
        return k.a.c(this, cVar);
    }

    @Override // ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) k.a.b(this, cVar);
    }

    public void c(float f10) {
        this.scaleFactor.f(f10);
    }

    @Override // ta.g
    public ta.g s(ta.g gVar) {
        return k.a.d(this, gVar);
    }

    @Override // b0.k
    public float z() {
        return this.scaleFactor.b();
    }
}
