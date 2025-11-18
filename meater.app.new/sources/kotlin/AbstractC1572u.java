package kotlin;

import Ba.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH ¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"LO/u;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(LBa/a;)V", "LO/H0;", "value", "LO/D1;", "previous", "b", "(LO/H0;LO/D1;)LO/D1;", "a", "LO/D1;", "()LO/D1;", "defaultValueHolder", "LO/G0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1572u<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D1<T> defaultValueHolder;

    public /* synthetic */ AbstractC1572u(a aVar, C3854k c3854k) {
        this(aVar);
    }

    public D1<T> a() {
        return this.defaultValueHolder;
    }

    public abstract D1<T> b(C1503H0<T> value, D1<T> previous);

    private AbstractC1572u(a<? extends T> aVar) {
        this.defaultValueHolder = new C1537d0(aVar);
    }
}
