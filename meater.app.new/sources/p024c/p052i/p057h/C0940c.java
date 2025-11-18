package p024c.p052i.p057h;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.core.content.p003d.C0260c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p024c.p052i.p057h.C0943f;

/* compiled from: FontProvider.java */
/* renamed from: c.i.h.c */
/* loaded from: classes.dex */
class C0940c {

    /* renamed from: a */
    private static final Comparator<byte[]> f6321a = new a();

    /* compiled from: FontProvider.java */
    /* renamed from: c.i.h.c$a */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    if (bArr[i2] != bArr2[i2]) {
                        length = bArr[i2];
                        length2 = bArr2[i2];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m5971a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m5972b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static List<List<byte[]>> m5973c(C0941d c0941d, Resources resources) {
        return c0941d.m5979b() != null ? c0941d.m5979b() : C0260c.m1724c(resources, c0941d.m5980c());
    }

    /* renamed from: d */
    static C0943f.a m5974d(Context context, C0941d c0941d, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM5975e = m5975e(context.getPackageManager(), c0941d, context.getResources());
        return providerInfoM5975e == null ? C0943f.a.m5997a(1, null) : C0943f.a.m5997a(0, m5976f(context, c0941d, providerInfoM5975e.authority, cancellationSignal));
    }

    /* renamed from: e */
    static ProviderInfo m5975e(PackageManager packageManager, C0941d c0941d, Resources resources) throws PackageManager.NameNotFoundException {
        String strM5982e = c0941d.m5982e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM5982e, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strM5982e);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c0941d.m5983f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strM5982e + ", but package was not " + c0941d.m5983f());
        }
        List<byte[]> listM5971a = m5971a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listM5971a, f6321a);
        List<List<byte[]>> listM5973c = m5973c(c0941d, resources);
        for (int i2 = 0; i2 < listM5973c.size(); i2++) {
            ArrayList arrayList = new ArrayList(listM5973c.get(i2));
            Collections.sort(arrayList, f6321a);
            if (m5972b(listM5971a, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* renamed from: f */
    static C0943f.b[] m5976f(Context context, C0941d c0941d, String str, CancellationSignal cancellationSignal) throws Throwable {
        int i2;
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            if (Build.VERSION.SDK_INT > 16) {
                i2 = 1;
                cursorQuery = context.getContentResolver().query(uriBuild, strArr, "query = ?", new String[]{c0941d.m5984g()}, null, cancellationSignal);
            } else {
                i2 = 1;
                cursorQuery = context.getContentResolver().query(uriBuild, strArr, "query = ?", new String[]{c0941d.m5984g()}, null);
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i3 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList.add(C0943f.b.m6000a(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == i2, i3));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return (C0943f.b[]) arrayList.toArray(new C0943f.b[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
