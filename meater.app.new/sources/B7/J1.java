package B7;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
final class J1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ParcelFileDescriptor f1734a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f1735b;

    J1(K1 k12, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f1734a = parcelFileDescriptor;
        this.f1735b = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws IOException {
        if (Log.isLoggable("WearableClient", 3)) {
            Log.d("WearableClient", "processAssets: writing data to FD : ".concat(String.valueOf(this.f1734a)));
        }
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f1734a);
        try {
            try {
                autoCloseOutputStream.write(this.f1735b);
                autoCloseOutputStream.flush();
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: wrote data: " + String.valueOf(this.f1734a));
                }
                Boolean bool = Boolean.TRUE;
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.f1734a));
                    }
                    autoCloseOutputStream.close();
                    return bool;
                } catch (IOException unused) {
                    return bool;
                }
            } catch (IOException unused2) {
                Log.w("WearableClient", "processAssets: writing data failed: " + String.valueOf(this.f1734a));
                try {
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.f1734a));
                    }
                    autoCloseOutputStream.close();
                } catch (IOException unused3) {
                }
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "processAssets: closing: " + String.valueOf(this.f1734a));
                }
                autoCloseOutputStream.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }
}
