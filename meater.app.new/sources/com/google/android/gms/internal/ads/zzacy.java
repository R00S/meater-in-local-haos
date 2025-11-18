package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
/* loaded from: classes2.dex */
public final class zzacy {

    /* renamed from: b */
    @VisibleForTesting
    private ExecutorService f21915b;

    /* renamed from: e */
    @VisibleForTesting
    private String f21918e;

    /* renamed from: f */
    @VisibleForTesting
    private Context f21919f;

    /* renamed from: g */
    @VisibleForTesting
    private String f21920g;

    /* renamed from: h */
    private AtomicBoolean f21921h;

    /* renamed from: i */
    private File f21922i;

    /* renamed from: a */
    @VisibleForTesting
    private BlockingQueue<zzadi> f21914a = new ArrayBlockingQueue(100);

    /* renamed from: c */
    @VisibleForTesting
    private LinkedHashMap<String, String> f21916c = new LinkedHashMap<>();

    /* renamed from: d */
    @VisibleForTesting
    private Map<String, zzadc> f21917d = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m16434f() throws Throwable {
        while (true) {
            try {
                zzadi zzadiVarTake = this.f21914a.take();
                String strM16452e = zzadiVarTake.m16452e();
                if (!TextUtils.isEmpty(strM16452e)) {
                    Map<String, String> mapM16435a = m16435a(this.f21916c, zzadiVarTake.m16453f());
                    Uri.Builder builderBuildUpon = Uri.parse(this.f21918e).buildUpon();
                    for (Map.Entry<String, String> entry : mapM16435a.entrySet()) {
                        builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    String str = builderBuildUpon.build().toString() + "&it=" + strM16452e;
                    if (this.f21921h.get()) {
                        File file = this.f21922i;
                        if (file != null) {
                            FileOutputStream fileOutputStream = null;
                            try {
                                try {
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                                    try {
                                        fileOutputStream2.write(str.getBytes());
                                        fileOutputStream2.write(10);
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException e2) {
                                            zzbad.m17348d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        fileOutputStream = fileOutputStream2;
                                        zzbad.m17348d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e4) {
                                                zzbad.m17348d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e5) {
                                                zzbad.m17348d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (IOException e6) {
                                e = e6;
                            }
                        } else {
                            zzbad.m17353i("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        zzk.zzlg();
                        zzaxi.m17130J(this.f21919f, this.f21920g, str);
                    }
                }
            } catch (InterruptedException e7) {
                zzbad.m17348d("CsiReporter:reporter interrupted", e7);
                return;
            }
        }
    }

    /* renamed from: a */
    final Map<String, String> m16435a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            linkedHashMap.put(key, m16438e(key).mo15917a((String) linkedHashMap.get(key), value));
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public final void m16436b(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f21919f = context;
        this.f21920g = str;
        this.f21918e = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f21921h = atomicBoolean;
        atomicBoolean.set(((Boolean) zzyt.m20848e().m16421c(zzacu.f21791g0)).booleanValue());
        if (this.f21921h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f21922i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f21916c.put(entry.getKey(), entry.getValue());
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f21915b = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new RunnableC7173t(this));
        Map<String, zzadc> map2 = this.f21917d;
        zzadc zzadcVar = zzadc.f21924b;
        map2.put("action", zzadcVar);
        this.f21917d.put("ad_format", zzadcVar);
        this.f21917d.put("e", zzadc.f21925c);
    }

    /* renamed from: d */
    public final boolean m16437d(zzadi zzadiVar) {
        return this.f21914a.offer(zzadiVar);
    }

    /* renamed from: e */
    public final zzadc m16438e(String str) {
        zzadc zzadcVar = this.f21917d.get(str);
        return zzadcVar != null ? zzadcVar : zzadc.f21923a;
    }
}
