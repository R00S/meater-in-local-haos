package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import d7.InterfaceC3051e;
import e7.AbstractC3225o;
import e7.C3209B;
import e7.C3211a;
import e7.C3212b;
import e7.C3216f;
import e7.C3228s;
import e7.G;
import e7.InterfaceC3224n;
import e7.ServiceConnectionC3221k;
import e7.U;
import g7.AbstractC3433d;
import g7.C3434e;
import g7.C3445p;
import java.util.Collections;
import java.util.Set;
import z7.AbstractC5208j;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public abstract class b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33471a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33472b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f33473c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f33474d;

    /* renamed from: e, reason: collision with root package name */
    private final C3212b f33475e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f33476f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33477g;

    /* renamed from: h, reason: collision with root package name */
    private final c f33478h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3224n f33479i;

    /* renamed from: j, reason: collision with root package name */
    protected final C3216f f33480j;

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f33481c = new C0460a().a();

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3224n f33482a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f33483b;

        /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
        /* renamed from: com.google.android.gms.common.api.b$a$a, reason: collision with other inner class name */
        public static class C0460a {

            /* renamed from: a, reason: collision with root package name */
            private InterfaceC3224n f33484a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f33485b;

            public a a() {
                if (this.f33484a == null) {
                    this.f33484a = new C3211a();
                }
                if (this.f33485b == null) {
                    this.f33485b = Looper.getMainLooper();
                }
                return new a(this.f33484a, this.f33485b);
            }
        }

        private a(InterfaceC3224n interfaceC3224n, Account account, Looper looper) {
            this.f33482a = interfaceC3224n;
            this.f33483b = looper;
        }
    }

    private b(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        C3445p.l(context, "Null context is not permitted.");
        C3445p.l(aVar, "Api must not be null.");
        C3445p.l(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) C3445p.l(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f33471a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : f(context);
        this.f33472b = attributionTag;
        this.f33473c = aVar;
        this.f33474d = dVar;
        this.f33476f = aVar2.f33483b;
        C3212b c3212bA = C3212b.a(aVar, dVar, attributionTag);
        this.f33475e = c3212bA;
        this.f33478h = new G(this);
        C3216f c3216fT = C3216f.t(context2);
        this.f33480j = c3216fT;
        this.f33477g = c3216fT.k();
        this.f33479i = aVar2.f33482a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C3228s.u(activity, c3216fT, c3212bA);
        }
        c3216fT.E(this);
    }

    private final com.google.android.gms.common.api.internal.a m(int i10, com.google.android.gms.common.api.internal.a aVar) {
        aVar.k();
        this.f33480j.z(this, i10, aVar);
        return aVar;
    }

    private final AbstractC5208j n(int i10, AbstractC3225o abstractC3225o) {
        C5209k c5209k = new C5209k();
        this.f33480j.A(this, i10, abstractC3225o, c5209k, this.f33479i);
        return c5209k.a();
    }

    public c b() {
        return this.f33478h;
    }

    protected C3434e.a c() {
        Account accountB;
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        C3434e.a aVar = new C3434e.a();
        a.d dVar = this.f33474d;
        if (!(dVar instanceof a.d.b) || (googleSignInAccountA2 = ((a.d.b) dVar).a()) == null) {
            a.d dVar2 = this.f33474d;
            accountB = dVar2 instanceof a.d.InterfaceC0459a ? ((a.d.InterfaceC0459a) dVar2).b() : null;
        } else {
            accountB = googleSignInAccountA2.f0();
        }
        aVar.d(accountB);
        a.d dVar3 = this.f33474d;
        Set<Scope> setEmptySet = (!(dVar3 instanceof a.d.b) || (googleSignInAccountA = ((a.d.b) dVar3).a()) == null) ? Collections.emptySet() : googleSignInAccountA.B1();
        aVar.c(setEmptySet);
        aVar.e(this.f33471a.getClass().getName());
        aVar.b(this.f33471a.getPackageName());
        return aVar;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> AbstractC5208j<TResult> d(AbstractC3225o<A, TResult> abstractC3225o) {
        return n(2, abstractC3225o);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends InterfaceC3051e, A>> T e(T t10) {
        m(0, t10);
        return t10;
    }

    protected String f(Context context) {
        return null;
    }

    public final C3212b<O> g() {
        return this.f33475e;
    }

    protected String h() {
        return this.f33472b;
    }

    public Looper i() {
        return this.f33476f;
    }

    public final int j() {
        return this.f33477g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f k(Looper looper, C3209B c3209b) {
        C3434e c3434eA = c().a();
        a.f fVarA = ((a.AbstractC0458a) C3445p.k(this.f33473c.a())).a(this.f33471a, looper, c3434eA, this.f33474d, c3209b, c3209b);
        String strH = h();
        if (strH != null && (fVarA instanceof AbstractC3433d)) {
            ((AbstractC3433d) fVarA).P(strH);
        }
        if (strH != null && (fVarA instanceof ServiceConnectionC3221k)) {
            ((ServiceConnectionC3221k) fVarA).r(strH);
        }
        return fVarA;
    }

    public final U l(Context context, Handler handler) {
        return new U(context, handler, c().a());
    }

    public b(Context context, com.google.android.gms.common.api.a<O> aVar, O o10, a aVar2) {
        this(context, null, aVar, o10, aVar2);
    }
}
