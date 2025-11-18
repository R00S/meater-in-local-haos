package B9;

/* compiled from: Constants.java */
/* loaded from: classes2.dex */
public enum c {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");


    /* renamed from: B, reason: collision with root package name */
    private String f1924B;

    c(String str) {
        this.f1924B = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1924B;
    }
}
