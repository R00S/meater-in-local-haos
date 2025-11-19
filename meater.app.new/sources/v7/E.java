package v7;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public enum E {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: B, reason: collision with root package name */
    private final String f51503B;

    E(String str) {
        this.f51503B = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f51503B;
    }
}
