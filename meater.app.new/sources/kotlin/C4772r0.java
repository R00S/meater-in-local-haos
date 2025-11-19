package kotlin;

import Ba.l;
import kotlin.AbstractC4769q;
import kotlin.Metadata;

/* compiled from: VectorConverters.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lv/r0;", "T", "Lv/q;", "V", "Lv/q0;", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "<init>", "(LBa/l;LBa/l;)V", "a", "LBa/l;", "()LBa/l;", "b", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4772r0<T, V extends AbstractC4769q> implements InterfaceC4770q0<T, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<T, V> convertToVector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<V, T> convertFromVector;

    /* JADX WARN: Multi-variable type inference failed */
    public C4772r0(l<? super T, ? extends V> lVar, l<? super V, ? extends T> lVar2) {
        this.convertToVector = lVar;
        this.convertFromVector = lVar2;
    }

    @Override // kotlin.InterfaceC4770q0
    public l<T, V> a() {
        return this.convertToVector;
    }

    @Override // kotlin.InterfaceC4770q0
    public l<V, T> b() {
        return this.convertFromVector;
    }
}
