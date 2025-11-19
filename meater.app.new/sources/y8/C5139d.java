package y8;

import D8.C;
import D8.t;
import E8.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;
import r8.q;

/* compiled from: SharedPrefKeysetWriter.java */
/* renamed from: y8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5139d implements q {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f53238a;

    /* renamed from: b, reason: collision with root package name */
    private final String f53239b;

    public C5139d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f53239b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f53238a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f53238a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // r8.q
    public void a(C c10) throws IOException {
        if (!this.f53238a.putString(this.f53239b, k.b(c10.l())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // r8.q
    public void b(t tVar) throws IOException {
        if (!this.f53238a.putString(this.f53239b, k.b(tVar.l())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
