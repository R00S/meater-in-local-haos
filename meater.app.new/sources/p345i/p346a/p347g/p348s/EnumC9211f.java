package p345i.p346a.p347g.p348s;

import okhttp3.internal.http2.Settings;

/* compiled from: DNSResultCode.java */
/* renamed from: i.a.g.s.f */
/* loaded from: classes2.dex */
public enum EnumC9211f {
    Unknown("Unknown", Settings.DEFAULT_INITIAL_WINDOW_SIZE),
    NoError("No Error", 0),
    FormErr("Format Error", 1),
    ServFail("Server Failure", 2),
    NXDomain("Non-Existent Domain", 3),
    NotImp("Not Implemented", 4),
    Refused("Query Refused", 5),
    YXDomain("Name Exists when it should not", 6),
    YXRRSet("RR Set Exists when it should not", 7),
    NXRRSet("RR Set that should exist does not", 8),
    NotAuth("Server Not Authoritative for zone", 9),
    NotZone("NotZone Name not contained in zone", 10);


    /* renamed from: s */
    private final String f35570s;

    /* renamed from: t */
    private final int f35571t;

    EnumC9211f(String str, int i2) {
        this.f35570s = str;
        this.f35571t = i2;
    }

    /* renamed from: k */
    public static EnumC9211f m29756k(int i2, int i3) {
        int i4 = (i2 & 15) | ((i3 >> 28) & 255);
        for (EnumC9211f enumC9211f : values()) {
            if (enumC9211f.f35571t == i4) {
                return enumC9211f;
            }
        }
        return Unknown;
    }

    /* renamed from: g */
    public int m29757g() {
        return this.f35571t;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m29757g();
    }
}
