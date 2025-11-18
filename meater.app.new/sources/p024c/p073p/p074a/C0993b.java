package p024c.p073p.p074a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.AbstractC0528x;
import androidx.lifecycle.C0521q;
import androidx.lifecycle.C0529y;
import androidx.lifecycle.C0530z;
import androidx.lifecycle.InterfaceC0515k;
import androidx.lifecycle.InterfaceC0522r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p024c.p041e.C0874h;
import p024c.p052i.p059j.C0952b;
import p024c.p073p.p074a.AbstractC0992a;
import p024c.p073p.p075b.C0995b;

/* compiled from: LoaderManagerImpl.java */
/* renamed from: c.p.a.b */
/* loaded from: classes.dex */
class C0993b extends AbstractC0992a {

    /* renamed from: a */
    static boolean f6528a = false;

    /* renamed from: b */
    private final InterfaceC0515k f6529b;

    /* renamed from: c */
    private final c f6530c;

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: c.p.a.b$a */
    public static class a<D> extends C0521q<D> implements C0995b.b<D> {

        /* renamed from: l */
        private final int f6531l;

        /* renamed from: m */
        private final Bundle f6532m;

        /* renamed from: n */
        private final C0995b<D> f6533n;

        /* renamed from: o */
        private InterfaceC0515k f6534o;

        /* renamed from: p */
        private b<D> f6535p;

        /* renamed from: q */
        private C0995b<D> f6536q;

        a(int i2, Bundle bundle, C0995b<D> c0995b, C0995b<D> c0995b2) {
            this.f6531l = i2;
            this.f6532m = bundle;
            this.f6533n = c0995b;
            this.f6536q = c0995b2;
            c0995b.m6324r(i2, this);
        }

        @Override // p024c.p073p.p075b.C0995b.b
        /* renamed from: a */
        public void mo6280a(C0995b<D> c0995b, D d2) {
            if (C0993b.f6528a) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo3822n(d2);
                return;
            }
            if (C0993b.f6528a) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo3820l(d2);
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: j */
        protected void mo3818j() {
            if (C0993b.f6528a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f6533n.m6327u();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: k */
        protected void mo3819k() {
            if (C0993b.f6528a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f6533n.m6328v();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: m */
        public void mo3821m(InterfaceC0522r<? super D> interfaceC0522r) {
            super.mo3821m(interfaceC0522r);
            this.f6534o = null;
            this.f6535p = null;
        }

        @Override // androidx.lifecycle.C0521q, androidx.lifecycle.LiveData
        /* renamed from: n */
        public void mo3822n(D d2) {
            super.mo3822n(d2);
            C0995b<D> c0995b = this.f6536q;
            if (c0995b != null) {
                c0995b.m6325s();
                this.f6536q = null;
            }
        }

        /* renamed from: o */
        C0995b<D> m6281o(boolean z) {
            if (C0993b.f6528a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f6533n.m6312c();
            this.f6533n.m6311b();
            b<D> bVar = this.f6535p;
            if (bVar != null) {
                mo3821m(bVar);
                if (z) {
                    bVar.m6288d();
                }
            }
            this.f6533n.m6329w(this);
            if ((bVar == null || bVar.m6287c()) && !z) {
                return this.f6533n;
            }
            this.f6533n.m6325s();
            return this.f6536q;
        }

        /* renamed from: p */
        public void m6282p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f6531l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f6532m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f6533n);
            this.f6533n.mo6301h(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f6535p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f6535p);
                this.f6535p.m6286b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m6283q().m6314e(m3814f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m3815g());
        }

        /* renamed from: q */
        C0995b<D> m6283q() {
            return this.f6533n;
        }

        /* renamed from: r */
        void m6284r() {
            InterfaceC0515k interfaceC0515k = this.f6534o;
            b<D> bVar = this.f6535p;
            if (interfaceC0515k == null || bVar == null) {
                return;
            }
            super.mo3821m(bVar);
            m3816h(interfaceC0515k, bVar);
        }

        /* renamed from: s */
        C0995b<D> m6285s(InterfaceC0515k interfaceC0515k, AbstractC0992a.a<D> aVar) {
            b<D> bVar = new b<>(this.f6533n, aVar);
            m3816h(interfaceC0515k, bVar);
            b<D> bVar2 = this.f6535p;
            if (bVar2 != null) {
                mo3821m(bVar2);
            }
            this.f6534o = interfaceC0515k;
            this.f6535p = bVar;
            return this.f6533n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f6531l);
            sb.append(" : ");
            C0952b.m6054a(this.f6533n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: c.p.a.b$b */
    static class b<D> implements InterfaceC0522r<D> {

        /* renamed from: a */
        private final C0995b<D> f6537a;

        /* renamed from: b */
        private final AbstractC0992a.a<D> f6538b;

        /* renamed from: c */
        private boolean f6539c = false;

        b(C0995b<D> c0995b, AbstractC0992a.a<D> aVar) {
            this.f6537a = c0995b;
            this.f6538b = aVar;
        }

        @Override // androidx.lifecycle.InterfaceC0522r
        /* renamed from: a */
        public void mo3611a(D d2) {
            if (C0993b.f6528a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f6537a + ": " + this.f6537a.m6314e(d2));
            }
            this.f6538b.mo6276a(this.f6537a, d2);
            this.f6539c = true;
        }

        /* renamed from: b */
        public void m6286b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f6539c);
        }

        /* renamed from: c */
        boolean m6287c() {
            return this.f6539c;
        }

        /* renamed from: d */
        void m6288d() {
            if (this.f6539c) {
                if (C0993b.f6528a) {
                    Log.v("LoaderManager", "  Resetting: " + this.f6537a);
                }
                this.f6538b.mo6278c(this.f6537a);
            }
        }

        public String toString() {
            return this.f6538b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: c.p.a.b$c */
    static class c extends AbstractC0528x {

        /* renamed from: c */
        private static final C0529y.b f6540c = new a();

        /* renamed from: d */
        private C0874h<a> f6541d = new C0874h<>();

        /* renamed from: e */
        private boolean f6542e = false;

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: c.p.a.b$c$a */
        static class a implements C0529y.b {
            a() {
            }

            @Override // androidx.lifecycle.C0529y.b
            /* renamed from: a */
            public <T extends AbstractC0528x> T mo3685a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        /* renamed from: h */
        static c m6289h(C0530z c0530z) {
            return (c) new C0529y(c0530z, f6540c).m3915a(c.class);
        }

        @Override // androidx.lifecycle.AbstractC0528x
        /* renamed from: d */
        protected void mo3674d() {
            super.mo3674d();
            int iM5487l = this.f6541d.m5487l();
            for (int i2 = 0; i2 < iM5487l; i2++) {
                this.f6541d.m5488m(i2).m6281o(true);
            }
            this.f6541d.m5480d();
        }

        /* renamed from: f */
        public void m6290f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f6541d.m5487l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f6541d.m5487l(); i2++) {
                    a aVarM5488m = this.f6541d.m5488m(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f6541d.m5485j(i2));
                    printWriter.print(": ");
                    printWriter.println(aVarM5488m.toString());
                    aVarM5488m.m6282p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: g */
        void m6291g() {
            this.f6542e = false;
        }

        /* renamed from: i */
        <D> a<D> m6292i(int i2) {
            return this.f6541d.m5482g(i2);
        }

        /* renamed from: j */
        boolean m6293j() {
            return this.f6542e;
        }

        /* renamed from: k */
        void m6294k() {
            int iM5487l = this.f6541d.m5487l();
            for (int i2 = 0; i2 < iM5487l; i2++) {
                this.f6541d.m5488m(i2).m6284r();
            }
        }

        /* renamed from: l */
        void m6295l(int i2, a aVar) {
            this.f6541d.m5486k(i2, aVar);
        }

        /* renamed from: m */
        void m6296m() {
            this.f6542e = true;
        }
    }

    C0993b(InterfaceC0515k interfaceC0515k, C0530z c0530z) {
        this.f6529b = interfaceC0515k;
        this.f6530c = c.m6289h(c0530z);
    }

    /* renamed from: e */
    private <D> C0995b<D> m6279e(int i2, Bundle bundle, AbstractC0992a.a<D> aVar, C0995b<D> c0995b) {
        try {
            this.f6530c.m6296m();
            C0995b<D> c0995bMo6277b = aVar.mo6277b(i2, bundle);
            if (c0995bMo6277b == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (c0995bMo6277b.getClass().isMemberClass() && !Modifier.isStatic(c0995bMo6277b.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c0995bMo6277b);
            }
            a aVar2 = new a(i2, bundle, c0995bMo6277b, c0995b);
            if (f6528a) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.f6530c.m6295l(i2, aVar2);
            this.f6530c.m6291g();
            return aVar2.m6285s(this.f6529b, aVar);
        } catch (Throwable th) {
            this.f6530c.m6291g();
            throw th;
        }
    }

    @Override // p024c.p073p.p074a.AbstractC0992a
    @Deprecated
    /* renamed from: a */
    public void mo6273a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f6530c.m6290f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p024c.p073p.p074a.AbstractC0992a
    /* renamed from: c */
    public <D> C0995b<D> mo6274c(int i2, Bundle bundle, AbstractC0992a.a<D> aVar) {
        if (this.f6530c.m6293j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarM6292i = this.f6530c.m6292i(i2);
        if (f6528a) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarM6292i == null) {
            return m6279e(i2, bundle, aVar, null);
        }
        if (f6528a) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarM6292i);
        }
        return aVarM6292i.m6285s(this.f6529b, aVar);
    }

    @Override // p024c.p073p.p074a.AbstractC0992a
    /* renamed from: d */
    public void mo6275d() {
        this.f6530c.m6294k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0952b.m6054a(this.f6529b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
