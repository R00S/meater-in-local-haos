package p345i.p346a.p347g.p348s;

import okhttp3.internal.http2.Settings;

/* compiled from: DNSOptionCode.java */
/* renamed from: i.a.g.s.c */
/* loaded from: classes2.dex */
public enum EnumC9208c {
    Unknown("Unknown", Settings.DEFAULT_INITIAL_WINDOW_SIZE),
    LLQ("LLQ", 1),
    UL("UL", 2),
    NSID("NSID", 3),
    Owner("Owner", 4);


    /* renamed from: l */
    private final String f35481l;

    /* renamed from: m */
    private final int f35482m;

    EnumC9208c(String str, int i2) {
        this.f35481l = str;
        this.f35482m = i2;
    }

    /* renamed from: k */
    public static EnumC9208c m29749k(int i2) {
        for (EnumC9208c enumC9208c : values()) {
            if (enumC9208c.f35482m == i2) {
                return enumC9208c;
            }
        }
        return Unknown;
    }

    /* renamed from: g */
    public int m29750g() {
        return this.f35482m;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m29750g();
    }
}
