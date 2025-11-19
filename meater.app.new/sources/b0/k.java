package b0;

import Ba.p;
import kotlin.Metadata;
import ta.g;

/* compiled from: MotionDurationScale.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lb0/k;", "Lta/g$b;", "", "z", "()F", "scaleFactor", "Lta/g$c;", "getKey", "()Lta/g$c;", "key", "n", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface k extends g.b {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f29934B;

    /* compiled from: MotionDurationScale.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R a(k kVar, R r10, p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(kVar, r10, pVar);
        }

        public static <E extends g.b> E b(k kVar, g.c<E> cVar) {
            return (E) g.b.a.b(kVar, cVar);
        }

        public static ta.g c(k kVar, g.c<?> cVar) {
            return g.b.a.c(kVar, cVar);
        }

        public static ta.g d(k kVar, ta.g gVar) {
            return g.b.a.d(kVar, gVar);
        }
    }

    /* compiled from: MotionDurationScale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lb0/k$b;", "Lta/g$c;", "Lb0/k;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: b0.k$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<k> {

        /* renamed from: B, reason: collision with root package name */
        static final /* synthetic */ Companion f29934B = new Companion();

        private Companion() {
        }
    }

    @Override // ta.g.b
    default g.c<?> getKey() {
        return INSTANCE;
    }

    float z();
}
