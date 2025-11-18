package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzbge extends zzbft {

    /* renamed from: i */
    private static final Set<String> f22987i = Collections.synchronizedSet(new HashSet());

    /* renamed from: j */
    private static final DecimalFormat f22988j = new DecimalFormat("#,###");

    /* renamed from: k */
    private File f22989k;

    /* renamed from: l */
    private boolean f22990l;

    public zzbge(zzbdf zzbdfVar) {
        super(zzbdfVar);
        File cacheDir = this.f22970f.getCacheDir();
        if (cacheDir == null) {
            zzbad.m17353i("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f22989k = file;
        if (!file.isDirectory() && !this.f22989k.mkdirs()) {
            String strValueOf = String.valueOf(this.f22989k.getAbsolutePath());
            zzbad.m17353i(strValueOf.length() != 0 ? "Could not create preload cache directory at ".concat(strValueOf) : new String("Could not create preload cache directory at "));
            this.f22989k = null;
        } else {
            if (this.f22989k.setReadable(true, false) && this.f22989k.setExecutable(true, false)) {
                return;
            }
            String strValueOf2 = String.valueOf(this.f22989k.getAbsolutePath());
            zzbad.m17353i(strValueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(strValueOf2) : new String("Could not set cache file permissions at "));
            this.f22989k = null;
        }
    }

    /* renamed from: B */
    private final File m17645B(File file) {
        return new File(this.f22989k, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: b */
    public final void mo17627b() {
        this.f22990l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e6, code lost:
    
        if (r1 < 400) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e8, code lost:
    
        r15 = "badUrl";
        r2 = java.lang.String.valueOf(java.lang.Integer.toString(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f8, code lost:
    
        if (r2.length() == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        r2 = "HTTP request failed. Code: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0200, code lost:
    
        r2 = new java.lang.String("HTTP request failed. Code: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0205, code lost:
    
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r31).length() + 32);
        r4.append("HTTP status code ");
        r4.append(r1);
        r4.append(" at ");
        r4.append(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x022d, code lost:
    
        throw new java.io.IOException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x022e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0232, code lost:
    
        r7 = r5.getContentLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0236, code lost:
    
        if (r7 >= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0238, code lost:
    
        r1 = java.lang.String.valueOf(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0242, code lost:
    
        if (r1.length() == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0244, code lost:
    
        r0 = "Stream cache aborted, missing content-length header at ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0249, code lost:
    
        r0 = new java.lang.String("Stream cache aborted, missing content-length header at ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024f, code lost:
    
        com.google.android.gms.internal.ads.zzbad.m17353i(r0);
        m17633q(r31, r12.getAbsolutePath(), "contentLengthMissing", null);
        com.google.android.gms.internal.ads.zzbge.f22987i.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0260, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0261, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzbge.f22988j.format(r7);
        r3 = ((java.lang.Integer) com.google.android.gms.internal.ads.zzyt.m20848e().m16421c(com.google.android.gms.internal.ads.zzacu.f21604C)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0278, code lost:
    
        if (r7 <= r3) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x027a, code lost:
    
        r2 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 33) + java.lang.String.valueOf(r31).length());
        r2.append("Content length ");
        r2.append(r1);
        r2.append(" exceeds limit at ");
        r2.append(r31);
        com.google.android.gms.internal.ads.zzbad.m17353i(r2.toString());
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b3, code lost:
    
        if (r1.length() == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b5, code lost:
    
        r0 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ba, code lost:
    
        r0 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02c0, code lost:
    
        m17633q(r31, r12.getAbsolutePath(), "sizeExceeded", r0);
        com.google.android.gms.internal.ads.zzbge.f22987i.remove(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ce, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02cf, code lost:
    
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 20) + java.lang.String.valueOf(r31).length());
        r4.append("Caching ");
        r4.append(r1);
        r4.append(" bytes from ");
        r4.append(r31);
        com.google.android.gms.internal.ads.zzbad.m17349e(r4.toString());
        r5 = java.nio.channels.Channels.newChannel(r5.getInputStream());
        r4 = new java.io.FileOutputStream(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x030a, code lost:
    
        r2 = r4.getChannel();
        r1 = java.nio.ByteBuffer.allocate(cm.aptoide.p092pt.file.CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
        r16 = com.google.android.gms.ads.internal.zzk.zzln();
        r17 = r16.mo14608a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0328, code lost:
    
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0329, code lost:
    
        r6 = new com.google.android.gms.internal.ads.zzazj(((java.lang.Long) com.google.android.gms.internal.ads.zzyt.m20848e().m16421c(com.google.android.gms.internal.ads.zzacu.f21622F)).longValue());
        r13 = ((java.lang.Long) com.google.android.gms.internal.ads.zzyt.m20848e().m16421c(com.google.android.gms.internal.ads.zzacu.f21616E)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0342, code lost:
    
        r20 = r5.read(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0346, code lost:
    
        if (r20 < 0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0348, code lost:
    
        r11 = r11 + r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x034a, code lost:
    
        if (r11 <= r3) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x034c, code lost:
    
        r15 = "sizeExceeded";
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x035c, code lost:
    
        if (r1.length() == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x035e, code lost:
    
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0364, code lost:
    
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0370, code lost:
    
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0373, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0374, code lost:
    
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0379, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x037a, code lost:
    
        r1 = r10;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x037c, code lost:
    
        r10 = r4;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x037f, code lost:
    
        r1.flip();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0386, code lost:
    
        if (r2.write(r1) > 0) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0388, code lost:
    
        r1.clear();
        r24 = ((r16.mo14608a() - r17) > (1000 * r13) ? 1 : ((r16.mo14608a() - r17) == (1000 * r13) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0397, code lost:
    
        if (r24 > 0) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0399, code lost:
    
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x039d, code lost:
    
        if (r30.f22990l != false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03a3, code lost:
    
        if (r6.m17278a() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03ab, code lost:
    
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03af, code lost:
    
        r24 = r10;
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03cd, code lost:
    
        com.google.android.gms.internal.ads.zzazt.f22735a.post(new com.google.android.gms.internal.ads.RunnableC7405z9(r30, r31, r12.getAbsolutePath(), r11, r7, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03d4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03d6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03d7, code lost:
    
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03dc, code lost:
    
        r25 = r2;
        r26 = r3;
        r27 = r4;
        r21 = r5;
        r19 = r6;
        r29 = r7;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03ee, code lost:
    
        r6 = r19;
        r1 = r20;
        r5 = r21;
        r15 = r22;
        r10 = r24;
        r2 = r25;
        r3 = r26;
        r4 = r27;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0411, code lost:
    
        throw new java.io.IOException("abort requested");
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0412, code lost:
    
        r27 = r4;
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0418, code lost:
    
        r15 = "downloadTimeout";
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x041a, code lost:
    
        r0 = java.lang.Long.toString(r13);
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 29);
        r2.append("Timeout exceeded. Limit: ");
        r2.append(r0);
        r2.append(" sec");
        r10 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0445, code lost:
    
        throw new java.io.IOException("stream cache time limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0448, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0449, code lost:
    
        r2 = r10;
        r1 = r24;
        r10 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0450, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0452, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0454, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0457, code lost:
    
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x045e, code lost:
    
        r27 = r4;
        r24 = r10;
        r22 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0466, code lost:
    
        r27.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x046d, code lost:
    
        if (com.google.android.gms.internal.ads.zzbad.m17345a(3) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x046f, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzbge.f22988j.format(r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r31).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r31);
        com.google.android.gms.internal.ads.zzbad.m17349e(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04a9, code lost:
    
        r15 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04ab, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04b0, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04b7, code lost:
    
        if (r0.isFile() == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04b9, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04c1, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04d8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04db, code lost:
    
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04e0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04e3, code lost:
    
        r27 = r4;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04e7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04ea, code lost:
    
        r27 = r4;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04ed, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e0, code lost:
    
        r1 = r5.getResponseCode();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x050c: MOVE (r15 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:239:0x050c */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0595  */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4, types: [int] */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.net.URLConnection] */
    @Override // com.google.android.gms.internal.ads.zzbft
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo17640y(java.lang.String r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbge.mo17640y(java.lang.String):boolean");
    }
}
