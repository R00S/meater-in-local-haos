package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import io.sentry.android.core.internal.util.C9315l;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: EmptySecureContentProvider.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.x0 */
/* loaded from: classes2.dex */
abstract class AbstractC9354x0 extends ContentProvider {

    /* renamed from: f */
    private final C9315l f36126f = new C9315l();

    AbstractC9354x0() {
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        this.f36126f.m30287a(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        this.f36126f.m30287a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f36126f.m30287a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.f36126f.m30287a(this);
        return 0;
    }
}
