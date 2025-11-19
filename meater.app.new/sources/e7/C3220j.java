package e7;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3220j<L> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f40698a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40699b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3220j)) {
            return false;
        }
        C3220j c3220j = (C3220j) obj;
        return this.f40698a == c3220j.f40698a && this.f40699b.equals(c3220j.f40699b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f40698a) * 31) + this.f40699b.hashCode();
    }
}
