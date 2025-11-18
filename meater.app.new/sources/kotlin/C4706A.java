package kotlin;

import kotlin.Metadata;

/* compiled from: DecayAnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv/A;", "T", "Lv/z;", "Lv/I;", "floatDecaySpec", "<init>", "(Lv/I;)V", "Lv/q;", "V", "Lv/q0;", "typeConverter", "Lv/v0;", "a", "(Lv/q0;)Lv/v0;", "Lv/I;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4706A<T> implements InterfaceC4787z<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4720I floatDecaySpec;

    public C4706A(InterfaceC4720I interfaceC4720I) {
        this.floatDecaySpec = interfaceC4720I;
    }

    @Override // kotlin.InterfaceC4787z
    public <V extends AbstractC4769q> InterfaceC4780v0<V> a(InterfaceC4770q0<T, V> typeConverter) {
        return new C4788z0(this.floatDecaySpec);
    }
}
