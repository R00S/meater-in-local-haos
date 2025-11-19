package Zc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ResolutionContext.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010!\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b\u0012\u0010 ¨\u0006\""}, d2 = {"LZc/d;", "", "Lad/c;", "logger", "Lfd/a;", "scope", "LIa/d;", "clazz", "Ldd/a;", "qualifier", "Lcd/a;", "parameters", "<init>", "(Lad/c;Lfd/a;LIa/d;Ldd/a;Lcd/a;)V", "a", "Lad/c;", "c", "()Lad/c;", "b", "Lfd/a;", "f", "()Lfd/a;", "LIa/d;", "()LIa/d;", "d", "Ldd/a;", "e", "()Ldd/a;", "Lcd/a;", "()Lcd/a;", "", "Ljava/lang/String;", "()Ljava/lang/String;", "debugTag", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ad.c logger;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fd.a scope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ia.d<?> clazz;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dd.a qualifier;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final cd.a parameters;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String debugTag;

    public d(ad.c logger, fd.a scope, Ia.d<?> clazz, dd.a aVar, cd.a aVar2) {
        C3862t.g(logger, "logger");
        C3862t.g(scope, "scope");
        C3862t.g(clazz, "clazz");
        this.logger = logger;
        this.scope = scope;
        this.clazz = clazz;
        this.qualifier = aVar;
        this.parameters = aVar2;
        this.debugTag = "t:'" + id.a.a(clazz) + "' - q:'" + aVar + '\'';
    }

    public final Ia.d<?> a() {
        return this.clazz;
    }

    /* renamed from: b, reason: from getter */
    public final String getDebugTag() {
        return this.debugTag;
    }

    /* renamed from: c, reason: from getter */
    public final ad.c getLogger() {
        return this.logger;
    }

    /* renamed from: d, reason: from getter */
    public final cd.a getParameters() {
        return this.parameters;
    }

    /* renamed from: e, reason: from getter */
    public final dd.a getQualifier() {
        return this.qualifier;
    }

    /* renamed from: f, reason: from getter */
    public final fd.a getScope() {
        return this.scope;
    }

    public /* synthetic */ d(ad.c cVar, fd.a aVar, Ia.d dVar, dd.a aVar2, cd.a aVar3, int i10, C3854k c3854k) {
        this(cVar, aVar, dVar, (i10 & 8) != 0 ? null : aVar2, (i10 & 16) != 0 ? null : aVar3);
    }
}
