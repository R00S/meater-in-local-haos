package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import android.view.D;
import android.view.E;
import android.view.InterfaceC2114v;
import android.view.Y;
import android.view.a0;
import android.view.b0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import r1.C4335b;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f26001c = false;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2114v f26002a;

    /* renamed from: b, reason: collision with root package name */
    private final C0368b f26003b;

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0368b extends Y {

        /* renamed from: d, reason: collision with root package name */
        private static final a0.c f26007d = new a();

        /* renamed from: b, reason: collision with root package name */
        private s.Y<a> f26008b = new s.Y<>();

        /* renamed from: c, reason: collision with root package name */
        private boolean f26009c = false;

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements a0.c {
            a() {
            }

            @Override // androidx.lifecycle.a0.c
            public <T extends Y> T a(Class<T> cls) {
                return new C0368b();
            }
        }

        C0368b() {
        }

        static C0368b i(b0 b0Var) {
            return (C0368b) new a0(b0Var, f26007d).b(C0368b.class);
        }

        @Override // android.view.Y
        protected void g() {
            super.g();
            int iQ = this.f26008b.q();
            for (int i10 = 0; i10 < iQ; i10++) {
                this.f26008b.r(i10).p(true);
            }
            this.f26008b.c();
        }

        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f26008b.q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f26008b.q(); i10++) {
                    a aVarR = this.f26008b.r(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f26008b.m(i10));
                    printWriter.print(": ");
                    printWriter.println(aVarR.toString());
                    aVarR.q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void j() {
            int iQ = this.f26008b.q();
            for (int i10 = 0; i10 < iQ; i10++) {
                this.f26008b.r(i10).r();
            }
        }
    }

    b(InterfaceC2114v interfaceC2114v, b0 b0Var) {
        this.f26002a = interfaceC2114v;
        this.f26003b = C0368b.i(b0Var);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f26003b.h(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f26003b.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C4335b.a(this.f26002a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }

    /* compiled from: LoaderManagerImpl.java */
    public static class a<D> extends D<D> {

        /* renamed from: l, reason: collision with root package name */
        private final int f26004l;

        /* renamed from: m, reason: collision with root package name */
        private final Bundle f26005m;

        /* renamed from: n, reason: collision with root package name */
        private InterfaceC2114v f26006n;

        @Override // android.view.B
        protected void j() {
            if (b.f26001c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // android.view.B
        protected void k() {
            if (b.f26001c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.B
        public void m(E<? super D> e10) {
            super.m(e10);
            this.f26006n = null;
        }

        @Override // android.view.D, android.view.B
        public void o(D d10) {
            super.o(d10);
        }

        S1.a<D> p(boolean z10) {
            if (b.f26001c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f26004l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f26005m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            throw null;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f26004l);
            sb2.append(" : ");
            C4335b.a(null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        void r() {
        }
    }
}
