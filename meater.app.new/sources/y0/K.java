package y0;

import java.util.Map;
import kotlin.Metadata;
import oa.C4153F;
import x0.C5047a;
import y0.Z;

/* compiled from: MeasureScope.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JI\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJa\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Ly0/K;", "Ly0/r;", "", "width", "height", "", "Ly0/a;", "alignmentLines", "Lkotlin/Function1;", "Ly0/Z$a;", "Loa/F;", "placementBlock", "Ly0/J;", "h0", "(IILjava/util/Map;LBa/l;)Ly0/J;", "Ly0/f0;", "rulers", "m0", "(IILjava/util/Map;LBa/l;LBa/l;)Ly0/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface K extends r {

    /* compiled from: MeasureScope.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"y0/K$a", "Ly0/J;", "Loa/F;", "e", "()V", "", "a", "I", "b", "()I", "width", "height", "", "Ly0/a;", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Ly0/f0;", "LBa/l;", "j", "()LBa/l;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<AbstractC5096a, Integer> alignmentLines;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Ba.l<f0, C4153F> rulers;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f52981e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ K f52982f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ba.l<Z.a, C4153F> f52983g;

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<AbstractC5096a, Integer> map, Ba.l<? super f0, C4153F> lVar, K k10, Ba.l<? super Z.a, C4153F> lVar2) {
            this.f52981e = i10;
            this.f52982f = k10;
            this.f52983g = lVar2;
            this.width = i10;
            this.height = i11;
            this.alignmentLines = map;
            this.rulers = lVar;
        }

        @Override // y0.J
        /* renamed from: a, reason: from getter */
        public int getF465b() {
            return this.height;
        }

        @Override // y0.J
        /* renamed from: b, reason: from getter */
        public int getF464a() {
            return this.width;
        }

        @Override // y0.J
        public Map<AbstractC5096a, Integer> d() {
            return this.alignmentLines;
        }

        @Override // y0.J
        public void e() {
            K k10 = this.f52982f;
            if (k10 instanceof A0.P) {
                this.f52983g.invoke(((A0.P) k10).getPlacementScope());
            } else {
                this.f52983g.invoke(new i0(this.f52981e, this.f52982f.getLayoutDirection()));
            }
        }

        @Override // y0.J
        public Ba.l<f0, C4153F> j() {
            return this.rulers;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ J E1(K k10, int i10, int i11, Map map, Ba.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = kotlin.collections.M.h();
        }
        return k10.h0(i10, i11, map, lVar);
    }

    default J h0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, Ba.l<? super Z.a, C4153F> placementBlock) {
        return m0(width, height, alignmentLines, null, placementBlock);
    }

    default J m0(int width, int height, Map<AbstractC5096a, Integer> alignmentLines, Ba.l<? super f0, C4153F> rulers, Ba.l<? super Z.a, C4153F> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            C5047a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers, this, placementBlock);
    }
}
