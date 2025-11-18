package p345i.p346a.p347g.p348s;

import okhttp3.HttpUrl;

/* compiled from: DNSLabel.java */
/* renamed from: i.a.g.s.b */
/* loaded from: classes2.dex */
public enum EnumC9207b {
    Unknown(HttpUrl.FRAGMENT_ENCODE_SET, 128),
    Standard("standard label", 0),
    Compressed("compressed label", 192),
    Extended("extended label", 64);


    /* renamed from: k */
    private final String f35473k;

    /* renamed from: l */
    private final int f35474l;

    EnumC9207b(String str, int i2) {
        this.f35473k = str;
        this.f35474l = i2;
    }

    /* renamed from: k */
    public static EnumC9207b m29746k(int i2) {
        int i3 = i2 & 192;
        for (EnumC9207b enumC9207b : values()) {
            if (enumC9207b.f35474l == i3) {
                return enumC9207b;
            }
        }
        return Unknown;
    }

    /* renamed from: q */
    public static int m29747q(int i2) {
        return i2 & 63;
    }

    /* renamed from: g */
    public int m29748g() {
        return this.f35474l;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m29748g();
    }
}
