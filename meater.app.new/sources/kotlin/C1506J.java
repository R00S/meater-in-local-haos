package kotlin;

import Ba.l;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LO/J;", "LO/R0;", "Lkotlin/Function1;", "LO/L;", "LO/K;", "effect", "<init>", "(LBa/l;)V", "Loa/F;", "d", "()V", "c", "b", "B", "LBa/l;", "C", "LO/K;", "onDispose", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1506J implements R0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final l<C1510L, InterfaceC1508K> effect;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1508K onDispose;

    /* JADX WARN: Multi-variable type inference failed */
    public C1506J(l<? super C1510L, ? extends InterfaceC1508K> lVar) {
        this.effect = lVar;
    }

    @Override // kotlin.R0
    public void c() {
        InterfaceC1508K interfaceC1508K = this.onDispose;
        if (interfaceC1508K != null) {
            interfaceC1508K.c();
        }
        this.onDispose = null;
    }

    @Override // kotlin.R0
    public void d() {
        this.onDispose = this.effect.invoke(C1516O.f12734a);
    }

    @Override // kotlin.R0
    public void b() {
    }
}
