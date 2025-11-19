package tc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.C4180D;
import oc.w;

/* compiled from: ConnectInterceptor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltc/a;", "Loc/w;", "<init>", "()V", "Loc/w$a;", "chain", "Loc/D;", "a", "(Loc/w$a;)Loc/D;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final a f50056a = new a();

    private a() {
    }

    @Override // oc.w
    public C4180D a(w.a chain) {
        C3862t.g(chain, "chain");
        uc.g gVar = (uc.g) chain;
        return uc.g.c(gVar, 0, gVar.getCall().t(gVar), null, 0, 0, 0, 61, null).a(gVar.getRequest());
    }
}
