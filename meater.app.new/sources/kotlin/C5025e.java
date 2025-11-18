package kotlin;

import Ba.l;
import android.content.Context;
import androidx.compose.ui.platform.M;
import kotlin.AbstractC1501G0;
import kotlin.C1576w;
import kotlin.C4755j;
import kotlin.CubicBezierEasing;
import kotlin.InterfaceC1574v;
import kotlin.InterfaceC4753i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: BringIntoViewSpec.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\"&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004\" \u0010\f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"LO/G0;", "Lx/d;", "a", "LO/G0;", "()LO/G0;", "getLocalBringIntoViewSpec$annotations", "()V", "LocalBringIntoViewSpec", "b", "Lx/d;", "()Lx/d;", "getPivotBringIntoViewSpec$annotations", "PivotBringIntoViewSpec", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5025e {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC1501G0<InterfaceC5024d> f52339a = C1576w.e(a.f52341B);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC5024d f52340b = new b();

    /* compiled from: BringIntoViewSpec.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/v;", "Lx/d;", "a", "(LO/v;)Lx/d;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.e$a */
    static final class a extends AbstractC3864v implements l<InterfaceC1574v, InterfaceC5024d> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f52341B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5024d invoke(InterfaceC1574v interfaceC1574v) {
            return !((Context) interfaceC1574v.f(M.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? InterfaceC5024d.INSTANCE.b() : C5025e.b();
        }
    }

    /* compiled from: BringIntoViewSpec.android.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"x/e$b", "Lx/d;", "", "offset", "size", "containerSize", "a", "(FFF)F", "b", "F", "getParentFraction", "()F", "parentFraction", "c", "getChildFraction", "childFraction", "Lv/i;", "d", "Lv/i;", "()Lv/i;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.e$b */
    public static final class b implements InterfaceC5024d {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float childFraction;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float parentFraction = 0.3f;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4753i<Float> scrollAnimationSpec = C4755j.j(125, 0, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 2, null);

        b() {
        }

        @Override // kotlin.InterfaceC5024d
        public float a(float offset, float size, float containerSize) {
            float fAbs = Math.abs((size + offset) - offset);
            boolean z10 = fAbs <= containerSize;
            float f10 = (this.parentFraction * containerSize) - (this.childFraction * fAbs);
            float f11 = containerSize - f10;
            if (z10 && f11 < fAbs) {
                f10 = containerSize - fAbs;
            }
            return offset - f10;
        }

        @Override // kotlin.InterfaceC5024d
        public InterfaceC4753i<Float> b() {
            return this.scrollAnimationSpec;
        }
    }

    public static final AbstractC1501G0<InterfaceC5024d> a() {
        return f52339a;
    }

    public static final InterfaceC5024d b() {
        return f52340b;
    }
}
