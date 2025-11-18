package d8;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3063g {

    /* renamed from: a, reason: collision with root package name */
    private C3070n f39759a;

    /* synthetic */ C3063g(C3062f c3062f) {
    }

    public final InterfaceC3061e a() {
        C3070n c3070n = this.f39759a;
        if (c3070n != null) {
            return new C3056C(c3070n, null);
        }
        throw new IllegalStateException(String.valueOf(C3070n.class.getCanonicalName()).concat(" must be set"));
    }

    public final C3063g b(C3070n c3070n) {
        this.f39759a = c3070n;
        return this;
    }
}
