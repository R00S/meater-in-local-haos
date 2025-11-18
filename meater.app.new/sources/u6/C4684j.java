package u6;

import android.content.Context;
import java.security.MessageDigest;
import m6.InterfaceC3976k;
import o6.InterfaceC4139c;

/* compiled from: UnitTransformation.java */
/* renamed from: u6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4684j<T> implements InterfaceC3976k<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC3976k<?> f50496b = new C4684j();

    private C4684j() {
    }

    public static <T> C4684j<T> c() {
        return (C4684j) f50496b;
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
    }

    @Override // m6.InterfaceC3976k
    public InterfaceC4139c<T> a(Context context, InterfaceC4139c<T> interfaceC4139c, int i10, int i11) {
        return interfaceC4139c;
    }
}
