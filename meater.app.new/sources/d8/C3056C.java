package d8;

import e8.C3241d;
import e8.InterfaceC3243f;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3056C implements InterfaceC3061e {

    /* renamed from: a, reason: collision with root package name */
    private final C3056C f39736a = this;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3243f f39737b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3243f f39738c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3243f f39739d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3243f f39740e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3243f f39741f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3243f f39742g;

    /* synthetic */ C3056C(C3070n c3070n, C3055B c3055b) {
        C3072p c3072p = new C3072p(c3070n);
        this.f39737b = c3072p;
        InterfaceC3243f interfaceC3243fB = C3241d.b(new C3080x(c3072p));
        this.f39738c = interfaceC3243fB;
        InterfaceC3243f interfaceC3243fB2 = C3241d.b(new C3078v(c3072p, interfaceC3243fB));
        this.f39739d = interfaceC3243fB2;
        InterfaceC3243f interfaceC3243fB3 = C3241d.b(new C3066j(c3072p));
        this.f39740e = interfaceC3243fB3;
        InterfaceC3243f interfaceC3243fB4 = C3241d.b(new C3069m(interfaceC3243fB2, interfaceC3243fB3, c3072p));
        this.f39741f = interfaceC3243fB4;
        this.f39742g = C3241d.b(new C3071o(interfaceC3243fB4));
    }

    @Override // d8.InterfaceC3061e
    public final InterfaceC3058b a() {
        return (InterfaceC3058b) this.f39742g.a();
    }
}
