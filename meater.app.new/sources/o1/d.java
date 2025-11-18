package o1;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import o1.k;
import s.C4413x;
import y3.C5123a;

/* compiled from: FontProvider.java */
/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private static final C4413x<c, ProviderInfo> f46271a = new C4413x<>(2);

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<byte[]> f46272b = new Comparator() { // from class: o1.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.g((byte[]) obj, (byte[]) obj2);
        }
    };

    /* compiled from: FontProvider.java */
    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* compiled from: FontProvider.java */
    private static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f46273a;

        b(Context context, Uri uri) {
            this.f46273a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // o1.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f46273a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // o1.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f46273a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* compiled from: FontProvider.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        String f46274a;

        /* renamed from: b, reason: collision with root package name */
        String f46275b;

        /* renamed from: c, reason: collision with root package name */
        List<List<byte[]>> f46276c;

        c(String str, String str2, List<List<byte[]>> list) {
            this.f46274a = str;
            this.f46275b = str2;
            this.f46276c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f46274a, cVar.f46274a) && Objects.equals(this.f46275b, cVar.f46275b) && Objects.equals(this.f46276c, cVar.f46276c);
        }

        public int hashCode() {
            return Objects.hash(this.f46274a, this.f46275b, this.f46276c);
        }
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : i1.e.c(resources, eVar.c());
    }

    static k.a e(Context context, List<e> list, CancellationSignal cancellationSignal) {
        C5123a.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = list.get(i10);
                ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
                if (providerInfoF == null) {
                    return k.a.b(1, null);
                }
                arrayList.add(h(context, eVar, providerInfoF.authority, cancellationSignal));
            }
            return k.a.a(0, arrayList);
        } finally {
            C5123a.b();
        }
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        C5123a.a("FontProvider.getProvider");
        try {
            List<List<byte[]>> listD = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), listD);
            ProviderInfo providerInfoC = f46271a.c(cVar);
            if (providerInfoC != null) {
                return providerInfoC;
            }
            String strE = eVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
            }
            List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f46272b);
            for (int i10 = 0; i10 < listD.size(); i10++) {
                ArrayList arrayList = new ArrayList(listD.get(i10));
                Collections.sort(arrayList, f46272b);
                if (c(listB, arrayList)) {
                    f46271a.d(cVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            C5123a.b();
            return null;
        } finally {
            C5123a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o1.k.b[] h(android.content.Context r16, o1.e r17, java.lang.String r18, android.os.CancellationSignal r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.d.h(android.content.Context, o1.e, java.lang.String, android.os.CancellationSignal):o1.k$b[]");
    }
}
