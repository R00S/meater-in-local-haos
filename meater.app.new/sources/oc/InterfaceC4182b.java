package oc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import qc.C4326a;

/* compiled from: Authenticator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Loc/b;", "", "Loc/F;", "route", "Loc/D;", "response", "Loc/B;", "a", "(Loc/F;Loc/D;)Loc/B;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4182b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f46835a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC4182b f46833b = new Companion.C0647a();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC4182b f46834c = new C4326a(null, 1, null);

    /* compiled from: Authenticator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001¨\u0006\t"}, d2 = {"Loc/b$a;", "", "<init>", "()V", "Loc/b;", "JAVA_NET_AUTHENTICATOR", "Loc/b;", "NONE", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.b$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f46835a = new Companion();

        /* compiled from: Authenticator.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Loc/b$a$a;", "Loc/b;", "<init>", "()V", "Loc/F;", "route", "Loc/D;", "response", "Loc/B;", "a", "(Loc/F;Loc/D;)Loc/B;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: oc.b$a$a, reason: collision with other inner class name */
        private static final class C0647a implements InterfaceC4182b {
            @Override // oc.InterfaceC4182b
            public C4178B a(F route, C4180D response) {
                C3862t.g(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    C4178B a(F route, C4180D response);
}
