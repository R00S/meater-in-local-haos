package p024c.p082u.p083a;

/* compiled from: SimpleSQLiteQuery.java */
/* renamed from: c.u.a.a */
/* loaded from: classes.dex */
public final class C1007a implements InterfaceC1011e {

    /* renamed from: f */
    private final String f6687f;

    /* renamed from: g */
    private final Object[] f6688g;

    public C1007a(String str, Object[] objArr) {
        this.f6687f = str;
        this.f6688g = objArr;
    }

    /* renamed from: c */
    private static void m6449c(InterfaceC1010d interfaceC1010d, int i2, Object obj) {
        if (obj == null) {
            interfaceC1010d.mo4646I0(i2);
            return;
        }
        if (obj instanceof byte[]) {
            interfaceC1010d.mo4653o0(i2, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            interfaceC1010d.mo4647L(i2, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            interfaceC1010d.mo4647L(i2, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            interfaceC1010d.mo4652h0(i2, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            interfaceC1010d.mo4652h0(i2, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            interfaceC1010d.mo4652h0(i2, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            interfaceC1010d.mo4652h0(i2, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            interfaceC1010d.mo4654w(i2, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC1010d.mo4652h0(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    /* renamed from: d */
    public static void m6450d(InterfaceC1010d interfaceC1010d, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            m6449c(interfaceC1010d, i2, obj);
        }
    }

    @Override // p024c.p082u.p083a.InterfaceC1011e
    /* renamed from: a */
    public String mo4648a() {
        return this.f6687f;
    }

    @Override // p024c.p082u.p083a.InterfaceC1011e
    /* renamed from: b */
    public void mo4649b(InterfaceC1010d interfaceC1010d) {
        m6450d(interfaceC1010d, this.f6688g);
    }

    public C1007a(String str) {
        this(str, null);
    }
}
