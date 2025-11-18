package kotlin;

import kotlin.Metadata;

/* compiled from: SnapshotFloatState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"LO/l0;", "LO/P;", "LO/p0;", "", "value", "getValue", "()Ljava/lang/Float;", "n", "(F)V", "b", "()F", "f", "floatValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1555l0 extends InterfaceC1517P, InterfaceC1563p0<Float> {
    @Override // kotlin.InterfaceC1517P
    float b();

    void f(float f10);

    default void n(float f10) {
        f(f10);
    }

    @Override // kotlin.InterfaceC1563p0
    /* bridge */ /* synthetic */ default void setValue(Float f10) {
        n(f10.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.x1
    default Float getValue() {
        return Float.valueOf(b());
    }
}
