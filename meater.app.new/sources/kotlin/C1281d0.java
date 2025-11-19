package kotlin;

import Ba.p;
import Ha.g;
import Y.j;
import Y.l;
import java.util.List;
import kotlin.C1491B0;
import kotlin.InterfaceC1555l0;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\nR$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\f¨\u0006\u001d"}, d2 = {"LK/d0;", "", "", "initialHeightOffsetLimit", "initialHeightOffset", "initialContentOffset", "<init>", "(FFF)V", "<set-?>", "a", "LO/l0;", "e", "()F", "i", "(F)V", "heightOffsetLimit", "b", "c", "g", "contentOffset", "LO/l0;", "_heightOffset", "newOffset", "d", "h", "heightOffset", "collapsedFraction", "f", "overlappedFraction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281d0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final j<C1281d0, ?> f8290e = Y.a.a(a.f8294B, b.f8295B);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1555l0 heightOffsetLimit;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1555l0 contentOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1555l0 _heightOffset;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LY/l;", "LK/d0;", "it", "", "", "a", "(LY/l;LK/d0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.d0$a */
    static final class a extends AbstractC3864v implements p<l, C1281d0, List<? extends Float>> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f8294B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Float> invoke(l lVar, C1281d0 c1281d0) {
            return r.p(Float.valueOf(c1281d0.e()), Float.valueOf(c1281d0.d()), Float.valueOf(c1281d0.c()));
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "LK/d0;", "a", "(Ljava/util/List;)LK/d0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.d0$b */
    static final class b extends AbstractC3864v implements Ba.l<List<? extends Float>, C1281d0> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f8295B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1281d0 invoke(List<Float> list) {
            return new C1281d0(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LK/d0$c;", "", "<init>", "()V", "LY/j;", "LK/d0;", "Saver", "LY/j;", "a", "()LY/j;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.d0$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final j<C1281d0, ?> a() {
            return C1281d0.f8290e;
        }

        private Companion() {
        }
    }

    public C1281d0(float f10, float f11, float f12) {
        this.heightOffsetLimit = C1491B0.a(f10);
        this.contentOffset = C1491B0.a(f12);
        this._heightOffset = C1491B0.a(f11);
    }

    public final float b() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return d() / e();
    }

    public final float c() {
        return this.contentOffset.b();
    }

    public final float d() {
        return this._heightOffset.b();
    }

    public final float e() {
        return this.heightOffsetLimit.b();
    }

    public final float f() {
        if (e() == 0.0f) {
            return 0.0f;
        }
        return 1 - (g.j(e() - c(), e(), 0.0f) / e());
    }

    public final void g(float f10) {
        this.contentOffset.f(f10);
    }

    public final void h(float f10) {
        this._heightOffset.f(g.j(f10, e(), 0.0f));
    }

    public final void i(float f10) {
        this.heightOffsetLimit.f(f10);
    }
}
