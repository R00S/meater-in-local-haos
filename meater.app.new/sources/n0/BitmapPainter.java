package n0;

import U0.n;
import U0.r;
import U0.s;
import h0.C3482m;
import i0.C0;
import i0.C3604u0;
import i0.H0;
import k0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: BitmapPainter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010&R(\u0010-\u001a\u00020(8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\u0002038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b%\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Ln0/a;", "Ln0/b;", "Li0/H0;", "image", "LU0/n;", "srcOffset", "LU0/r;", "srcSize", "<init>", "(Li0/H0;JJLkotlin/jvm/internal/k;)V", "k", "(JJ)J", "Lk0/f;", "Loa/F;", "j", "(Lk0/f;)V", "", "alpha", "", "a", "(F)Z", "Li0/u0;", "colorFilter", "b", "(Li0/u0;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "g", "Li0/H0;", "h", "J", "i", "Li0/C0;", "I", "getFilterQuality-f-v9h1I$ui_graphics_release", "setFilterQuality-vDHp3xo$ui_graphics_release", "(I)V", "filterQuality", "size", "l", "F", "m", "Li0/u0;", "Lh0/m;", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class BitmapPainter extends AbstractC4051b {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final H0 image;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcOffset;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private int filterQuality;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private C3604u0 colorFilter;

    public /* synthetic */ BitmapPainter(H0 h02, long j10, long j11, C3854k c3854k) {
        this(h02, j10, j11);
    }

    private final long k(long srcOffset, long srcSize) {
        if (n.h(srcOffset) < 0 || n.i(srcOffset) < 0 || r.g(srcSize) < 0 || r.f(srcSize) < 0 || r.g(srcSize) > this.image.b() || r.f(srcSize) > this.image.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return srcSize;
    }

    @Override // n0.AbstractC4051b
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // n0.AbstractC4051b
    protected boolean b(C3604u0 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) other;
        return C3862t.b(this.image, bitmapPainter.image) && n.g(this.srcOffset, bitmapPainter.srcOffset) && r.e(this.srcSize, bitmapPainter.srcSize) && C0.d(this.filterQuality, bitmapPainter.filterQuality);
    }

    @Override // n0.AbstractC4051b
    public long h() {
        return s.d(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + n.j(this.srcOffset)) * 31) + r.h(this.srcSize)) * 31) + C0.e(this.filterQuality);
    }

    @Override // n0.AbstractC4051b
    protected void j(f fVar) {
        f.e0(fVar, this.image, this.srcOffset, this.srcSize, 0L, s.a(Math.round(C3482m.i(fVar.C())), Math.round(C3482m.g(fVar.C()))), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) n.m(this.srcOffset)) + ", srcSize=" + ((Object) r.i(this.srcSize)) + ", filterQuality=" + ((Object) C0.f(this.filterQuality)) + ')';
    }

    public /* synthetic */ BitmapPainter(H0 h02, long j10, long j11, int i10, C3854k c3854k) {
        this(h02, (i10 & 2) != 0 ? n.INSTANCE.a() : j10, (i10 & 4) != 0 ? s.a(h02.b(), h02.a()) : j11, null);
    }

    private BitmapPainter(H0 h02, long j10, long j11) {
        this.image = h02;
        this.srcOffset = j10;
        this.srcSize = j11;
        this.filterQuality = C0.INSTANCE.a();
        this.size = k(j10, j11);
        this.alpha = 1.0f;
    }
}
