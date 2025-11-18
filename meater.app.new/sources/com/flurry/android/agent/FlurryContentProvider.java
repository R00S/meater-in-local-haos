package com.flurry.android.agent;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.flurry.sdk.C6002b0;
import com.flurry.sdk.C6013c2;
import com.flurry.sdk.C6021d1;
import com.flurry.sdk.C6037e7;
import com.flurry.sdk.C6121o1;
import com.flurry.sdk.C6130p1;
import java.util.Locale;

/* loaded from: classes2.dex */
public class FlurryContentProvider extends ContentProvider {

    /* renamed from: f */
    private static UriMatcher f15617f;

    /* renamed from: g */
    private static final long f15618g = System.nanoTime();

    /* renamed from: h */
    private MatrixCursor f15619h;

    /* renamed from: a */
    public static String m12943a(Context context) {
        return context.getApplicationContext().getPackageName() + ".FlurryContentProvider";
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        String strM12943a = m12943a(getContext());
        UriMatcher uriMatcher = new UriMatcher(-1);
        f15617f = uriMatcher;
        uriMatcher.addURI(strM12943a, "performance", 1);
        if (!C6013c2.m12991g(16)) {
            C6021d1.m13042o("FlurryContentProvider", String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
            return true;
        }
        Runtime runtime = Runtime.getRuntime();
        ActivityManager.MemoryInfo memoryInfoM13251a = C6130p1.m13251a(getContext());
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"START_TIME", "RUNTIME_USED_MEMORY", "SYSTEM_USED_MEMORY"});
        this.f15619h = matrixCursor;
        matrixCursor.newRow().add(Long.valueOf(f15618g)).add(Long.valueOf(runtime.totalMemory() - runtime.freeMemory())).add(Long.valueOf(memoryInfoM13251a.totalMem - memoryInfoM13251a.availMem));
        C6121o1.m13222a().m13223b(getContext(), this.f15619h);
        C6002b0.m12965b(getContext());
        C6037e7.m13055a();
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (f15617f.match(uri) != 1) {
            return null;
        }
        return this.f15619h;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
