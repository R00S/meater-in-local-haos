package p345i.p346a.p347g.p348s;

import cm.aptoide.p092pt.database.room.RoomNotification;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: DNSRecordType.java */
/* renamed from: i.a.g.s.e */
/* loaded from: classes2.dex */
public enum EnumC9210e {
    TYPE_IGNORE("ignore", 0),
    TYPE_A("a", 1),
    TYPE_NS("ns", 2),
    TYPE_MD("md", 3),
    TYPE_MF("mf", 4),
    TYPE_CNAME("cname", 5),
    TYPE_SOA("soa", 6),
    TYPE_MB("mb", 7),
    TYPE_MG("mg", 8),
    TYPE_MR("mr", 9),
    TYPE_NULL("null", 10),
    TYPE_WKS("wks", 11),
    TYPE_PTR("ptr", 12),
    TYPE_HINFO("hinfo", 13),
    TYPE_MINFO("minfo", 14),
    TYPE_MX("mx", 15),
    TYPE_TXT("txt", 16),
    TYPE_RP("rp", 17),
    TYPE_AFSDB("afsdb", 18),
    TYPE_X25("x25", 19),
    TYPE_ISDN("isdn", 20),
    TYPE_RT("rt", 21),
    TYPE_NSAP("nsap", 22),
    TYPE_NSAP_PTR("nsap-otr", 23),
    TYPE_SIG("sig", 24),
    TYPE_KEY(RoomNotification.KEY, 25),
    TYPE_PX("px", 26),
    TYPE_GPOS("gpos", 27),
    TYPE_AAAA("aaaa", 28),
    TYPE_LOC("loc", 29),
    TYPE_NXT("nxt", 30),
    TYPE_EID("eid", 31),
    TYPE_NIMLOC("nimloc", 32),
    TYPE_SRV("srv", 33),
    TYPE_ATMA("atma", 34),
    TYPE_NAPTR("naptr", 35),
    TYPE_KX("kx", 36),
    TYPE_CERT("cert", 37),
    TYPE_A6("a6", 38),
    TYPE_DNAME("dname", 39),
    TYPE_SINK("sink", 40),
    TYPE_OPT("opt", 41),
    TYPE_APL("apl", 42),
    TYPE_DS("ds", 43),
    TYPE_SSHFP("sshfp", 44),
    TYPE_RRSIG("rrsig", 46),
    TYPE_NSEC("nsec", 47),
    TYPE_DNSKEY("dnskey", 48),
    TYPE_UINFO("uinfo", 100),
    TYPE_UID("uid", 101),
    TYPE_GID("gid", 102),
    TYPE_UNSPEC("unspec", 103),
    TYPE_TKEY("tkey", 249),
    TYPE_TSIG("tsig", 250),
    TYPE_IXFR("ixfr", 251),
    TYPE_AXFR("axfr", 252),
    TYPE_MAILA("mails", 253),
    TYPE_MAILB("mailb", 254),
    TYPE_ANY("any", 255);


    /* renamed from: m0 */
    private static InterfaceC9732b f35540m0 = C9733c.m32189i(EnumC9210e.class.getName());

    /* renamed from: o0 */
    private final String f35555o0;

    /* renamed from: p0 */
    private final int f35556p0;

    EnumC9210e(String str, int i2) {
        this.f35555o0 = str;
        this.f35556p0 = i2;
    }

    /* renamed from: k */
    public static EnumC9210e m29754k(int i2) {
        for (EnumC9210e enumC9210e : values()) {
            if (enumC9210e.f35556p0 == i2) {
                return enumC9210e;
            }
        }
        f35540m0.mo32179h("Could not find record type for index: " + i2);
        return TYPE_IGNORE;
    }

    /* renamed from: g */
    public int m29755g() {
        return this.f35556p0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m29755g();
    }
}
