package v0;

import Ha.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3854k;
import x0.C5047a;

/* compiled from: VelocityTracker.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(¨\u0006."}, d2 = {"Lv0/c;", "", "", "isDataDifferential", "Lv0/c$a;", "strategy", "<init>", "(ZLv0/c$a;)V", "", "dataPoints", "time", "", "sampleCount", "", "b", "([F[FI)F", "", "timeMillis", "dataPoint", "Loa/F;", "a", "(JF)V", "c", "()F", "maximumVelocity", "d", "(F)F", "e", "()V", "Z", "()Z", "Lv0/c$a;", "I", "minSampleSize", "", "Lv0/a;", "[Lv0/a;", "samples", "index", "f", "[F", "reusableDataPointsArray", "g", "reusableTimeArray", "h", "reusableVelocityCoefficients", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4791c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDataDifferential;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a strategy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minSampleSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DataPointAtTime[] samples;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableDataPointsArray;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableTimeArray;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] reusableVelocityCoefficients;

    /* compiled from: VelocityTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lv0/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.c$a */
    public enum a {
        Lsq2,
        Impulse
    }

    /* compiled from: VelocityTracker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.c$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50999a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50999a = iArr;
        }
    }

    public C4791c(boolean z10, a aVar) {
        this.isDataDifferential = z10;
        this.strategy = aVar;
        if (z10 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = b.f50999a[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.minSampleSize = i11;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    private final float b(float[] dataPoints, float[] time, int sampleCount) {
        try {
            return e.i(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long timeMillis, float dataPoint) {
        int i10 = (this.index + 1) % 20;
        this.index = i10;
        e.j(this.samples, i10, timeMillis, dataPoint);
    }

    public final float c() {
        float f10;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i10 = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i10];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i11 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i10];
            if (dataPointAtTime3 == null) {
                break;
            }
            float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
            float fAbs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
            DataPointAtTime dataPointAtTime4 = (this.strategy == a.Lsq2 || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
            if (time > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = dataPointAtTime3.getDataPoint();
            fArr2[i11] = -time;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            dataPointAtTime2 = dataPointAtTime4;
        }
        if (i11 < this.minSampleSize) {
            return 0.0f;
        }
        int i12 = b.f50999a[this.strategy.ordinal()];
        if (i12 == 1) {
            f10 = e.f(fArr, fArr2, i11, this.isDataDifferential);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = b(fArr, fArr2, i11);
        }
        return f10 * 1000;
    }

    public final float d(float maximumVelocity) {
        if (!(maximumVelocity > 0.0f)) {
            C5047a.b("maximumVelocity should be a positive value. You specified=" + maximumVelocity);
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? g.f(fC, maximumVelocity) : g.c(fC, -maximumVelocity);
    }

    public final void e() {
        C3831l.x(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public /* synthetic */ C4791c(boolean z10, a aVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.Lsq2 : aVar);
    }
}
