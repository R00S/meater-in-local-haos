package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import c7.C2335d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import e7.InterfaceC3215e;
import e7.InterfaceC3222l;
import g7.AbstractC3433d;
import g7.C3434e;
import g7.C3445p;
import g7.InterfaceC3439j;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class a<O extends d> {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0458a f33468a;

    /* renamed from: b, reason: collision with root package name */
    private final g f33469b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33470c;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0458a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, C3434e c3434e, O o10, c.a aVar, c.b bVar) {
            return (T) b(context, looper, c3434e, o10, aVar, bVar);
        }

        public T b(Context context, Looper looper, C3434e c3434e, O o10, InterfaceC3215e interfaceC3215e, InterfaceC3222l interfaceC3222l) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface d {

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0459a extends d {
            Account b();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        public interface b extends d {
            GoogleSignInAccount a();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static abstract class e<T extends b, O> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface f extends b {
        void a(AbstractC3433d.c cVar);

        Set<Scope> b();

        void c(String str);

        boolean d();

        String e();

        void f(InterfaceC3439j interfaceC3439j, Set<Scope> set);

        void g();

        boolean h();

        boolean i();

        int j();

        C2335d[] k();

        void l(AbstractC3433d.e eVar);

        String m();

        boolean n();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC0458a<C, O> abstractC0458a, g<C> gVar) {
        C3445p.l(abstractC0458a, "Cannot construct an Api with a null ClientBuilder");
        C3445p.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f33470c = str;
        this.f33468a = abstractC0458a;
        this.f33469b = gVar;
    }

    public final AbstractC0458a a() {
        return this.f33468a;
    }

    public final c b() {
        return this.f33469b;
    }

    public final String c() {
        return this.f33470c;
    }
}
