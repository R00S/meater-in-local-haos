package p241e.p254e.p255a;

/* renamed from: e.e.a.a */
/* loaded from: classes2.dex */
public enum EnumC8781a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");


    /* renamed from: k */
    private final String f33398k;

    EnumC8781a(String str) {
        this.f33398k = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33398k;
    }
}
