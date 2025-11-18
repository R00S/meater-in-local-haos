package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzwj {

    /* renamed from: a */
    private final zzwo f27242a;

    /* renamed from: b */
    private final zzxn f27243b;

    /* renamed from: c */
    private final boolean f27244c;

    public zzwj(zzwo zzwoVar) {
        this.f27242a = zzwoVar;
        this.f27244c = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21704S3)).booleanValue();
        this.f27243b = new zzxn();
        m20695g();
    }

    /* renamed from: c */
    private final synchronized void m20691c(zzwl.zza.zzb zzbVar) {
        this.f27243b.f27370h = m20696h();
        this.f27242a.m20700a(zzdrw.m19824b(this.f27243b)).m20702b(zzbVar.mo17879i()).m20703c();
        String strValueOf = String.valueOf(Integer.toString(zzbVar.mo17879i(), 10));
        zzawz.m17082m(strValueOf.length() != 0 ? "Logging Event with event code : ".concat(strValueOf) : new String("Logging Event with event code : "));
    }

    /* renamed from: d */
    private final synchronized void m20692d(zzwl.zza.zzb zzbVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(m20693e(zzbVar).getBytes());
                } catch (IOException unused) {
                    zzawz.m17082m("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        zzawz.m17082m("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    zzawz.m17082m("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            zzawz.m17082m("Could not find file for Clearcut");
        }
    }

    /* renamed from: e */
    private final synchronized String m20693e(zzwl.zza.zzb zzbVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f27243b.f27366d, Long.valueOf(zzk.zzln().mo14609b()), Integer.valueOf(zzbVar.mo17879i()), Base64.encodeToString(zzdrw.m19824b(this.f27243b), 3));
    }

    /* renamed from: f */
    public static zzwj m20694f() {
        return new zzwj();
    }

    /* renamed from: g */
    private final synchronized void m20695g() {
        this.f27243b.f27374l = new zzxj();
        this.f27243b.f27374l.f27344f = new zzxk();
        this.f27243b.f27371i = new zzxl();
    }

    /* renamed from: h */
    private static long[] m20696h() {
        int i2;
        List<String> listM16426d = zzacu.m16426d();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listM16426d.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] strArrSplit = it.next().split(",");
            int length = strArrSplit.length;
            while (i2 < length) {
                try {
                    arrayList.add(Long.valueOf(strArrSplit[i2]));
                } catch (NumberFormatException unused) {
                    zzawz.m17082m("Experiment ID is not a number");
                }
                i2++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jArr[i3] = ((Long) obj).longValue();
            i3++;
        }
        return jArr;
    }

    /* renamed from: a */
    public final synchronized void m20697a(zzwk zzwkVar) {
        if (this.f27244c) {
            try {
                zzwkVar.mo14971a(this.f27243b);
            } catch (NullPointerException e2) {
                zzk.zzlk().m17052e(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:118)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    /* renamed from: b */
    public final synchronized void m20698b(zzwl.zza.zzb zzbVar) {
        if (this.f27244c) {
            if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21710T3)).booleanValue()) {
                m20692d(zzbVar);
            } else {
                m20691c(zzbVar);
            }
        }
    }

    private zzwj() {
        this.f27244c = false;
        this.f27242a = new zzwo();
        this.f27243b = new zzxn();
        m20695g();
    }
}
