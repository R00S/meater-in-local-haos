package com.google.firebase.sessions;

import D9.h;
import I9.B;
import I9.C1195g;
import I9.F;
import I9.G;
import I9.J;
import I9.k;
import I9.x;
import K6.j;
import K8.A;
import K8.c;
import K8.d;
import K8.q;
import Xb.E;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import j9.InterfaceC3755b;
import java.util.List;
import k9.InterfaceC3810e;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: FirebaseSessionsRegistrar.kt */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LK8/c;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final A<E> backgroundDispatcher;
    private static final A<E> blockingDispatcher;
    private static final A<f> firebaseApp;
    private static final A<InterfaceC3810e> firebaseInstallationsApi;
    private static final A<F> sessionLifecycleServiceBinder;
    private static final A<K9.f> sessionsSettings;
    private static final A<j> transportFactory;

    /* compiled from: FirebaseSessionsRegistrar.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\r0\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000f0\u000f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00110\u00110\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00130\u00130\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00150\u00150\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;", "", "<init>", "()V", "", "LIBRARY_NAME", "Ljava/lang/String;", "LK8/A;", "LXb/E;", "kotlin.jvm.PlatformType", "backgroundDispatcher", "LK8/A;", "blockingDispatcher", "Lcom/google/firebase/f;", "firebaseApp", "Lk9/e;", "firebaseInstallationsApi", "LI9/F;", "sessionLifecycleServiceBinder", "LK9/f;", "sessionsSettings", "LK6/j;", "transportFactory", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    static {
        A<f> aB = A.b(f.class);
        C3862t.f(aB, "unqualified(FirebaseApp::class.java)");
        firebaseApp = aB;
        A<InterfaceC3810e> aB2 = A.b(InterfaceC3810e.class);
        C3862t.f(aB2, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = aB2;
        A<E> a10 = A.a(J8.a.class, E.class);
        C3862t.f(a10, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a10;
        A<E> a11 = A.a(J8.b.class, E.class);
        C3862t.f(a11, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a11;
        A<j> aB3 = A.b(j.class);
        C3862t.f(aB3, "unqualified(TransportFactory::class.java)");
        transportFactory = aB3;
        A<K9.f> aB4 = A.b(K9.f.class);
        C3862t.f(aB4, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = aB4;
        A<F> aB5 = A.b(F.class);
        C3862t.f(aB5, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = aB5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k getComponents$lambda$0(d dVar) {
        Object objG = dVar.g(firebaseApp);
        C3862t.f(objG, "container[firebaseApp]");
        Object objG2 = dVar.g(sessionsSettings);
        C3862t.f(objG2, "container[sessionsSettings]");
        Object objG3 = dVar.g(backgroundDispatcher);
        C3862t.f(objG3, "container[backgroundDispatcher]");
        Object objG4 = dVar.g(sessionLifecycleServiceBinder);
        C3862t.f(objG4, "container[sessionLifecycleServiceBinder]");
        return new k((f) objG, (K9.f) objG2, (g) objG3, (F) objG4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c getComponents$lambda$1(d dVar) {
        return new c(J.f6802a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$2(d dVar) {
        Object objG = dVar.g(firebaseApp);
        C3862t.f(objG, "container[firebaseApp]");
        f fVar = (f) objG;
        Object objG2 = dVar.g(firebaseInstallationsApi);
        C3862t.f(objG2, "container[firebaseInstallationsApi]");
        InterfaceC3810e interfaceC3810e = (InterfaceC3810e) objG2;
        Object objG3 = dVar.g(sessionsSettings);
        C3862t.f(objG3, "container[sessionsSettings]");
        K9.f fVar2 = (K9.f) objG3;
        InterfaceC3755b interfaceC3755bF = dVar.f(transportFactory);
        C3862t.f(interfaceC3755bF, "container.getProvider(transportFactory)");
        C1195g c1195g = new C1195g(interfaceC3755bF);
        Object objG4 = dVar.g(backgroundDispatcher);
        C3862t.f(objG4, "container[backgroundDispatcher]");
        return new B(fVar, interfaceC3810e, fVar2, c1195g, (g) objG4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K9.f getComponents$lambda$3(d dVar) {
        Object objG = dVar.g(firebaseApp);
        C3862t.f(objG, "container[firebaseApp]");
        Object objG2 = dVar.g(blockingDispatcher);
        C3862t.f(objG2, "container[blockingDispatcher]");
        Object objG3 = dVar.g(backgroundDispatcher);
        C3862t.f(objG3, "container[backgroundDispatcher]");
        Object objG4 = dVar.g(firebaseInstallationsApi);
        C3862t.f(objG4, "container[firebaseInstallationsApi]");
        return new K9.f((f) objG, (g) objG2, (g) objG3, (InterfaceC3810e) objG4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.a getComponents$lambda$4(d dVar) {
        Context contextK = ((f) dVar.g(firebaseApp)).k();
        C3862t.f(contextK, "container[firebaseApp].applicationContext");
        Object objG = dVar.g(backgroundDispatcher);
        C3862t.f(objG, "container[backgroundDispatcher]");
        return new x(contextK, (g) objG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F getComponents$lambda$5(d dVar) {
        Object objG = dVar.g(firebaseApp);
        C3862t.f(objG, "container[firebaseApp]");
        return new G((f) objG);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<K8.c<? extends Object>> getComponents() {
        c.b bVarH = K8.c.e(k.class).h(LIBRARY_NAME);
        A<f> a10 = firebaseApp;
        c.b bVarB = bVarH.b(q.k(a10));
        A<K9.f> a11 = sessionsSettings;
        c.b bVarB2 = bVarB.b(q.k(a11));
        A<E> a12 = backgroundDispatcher;
        K8.c cVarD = bVarB2.b(q.k(a12)).b(q.k(sessionLifecycleServiceBinder)).f(new K8.g() { // from class: I9.m
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(dVar);
            }
        }).e().d();
        K8.c cVarD2 = K8.c.e(c.class).h("session-generator").f(new K8.g() { // from class: I9.n
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(dVar);
            }
        }).d();
        c.b bVarB3 = K8.c.e(b.class).h("session-publisher").b(q.k(a10));
        A<InterfaceC3810e> a13 = firebaseInstallationsApi;
        return r.p(cVarD, cVarD2, bVarB3.b(q.k(a13)).b(q.k(a11)).b(q.m(transportFactory)).b(q.k(a12)).f(new K8.g() { // from class: I9.o
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$2(dVar);
            }
        }).d(), K8.c.e(K9.f.class).h("sessions-settings").b(q.k(a10)).b(q.k(blockingDispatcher)).b(q.k(a12)).b(q.k(a13)).f(new K8.g() { // from class: I9.p
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$3(dVar);
            }
        }).d(), K8.c.e(com.google.firebase.sessions.a.class).h("sessions-datastore").b(q.k(a10)).b(q.k(a12)).f(new K8.g() { // from class: I9.q
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$4(dVar);
            }
        }).d(), K8.c.e(F.class).h("sessions-service-binder").b(q.k(a10)).f(new K8.g() { // from class: I9.r
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$5(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "2.0.8"));
    }
}
