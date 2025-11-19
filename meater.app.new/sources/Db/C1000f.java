package Db;

import kotlin.jvm.internal.C3862t;
import lb.C3922b;
import lb.C3934n;
import nb.InterfaceC4077c;
import vb.AbstractC4943g;

/* compiled from: AnnotationAndConstantLoaderImpl.kt */
/* renamed from: Db.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1000f extends AbstractC0995a<Sa.c> implements InterfaceC0999e<Sa.c, AbstractC4943g<?>> {

    /* renamed from: b, reason: collision with root package name */
    private final C1001g f3674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1000f(Ra.H module, Ra.M notFoundClasses, Cb.a protocol) {
        super(protocol);
        C3862t.g(module, "module");
        C3862t.g(notFoundClasses, "notFoundClasses");
        C3862t.g(protocol, "protocol");
        this.f3674b = new C1001g(module, notFoundClasses);
    }

    @Override // Db.InterfaceC1002h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Sa.c k(C3922b proto, InterfaceC4077c nameResolver) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        return this.f3674b.a(proto, nameResolver);
    }

    @Override // Db.InterfaceC0999e
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC4943g<?> h(N container, C3934n proto, Hb.U expectedType) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        C3862t.g(expectedType, "expectedType");
        return null;
    }

    @Override // Db.InterfaceC0999e
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC4943g<?> b(N container, C3934n proto, Hb.U expectedType) {
        C3862t.g(container, "container");
        C3862t.g(proto, "proto");
        C3862t.g(expectedType, "expectedType");
        C3922b.C0595b.c cVar = (C3922b.C0595b.c) nb.e.a(proto, m().b());
        if (cVar == null) {
            return null;
        }
        return this.f3674b.f(expectedType, cVar, container.b());
    }
}
