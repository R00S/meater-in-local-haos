package kotlin;

import kotlin.Metadata;

/* compiled from: Applier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010 \u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"LO/r0;", "N", "LO/f;", "applier", "", "offset", "<init>", "(LO/f;I)V", "node", "Loa/F;", "d", "(Ljava/lang/Object;)V", "g", "()V", "index", "instance", "h", "(ILjava/lang/Object;)V", "c", "count", "a", "(II)V", "from", "to", "f", "(III)V", "clear", "LO/f;", "b", "I", "nesting", "()Ljava/lang/Object;", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567r0<N> implements InterfaceC1542f<N> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1542f<N> applier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int offset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nesting;

    public C1567r0(InterfaceC1542f<N> interfaceC1542f, int i10) {
        this.applier = interfaceC1542f;
        this.offset = i10;
    }

    @Override // kotlin.InterfaceC1542f
    public void a(int index, int count) {
        this.applier.a(index + (this.nesting == 0 ? this.offset : 0), count);
    }

    @Override // kotlin.InterfaceC1542f
    public N b() {
        return this.applier.b();
    }

    @Override // kotlin.InterfaceC1542f
    public void c(int index, N instance) {
        this.applier.c(index + (this.nesting == 0 ? this.offset : 0), instance);
    }

    @Override // kotlin.InterfaceC1542f
    public void clear() {
        C1560o.s("Clear is not valid on OffsetApplier");
    }

    @Override // kotlin.InterfaceC1542f
    public void d(N node) {
        this.nesting++;
        this.applier.d(node);
    }

    @Override // kotlin.InterfaceC1542f
    public void f(int from, int to, int count) {
        int i10 = this.nesting == 0 ? this.offset : 0;
        this.applier.f(from + i10, to + i10, count);
    }

    @Override // kotlin.InterfaceC1542f
    public void g() {
        if (!(this.nesting > 0)) {
            C1560o.s("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.g();
    }

    @Override // kotlin.InterfaceC1542f
    public void h(int index, N instance) {
        this.applier.h(index + (this.nesting == 0 ? this.offset : 0), instance);
    }
}
