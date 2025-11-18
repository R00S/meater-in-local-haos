package androidx.datastore.preferences.protobuf;

/* compiled from: RawMessageInfo.java */
/* renamed from: androidx.datastore.preferences.protobuf.d1 */
/* loaded from: classes.dex */
final class C0367d1 implements InterfaceC0399o0 {

    /* renamed from: a */
    private final InterfaceC0405q0 f2713a;

    /* renamed from: b */
    private final String f2714b;

    /* renamed from: c */
    private final Object[] f2715c;

    /* renamed from: d */
    private final int f2716d;

    C0367d1(InterfaceC0405q0 interfaceC0405q0, String str, Object[] objArr) {
        this.f2713a = interfaceC0405q0;
        this.f2714b = str;
        this.f2715c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2716d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f2716d = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0399o0
    /* renamed from: a */
    public boolean mo2600a() {
        return (this.f2716d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0399o0
    /* renamed from: b */
    public InterfaceC0405q0 mo2601b() {
        return this.f2713a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0399o0
    /* renamed from: c */
    public EnumC0358a1 mo2602c() {
        return (this.f2716d & 1) == 1 ? EnumC0358a1.PROTO2 : EnumC0358a1.PROTO3;
    }

    /* renamed from: d */
    Object[] m2603d() {
        return this.f2715c;
    }

    /* renamed from: e */
    String m2604e() {
        return this.f2714b;
    }
}
