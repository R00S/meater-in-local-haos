package p345i.p346a.p347g.p348s;

import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: DNSRecordClass.java */
/* renamed from: i.a.g.s.d */
/* loaded from: classes2.dex */
public enum EnumC9209d {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN("in", 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", 254),
    CLASS_ANY("any", 255);


    /* renamed from: m */
    private static InterfaceC9732b f35490m = C9733c.m32189i(EnumC9209d.class.getName());

    /* renamed from: o */
    private final String f35492o;

    /* renamed from: p */
    private final int f35493p;

    EnumC9209d(String str, int i2) {
        this.f35492o = str;
        this.f35493p = i2;
    }

    /* renamed from: g */
    public static EnumC9209d m29751g(int i2) {
        int i3 = i2 & 32767;
        for (EnumC9209d enumC9209d : values()) {
            if (enumC9209d.f35493p == i3) {
                return enumC9209d;
            }
        }
        f35490m.mo32179h("Could not find record class for index: " + i2);
        return CLASS_UNKNOWN;
    }

    /* renamed from: k */
    public int m29752k() {
        return this.f35493p;
    }

    /* renamed from: q */
    public boolean m29753q(int i2) {
        return (this == CLASS_UNKNOWN || (i2 & 32768) == 0) ? false : true;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m29752k();
    }
}
