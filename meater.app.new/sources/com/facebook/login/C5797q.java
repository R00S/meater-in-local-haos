package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import p024c.p038c.p039b.AbstractServiceConnectionC0860d;
import p024c.p038c.p039b.C0858b;
import p024c.p038c.p039b.C0861e;

/* compiled from: CustomTabPrefetchHelper.kt */
/* renamed from: com.facebook.login.q */
/* loaded from: classes2.dex */
public final class C5797q extends AbstractServiceConnectionC0860d {

    /* renamed from: g */
    private static C0858b f14817g;

    /* renamed from: h */
    private static C0861e f14818h;

    /* renamed from: f */
    public static final a f14816f = new a(null);

    /* renamed from: i */
    private static final ReentrantLock f14819i = new ReentrantLock();

    /* compiled from: CustomTabPrefetchHelper.kt */
    /* renamed from: com.facebook.login.q$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m12053d() {
            C0858b c0858b;
            C5797q.f14819i.lock();
            if (C5797q.f14818h == null && (c0858b = C5797q.f14817g) != null) {
                a aVar = C5797q.f14816f;
                C5797q.f14818h = c0858b.m5394c(null);
            }
            C5797q.f14819i.unlock();
        }

        /* renamed from: b */
        public final C0861e m12054b() {
            C5797q.f14819i.lock();
            C0861e c0861e = C5797q.f14818h;
            C5797q.f14818h = null;
            C5797q.f14819i.unlock();
            return c0861e;
        }

        /* renamed from: c */
        public final void m12055c(Uri uri) {
            C9801m.m32346f(uri, "url");
            m12053d();
            C5797q.f14819i.lock();
            C0861e c0861e = C5797q.f14818h;
            if (c0861e != null) {
                c0861e.m5408c(uri, null, null);
            }
            C5797q.f14819i.unlock();
        }
    }

    @Override // p024c.p038c.p039b.AbstractServiceConnectionC0860d
    /* renamed from: a */
    public void mo5396a(ComponentName componentName, C0858b c0858b) {
        C9801m.m32346f(componentName, "name");
        C9801m.m32346f(c0858b, "newClient");
        c0858b.m5395d(0L);
        a aVar = f14816f;
        f14817g = c0858b;
        aVar.m12053d();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        C9801m.m32346f(componentName, "componentName");
    }
}
