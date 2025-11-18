package c7;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2328F extends C2330H {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f31059f;

    /* synthetic */ C2328F(Callable callable, C2329G c2329g) {
        super();
        this.f31059f = callable;
    }

    @Override // c7.C2330H
    final String a() {
        try {
            return (String) this.f31059f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
