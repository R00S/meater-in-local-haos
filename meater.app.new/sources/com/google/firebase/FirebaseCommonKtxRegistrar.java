package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.C8111b0;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;
import com.google.firebase.p200o.p201a.InterfaceC8474a;
import com.google.firebase.p200o.p201a.InterfaceC8475b;
import com.google.firebase.p200o.p201a.InterfaceC8476c;
import com.google.firebase.p200o.p201a.InterfaceC8477d;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11038q1;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.HttpUrl;

/* compiled from: Firebase.kt */
@Keep
@Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, m32267d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Lcom/google/firebase/components/ComponentContainer;", "create", "com/google/firebase/FirebaseKt$coroutineDispatcher$1"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$a */
    public static final class C8090a<T> implements InterfaceC8128r {

        /* renamed from: a */
        public static final C8090a<T> f30634a = new C8090a<>();

        @Override // com.google.firebase.components.InterfaceC8128r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo24937a(InterfaceC8126p interfaceC8126p) {
            Object objMo24978f = interfaceC8126p.mo24978f(C8111b0.m24971a(InterfaceC8474a.class, Executor.class));
            C9801m.m32345e(objMo24978f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C11038q1.m39679a((Executor) objMo24978f);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Lcom/google/firebase/components/ComponentContainer;", "create", "com/google/firebase/FirebaseKt$coroutineDispatcher$1"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$b */
    public static final class C8091b<T> implements InterfaceC8128r {

        /* renamed from: a */
        public static final C8091b<T> f30635a = new C8091b<>();

        @Override // com.google.firebase.components.InterfaceC8128r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo24937a(InterfaceC8126p interfaceC8126p) {
            Object objMo24978f = interfaceC8126p.mo24978f(C8111b0.m24971a(InterfaceC8476c.class, Executor.class));
            C9801m.m32345e(objMo24978f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C11038q1.m39679a((Executor) objMo24978f);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Lcom/google/firebase/components/ComponentContainer;", "create", "com/google/firebase/FirebaseKt$coroutineDispatcher$1"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$c */
    public static final class C8092c<T> implements InterfaceC8128r {

        /* renamed from: a */
        public static final C8092c<T> f30636a = new C8092c<>();

        @Override // com.google.firebase.components.InterfaceC8128r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo24937a(InterfaceC8126p interfaceC8126p) {
            Object objMo24978f = interfaceC8126p.mo24978f(C8111b0.m24971a(InterfaceC8475b.class, Executor.class));
            C9801m.m32345e(objMo24978f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C11038q1.m39679a((Executor) objMo24978f);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Lcom/google/firebase/components/ComponentContainer;", "create", "com/google/firebase/FirebaseKt$coroutineDispatcher$1"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$d */
    public static final class C8093d<T> implements InterfaceC8128r {

        /* renamed from: a */
        public static final C8093d<T> f30637a = new C8093d<>();

        @Override // com.google.firebase.components.InterfaceC8128r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo24937a(InterfaceC8126p interfaceC8126p) {
            Object objMo24978f = interfaceC8126p.mo24978f(C8111b0.m24971a(InterfaceC8477d.class, Executor.class));
            C9801m.m32345e(objMo24978f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C11038q1.m39679a((Executor) objMo24978f);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8124n<?>> getComponents() {
        C8124n c8124nM25008d = C8124n.m24984a(C8111b0.m24971a(InterfaceC8474a.class, CoroutineDispatcher.class)).m25006b(C8132v.m25059j(C8111b0.m24971a(InterfaceC8474a.class, Executor.class))).m25010f(C8090a.f30634a).m25008d();
        C9801m.m32345e(c8124nM25008d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8124n c8124nM25008d2 = C8124n.m24984a(C8111b0.m24971a(InterfaceC8476c.class, CoroutineDispatcher.class)).m25006b(C8132v.m25059j(C8111b0.m24971a(InterfaceC8476c.class, Executor.class))).m25010f(C8091b.f30635a).m25008d();
        C9801m.m32345e(c8124nM25008d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8124n c8124nM25008d3 = C8124n.m24984a(C8111b0.m24971a(InterfaceC8475b.class, CoroutineDispatcher.class)).m25006b(C8132v.m25059j(C8111b0.m24971a(InterfaceC8475b.class, Executor.class))).m25010f(C8092c.f30636a).m25008d();
        C9801m.m32345e(c8124nM25008d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8124n c8124nM25008d4 = C8124n.m24984a(C8111b0.m24971a(InterfaceC8477d.class, CoroutineDispatcher.class)).m25006b(C8132v.m25059j(C8111b0.m24971a(InterfaceC8477d.class, Executor.class))).m25010f(C8093d.f30637a).m25008d();
        C9801m.m32345e(c8124nM25008d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C10817u.m38891m(c8124nM25008d, c8124nM25008d2, c8124nM25008d3, c8124nM25008d4);
    }
}
