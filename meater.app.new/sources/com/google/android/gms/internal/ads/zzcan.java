package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcan {

    /* renamed from: a */
    private final zzayu f23966a;

    /* renamed from: b */
    private final Clock f23967b;

    /* renamed from: c */
    private final Executor f23968c;

    public zzcan(zzayu zzayuVar, Clock clock, Executor executor) {
        this.f23966a = zzayuVar;
        this.f23967b = clock;
        this.f23968c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final Bitmap m18619b(byte[] bArr, double d2, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21723V4)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m18620c(bArr, options);
            options.inJustDecodeBounds = false;
            int i2 = options.outWidth * options.outHeight;
            if (i2 > 0) {
                int i3 = i2 - 1;
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros(i3 / ((Integer) zzyt.m20848e().m16421c(zzacu.f21729W4)).intValue())) / 2);
            }
        }
        return m18620c(bArr, options);
    }

    /* renamed from: c */
    private final Bitmap m18620c(byte[] bArr, BitmapFactory.Options options) {
        long jMo14609b = this.f23967b.mo14609b();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jMo14609b2 = this.f23967b.mo14609b();
        if (Build.VERSION.SDK_INT >= 19 && bitmapDecodeByteArray != null) {
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            long j2 = jMo14609b2 - jMo14609b;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j2);
            sb.append(" on ui thread: ");
            sb.append(z);
            zzawz.m17082m(sb.toString());
        }
        return bitmapDecodeByteArray;
    }

    /* renamed from: d */
    public final zzbbh<Bitmap> m18621d(String str, double d2, boolean z) {
        return zzbar.m17367d(zzayu.m17256d(str), new C6857kg(this, d2, z), this.f23968c);
    }
}
