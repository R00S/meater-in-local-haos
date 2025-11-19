package androidx.compose.runtime.snapshots;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0010\u001a\u00020\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/a;", "Landroidx/compose/runtime/snapshots/b;", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/i;)V", "Lkotlin/Function1;", "", "Loa/F;", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "x", "(LBa/l;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "Q", "(LBa/l;LBa/l;)Landroidx/compose/runtime/snapshots/b;", "o", "()V", "snapshot", "", "U", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "T", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "d", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends androidx.compose.runtime.snapshots.b {

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Loa/F;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.snapshots.a$a, reason: collision with other inner class name */
    static final class C0321a extends AbstractC3864v implements Ba.l<Object, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List<Ba.l<Object, C4153F>> f22567B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0321a(List<? extends Ba.l<Object, C4153F>> list) {
            super(1);
            this.f22567B = list;
        }

        public final void a(Object obj) {
            List<Ba.l<Object, C4153F>> list = this.f22567B;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).invoke(obj);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Object obj) {
            a(obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "invalid", "Landroidx/compose/runtime/snapshots/b;", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/b;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<i, androidx.compose.runtime.snapshots.b> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<Object, C4153F> f22568B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<Object, C4153F> f22569C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ba.l<Object, C4153F> lVar, Ba.l<Object, C4153F> lVar2) {
            super(1);
            this.f22568B = lVar;
            this.f22569C = lVar2;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.b invoke(i iVar) {
            int i10;
            synchronized (j.I()) {
                i10 = j.f22614e;
                j.f22614e = i10 + 1;
            }
            return new androidx.compose.runtime.snapshots.b(i10, iVar, this.f22568B, this.f22569C);
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "invalid", "Landroidx/compose/runtime/snapshots/f;", "a", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/f;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<i, f> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<Object, C4153F> f22570B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ba.l<Object, C4153F> lVar) {
            super(1);
            this.f22570B = lVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(i iVar) {
            int i10;
            synchronized (j.I()) {
                i10 = j.f22614e;
                j.f22614e = i10 + 1;
            }
            return new f(i10, iVar, this.f22570B);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i10, i iVar) {
        Ba.l c0321a;
        synchronized (j.I()) {
            List list = j.f22618i;
            c0321a = (Ba.l) r.L0(list);
            c0321a = c0321a == null ? new C0321a(list) : c0321a;
        }
        super(i10, iVar, null, c0321a);
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.b
    public androidx.compose.runtime.snapshots.b Q(Ba.l<Object, C4153F> readObserver, Ba.l<Object, C4153F> writeObserver) {
        return (androidx.compose.runtime.snapshots.b) j.b0(new b(readObserver, writeObserver));
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        synchronized (j.I()) {
            q();
            C4153F c4153f = C4153F.f46609a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void o() {
        j.B();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public g x(Ba.l<Object, C4153F> readObserver) {
        return j.b0(new c(readObserver));
    }
}
