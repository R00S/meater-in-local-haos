package kotlin;

import Ba.a;
import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LO/M;", "T", "LO/G0;", "LO/l1;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(LO/l1;LBa/a;)V", "value", "LO/H0;", "c", "(Ljava/lang/Object;)LO/H0;", "b", "LO/l1;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1512M<T> extends AbstractC1501G0<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l1<T> policy;

    public C1512M(l1<T> l1Var, a<? extends T> aVar) {
        super(aVar);
        this.policy = l1Var;
    }

    @Override // kotlin.AbstractC1501G0
    public C1503H0<T> c(T value) {
        return new C1503H0<>(this, value, value == null, this.policy, null, null, true);
    }
}
