package kotlin;

import Ha.g;
import java.util.Iterator;
import kotlin.AbstractC4769q;
import kotlin.Metadata;
import kotlin.collections.J;
import kotlin.jvm.internal.C3862t;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001e"}, d2 = {"Lv/y0;", "Lv/q;", "V", "Lv/x0;", "Lv/s;", "anims", "<init>", "(Lv/s;)V", "Lv/H;", "anim", "(Lv/H;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLv/q;Lv/q;Lv/q;)Lv/q;", "g", "d", "(Lv/q;Lv/q;Lv/q;)Lv/q;", "b", "(Lv/q;Lv/q;Lv/q;)J", "a", "Lv/s;", "Lv/q;", "valueVector", "c", "velocityVector", "endVelocityVector", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4786y0<V extends AbstractC4769q> implements InterfaceC4784x0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4773s anims;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V endVelocityVector;

    /* compiled from: VectorizedAnimationSpec.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"v/y0$a", "Lv/s;", "", "index", "Lv/H;", "get", "(I)Lv/H;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.y0$a */
    public static final class a implements InterfaceC4773s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC4719H f50978a;

        a(InterfaceC4719H interfaceC4719H) {
            this.f50978a = interfaceC4719H;
        }

        @Override // kotlin.InterfaceC4773s
        public InterfaceC4719H get(int index) {
            return this.f50978a;
        }
    }

    public C4786y0(InterfaceC4773s interfaceC4773s) {
        this.anims = interfaceC4773s;
    }

    @Override // kotlin.InterfaceC4776t0
    public long b(V initialValue, V targetValue, V initialVelocity) {
        Iterator<Integer> it = g.p(0, initialValue.getSize()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iB = ((J) it).b();
            jMax = Math.max(jMax, this.anims.get(iB).c(initialValue.a(iB), targetValue.a(iB), initialVelocity.a(iB)));
        }
        return jMax;
    }

    @Override // kotlin.InterfaceC4776t0
    public V d(V initialValue, V targetValue, V initialVelocity) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) C4771r.g(initialVelocity);
        }
        V v10 = this.endVelocityVector;
        if (v10 == null) {
            C3862t.u("endVelocityVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.endVelocityVector;
            if (v11 == null) {
                C3862t.u("endVelocityVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).d(initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.endVelocityVector;
        if (v12 != null) {
            return v12;
        }
        C3862t.u("endVelocityVector");
        return null;
    }

    @Override // kotlin.InterfaceC4776t0
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) C4771r.g(initialValue);
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            C3862t.u("valueVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.valueVector;
            if (v11 == null) {
                C3862t.u("valueVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).e(playTimeNanos, initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.valueVector;
        if (v12 != null) {
            return v12;
        }
        C3862t.u("valueVector");
        return null;
    }

    @Override // kotlin.InterfaceC4776t0
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) C4771r.g(initialVelocity);
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            C3862t.u("velocityVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.velocityVector;
            if (v11 == null) {
                C3862t.u("velocityVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).b(playTimeNanos, initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.velocityVector;
        if (v12 != null) {
            return v12;
        }
        C3862t.u("velocityVector");
        return null;
    }

    public C4786y0(InterfaceC4719H interfaceC4719H) {
        this(new a(interfaceC4719H));
    }
}
