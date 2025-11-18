package androidx.datastore.preferences.protobuf;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes.dex */
final class d0 implements N {

    /* renamed from: a, reason: collision with root package name */
    private final P f24908a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24909b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f24910c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24911d;

    d0(P p10, String str, Object[] objArr) {
        this.f24908a = p10;
        this.f24909b = str;
        this.f24910c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f24911d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f24911d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean a() {
        return (this.f24911d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public P b() {
        return this.f24908a;
    }

    Object[] c() {
        return this.f24910c;
    }

    String d() {
        return this.f24909b;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public a0 getSyntax() {
        return (this.f24911d & 1) == 1 ? a0.PROTO2 : a0.PROTO3;
    }
}
