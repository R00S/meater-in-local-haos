package o1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import j1.C3724i;
import j1.C3725j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o1.k;
import r1.InterfaceC4334a;
import s.C4413x;
import s.X;
import y3.C5123a;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    static final C4413x<String, Typeface> f46283a = new C4413x<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f46284b = l.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f46285c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final X<String, ArrayList<InterfaceC4334a<e>>> f46286d = new X<>();

    /* compiled from: FontRequestWorker.java */
    class a implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46287a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f46288b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o1.e f46289c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f46290d;

        a(String str, Context context, o1.e eVar, int i10) {
            this.f46287a = str;
            this.f46288b = context;
            this.f46289c = eVar;
            this.f46290d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return i.c(this.f46287a, this.f46288b, C3724i.a(new Object[]{this.f46289c}), this.f46290d);
        }
    }

    /* compiled from: FontRequestWorker.java */
    class b implements InterfaceC4334a<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4098a f46291a;

        b(C4098a c4098a) {
            this.f46291a = c4098a;
        }

        @Override // r1.InterfaceC4334a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f46291a.b(eVar);
        }
    }

    /* compiled from: FontRequestWorker.java */
    class c implements Callable<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f46293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f46294c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f46295d;

        c(String str, Context context, List list, int i10) {
            this.f46292a = str;
            this.f46293b = context;
            this.f46294c = list;
            this.f46295d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return i.c(this.f46292a, this.f46293b, this.f46294c, this.f46295d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* compiled from: FontRequestWorker.java */
    class d implements InterfaceC4334a<e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f46296a;

        d(String str) {
            this.f46296a = str;
        }

        @Override // r1.InterfaceC4334a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (i.f46285c) {
                try {
                    X<String, ArrayList<InterfaceC4334a<e>>> x10 = i.f46286d;
                    ArrayList<InterfaceC4334a<e>> arrayList = x10.get(this.f46296a);
                    if (arrayList == null) {
                        return;
                    }
                    x10.remove(this.f46296a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(List<o1.e> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @SuppressLint({"WrongConstant"})
    private static int b(k.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        k.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (k.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, List<o1.e> list, int i10) {
        C5123a.a("getFontSync");
        try {
            C4413x<String, Typeface> c4413x = f46283a;
            Typeface typefaceC = c4413x.c(str);
            if (typefaceC != null) {
                return new e(typefaceC);
            }
            k.a aVarE = o1.d.e(context, list, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? C3725j.b(context, null, aVarE.c(), i10) : C3725j.c(context, null, aVarE.d(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            c4413x.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            C5123a.b();
        }
    }

    static Typeface d(Context context, List<o1.e> list, int i10, Executor executor, C4098a c4098a) {
        String strA = a(list, i10);
        Typeface typefaceC = f46283a.c(strA);
        if (typefaceC != null) {
            c4098a.b(new e(typefaceC));
            return typefaceC;
        }
        b bVar = new b(c4098a);
        synchronized (f46285c) {
            try {
                X<String, ArrayList<InterfaceC4334a<e>>> x10 = f46286d;
                ArrayList<InterfaceC4334a<e>> arrayList = x10.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<InterfaceC4334a<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                x10.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f46284b;
                }
                l.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, o1.e eVar, C4098a c4098a, int i10, int i11) {
        String strA = a(C3724i.a(new Object[]{eVar}), i10);
        Typeface typefaceC = f46283a.c(strA);
        if (typefaceC != null) {
            c4098a.b(new e(typefaceC));
            return typefaceC;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, C3724i.a(new Object[]{eVar}), i10);
            c4098a.b(eVarC);
            return eVarC.f46297a;
        }
        try {
            e eVar2 = (e) l.d(f46284b, new a(strA, context, eVar, i10), i11);
            c4098a.b(eVar2);
            return eVar2.f46297a;
        } catch (InterruptedException unused) {
            c4098a.b(new e(-3));
            return null;
        }
    }

    /* compiled from: FontRequestWorker.java */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f46297a;

        /* renamed from: b, reason: collision with root package name */
        final int f46298b;

        e(int i10) {
            this.f46297a = null;
            this.f46298b = i10;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f46298b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f46297a = typeface;
            this.f46298b = 0;
        }
    }
}
