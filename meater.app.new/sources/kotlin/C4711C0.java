package kotlin;

import kotlin.AbstractC4769q;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import s.AbstractC4403m;
import s.AbstractC4405o;

/* compiled from: VectorizedAnimationSpec.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BE\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010%\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00028\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00101R\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u0010-R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u00106R\u0016\u00109\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0016\u0010:\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u00108R\u0016\u0010;\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u00108R\u0016\u0010=\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010A\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Lv/C0;", "Lv/q;", "V", "Lv/w0;", "Ls/m;", "timestamps", "Ls/o;", "Lv/B0;", "keyframes", "", "durationMillis", "delayMillis", "Lv/D;", "defaultEasing", "Lv/t;", "initialArcMode", "<init>", "(Ls/m;Ls/o;IILv/D;ILkotlin/jvm/internal/k;)V", "initialValue", "targetValue", "initialVelocity", "Loa/F;", "k", "(Lv/q;Lv/q;Lv/q;)V", "timeMillis", "", "i", "(I)F", "index", "", "asFraction", "j", "(IIZ)F", "h", "(I)I", "", "playTimeNanos", "e", "(JLv/q;Lv/q;Lv/q;)Lv/q;", "g", "a", "Ls/m;", "b", "Ls/o;", "c", "I", "()I", "d", "f", "Lv/D;", "", "[I", "modes", "", "[F", "times", "Lv/q;", "valueVector", "velocityVector", "lastInitialValue", "l", "lastTargetValue", "m", "posArray", "n", "slopeArray", "Lv/u;", "o", "Lv/u;", "arcSpline", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.C0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4711C0<V extends AbstractC4769q> implements InterfaceC4782w0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC4403m timestamps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC4405o<VectorizedKeyframeSpecElementInfo<V>> keyframes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4712D defaultEasing;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int initialArcMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int[] modes;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float[] times;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private V lastInitialValue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private V lastTargetValue;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float[] posArray;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float[] slopeArray;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private C4777u arcSpline;

    public /* synthetic */ C4711C0(AbstractC4403m abstractC4403m, AbstractC4405o abstractC4405o, int i10, int i11, InterfaceC4712D interfaceC4712D, int i12, C3854k c3854k) {
        this(abstractC4403m, abstractC4405o, i10, i11, interfaceC4712D, i12);
    }

    private final int h(int timeMillis) {
        int iB = C4727P.b(this.timestamps, timeMillis, 0, 0, 6, null);
        return iB < -1 ? -(iB + 2) : iB;
    }

    private final float i(int timeMillis) {
        return j(h(timeMillis), timeMillis, false);
    }

    private final float j(int index, int timeMillis, boolean asFraction) {
        InterfaceC4712D easing;
        float f10;
        AbstractC4403m abstractC4403m = this.timestamps;
        if (index >= abstractC4403m._size - 1) {
            f10 = timeMillis;
        } else {
            int iA = abstractC4403m.a(index);
            int iA2 = this.timestamps.a(index + 1);
            if (timeMillis == iA) {
                f10 = iA;
            } else {
                int i10 = iA2 - iA;
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC = this.keyframes.c(iA);
                if (vectorizedKeyframeSpecElementInfoC == null || (easing = vectorizedKeyframeSpecElementInfoC.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f11 = i10;
                float fA = easing.a((timeMillis - iA) / f11);
                if (asFraction) {
                    return fA;
                }
                f10 = (f11 * fA) + iA;
            }
        }
        return f10 / 1000;
    }

    private final void k(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        float[] fArr2;
        boolean z10 = this.arcSpline != null;
        if (this.valueVector == null) {
            this.valueVector = (V) C4771r.g(initialValue);
            this.velocityVector = (V) C4771r.g(initialVelocity);
            int i10 = this.timestamps.get_size();
            float[] fArr3 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr3[i11] = this.timestamps.a(i11) / 1000;
            }
            this.times = fArr3;
            int i12 = this.timestamps.get_size();
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC = this.keyframes.c(this.timestamps.a(i13));
                int arcMode = vectorizedKeyframeSpecElementInfoC != null ? vectorizedKeyframeSpecElementInfoC.getArcMode() : this.initialArcMode;
                if (!C4775t.c(arcMode, C4775t.INSTANCE.a())) {
                    z10 = true;
                }
                iArr[i13] = arcMode;
            }
            this.modes = iArr;
        }
        if (z10) {
            float[] fArr4 = null;
            if (this.arcSpline != null) {
                V v10 = this.lastInitialValue;
                if (v10 == null) {
                    C3862t.u("lastInitialValue");
                    v10 = null;
                }
                if (C3862t.b(v10, initialValue)) {
                    V v11 = this.lastTargetValue;
                    if (v11 == null) {
                        C3862t.u("lastTargetValue");
                        v11 = null;
                    }
                    if (C3862t.b(v11, targetValue)) {
                        return;
                    }
                }
            }
            this.lastInitialValue = initialValue;
            this.lastTargetValue = targetValue;
            int size = (initialValue.getSize() % 2) + initialValue.getSize();
            this.posArray = new float[size];
            this.slopeArray = new float[size];
            int i14 = this.timestamps.get_size();
            float[][] fArr5 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iA = this.timestamps.a(i15);
                if (iA != 0) {
                    if (iA != getDurationMillis()) {
                        fArr = new float[size];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC2 = this.keyframes.c(iA);
                        C3862t.d(vectorizedKeyframeSpecElementInfoC2);
                        AbstractC4769q abstractC4769qC = vectorizedKeyframeSpecElementInfoC2.c();
                        for (int i16 = 0; i16 < size; i16++) {
                            fArr[i16] = abstractC4769qC.a(i16);
                        }
                    } else if (this.keyframes.a(iA)) {
                        fArr = new float[size];
                        VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC3 = this.keyframes.c(iA);
                        C3862t.d(vectorizedKeyframeSpecElementInfoC3);
                        AbstractC4769q abstractC4769qC2 = vectorizedKeyframeSpecElementInfoC3.c();
                        for (int i17 = 0; i17 < size; i17++) {
                            fArr[i17] = abstractC4769qC2.a(i17);
                        }
                    } else {
                        fArr2 = new float[size];
                        for (int i18 = 0; i18 < size; i18++) {
                            fArr2[i18] = targetValue.a(i18);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.keyframes.a(iA)) {
                    fArr = new float[size];
                    VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC4 = this.keyframes.c(iA);
                    C3862t.d(vectorizedKeyframeSpecElementInfoC4);
                    AbstractC4769q abstractC4769qC3 = vectorizedKeyframeSpecElementInfoC4.c();
                    for (int i19 = 0; i19 < size; i19++) {
                        fArr[i19] = abstractC4769qC3.a(i19);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[size];
                    for (int i20 = 0; i20 < size; i20++) {
                        fArr2[i20] = initialValue.a(i20);
                    }
                }
                fArr5[i15] = fArr2;
            }
            int[] iArr2 = this.modes;
            if (iArr2 == null) {
                C3862t.u("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.times;
            if (fArr6 == null) {
                C3862t.u("times");
            } else {
                fArr4 = fArr6;
            }
            this.arcSpline = new C4777u(iArr2, fArr4, fArr5);
        }
    }

    @Override // kotlin.InterfaceC4782w0
    /* renamed from: c, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // kotlin.InterfaceC4776t0
    public V e(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int iB = (int) C4778u0.b(this, playTimeNanos / 1000000);
        if (this.keyframes.a(iB)) {
            VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC = this.keyframes.c(iB);
            C3862t.d(vectorizedKeyframeSpecElementInfoC);
            return (V) vectorizedKeyframeSpecElementInfoC.c();
        }
        if (iB >= getDurationMillis()) {
            return targetValue;
        }
        if (iB <= 0) {
            return initialValue;
        }
        k(initialValue, targetValue, initialVelocity);
        int i10 = 0;
        if (this.arcSpline == null) {
            int iH = h(iB);
            float fJ = j(iH, iB, true);
            int iA = this.timestamps.a(iH);
            if (this.keyframes.a(iA)) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC2 = this.keyframes.c(iA);
                C3862t.d(vectorizedKeyframeSpecElementInfoC2);
                initialValue = (V) vectorizedKeyframeSpecElementInfoC2.c();
            }
            int iA2 = this.timestamps.a(iH + 1);
            if (this.keyframes.a(iA2)) {
                VectorizedKeyframeSpecElementInfo<V> vectorizedKeyframeSpecElementInfoC3 = this.keyframes.c(iA2);
                C3862t.d(vectorizedKeyframeSpecElementInfoC3);
                targetValue = (V) vectorizedKeyframeSpecElementInfoC3.c();
            }
            V v10 = this.valueVector;
            if (v10 == null) {
                C3862t.u("valueVector");
                v10 = null;
            }
            int size = v10.getSize();
            while (i10 < size) {
                V v11 = this.valueVector;
                if (v11 == null) {
                    C3862t.u("valueVector");
                    v11 = null;
                }
                v11.e(i10, C4774s0.k(initialValue.a(i10), targetValue.a(i10), fJ));
                i10++;
            }
            V v12 = this.valueVector;
            if (v12 != null) {
                return v12;
            }
            C3862t.u("valueVector");
            return null;
        }
        float fI = i(iB);
        C4777u c4777u = this.arcSpline;
        if (c4777u == null) {
            C3862t.u("arcSpline");
            c4777u = null;
        }
        float[] fArr = this.posArray;
        if (fArr == null) {
            C3862t.u("posArray");
            fArr = null;
        }
        c4777u.a(fI, fArr);
        float[] fArr2 = this.posArray;
        if (fArr2 == null) {
            C3862t.u("posArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i10 < length) {
            V v13 = this.valueVector;
            if (v13 == null) {
                C3862t.u("valueVector");
                v13 = null;
            }
            float[] fArr3 = this.posArray;
            if (fArr3 == null) {
                C3862t.u("posArray");
                fArr3 = null;
            }
            v13.e(i10, fArr3[i10]);
            i10++;
        }
        V v14 = this.valueVector;
        if (v14 != null) {
            return v14;
        }
        C3862t.u("valueVector");
        return null;
    }

    @Override // kotlin.InterfaceC4782w0
    /* renamed from: f, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // kotlin.InterfaceC4776t0
    public V g(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long jB = C4778u0.b(this, playTimeNanos / 1000000);
        if (jB < 0) {
            return initialVelocity;
        }
        k(initialValue, targetValue, initialVelocity);
        int i10 = 0;
        if (this.arcSpline == null) {
            AbstractC4769q abstractC4769qD = C4778u0.d(this, jB - 1, initialValue, targetValue, initialVelocity);
            AbstractC4769q abstractC4769qD2 = C4778u0.d(this, jB, initialValue, targetValue, initialVelocity);
            int size = abstractC4769qD.getSize();
            while (i10 < size) {
                V v10 = this.velocityVector;
                if (v10 == null) {
                    C3862t.u("velocityVector");
                    v10 = null;
                }
                v10.e(i10, (abstractC4769qD.a(i10) - abstractC4769qD2.a(i10)) * 1000.0f);
                i10++;
            }
            V v11 = this.velocityVector;
            if (v11 != null) {
                return v11;
            }
            C3862t.u("velocityVector");
            return null;
        }
        float fI = i((int) jB);
        C4777u c4777u = this.arcSpline;
        if (c4777u == null) {
            C3862t.u("arcSpline");
            c4777u = null;
        }
        float[] fArr = this.slopeArray;
        if (fArr == null) {
            C3862t.u("slopeArray");
            fArr = null;
        }
        c4777u.b(fI, fArr);
        float[] fArr2 = this.slopeArray;
        if (fArr2 == null) {
            C3862t.u("slopeArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i10 < length) {
            V v12 = this.velocityVector;
            if (v12 == null) {
                C3862t.u("velocityVector");
                v12 = null;
            }
            float[] fArr3 = this.slopeArray;
            if (fArr3 == null) {
                C3862t.u("slopeArray");
                fArr3 = null;
            }
            v12.e(i10, fArr3[i10]);
            i10++;
        }
        V v13 = this.velocityVector;
        if (v13 != null) {
            return v13;
        }
        C3862t.u("velocityVector");
        return null;
    }

    private C4711C0(AbstractC4403m abstractC4403m, AbstractC4405o<VectorizedKeyframeSpecElementInfo<V>> abstractC4405o, int i10, int i11, InterfaceC4712D interfaceC4712D, int i12) {
        this.timestamps = abstractC4403m;
        this.keyframes = abstractC4405o;
        this.durationMillis = i10;
        this.delayMillis = i11;
        this.defaultEasing = interfaceC4712D;
        this.initialArcMode = i12;
    }
}
