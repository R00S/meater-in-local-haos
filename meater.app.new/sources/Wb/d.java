package Wb;

import kotlin.Metadata;

/* compiled from: UuidJVM.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LWb/c;", "a", "()LWb/c;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
/* loaded from: classes3.dex */
class d {
    public static final c a() {
        byte[] bArr = new byte[16];
        a.f18495a.a().nextBytes(bArr);
        return e.f(bArr);
    }
}
