package com.bumptech.glide.load.p131o.p132c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C5425h;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5367c;
import com.bumptech.glide.load.InterfaceC5428k;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;

/* compiled from: BitmapEncoder.java */
/* renamed from: com.bumptech.glide.load.o.c.c */
/* loaded from: classes.dex */
public class C5482c implements InterfaceC5428k<Bitmap> {

    /* renamed from: a */
    public static final C5425h<Integer> f13713a = C5425h.m10444f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: b */
    public static final C5425h<Bitmap.CompressFormat> f13714b = C5425h.m10443e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: c */
    private final InterfaceC5410b f13715c;

    public C5482c(InterfaceC5410b interfaceC5410b) {
        this.f13715c = interfaceC5410b;
    }

    /* renamed from: d */
    private Bitmap.CompressFormat m10605d(Bitmap bitmap, C5426i c5426i) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c5426i.m10449a(f13714b);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // com.bumptech.glide.load.InterfaceC5428k
    /* renamed from: b */
    public EnumC5367c mo10454b(C5426i c5426i) {
        return EnumC5367c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #2 {all -> 0x00c0, blocks: (B:3:0x0021, B:13:0x004d, B:29:0x006a, B:31:0x0070, B:35:0x00bc, B:36:0x00bf), top: B:47:0x0021 }] */
    @Override // com.bumptech.glide.load.InterfaceC5368d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo10155a(com.bumptech.glide.load.engine.InterfaceC5404u<android.graphics.Bitmap> r9, java.io.File r10, com.bumptech.glide.load.C5426i r11) {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            android.graphics.Bitmap$CompressFormat r1 = r8.m10605d(r9, r11)
            int r2 = r9.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r9.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            com.bumptech.glide.p145r.p146l.C5599b.m11076c(r4, r2, r3, r1)
            long r2 = com.bumptech.glide.p145r.C5592f.m11028b()     // Catch: java.lang.Throwable -> Lc0
            com.bumptech.glide.load.h<java.lang.Integer> r4 = com.bumptech.glide.load.p131o.p132c.C5482c.f13713a     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r4 = r11.m10449a(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc0
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc0
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            com.bumptech.glide.load.engine.z.b r10 = r8.f13715c     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r10 == 0) goto L45
            com.bumptech.glide.load.m.c r10 = new com.bumptech.glide.load.m.c     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            com.bumptech.glide.load.engine.z.b r6 = r8.f13715c     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r10.<init>(r7, r6)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r6 = r10
            goto L46
        L45:
            r6 = r7
        L46:
            r9.compress(r1, r4, r6)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r6.close()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5 = 1
        L4d:
            r6.close()     // Catch: java.io.IOException -> L69 java.lang.Throwable -> Lc0
            goto L69
        L51:
            r9 = move-exception
            r6 = r7
            goto Lba
        L54:
            r10 = move-exception
            r6 = r7
            goto L5a
        L57:
            r9 = move-exception
            goto Lba
        L59:
            r10 = move-exception
        L5a:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L66
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch: java.lang.Throwable -> L57
        L66:
            if (r6 == 0) goto L69
            goto L4d
        L69:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> Lc0
            if (r10 == 0) goto Lb6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r10.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            int r1 = com.bumptech.glide.p145r.C5597k.m11051h(r9)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            double r1 = com.bumptech.glide.p145r.C5592f.m11027a(r2)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch: java.lang.Throwable -> Lc0
            com.bumptech.glide.load.h<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.p131o.p132c.C5482c.f13714b     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r11 = r11.m10449a(r1)     // Catch: java.lang.Throwable -> Lc0
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch: java.lang.Throwable -> Lc0
            boolean r9 = r9.hasAlpha()     // Catch: java.lang.Throwable -> Lc0
            r10.append(r9)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> Lc0
            android.util.Log.v(r0, r9)     // Catch: java.lang.Throwable -> Lc0
        Lb6:
            com.bumptech.glide.p145r.p146l.C5599b.m11077d()
            return r5
        Lba:
            if (r6 == 0) goto Lbf
            r6.close()     // Catch: java.io.IOException -> Lbf java.lang.Throwable -> Lc0
        Lbf:
            throw r9     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r9 = move-exception
            com.bumptech.glide.p145r.p146l.C5599b.m11077d()
            goto Lc6
        Lc5:
            throw r9
        Lc6:
            goto Lc5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p131o.p132c.C5482c.mo10155a(com.bumptech.glide.load.engine.u, java.io.File, com.bumptech.glide.load.i):boolean");
    }
}
