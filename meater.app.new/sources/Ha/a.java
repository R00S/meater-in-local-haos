package Ha;

import kotlin.Metadata;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"LHa/a;", "LHa/b;", "", "start", "endInclusive", "<init>", "(FF)V", "", "d", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "B", "F", "_start", "C", "_endInclusive", "b", "()Ljava/lang/Float;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class a implements b<Float> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final float _start;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final float _endInclusive;

    public a(float f10, float f11) {
        this._start = f10;
        this._endInclusive = f11;
    }

    @Override // Ha.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float h() {
        return Float.valueOf(this._endInclusive);
    }

    @Override // Ha.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float c() {
        return Float.valueOf(this._start);
    }

    public boolean d() {
        return this._start > this._endInclusive;
    }

    public boolean equals(Object other) {
        if (other instanceof a) {
            if (!d() || !((a) other).d()) {
                a aVar = (a) other;
                if (this._start != aVar._start || this._endInclusive != aVar._endInclusive) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (d()) {
            return -1;
        }
        return (Float.hashCode(this._start) * 31) + Float.hashCode(this._endInclusive);
    }

    public String toString() {
        return this._start + ".." + this._endInclusive;
    }
}
