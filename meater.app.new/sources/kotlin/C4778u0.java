package kotlin;

import Ha.f;
import Ha.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.J;
import kotlin.collections.r;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0013\u001a\u00020\u0012\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv/q;", "V", "Lv/t0;", "", "playTimeMillis", "start", "end", "startVelocity", "d", "(Lv/t0;JLv/q;Lv/q;Lv/q;)Lv/q;", "Lv/w0;", "playTime", "b", "(Lv/w0;J)J", "visibilityThreshold", "", "dampingRatio", "stiffness", "Lv/s;", "c", "(Lv/q;FF)Lv/s;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4778u0 {

    /* compiled from: VectorizedAnimationSpec.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"v/u0$a", "Lv/s;", "", "index", "Lv/J;", "a", "(I)Lv/J;", "", "Ljava/util/List;", "anims", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.u0$a */
    public static final class a implements InterfaceC4773s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<C4721J> anims;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(AbstractC4769q abstractC4769q, float f10, float f11) {
            f fVarP = g.p(0, abstractC4769q.getSize());
            ArrayList arrayList = new ArrayList(r.x(fVarP, 10));
            Iterator<Integer> it = fVarP.iterator();
            while (it.hasNext()) {
                arrayList.add(new C4721J(f10, f11, abstractC4769q.a(((J) it).b())));
            }
            this.anims = arrayList;
        }

        @Override // kotlin.InterfaceC4773s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4721J get(int index) {
            return this.anims.get(index);
        }
    }

    /* compiled from: VectorizedAnimationSpec.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"v/u0$b", "Lv/s;", "", "index", "Lv/J;", "a", "(I)Lv/J;", "Lv/J;", "anim", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.u0$b */
    public static final class b implements InterfaceC4773s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final C4721J anim;

        b(float f10, float f11) {
            this.anim = new C4721J(f10, f11, 0.0f, 4, null);
        }

        @Override // kotlin.InterfaceC4773s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4721J get(int index) {
            return this.anim;
        }
    }

    public static final long b(InterfaceC4782w0<?> interfaceC4782w0, long j10) {
        return g.l(j10 - interfaceC4782w0.getDelayMillis(), 0L, interfaceC4782w0.getDurationMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends AbstractC4769q> InterfaceC4773s c(V v10, float f10, float f11) {
        return v10 != null ? new a(v10, f10, f11) : new b(f10, f11);
    }

    public static final <V extends AbstractC4769q> V d(InterfaceC4776t0<V> interfaceC4776t0, long j10, V v10, V v11, V v12) {
        return (V) interfaceC4776t0.e(j10 * 1000000, v10, v11, v12);
    }
}
