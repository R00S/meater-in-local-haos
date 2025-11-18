package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzbo;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzky;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public class zzkc implements InterfaceC7817s4 {

    /* renamed from: a */
    private static volatile zzkc f29356a;

    /* renamed from: b */
    private zzfr f29357b;

    /* renamed from: c */
    private zzex f29358c;

    /* renamed from: d */
    private C7668c f29359d;

    /* renamed from: e */
    private C7789p3 f29360e;

    /* renamed from: f */
    private zzjy f29361f;

    /* renamed from: g */
    private C7802q7 f29362g;

    /* renamed from: h */
    private final zzkg f29363h;

    /* renamed from: i */
    private C7818s5 f29364i;

    /* renamed from: j */
    private final zzfx f29365j;

    /* renamed from: k */
    private boolean f29366k;

    /* renamed from: l */
    private boolean f29367l;

    /* renamed from: m */
    private boolean f29368m;

    /* renamed from: n */
    @VisibleForTesting
    private long f29369n;

    /* renamed from: o */
    private List<Runnable> f29370o;

    /* renamed from: p */
    private int f29371p;

    /* renamed from: q */
    private int f29372q;

    /* renamed from: r */
    private boolean f29373r;

    /* renamed from: s */
    private boolean f29374s;

    /* renamed from: t */
    private boolean f29375t;

    /* renamed from: u */
    private FileLock f29376u;

    /* renamed from: v */
    private FileChannel f29377v;

    /* renamed from: w */
    private List<Long> f29378w;

    /* renamed from: x */
    private List<Long> f29379x;

    /* renamed from: y */
    private long f29380y;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    /* renamed from: com.google.android.gms.measurement.internal.zzkc$a */
    class C7882a implements InterfaceC7686e {

        /* renamed from: a */
        zzbr.zzg f29381a;

        /* renamed from: b */
        List<Long> f29382b;

        /* renamed from: c */
        List<zzbr.zzc> f29383c;

        /* renamed from: d */
        private long f29384d;

        private C7882a() {
        }

        /* renamed from: c */
        private static long m23466c(zzbr.zzc zzcVar) {
            return ((zzcVar.m21689W() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC7686e
        /* renamed from: a */
        public final void mo22770a(zzbr.zzg zzgVar) {
            Preconditions.m14372k(zzgVar);
            this.f29381a = zzgVar;
        }

        @Override // com.google.android.gms.measurement.internal.InterfaceC7686e
        /* renamed from: b */
        public final boolean mo22771b(long j2, zzbr.zzc zzcVar) {
            Preconditions.m14372k(zzcVar);
            if (this.f29383c == null) {
                this.f29383c = new ArrayList();
            }
            if (this.f29382b == null) {
                this.f29382b = new ArrayList();
            }
            if (this.f29383c.size() > 0 && m23466c(this.f29383c.get(0)) != m23466c(zzcVar)) {
                return false;
            }
            long jMo22272i = this.f29384d + zzcVar.mo22272i();
            if (jMo22272i >= Math.max(0, zzap.f29161p.m23095a(null).intValue())) {
                return false;
            }
            this.f29384d = jMo22272i;
            this.f29383c.add(zzcVar);
            this.f29382b.add(Long.valueOf(j2));
            return this.f29383c.size() < Math.max(1, zzap.f29163q.m23095a(null).intValue());
        }

        /* synthetic */ C7882a(zzkc zzkcVar, RunnableC7730i7 runnableC7730i7) {
            this();
        }
    }

    private zzkc(zzkh zzkhVar) {
        this(zzkhVar, null);
    }

    @VisibleForTesting
    /* renamed from: C */
    private final boolean m23406C(int i2, FileChannel fileChannel) throws IOException {
        m23423j0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f29365j.mo22836h().m23137H().m23147a("Bad channel to read from");
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(byteBufferAllocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f29365j.mo22836h().m23137H().m23148b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.f29365j.mo22836h().m23137H().m23148b("Failed to write to channel", e2);
            return false;
        }
    }

    /* renamed from: D */
    private final boolean m23407D(zzbr.zzc.zza zzaVar, zzbr.zzc.zza zzaVar2) {
        Preconditions.m14362a("_e".equals(zzaVar.m21704K()));
        m23448Z();
        zzbr.zze zzeVarM23480z = zzkg.m23480z((zzbr.zzc) ((zzfd) zzaVar.mo22283y()), "_sc");
        String strM21735N = zzeVarM23480z == null ? null : zzeVarM23480z.m21735N();
        m23448Z();
        zzbr.zze zzeVarM23480z2 = zzkg.m23480z((zzbr.zzc) ((zzfd) zzaVar2.mo22283y()), "_pc");
        String strM21735N2 = zzeVarM23480z2 != null ? zzeVarM23480z2.m21735N() : null;
        if (strM21735N2 == null || !strM21735N2.equals(strM21735N)) {
            return false;
        }
        m23413L(zzaVar, zzaVar2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026e A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05af A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0686 A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07ae A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x085e A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x091f A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0b62 A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0b75  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0b78 A[Catch: all -> 0x0f7f, TRY_LEAVE, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0b9f A[Catch: all -> 0x0dbe, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x0dbe, blocks: (B:363:0x0a31, B:364:0x0a46, B:366:0x0a4c, B:473:0x0d80, B:385:0x0ad6, B:413:0x0b9f, B:423:0x0c3a, B:427:0x0c52, B:441:0x0c87, B:472:0x0d7d, B:449:0x0ccf, B:451:0x0ce3, B:464:0x0d1e, B:466:0x0d48, B:467:0x0d53, B:468:0x0d65, B:470:0x0d6f, B:455:0x0cee, B:460:0x0d07, B:474:0x0d8a, B:476:0x0d95, B:477:0x0d9c, B:478:0x0da4, B:480:0x0daa), top: B:565:0x0a31 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a A[Catch: SQLiteException -> 0x0237, all -> 0x0f76, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0237, blocks: (B:46:0x00ee, B:48:0x011a, B:51:0x0130, B:52:0x0134, B:53:0x0146, B:55:0x014c, B:56:0x015d, B:58:0x0169, B:60:0x018b, B:59:0x017e, B:82:0x0222), top: B:553:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130 A[Catch: SQLiteException -> 0x0237, all -> 0x0f76, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0237, blocks: (B:46:0x00ee, B:48:0x011a, B:51:0x0130, B:52:0x0134, B:53:0x0146, B:55:0x014c, B:56:0x015d, B:58:0x0169, B:60:0x018b, B:59:0x017e, B:82:0x0222), top: B:553:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0f66 A[Catch: all -> 0x0f7f, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025b A[Catch: all -> 0x0f7f, TRY_ENTER, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0262 A[Catch: all -> 0x0f7f, TryCatch #12 {all -> 0x0f7f, blocks: (B:3:0x000b, B:25:0x0086, B:96:0x025e, B:98:0x0262, B:104:0x026e, B:105:0x0296, B:108:0x02aa, B:111:0x02d0, B:113:0x0309, B:119:0x031f, B:121:0x0329, B:287:0x0822, B:123:0x0352, B:126:0x036a, B:156:0x03cd, B:159:0x03d7, B:161:0x03e5, B:166:0x0438, B:162:0x0406, B:164:0x0415, B:170:0x0447, B:172:0x0477, B:173:0x04a5, B:175:0x04d9, B:177:0x04df, B:199:0x05af, B:200:0x05bb, B:203:0x05c5, B:209:0x05e8, B:206:0x05d7, B:212:0x05ee, B:214:0x05fa, B:216:0x0606, B:232:0x0655, B:235:0x0672, B:237:0x0686, B:239:0x0692, B:242:0x06a5, B:244:0x06b7, B:246:0x06c5, B:276:0x07ae, B:278:0x07b8, B:280:0x07be, B:281:0x07d8, B:283:0x07eb, B:284:0x0805, B:286:0x080e, B:251:0x06ee, B:253:0x06fe, B:256:0x0713, B:258:0x0725, B:260:0x0733, B:262:0x0743, B:264:0x075b, B:266:0x0767, B:269:0x077a, B:271:0x078e, B:220:0x0627, B:224:0x063b, B:226:0x0641, B:229:0x064c, B:180:0x04eb, B:182:0x0520, B:183:0x053d, B:185:0x0543, B:187:0x0551, B:191:0x0565, B:188:0x055a, B:194:0x056c, B:196:0x0573, B:197:0x0592, B:133:0x038c, B:136:0x0396, B:139:0x03a0, B:292:0x083f, B:294:0x084d, B:296:0x0856, B:307:0x0888, B:297:0x085e, B:299:0x0867, B:301:0x086d, B:304:0x0879, B:306:0x0883, B:310:0x088f, B:313:0x08a7, B:314:0x08af, B:316:0x08b5, B:321:0x08cc, B:322:0x08d7, B:324:0x08dd, B:326:0x08ef, B:331:0x08fc, B:333:0x0902, B:338:0x0941, B:340:0x0953, B:342:0x0972, B:344:0x0980, B:346:0x0986, B:348:0x0990, B:349:0x09c2, B:351:0x09c8, B:353:0x09d6, B:357:0x09e1, B:354:0x09db, B:358:0x09e4, B:360:0x09f6, B:361:0x09f9, B:369:0x0a64, B:371:0x0a7f, B:372:0x0a90, B:374:0x0a94, B:376:0x0aa0, B:377:0x0aa8, B:379:0x0aac, B:381:0x0ab2, B:382:0x0ac0, B:383:0x0acb, B:389:0x0b0c, B:390:0x0b14, B:392:0x0b1a, B:394:0x0b2c, B:396:0x0b3a, B:398:0x0b3e, B:400:0x0b48, B:402:0x0b4c, B:408:0x0b62, B:411:0x0b78, B:415:0x0bab, B:417:0x0bbf, B:419:0x0bee, B:430:0x0c59, B:432:0x0c6a, B:434:0x0c6e, B:436:0x0c72, B:438:0x0c76, B:439:0x0c82, B:443:0x0c8d, B:445:0x0ca9, B:446:0x0cb2, B:453:0x0ce7, B:420:0x0c14, B:485:0x0dc5, B:487:0x0dd7, B:488:0x0dda, B:490:0x0dea, B:510:0x0e5f, B:512:0x0e65, B:514:0x0e7a, B:517:0x0e81, B:522:0x0eb4, B:518:0x0e89, B:520:0x0e95, B:521:0x0e9b, B:523:0x0ec5, B:524:0x0edc, B:527:0x0ee4, B:528:0x0ee9, B:529:0x0ef9, B:531:0x0f13, B:532:0x0f2c, B:533:0x0f34, B:538:0x0f56, B:537:0x0f45, B:491:0x0e04, B:493:0x0e0a, B:495:0x0e14, B:497:0x0e1b, B:503:0x0e2b, B:505:0x0e32, B:507:0x0e51, B:509:0x0e58, B:508:0x0e55, B:504:0x0e2f, B:496:0x0e18, B:334:0x091f, B:335:0x0924, B:337:0x0936, B:541:0x0f66, B:49:0x012b, B:64:0x01c9, B:71:0x01ff, B:78:0x021c, B:83:0x0233, B:95:0x025b, B:547:0x0f7b, B:548:0x0f7e, B:42:0x00df, B:52:0x0134), top: B:567:0x000b, inners: #6, #9 }] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v42, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v69 */
    /* JADX WARN: Type inference failed for: r9v70 */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m23408E(java.lang.String r61, long r62) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23408E(java.lang.String, long):boolean");
    }

    /* renamed from: F */
    private final void m23409F() throws IllegalStateException {
        m23423j0();
        if (this.f29373r || this.f29374s || this.f29375t) {
            this.f29365j.mo22836h().m23145P().m23150d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f29373r), Boolean.valueOf(this.f29374s), Boolean.valueOf(this.f29375t));
            return;
        }
        this.f29365j.mo22836h().m23145P().m23147a("Stopping uploading service(s)");
        List<Runnable> list = this.f29370o;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f29370o.clear();
    }

    @VisibleForTesting
    /* renamed from: H */
    private final boolean m23410H() throws IOException {
        FileLock fileLock;
        m23423j0();
        if (this.f29365j.m23243y().m23587r(zzap.f29104L0) && (fileLock = this.f29376u) != null && fileLock.isValid()) {
            this.f29365j.mo22836h().m23145P().m23147a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f29365j.mo22834f().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f29377v = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.f29376u = fileLockTryLock;
            if (fileLockTryLock != null) {
                this.f29365j.mo22836h().m23145P().m23147a("Storage concurrent access okay");
                return true;
            }
            this.f29365j.mo22836h().m23137H().m23147a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            this.f29365j.mo22836h().m23137H().m23148b("Failed to acquire storage lock", e2);
            return false;
        } catch (IOException e3) {
            this.f29365j.mo22836h().m23137H().m23148b("Failed to access storage lock file", e3);
            return false;
        } catch (OverlappingFileLockException e4) {
            this.f29365j.mo22836h().m23140K().m23148b("Storage lock already acquired", e4);
            return false;
        }
    }

    /* renamed from: I */
    private final boolean m23411I() {
        m23423j0();
        m23451c0();
        return this.f29367l;
    }

    /* renamed from: K */
    private final Boolean m23412K(C7878z3 c7878z3) {
        try {
            if (c7878z3.m22903V() != -2147483648L) {
                if (c7878z3.m22903V() == Wrappers.m14674a(this.f29365j.mo22834f()).m14671e(c7878z3.m22940t(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.m14674a(this.f29365j.mo22834f()).m14671e(c7878z3.m22940t(), 0).versionName;
                if (c7878z3.m22901T() != null && c7878z3.m22901T().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: L */
    private final void m23413L(zzbr.zzc.zza zzaVar, zzbr.zzc.zza zzaVar2) {
        Preconditions.m14362a("_e".equals(zzaVar.m21704K()));
        m23448Z();
        zzbr.zze zzeVarM23480z = zzkg.m23480z((zzbr.zzc) ((zzfd) zzaVar.mo22283y()), "_et");
        if (!zzeVarM23480z.m21736P() || zzeVarM23480z.m21737Q() <= 0) {
            return;
        }
        long jM21737Q = zzeVarM23480z.m21737Q();
        m23448Z();
        zzbr.zze zzeVarM23480z2 = zzkg.m23480z((zzbr.zzc) ((zzfd) zzaVar2.mo22283y()), "_et");
        if (zzeVarM23480z2 != null && zzeVarM23480z2.m21737Q() > 0) {
            jM21737Q += zzeVarM23480z2.m21737Q();
        }
        m23448Z();
        zzkg.m23470I(zzaVar2, "_et", Long.valueOf(jM21737Q));
        m23448Z();
        zzkg.m23470I(zzaVar, "_fr", 1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x0845 A[Catch: all -> 0x08ba, TryCatch #2 {all -> 0x08ba, blocks: (B:33:0x0108, B:36:0x0117, B:85:0x02b1, B:87:0x02f0, B:89:0x02f5, B:90:0x030e, B:94:0x031f, B:96:0x0334, B:98:0x033b, B:99:0x0354, B:103:0x0377, B:107:0x039f, B:108:0x03b8, B:112:0x03c8, B:115:0x03eb, B:116:0x0409, B:119:0x0413, B:121:0x0421, B:123:0x042d, B:125:0x0433, B:126:0x043e, B:128:0x0446, B:130:0x0456, B:132:0x0464, B:134:0x046f, B:136:0x047b, B:137:0x0492, B:139:0x04bf, B:142:0x04cf, B:145:0x050b, B:147:0x0533, B:149:0x056d, B:150:0x0572, B:152:0x057a, B:153:0x057f, B:155:0x0587, B:156:0x058c, B:158:0x0595, B:159:0x0599, B:161:0x05a6, B:162:0x05ab, B:164:0x05b9, B:166:0x05c3, B:168:0x05cb, B:172:0x05de, B:174:0x05e6, B:175:0x05e9, B:177:0x05fe, B:179:0x0608, B:180:0x060b, B:182:0x0619, B:184:0x0623, B:186:0x0627, B:188:0x0632, B:200:0x069e, B:202:0x06e6, B:204:0x06ec, B:206:0x06f5, B:207:0x06fa, B:209:0x0706, B:210:0x076d, B:212:0x0777, B:213:0x077e, B:215:0x0788, B:216:0x078f, B:217:0x079a, B:219:0x07a0, B:221:0x07d1, B:222:0x07e1, B:224:0x07e9, B:225:0x07ed, B:227:0x07f3, B:237:0x083f, B:239:0x0845, B:242:0x0861, B:244:0x0875, B:231:0x0806, B:233:0x082a, B:241:0x0849, B:189:0x063c, B:191:0x064e, B:193:0x0652, B:195:0x0664, B:199:0x069b, B:196:0x067e, B:198:0x0684, B:169:0x05d1, B:171:0x05d9, B:146:0x0525, B:40:0x0125, B:43:0x0137, B:45:0x014e, B:51:0x016a, B:54:0x0196, B:56:0x019c, B:58:0x01aa, B:60:0x01b2, B:62:0x01bc, B:64:0x01c7, B:67:0x01ce, B:76:0x0261, B:78:0x026b, B:82:0x02a2, B:69:0x01fb, B:70:0x0219, B:75:0x0247, B:74:0x0236, B:61:0x01b7, B:52:0x016f, B:53:0x018c), top: B:255:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026b A[Catch: all -> 0x08ba, TryCatch #2 {all -> 0x08ba, blocks: (B:33:0x0108, B:36:0x0117, B:85:0x02b1, B:87:0x02f0, B:89:0x02f5, B:90:0x030e, B:94:0x031f, B:96:0x0334, B:98:0x033b, B:99:0x0354, B:103:0x0377, B:107:0x039f, B:108:0x03b8, B:112:0x03c8, B:115:0x03eb, B:116:0x0409, B:119:0x0413, B:121:0x0421, B:123:0x042d, B:125:0x0433, B:126:0x043e, B:128:0x0446, B:130:0x0456, B:132:0x0464, B:134:0x046f, B:136:0x047b, B:137:0x0492, B:139:0x04bf, B:142:0x04cf, B:145:0x050b, B:147:0x0533, B:149:0x056d, B:150:0x0572, B:152:0x057a, B:153:0x057f, B:155:0x0587, B:156:0x058c, B:158:0x0595, B:159:0x0599, B:161:0x05a6, B:162:0x05ab, B:164:0x05b9, B:166:0x05c3, B:168:0x05cb, B:172:0x05de, B:174:0x05e6, B:175:0x05e9, B:177:0x05fe, B:179:0x0608, B:180:0x060b, B:182:0x0619, B:184:0x0623, B:186:0x0627, B:188:0x0632, B:200:0x069e, B:202:0x06e6, B:204:0x06ec, B:206:0x06f5, B:207:0x06fa, B:209:0x0706, B:210:0x076d, B:212:0x0777, B:213:0x077e, B:215:0x0788, B:216:0x078f, B:217:0x079a, B:219:0x07a0, B:221:0x07d1, B:222:0x07e1, B:224:0x07e9, B:225:0x07ed, B:227:0x07f3, B:237:0x083f, B:239:0x0845, B:242:0x0861, B:244:0x0875, B:231:0x0806, B:233:0x082a, B:241:0x0849, B:189:0x063c, B:191:0x064e, B:193:0x0652, B:195:0x0664, B:199:0x069b, B:196:0x067e, B:198:0x0684, B:169:0x05d1, B:171:0x05d9, B:146:0x0525, B:40:0x0125, B:43:0x0137, B:45:0x014e, B:51:0x016a, B:54:0x0196, B:56:0x019c, B:58:0x01aa, B:60:0x01b2, B:62:0x01bc, B:64:0x01c7, B:67:0x01ce, B:76:0x0261, B:78:0x026b, B:82:0x02a2, B:69:0x01fb, B:70:0x0219, B:75:0x0247, B:74:0x0236, B:61:0x01b7, B:52:0x016f, B:53:0x018c), top: B:255:0x0108, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a2 A[Catch: all -> 0x08ba, TRY_LEAVE, TryCatch #2 {all -> 0x08ba, blocks: (B:33:0x0108, B:36:0x0117, B:85:0x02b1, B:87:0x02f0, B:89:0x02f5, B:90:0x030e, B:94:0x031f, B:96:0x0334, B:98:0x033b, B:99:0x0354, B:103:0x0377, B:107:0x039f, B:108:0x03b8, B:112:0x03c8, B:115:0x03eb, B:116:0x0409, B:119:0x0413, B:121:0x0421, B:123:0x042d, B:125:0x0433, B:126:0x043e, B:128:0x0446, B:130:0x0456, B:132:0x0464, B:134:0x046f, B:136:0x047b, B:137:0x0492, B:139:0x04bf, B:142:0x04cf, B:145:0x050b, B:147:0x0533, B:149:0x056d, B:150:0x0572, B:152:0x057a, B:153:0x057f, B:155:0x0587, B:156:0x058c, B:158:0x0595, B:159:0x0599, B:161:0x05a6, B:162:0x05ab, B:164:0x05b9, B:166:0x05c3, B:168:0x05cb, B:172:0x05de, B:174:0x05e6, B:175:0x05e9, B:177:0x05fe, B:179:0x0608, B:180:0x060b, B:182:0x0619, B:184:0x0623, B:186:0x0627, B:188:0x0632, B:200:0x069e, B:202:0x06e6, B:204:0x06ec, B:206:0x06f5, B:207:0x06fa, B:209:0x0706, B:210:0x076d, B:212:0x0777, B:213:0x077e, B:215:0x0788, B:216:0x078f, B:217:0x079a, B:219:0x07a0, B:221:0x07d1, B:222:0x07e1, B:224:0x07e9, B:225:0x07ed, B:227:0x07f3, B:237:0x083f, B:239:0x0845, B:242:0x0861, B:244:0x0875, B:231:0x0806, B:233:0x082a, B:241:0x0849, B:189:0x063c, B:191:0x064e, B:193:0x0652, B:195:0x0664, B:199:0x069b, B:196:0x067e, B:198:0x0684, B:169:0x05d1, B:171:0x05d9, B:146:0x0525, B:40:0x0125, B:43:0x0137, B:45:0x014e, B:51:0x016a, B:54:0x0196, B:56:0x019c, B:58:0x01aa, B:60:0x01b2, B:62:0x01bc, B:64:0x01c7, B:67:0x01ce, B:76:0x0261, B:78:0x026b, B:82:0x02a2, B:69:0x01fb, B:70:0x0219, B:75:0x0247, B:74:0x0236, B:61:0x01b7, B:52:0x016f, B:53:0x018c), top: B:255:0x0108, inners: #0, #1 }] */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m23414M(com.google.android.gms.measurement.internal.zzan r28, com.google.android.gms.measurement.internal.zzm r29) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 2246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23414M(com.google.android.gms.measurement.internal.zzan, com.google.android.gms.measurement.internal.zzm):void");
    }

    /* renamed from: N */
    private static void m23415N(AbstractC7703f7 abstractC7703f7) {
        if (abstractC7703f7 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (abstractC7703f7.m22777s()) {
            return;
        }
        String strValueOf = String.valueOf(abstractC7703f7.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    @VisibleForTesting
    /* renamed from: a */
    private final int m23416a(FileChannel fileChannel) throws IOException {
        m23423j0();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f29365j.mo22836h().m23137H().m23147a("Bad channel to read from");
            return 0;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int i2 = fileChannel.read(byteBufferAllocate);
            if (i2 == 4) {
                byteBufferAllocate.flip();
                return byteBufferAllocate.getInt();
            }
            if (i2 != -1) {
                this.f29365j.mo22836h().m23140K().m23148b("Unexpected data length. Bytes read", Integer.valueOf(i2));
            }
            return 0;
        } catch (IOException e2) {
            this.f29365j.mo22836h().m23137H().m23148b("Failed to read from channel", e2);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.C7878z3 m23417b(com.google.android.gms.measurement.internal.zzm r9, com.google.android.gms.measurement.internal.C7878z3 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23417b(com.google.android.gms.measurement.internal.zzm, com.google.android.gms.measurement.internal.z3, java.lang.String):com.google.android.gms.measurement.internal.z3");
    }

    /* renamed from: c */
    public static zzkc m23418c(Context context) {
        Preconditions.m14372k(context);
        Preconditions.m14372k(context.getApplicationContext());
        if (f29356a == null) {
            synchronized (zzkc.class) {
                if (f29356a == null) {
                    f29356a = new zzkc(new zzkh(context));
                }
            }
        }
        return f29356a;
    }

    /* renamed from: d */
    private final zzm m23419d(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j2, String str3, String str4) throws IllegalStateException {
        String installerPackageName;
        String str5;
        int i2;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f29365j.mo22836h().m23137H().m23147a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            installerPackageName = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.f29365j.mo22836h().m23137H().m23148b("Error retrieving installer package name. appId", zzet.m23131x(str));
            installerPackageName = "Unknown";
        }
        if (installerPackageName == null) {
            installerPackageName = "manual_install";
        } else if ("com.android.vending".equals(installerPackageName)) {
            installerPackageName = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str6 = installerPackageName;
        try {
            PackageInfo packageInfoM14671e = Wrappers.m14674a(context).m14671e(str, 0);
            if (packageInfoM14671e != null) {
                CharSequence charSequenceM14670d = Wrappers.m14674a(context).m14670d(str);
                if (!TextUtils.isEmpty(charSequenceM14670d)) {
                    charSequenceM14670d.toString();
                }
                str5 = packageInfoM14671e.versionName;
                i2 = packageInfoM14671e.versionCode;
            } else {
                str5 = "Unknown";
                i2 = Integer.MIN_VALUE;
            }
            this.f29365j.mo22832G();
            return new zzm(str, str2, str5, i2, str6, this.f29365j.m23243y().m23565C(), this.f29365j.m23217I().m23551w(context, str), (String) null, z, false, HttpUrl.FRAGMENT_ENCODE_SET, 0L, this.f29365j.m23243y().m23572K(str) ? j2 : 0L, 0, z2, z3, false, str3, (Boolean) null, 0L, (List<String>) null, (zzky.m22475b() && this.f29365j.m23243y().m23564B(str, zzap.f29108N0)) ? str4 : null);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.f29365j.mo22836h().m23137H().m23149c("Error retrieving newly installed package info. appId, appName", zzet.m23131x(str), "Unknown");
            return null;
        }
    }

    /* renamed from: e */
    private final zzm m23420e(String str) {
        C7878z3 c7878z3M22746j0 = m23445W().m22746j0(str);
        if (c7878z3M22746j0 == null || TextUtils.isEmpty(c7878z3M22746j0.m22901T())) {
            this.f29365j.mo22836h().m23144O().m23148b("No app data available; dropping", str);
            return null;
        }
        Boolean boolM23412K = m23412K(c7878z3M22746j0);
        if (boolM23412K == null || boolM23412K.booleanValue()) {
            return new zzm(str, c7878z3M22746j0.m22882A(), c7878z3M22746j0.m22901T(), c7878z3M22746j0.m22903V(), c7878z3M22746j0.m22905X(), c7878z3M22746j0.m22907Z(), c7878z3M22746j0.m22911b0(), (String) null, c7878z3M22746j0.m22917e0(), false, c7878z3M22746j0.m22894M(), c7878z3M22746j0.m22928k(), 0L, 0, c7878z3M22746j0.m22930l(), c7878z3M22746j0.m22932m(), false, c7878z3M22746j0.m22885D(), c7878z3M22746j0.m22934n(), c7878z3M22746j0.m22915d0(), c7878z3M22746j0.m22935o(), (zzky.m22475b() && this.f29365j.m23243y().m23564B(str, zzap.f29108N0)) ? c7878z3M22746j0.m22888G() : null);
        }
        this.f29365j.mo22836h().m23137H().m23148b("App version does not match; dropping. appId", zzet.m23131x(str));
        return null;
    }

    /* renamed from: h0 */
    private final C7789p3 m23421h0() {
        C7789p3 c7789p3 = this.f29360e;
        if (c7789p3 != null) {
            return c7789p3;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: i0 */
    private final zzjy m23422i0() {
        m23415N(this.f29361f);
        return this.f29361f;
    }

    /* renamed from: j0 */
    private final void m23423j0() {
        this.f29365j.mo22835g().mo22792d();
    }

    /* renamed from: k0 */
    private final long m23424k0() {
        long jMo14608a = this.f29365j.mo22837j().mo14608a();
        C7807r3 c7807r3M23211B = this.f29365j.m23211B();
        c7807r3M23211B.m22807p();
        c7807r3M23211B.mo22792d();
        long jM23155a = c7807r3M23211B.f28857j.m23155a();
        if (jM23155a == 0) {
            jM23155a = 1 + c7807r3M23211B.mo22839l().m23555z0().nextInt(86400000);
            c7807r3M23211B.f28857j.m23156b(jM23155a);
        }
        return ((((jMo14608a + jM23155a) / 1000) / 60) / 60) / 24;
    }

    @VisibleForTesting
    /* renamed from: l */
    private static void m23425l(zzbr.zzc.zza zzaVar, int i2, String str) {
        List<zzbr.zze> listM21700G = zzaVar.m21700G();
        for (int i3 = 0; i3 < listM21700G.size(); i3++) {
            if ("_err".equals(listM21700G.get(i3).m21733B())) {
                return;
            }
        }
        zzaVar.m21697D((zzbr.zze) ((zzfd) zzbr.zze.m21728T().m21742C("_err").m21741B(Long.valueOf(i2).longValue()).mo22283y())).m21697D((zzbr.zze) ((zzfd) zzbr.zze.m21728T().m21742C("_ev").m21744E(str).mo22283y()));
    }

    /* renamed from: l0 */
    private final boolean m23426l0() {
        m23423j0();
        m23451c0();
        return m23445W().m22729F0() || !TextUtils.isEmpty(m23445W().m22763y());
    }

    @VisibleForTesting
    /* renamed from: m */
    private static void m23427m(zzbr.zzc.zza zzaVar, String str) {
        List<zzbr.zze> listM21700G = zzaVar.m21700G();
        for (int i2 = 0; i2 < listM21700G.size(); i2++) {
            if (str.equals(listM21700G.get(i2).m21733B())) {
                zzaVar.m21702I(i2);
                return;
            }
        }
    }

    /* renamed from: m0 */
    private final void m23428m0() {
        long jMax;
        long jMax2;
        m23423j0();
        m23451c0();
        if (m23411I() || this.f29365j.m23243y().m23587r(zzap.f29158n0)) {
            if (this.f29369n > 0) {
                long jAbs = 3600000 - Math.abs(this.f29365j.mo22837j().mo14609b() - this.f29369n);
                if (jAbs > 0) {
                    this.f29365j.mo22836h().m23145P().m23148b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                    m23421h0().m22805c();
                    m23422i0().m23405x();
                    return;
                }
                this.f29369n = 0L;
            }
            if (!this.f29365j.m23241u() || !m23426l0()) {
                this.f29365j.mo22836h().m23145P().m23147a("Nothing to upload or uploading impossible");
                m23421h0().m22805c();
                m23422i0().m23405x();
                return;
            }
            long jMo14608a = this.f29365j.mo22837j().mo14608a();
            long jMax3 = Math.max(0L, zzap.f29095H.m23095a(null).longValue());
            boolean z = m23445W().m22730G0() || m23445W().m22723B0();
            if (z) {
                String strM23581V = this.f29365j.m23243y().m23581V();
                jMax = (TextUtils.isEmpty(strM23581V) || ".none.".equals(strM23581V)) ? Math.max(0L, zzap.f29083B.m23095a(null).longValue()) : Math.max(0L, zzap.f29085C.m23095a(null).longValue());
            } else {
                jMax = Math.max(0L, zzap.f29081A.m23095a(null).longValue());
            }
            long jM23155a = this.f29365j.m23211B().f28853f.m23155a();
            long jM23155a2 = this.f29365j.m23211B().f28854g.m23155a();
            long j2 = jMax;
            long jMax4 = Math.max(m23445W().m22727D0(), m23445W().m22728E0());
            if (jMax4 == 0) {
                jMax2 = 0;
            } else {
                long jAbs2 = jMo14608a - Math.abs(jMax4 - jMo14608a);
                long jAbs3 = jMo14608a - Math.abs(jM23155a - jMo14608a);
                long jAbs4 = jMo14608a - Math.abs(jM23155a2 - jMo14608a);
                long jMax5 = Math.max(jAbs3, jAbs4);
                jMax2 = jAbs2 + jMax3;
                if (z && jMax5 > 0) {
                    jMax2 = Math.min(jAbs2, jMax5) + j2;
                }
                if (!m23448Z().m23487Q(jMax5, j2)) {
                    jMax2 = jMax5 + j2;
                }
                if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                    for (int i2 = 0; i2 < Math.min(20, Math.max(0, zzap.f29099J.m23095a(null).intValue())); i2++) {
                        jMax2 += Math.max(0L, zzap.f29097I.m23095a(null).longValue()) * (1 << i2);
                        if (jMax2 > jAbs4) {
                            break;
                        }
                    }
                    jMax2 = 0;
                }
            }
            if (jMax2 == 0) {
                this.f29365j.mo22836h().m23145P().m23147a("Next upload time is 0");
                m23421h0().m22805c();
                m23422i0().m23405x();
                return;
            }
            if (!m23443U().m23154z()) {
                this.f29365j.mo22836h().m23145P().m23147a("No network");
                m23421h0().m22804b();
                m23422i0().m23405x();
                return;
            }
            long jM23155a3 = this.f29365j.m23211B().f28855h.m23155a();
            long jMax6 = Math.max(0L, zzap.f29179y.m23095a(null).longValue());
            if (!m23448Z().m23487Q(jM23155a3, jMax6)) {
                jMax2 = Math.max(jMax2, jM23155a3 + jMax6);
            }
            m23421h0().m22805c();
            long jMo14608a2 = jMax2 - this.f29365j.mo22837j().mo14608a();
            if (jMo14608a2 <= 0) {
                jMo14608a2 = Math.max(0L, zzap.f29087D.m23095a(null).longValue());
                this.f29365j.m23211B().f28853f.m23156b(this.f29365j.mo22837j().mo14608a());
            }
            this.f29365j.mo22836h().m23145P().m23148b("Upload scheduled in approximately ms", Long.valueOf(jMo14608a2));
            m23422i0().m23404w(jMo14608a2);
        }
    }

    /* renamed from: n */
    private static void m23429n(zzbr.zzg.zza zzaVar) {
        zzaVar.m21945N(Long.MAX_VALUE).m21954T(Long.MIN_VALUE);
        for (int i2 = 0; i2 < zzaVar.m21942L(); i2++) {
            zzbr.zzc zzcVarM21944M = zzaVar.m21944M(i2);
            if (zzcVarM21944M.m21689W() < zzaVar.m21966j0()) {
                zzaVar.m21945N(zzcVarM21944M.m21689W());
            }
            if (zzcVarM21944M.m21689W() > zzaVar.m21970n0()) {
                zzaVar.m21954T(zzcVarM21944M.m21689W());
            }
        }
    }

    @VisibleForTesting
    /* renamed from: o */
    private final void m23430o(zzbr.zzg.zza zzaVar, long j2, boolean z) throws IllegalStateException {
        String str = z ? "_se" : "_lte";
        C7766m7 c7766m7M22751o0 = m23445W().m22751o0(zzaVar.m21926C0(), str);
        C7766m7 c7766m7 = (c7766m7M22751o0 == null || c7766m7M22751o0.f28781e == null) ? new C7766m7(zzaVar.m21926C0(), "auto", str, this.f29365j.mo22837j().mo14608a(), Long.valueOf(j2)) : new C7766m7(zzaVar.m21926C0(), "auto", str, this.f29365j.mo22837j().mo14608a(), Long.valueOf(((Long) c7766m7M22751o0.f28781e).longValue() + j2));
        zzbr.zzk zzkVar = (zzbr.zzk) ((zzfd) zzbr.zzk.m22062X().m22078C(str).m22077B(this.f29365j.mo22837j().mo14608a()).m22080E(((Long) c7766m7.f28781e).longValue()).mo22283y());
        boolean z2 = false;
        int iM23479w = zzkg.m23479w(zzaVar, str);
        if (iM23479w >= 0) {
            zzaVar.m21923B(iM23479w, zzkVar);
            z2 = true;
        }
        if (!z2) {
            zzaVar.m21933G(zzkVar);
        }
        if (j2 > 0) {
            m23445W().m22742T(c7766m7);
            this.f29365j.mo22836h().m23144O().m23149c("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", c7766m7.f28781e);
        }
    }

    /* renamed from: r */
    private final void m23431r(C7878z3 c7878z3) throws IllegalStateException {
        m23423j0();
        if (TextUtils.isEmpty(c7878z3.m22882A()) && TextUtils.isEmpty(c7878z3.m22885D())) {
            m23434A(c7878z3.m22940t(), 204, null, null, null);
            return;
        }
        zzx zzxVarM23243y = this.f29365j.m23243y();
        Uri.Builder builder = new Uri.Builder();
        String strM22882A = c7878z3.m22882A();
        if (TextUtils.isEmpty(strM22882A)) {
            strM22882A = c7878z3.m22885D();
        }
        C0867a c0867a = null;
        Uri.Builder builderEncodedAuthority = builder.scheme(zzap.f29153l.m23095a(null)).encodedAuthority(zzap.f29155m.m23095a(null));
        String strValueOf = String.valueOf(strM22882A);
        builderEncodedAuthority.path(strValueOf.length() != 0 ? "config/app/".concat(strValueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", c7878z3.m22944x()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(zzxVarM23243y.m23565C()));
        String string = builder.build().toString();
        try {
            URL url = new URL(string);
            this.f29365j.mo22836h().m23145P().m23148b("Fetching remote configuration", c7878z3.m22940t());
            zzbo.zzb zzbVarM23186w = m23441S().m23186w(c7878z3.m22940t());
            String strM23176B = m23441S().m23176B(c7878z3.m22940t());
            if (zzbVarM23186w != null && !TextUtils.isEmpty(strM23176B)) {
                c0867a = new C0867a();
                c0867a.put("If-Modified-Since", strM23176B);
            }
            this.f29373r = true;
            zzex zzexVarM23443U = m23443U();
            String strM22940t = c7878z3.m22940t();
            C7739j7 c7739j7 = new C7739j7(this);
            zzexVarM23443U.mo22792d();
            zzexVarM23443U.m22778t();
            Preconditions.m14372k(url);
            Preconditions.m14372k(c7739j7);
            zzexVarM23443U.mo22835g().m23197C(new RunnableC7762m3(zzexVarM23443U, strM22940t, url, null, c0867a, c7739j7));
        } catch (MalformedURLException unused) {
            this.f29365j.mo22836h().m23137H().m23149c("Failed to parse config URL. Not fetching. appId", zzet.m23131x(c7878z3.m22940t()), string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m23433u(zzkh zzkhVar) throws IllegalStateException {
        this.f29365j.mo22835g().mo22792d();
        C7668c c7668c = new C7668c(this);
        c7668c.m22779u();
        this.f29359d = c7668c;
        this.f29365j.m23243y().m23586q(this.f29357b);
        C7802q7 c7802q7 = new C7802q7(this);
        c7802q7.m22779u();
        this.f29362g = c7802q7;
        C7818s5 c7818s5 = new C7818s5(this);
        c7818s5.m22779u();
        this.f29364i = c7818s5;
        zzjy zzjyVar = new zzjy(this);
        zzjyVar.m22779u();
        this.f29361f = zzjyVar;
        this.f29360e = new C7789p3(this);
        if (this.f29371p != this.f29372q) {
            this.f29365j.mo22836h().m23137H().m23149c("Not all upload components initialized", Integer.valueOf(this.f29371p), Integer.valueOf(this.f29372q));
        }
        this.f29366k = true;
    }

    @VisibleForTesting
    /* renamed from: A */
    final void m23434A(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) throws IllegalStateException {
        m23423j0();
        m23451c0();
        Preconditions.m14368g(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f29373r = false;
                m23409F();
            }
        }
        this.f29365j.mo22836h().m23145P().m23148b("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        m23445W().m22760w0();
        try {
            C7878z3 c7878z3M22746j0 = m23445W().m22746j0(str);
            boolean z = true;
            boolean z2 = (i2 == 200 || i2 == 204 || i2 == 304) && th == null;
            if (c7878z3M22746j0 == null) {
                this.f29365j.mo22836h().m23140K().m23148b("App does not exist in onConfigFetched. appId", zzet.m23131x(str));
            } else if (z2 || i2 == 404) {
                List<String> list = map != null ? map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                if (i2 == 404 || i2 == 304) {
                    if (m23441S().m23186w(str) == null && !m23441S().m23175A(str, null, null)) {
                        return;
                    }
                } else if (!m23441S().m23175A(str, bArr, str2)) {
                    return;
                }
                c7878z3M22746j0.m22892K(this.f29365j.mo22837j().mo14608a());
                m23445W().m22737O(c7878z3M22746j0);
                if (i2 == 404) {
                    this.f29365j.mo22836h().m23142M().m23148b("Config not found. Using empty config. appId", str);
                } else {
                    this.f29365j.mo22836h().m23145P().m23149c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                }
                if (m23443U().m23154z() && m23426l0()) {
                    m23452d0();
                } else {
                    m23428m0();
                }
            } else {
                c7878z3M22746j0.m22895N(this.f29365j.mo22837j().mo14608a());
                m23445W().m22737O(c7878z3M22746j0);
                this.f29365j.mo22836h().m23145P().m23149c("Fetching config failed. code, error", Integer.valueOf(i2), th);
                m23441S().m23178D(str);
                this.f29365j.m23211B().f28854g.m23156b(this.f29365j.mo22837j().mo14608a());
                if (i2 != 503 && i2 != 429) {
                    z = false;
                }
                if (z) {
                    this.f29365j.m23211B().f28855h.m23156b(this.f29365j.mo22837j().mo14608a());
                }
                m23428m0();
            }
            m23445W().m22759w();
        } finally {
            m23445W().m22721A0();
        }
    }

    /* renamed from: B */
    final void m23435B(boolean z) {
        m23428m0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: G */
    public final zzw mo22832G() {
        return this.f29365j.mo22832G();
    }

    /* renamed from: J */
    public final zzx m23436J() {
        return this.f29365j.m23243y();
    }

    /* renamed from: O */
    final void m23437O(zzkj zzkjVar, zzm zzmVar) throws IllegalStateException {
        m23423j0();
        m23451c0();
        if (TextUtils.isEmpty(zzmVar.f29402g) && TextUtils.isEmpty(zzmVar.f29418w)) {
            return;
        }
        if (!zzmVar.f29408m) {
            m23442T(zzmVar);
            return;
        }
        if (!this.f29365j.m23243y().m23564B(zzmVar.f29401f, zzap.f29152k0)) {
            this.f29365j.mo22836h().m23144O().m23148b("Removing user property", this.f29365j.m23218J().m23120B(zzkjVar.f29388g));
            m23445W().m22760w0();
            try {
                m23442T(zzmVar);
                m23445W().m22749m0(zzmVar.f29401f, zzkjVar.f29388g);
                m23445W().m22759w();
                this.f29365j.mo22836h().m23144O().m23148b("User property removed", this.f29365j.m23218J().m23120B(zzkjVar.f29388g));
                return;
            } finally {
            }
        }
        if ("_npa".equals(zzkjVar.f29388g) && zzmVar.f29419x != null) {
            this.f29365j.mo22836h().m23144O().m23147a("Falling back to manifest metadata value for ad personalization");
            m23461v(new zzkj("_npa", this.f29365j.mo22837j().mo14608a(), Long.valueOf(zzmVar.f29419x.booleanValue() ? 1L : 0L), "auto"), zzmVar);
            return;
        }
        this.f29365j.mo22836h().m23144O().m23148b("Removing user property", this.f29365j.m23218J().m23120B(zzkjVar.f29388g));
        m23445W().m22760w0();
        try {
            m23442T(zzmVar);
            m23445W().m22749m0(zzmVar.f29401f, zzkjVar.f29388g);
            m23445W().m22759w();
            this.f29365j.mo22836h().m23144O().m23148b("User property removed", this.f29365j.m23218J().m23120B(zzkjVar.f29388g));
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022c A[Catch: all -> 0x04d5, TryCatch #0 {all -> 0x04d5, blocks: (B:29:0x00b9, B:31:0x00c9, B:33:0x00d7, B:35:0x00e1, B:37:0x00e5, B:41:0x00f6, B:43:0x010e, B:50:0x0136, B:52:0x0142, B:54:0x0159, B:55:0x0181, B:57:0x01cb, B:60:0x01de, B:63:0x01f2, B:65:0x01fd, B:70:0x020c, B:72:0x0214, B:74:0x021a, B:78:0x0229, B:80:0x022c, B:82:0x0250, B:84:0x0255, B:90:0x0275, B:93:0x0289, B:95:0x02aa, B:96:0x02b8, B:98:0x02e9, B:100:0x02f1, B:102:0x02f5, B:103:0x02f8, B:105:0x0319, B:144:0x03f3, B:145:0x03f6, B:156:0x0465, B:158:0x0475, B:160:0x048d, B:161:0x0494, B:165:0x04c6, B:107:0x0332, B:112:0x035d, B:114:0x0365, B:116:0x036d, B:120:0x0381, B:124:0x038f, B:128:0x039a, B:131:0x03ac, B:136:0x03d7, B:138:0x03dd, B:139:0x03e2, B:141:0x03e8, B:134:0x03bf, B:121:0x0387, B:110:0x0345, B:148:0x040e, B:150:0x0442, B:152:0x044a, B:154:0x044e, B:155:0x0451, B:162:0x04a9, B:164:0x04ad, B:87:0x0265, B:45:0x0118, B:48:0x0122), top: B:172:0x00b9, inners: #1, #2, #3 }] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m23438P(com.google.android.gms.measurement.internal.zzm r22) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23438P(com.google.android.gms.measurement.internal.zzm):void");
    }

    /* renamed from: Q */
    final void m23439Q(zzv zzvVar) {
        zzm zzmVarM23420e = m23420e(zzvVar.f29422f);
        if (zzmVarM23420e != null) {
            m23440R(zzvVar, zzmVarM23420e);
        }
    }

    /* renamed from: R */
    final void m23440R(zzv zzvVar, zzm zzmVar) {
        Preconditions.m14372k(zzvVar);
        Preconditions.m14368g(zzvVar.f29422f);
        Preconditions.m14372k(zzvVar.f29424h);
        Preconditions.m14368g(zzvVar.f29424h.f29388g);
        m23423j0();
        m23451c0();
        if (TextUtils.isEmpty(zzmVar.f29402g) && TextUtils.isEmpty(zzmVar.f29418w)) {
            return;
        }
        if (!zzmVar.f29408m) {
            m23442T(zzmVar);
            return;
        }
        m23445W().m22760w0();
        try {
            m23442T(zzmVar);
            zzv zzvVarM22752q0 = m23445W().m22752q0(zzvVar.f29422f, zzvVar.f29424h.f29388g);
            if (zzvVarM22752q0 != null) {
                this.f29365j.mo22836h().m23144O().m23149c("Removing conditional user property", zzvVar.f29422f, this.f29365j.m23218J().m23120B(zzvVar.f29424h.f29388g));
                m23445W().m22754s0(zzvVar.f29422f, zzvVar.f29424h.f29388g);
                if (zzvVarM22752q0.f29426j) {
                    m23445W().m22749m0(zzvVar.f29422f, zzvVar.f29424h.f29388g);
                }
                zzan zzanVar = zzvVar.f29432p;
                if (zzanVar != null) {
                    zzam zzamVar = zzanVar.f29078g;
                    Bundle bundleM22960Y = zzamVar != null ? zzamVar.m22960Y() : null;
                    zzkk zzkkVarM23217I = this.f29365j.m23217I();
                    String str = zzvVar.f29422f;
                    zzan zzanVar2 = zzvVar.f29432p;
                    m23414M(zzkkVarM23217I.m23522C(str, zzanVar2.f29077f, bundleM22960Y, zzvVarM22752q0.f29423g, zzanVar2.f29080i, true, false), zzmVar);
                }
            } else {
                this.f29365j.mo22836h().m23140K().m23149c("Conditional user property doesn't exist", zzet.m23131x(zzvVar.f29422f), this.f29365j.m23218J().m23120B(zzvVar.f29424h.f29388g));
            }
            m23445W().m22759w();
        } finally {
            m23445W().m22721A0();
        }
    }

    /* renamed from: S */
    public final zzfr m23441S() {
        m23415N(this.f29357b);
        return this.f29357b;
    }

    /* renamed from: T */
    final C7878z3 m23442T(zzm zzmVar) {
        m23423j0();
        m23451c0();
        Preconditions.m14372k(zzmVar);
        Preconditions.m14368g(zzmVar.f29401f);
        C7878z3 c7878z3M22746j0 = m23445W().m22746j0(zzmVar.f29401f);
        String strM22830y = this.f29365j.m23211B().m22830y(zzmVar.f29401f);
        if (!zzkm.m22459b() || !zzap.f29124V0.m23095a(null).booleanValue()) {
            return m23417b(zzmVar, c7878z3M22746j0, strM22830y);
        }
        if (c7878z3M22746j0 == null) {
            c7878z3M22746j0 = new C7878z3(this.f29365j, zzmVar.f29401f);
            c7878z3M22746j0.m22912c(this.f29365j.m23217I().m23523C0());
            c7878z3M22746j0.m22884C(strM22830y);
        } else if (!strM22830y.equals(c7878z3M22746j0.m22891J())) {
            c7878z3M22746j0.m22884C(strM22830y);
            c7878z3M22746j0.m22912c(this.f29365j.m23217I().m23523C0());
        }
        c7878z3M22746j0.m22938r(zzmVar.f29402g);
        c7878z3M22746j0.m22942v(zzmVar.f29418w);
        if (zzky.m22475b() && this.f29365j.m23243y().m23564B(c7878z3M22746j0.m22940t(), zzap.f29108N0)) {
            c7878z3M22746j0.m22946z(zzmVar.f29400A);
        }
        if (!TextUtils.isEmpty(zzmVar.f29411p)) {
            c7878z3M22746j0.m22887F(zzmVar.f29411p);
        }
        long j2 = zzmVar.f29405j;
        if (j2 != 0) {
            c7878z3M22746j0.m22945y(j2);
        }
        if (!TextUtils.isEmpty(zzmVar.f29403h)) {
            c7878z3M22746j0.m22890I(zzmVar.f29403h);
        }
        c7878z3M22746j0.m22941u(zzmVar.f29410o);
        String str = zzmVar.f29404i;
        if (str != null) {
            c7878z3M22746j0.m22893L(str);
        }
        c7878z3M22746j0.m22883B(zzmVar.f29406k);
        c7878z3M22746j0.m22916e(zzmVar.f29408m);
        if (!TextUtils.isEmpty(zzmVar.f29407l)) {
            c7878z3M22746j0.m22896O(zzmVar.f29407l);
        }
        c7878z3M22746j0.m22913c0(zzmVar.f29412q);
        c7878z3M22746j0.m22939s(zzmVar.f29415t);
        c7878z3M22746j0.m22943w(zzmVar.f29416u);
        if (this.f29365j.m23243y().m23564B(zzmVar.f29401f, zzap.f29152k0)) {
            c7878z3M22746j0.m22910b(zzmVar.f29419x);
        }
        c7878z3M22746j0.m22886E(zzmVar.f29420y);
        if (c7878z3M22746j0.m22918f()) {
            m23445W().m22737O(c7878z3M22746j0);
        }
        return c7878z3M22746j0;
    }

    /* renamed from: U */
    public final zzex m23443U() {
        m23415N(this.f29358c);
        return this.f29358c;
    }

    /* renamed from: V */
    final String m23444V(zzm zzmVar) throws IllegalStateException {
        try {
            return (String) this.f29365j.mo22835g().m23200w(new CallableC7757l7(this, zzmVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.f29365j.mo22836h().m23137H().m23149c("Failed to get app instance id. appId", zzet.m23131x(zzmVar.f29401f), e2);
            return null;
        }
    }

    /* renamed from: W */
    public final C7668c m23445W() {
        m23415N(this.f29359d);
        return this.f29359d;
    }

    /* renamed from: X */
    public final C7802q7 m23446X() {
        m23415N(this.f29362g);
        return this.f29362g;
    }

    /* renamed from: Y */
    public final C7818s5 m23447Y() {
        m23415N(this.f29364i);
        return this.f29364i;
    }

    /* renamed from: Z */
    public final zzkg m23448Z() {
        m23415N(this.f29363h);
        return this.f29363h;
    }

    /* renamed from: a0 */
    public final zzer m23449a0() {
        return this.f29365j.m23218J();
    }

    /* renamed from: b0 */
    public final zzkk m23450b0() {
        return this.f29365j.m23217I();
    }

    /* renamed from: c0 */
    final void m23451c0() {
        if (!this.f29366k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: d0 */
    final void m23452d0() {
        C7878z3 c7878z3M22746j0;
        String strM21891d0;
        m23423j0();
        m23451c0();
        this.f29375t = true;
        try {
            this.f29365j.mo22832G();
            Boolean boolM23375a0 = this.f29365j.m23226R().m23375a0();
            if (boolM23375a0 == null) {
                this.f29365j.mo22836h().m23140K().m23147a("Upload data called on the client side before use of service was decided");
                return;
            }
            if (boolM23375a0.booleanValue()) {
                this.f29365j.mo22836h().m23137H().m23147a("Upload called in the client side when service should be used");
                return;
            }
            if (this.f29369n > 0) {
                m23428m0();
                return;
            }
            m23423j0();
            if (this.f29378w != null) {
                this.f29365j.mo22836h().m23145P().m23147a("Uploading requested multiple times");
                return;
            }
            if (!m23443U().m23154z()) {
                this.f29365j.mo22836h().m23145P().m23147a("Network not connected, ignoring upload request");
                m23428m0();
                return;
            }
            long jMo14608a = this.f29365j.mo22837j().mo14608a();
            m23408E(null, jMo14608a - zzx.m23558U());
            long jM23155a = this.f29365j.m23211B().f28853f.m23155a();
            if (jM23155a != 0) {
                this.f29365j.mo22836h().m23144O().m23148b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jMo14608a - jM23155a)));
            }
            String strM22763y = m23445W().m22763y();
            if (TextUtils.isEmpty(strM22763y)) {
                this.f29380y = -1L;
                String strM22731H = m23445W().m22731H(jMo14608a - zzx.m23558U());
                if (!TextUtils.isEmpty(strM22731H) && (c7878z3M22746j0 = m23445W().m22746j0(strM22731H)) != null) {
                    m23431r(c7878z3M22746j0);
                }
            } else {
                if (this.f29380y == -1) {
                    this.f29380y = m23445W().m22745Y();
                }
                List<Pair<zzbr.zzg, Long>> listM22733J = m23445W().m22733J(strM22763y, this.f29365j.m23243y().m23588t(strM22763y, zzap.f29157n), Math.max(0, this.f29365j.m23243y().m23588t(strM22763y, zzap.f29159o)));
                if (!listM22733J.isEmpty()) {
                    Iterator<Pair<zzbr.zzg, Long>> it = listM22733J.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strM21891d0 = null;
                            break;
                        }
                        zzbr.zzg zzgVar = (zzbr.zzg) it.next().first;
                        if (!TextUtils.isEmpty(zzgVar.m21891d0())) {
                            strM21891d0 = zzgVar.m21891d0();
                            break;
                        }
                    }
                    if (strM21891d0 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= listM22733J.size()) {
                                break;
                            }
                            zzbr.zzg zzgVar2 = (zzbr.zzg) listM22733J.get(i2).first;
                            if (!TextUtils.isEmpty(zzgVar2.m21891d0()) && !zzgVar2.m21891d0().equals(strM21891d0)) {
                                listM22733J = listM22733J.subList(0, i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    zzbr.zzf.zza zzaVarM21749F = zzbr.zzf.m21749F();
                    int size = listM22733J.size();
                    ArrayList arrayList = new ArrayList(listM22733J.size());
                    boolean z = zzx.m23559X() && this.f29365j.m23243y().m23592x(strM22763y);
                    for (int i3 = 0; i3 < size; i3++) {
                        zzbr.zzg.zza zzaVarM22274v = ((zzbr.zzg) listM22733J.get(i3).first).m22274v();
                        arrayList.add((Long) listM22733J.get(i3).second);
                        zzbr.zzg.zza zzaVarM21925C = zzaVarM22274v.m21972q0(this.f29365j.m23243y().m23565C()).m21925C(jMo14608a);
                        this.f29365j.mo22832G();
                        zzaVarM21925C.m21951Q(false);
                        if (!z) {
                            zzaVarM22274v.m21946N0();
                        }
                        if (this.f29365j.m23243y().m23564B(strM22763y, zzap.f29164q0)) {
                            zzaVarM22274v.m21934G0(m23448Z().m23492x(((zzbr.zzg) ((zzfd) zzaVarM22274v.mo22283y())).m22136j()));
                        }
                        zzaVarM21749F.m21754w(zzaVarM22274v);
                    }
                    String strM23483D = this.f29365j.mo22836h().m23136C(2) ? m23448Z().m23483D((zzbr.zzf) ((zzfd) zzaVarM21749F.mo22283y())) : null;
                    m23448Z();
                    byte[] bArrM22136j = ((zzbr.zzf) ((zzfd) zzaVarM21749F.mo22283y())).m22136j();
                    String strM23095a = zzap.f29177x.m23095a(null);
                    try {
                        URL url = new URL(strM23095a);
                        Preconditions.m14362a(!arrayList.isEmpty());
                        if (this.f29378w != null) {
                            this.f29365j.mo22836h().m23137H().m23147a("Set uploading progress before finishing the previous upload");
                        } else {
                            this.f29378w = new ArrayList(arrayList);
                        }
                        this.f29365j.m23211B().f28854g.m23156b(jMo14608a);
                        this.f29365j.mo22836h().m23145P().m23150d("Uploading data. app, uncompressed size, data", size > 0 ? zzaVarM21749F.m21753A(0).m21877L2() : "?", Integer.valueOf(bArrM22136j.length), strM23483D);
                        this.f29374s = true;
                        zzex zzexVarM23443U = m23443U();
                        C7748k7 c7748k7 = new C7748k7(this, strM22763y);
                        zzexVarM23443U.mo22792d();
                        zzexVarM23443U.m22778t();
                        Preconditions.m14372k(url);
                        Preconditions.m14372k(bArrM22136j);
                        Preconditions.m14372k(c7748k7);
                        zzexVarM23443U.mo22835g().m23197C(new RunnableC7762m3(zzexVarM23443U, strM22763y, url, bArrM22136j, null, c7748k7));
                    } catch (MalformedURLException unused) {
                        this.f29365j.mo22836h().m23137H().m23149c("Failed to parse upload URL. Not uploading. appId", zzet.m23131x(strM22763y), strM23095a);
                    }
                }
            }
        } finally {
            this.f29375t = false;
            m23409F();
        }
    }

    /* renamed from: e0 */
    final void m23453e0() {
        m23423j0();
        m23451c0();
        if (!this.f29368m) {
            this.f29368m = true;
            m23423j0();
            m23451c0();
            if ((this.f29365j.m23243y().m23587r(zzap.f29158n0) || m23411I()) && m23410H()) {
                int iM23416a = m23416a(this.f29377v);
                int iM23113F = this.f29365j.m23228T().m23113F();
                m23423j0();
                if (iM23416a > iM23113F) {
                    this.f29365j.mo22836h().m23137H().m23149c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(iM23416a), Integer.valueOf(iM23113F));
                } else if (iM23416a < iM23113F) {
                    if (m23406C(iM23113F, this.f29377v)) {
                        this.f29365j.mo22836h().m23145P().m23149c("Storage version upgraded. Previous, current version", Integer.valueOf(iM23416a), Integer.valueOf(iM23113F));
                    } else {
                        this.f29365j.mo22836h().m23137H().m23149c("Storage version upgrade failed. Previous, current version", Integer.valueOf(iM23416a), Integer.valueOf(iM23113F));
                    }
                }
            }
        }
        if (this.f29367l || this.f29365j.m23243y().m23587r(zzap.f29158n0)) {
            return;
        }
        this.f29365j.mo22836h().m23143N().m23147a("This instance being marked as an uploader");
        this.f29367l = true;
        m23428m0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: f */
    public final Context mo22834f() {
        return this.f29365j.mo22834f();
    }

    /* renamed from: f0 */
    final void m23454f0() {
        this.f29372q++;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: g */
    public final zzfu mo22835g() {
        return this.f29365j.mo22835g();
    }

    /* renamed from: g0 */
    final zzfx m23455g0() {
        return this.f29365j;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: h */
    public final zzet mo22836h() {
        return this.f29365j.mo22836h();
    }

    /* renamed from: i */
    protected final void m23456i() {
        this.f29365j.mo22835g().mo22792d();
        m23445W().m22725C0();
        if (this.f29365j.m23211B().f28853f.m23155a() == 0) {
            this.f29365j.m23211B().f28853f.m23156b(this.f29365j.mo22837j().mo14608a());
        }
        m23428m0();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC7817s4
    /* renamed from: j */
    public final Clock mo22837j() {
        return this.f29365j.mo22837j();
    }

    @VisibleForTesting
    /* renamed from: k */
    final void m23457k(int i2, Throwable th, byte[] bArr, String str) throws IllegalStateException {
        C7668c c7668cM23445W;
        long jLongValue;
        m23423j0();
        m23451c0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f29374s = false;
                m23409F();
            }
        }
        List<Long> list = this.f29378w;
        this.f29378w = null;
        boolean z = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.f29365j.m23211B().f28853f.m23156b(this.f29365j.mo22837j().mo14608a());
                this.f29365j.m23211B().f28854g.m23156b(0L);
                m23428m0();
                this.f29365j.mo22836h().m23145P().m23149c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                m23445W().m22760w0();
                try {
                    for (Long l : list) {
                        try {
                            c7668cM23445W = m23445W();
                            jLongValue = l.longValue();
                            c7668cM23445W.mo22792d();
                            c7668cM23445W.m22778t();
                        } catch (SQLiteException e2) {
                            List<Long> list2 = this.f29379x;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                        try {
                            if (c7668cM23445W.m22761x().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e3) {
                            c7668cM23445W.mo22836h().m23137H().m23148b("Failed to delete a bundle in a queue table", e3);
                            throw e3;
                        }
                    }
                    m23445W().m22759w();
                    m23445W().m22721A0();
                    this.f29379x = null;
                    if (m23443U().m23154z() && m23426l0()) {
                        m23452d0();
                    } else {
                        this.f29380y = -1L;
                        m23428m0();
                    }
                    this.f29369n = 0L;
                } catch (Throwable th2) {
                    m23445W().m22721A0();
                    throw th2;
                }
            } catch (SQLiteException e4) {
                this.f29365j.mo22836h().m23137H().m23148b("Database error while trying to delete uploaded bundles", e4);
                this.f29369n = this.f29365j.mo22837j().mo14609b();
                this.f29365j.mo22836h().m23145P().m23148b("Disable upload, time", Long.valueOf(this.f29369n));
            }
        } else {
            this.f29365j.mo22836h().m23145P().m23149c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.f29365j.m23211B().f28854g.m23156b(this.f29365j.mo22837j().mo14608a());
            if (i2 != 503 && i2 != 429) {
                z = false;
            }
            if (z) {
                this.f29365j.m23211B().f28855h.m23156b(this.f29365j.mo22837j().mo14608a());
            }
            m23445W().m22739Q(list);
            m23428m0();
        }
    }

    /* renamed from: p */
    final void m23458p(zzan zzanVar, zzm zzmVar) throws IllegalStateException {
        List<zzv> listM22735L;
        List<zzv> listM22735L2;
        List<zzv> listM22735L3;
        List<String> list;
        zzan zzanVar2 = zzanVar;
        Preconditions.m14372k(zzmVar);
        Preconditions.m14368g(zzmVar.f29401f);
        m23423j0();
        m23451c0();
        String str = zzmVar.f29401f;
        long j2 = zzanVar2.f29080i;
        if (m23448Z().m23488R(zzanVar2, zzmVar)) {
            if (!zzmVar.f29408m) {
                m23442T(zzmVar);
                return;
            }
            if (this.f29365j.m23243y().m23564B(str, zzap.f29174v0) && (list = zzmVar.f29421z) != null) {
                if (!list.contains(zzanVar2.f29077f)) {
                    this.f29365j.mo22836h().m23144O().m23150d("Dropping non-safelisted event. appId, event name, origin", str, zzanVar2.f29077f, zzanVar2.f29079h);
                    return;
                } else {
                    Bundle bundleM22960Y = zzanVar2.f29078g.m22960Y();
                    bundleM22960Y.putLong("ga_safelisted", 1L);
                    zzanVar2 = new zzan(zzanVar2.f29077f, new zzam(bundleM22960Y), zzanVar2.f29079h, zzanVar2.f29080i);
                }
            }
            m23445W().m22760w0();
            try {
                C7668c c7668cM23445W = m23445W();
                Preconditions.m14368g(str);
                c7668cM23445W.mo22792d();
                c7668cM23445W.m22778t();
                if (j2 < 0) {
                    c7668cM23445W.mo22836h().m23140K().m23149c("Invalid time querying timed out conditional properties", zzet.m23131x(str), Long.valueOf(j2));
                    listM22735L = Collections.emptyList();
                } else {
                    listM22735L = c7668cM23445W.m22735L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (zzv zzvVar : listM22735L) {
                    if (zzvVar != null) {
                        this.f29365j.mo22836h().m23144O().m23150d("User property timed out", zzvVar.f29422f, this.f29365j.m23218J().m23120B(zzvVar.f29424h.f29388g), zzvVar.f29424h.m23494y());
                        if (zzvVar.f29428l != null) {
                            m23414M(new zzan(zzvVar.f29428l, j2), zzmVar);
                        }
                        m23445W().m22754s0(str, zzvVar.f29424h.f29388g);
                    }
                }
                C7668c c7668cM23445W2 = m23445W();
                Preconditions.m14368g(str);
                c7668cM23445W2.mo22792d();
                c7668cM23445W2.m22778t();
                if (j2 < 0) {
                    c7668cM23445W2.mo22836h().m23140K().m23149c("Invalid time querying expired conditional properties", zzet.m23131x(str), Long.valueOf(j2));
                    listM22735L2 = Collections.emptyList();
                } else {
                    listM22735L2 = c7668cM23445W2.m22735L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(listM22735L2.size());
                for (zzv zzvVar2 : listM22735L2) {
                    if (zzvVar2 != null) {
                        this.f29365j.mo22836h().m23144O().m23150d("User property expired", zzvVar2.f29422f, this.f29365j.m23218J().m23120B(zzvVar2.f29424h.f29388g), zzvVar2.f29424h.m23494y());
                        m23445W().m22749m0(str, zzvVar2.f29424h.f29388g);
                        zzan zzanVar3 = zzvVar2.f29432p;
                        if (zzanVar3 != null) {
                            arrayList.add(zzanVar3);
                        }
                        m23445W().m22754s0(str, zzvVar2.f29424h.f29388g);
                    }
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    m23414M(new zzan((zzan) obj, j2), zzmVar);
                }
                C7668c c7668cM23445W3 = m23445W();
                String str2 = zzanVar2.f29077f;
                Preconditions.m14368g(str);
                Preconditions.m14368g(str2);
                c7668cM23445W3.mo22792d();
                c7668cM23445W3.m22778t();
                if (j2 < 0) {
                    c7668cM23445W3.mo22836h().m23140K().m23150d("Invalid time querying triggered conditional properties", zzet.m23131x(str), c7668cM23445W3.mo22838k().m23124y(str2), Long.valueOf(j2));
                    listM22735L3 = Collections.emptyList();
                } else {
                    listM22735L3 = c7668cM23445W3.m22735L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(listM22735L3.size());
                for (zzv zzvVar3 : listM22735L3) {
                    if (zzvVar3 != null) {
                        zzkj zzkjVar = zzvVar3.f29424h;
                        C7766m7 c7766m7 = new C7766m7(zzvVar3.f29422f, zzvVar3.f29423g, zzkjVar.f29388g, j2, zzkjVar.m23494y());
                        if (m23445W().m22742T(c7766m7)) {
                            this.f29365j.mo22836h().m23144O().m23150d("User property triggered", zzvVar3.f29422f, this.f29365j.m23218J().m23120B(c7766m7.f28779c), c7766m7.f28781e);
                        } else {
                            this.f29365j.mo22836h().m23137H().m23150d("Too many active user properties, ignoring", zzet.m23131x(zzvVar3.f29422f), this.f29365j.m23218J().m23120B(c7766m7.f28779c), c7766m7.f28781e);
                        }
                        zzan zzanVar4 = zzvVar3.f29430n;
                        if (zzanVar4 != null) {
                            arrayList2.add(zzanVar4);
                        }
                        zzvVar3.f29424h = new zzkj(c7766m7);
                        zzvVar3.f29426j = true;
                        m23445W().m22743U(zzvVar3);
                    }
                }
                m23414M(zzanVar2, zzmVar);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    m23414M(new zzan((zzan) obj2, j2), zzmVar);
                }
                m23445W().m22759w();
            } finally {
                m23445W().m22721A0();
            }
        }
    }

    /* renamed from: q */
    final void m23459q(zzan zzanVar, String str) throws IllegalStateException {
        C7878z3 c7878z3M22746j0 = m23445W().m22746j0(str);
        if (c7878z3M22746j0 == null || TextUtils.isEmpty(c7878z3M22746j0.m22901T())) {
            this.f29365j.mo22836h().m23144O().m23148b("No app data available; dropping event", str);
            return;
        }
        Boolean boolM23412K = m23412K(c7878z3M22746j0);
        if (boolM23412K == null) {
            if (!"_ui".equals(zzanVar.f29077f)) {
                this.f29365j.mo22836h().m23140K().m23148b("Could not find package. appId", zzet.m23131x(str));
            }
        } else if (!boolM23412K.booleanValue()) {
            this.f29365j.mo22836h().m23137H().m23148b("App version does not match; dropping event. appId", zzet.m23131x(str));
            return;
        }
        m23458p(zzanVar, new zzm(str, c7878z3M22746j0.m22882A(), c7878z3M22746j0.m22901T(), c7878z3M22746j0.m22903V(), c7878z3M22746j0.m22905X(), c7878z3M22746j0.m22907Z(), c7878z3M22746j0.m22911b0(), (String) null, c7878z3M22746j0.m22917e0(), false, c7878z3M22746j0.m22894M(), c7878z3M22746j0.m22928k(), 0L, 0, c7878z3M22746j0.m22930l(), c7878z3M22746j0.m22932m(), false, c7878z3M22746j0.m22885D(), c7878z3M22746j0.m22934n(), c7878z3M22746j0.m22915d0(), c7878z3M22746j0.m22935o(), (zzky.m22475b() && this.f29365j.m23243y().m23564B(c7878z3M22746j0.m22940t(), zzap.f29108N0)) ? c7878z3M22746j0.m22888G() : null));
    }

    /* renamed from: s */
    final void m23460s(AbstractC7703f7 abstractC7703f7) {
        this.f29371p++;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m23461v(com.google.android.gms.measurement.internal.zzkj r13, com.google.android.gms.measurement.internal.zzm r14) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkc.m23461v(com.google.android.gms.measurement.internal.zzkj, com.google.android.gms.measurement.internal.zzm):void");
    }

    @VisibleForTesting
    /* renamed from: w */
    final void m23462w(zzm zzmVar) throws IllegalStateException {
        if (this.f29378w != null) {
            ArrayList arrayList = new ArrayList();
            this.f29379x = arrayList;
            arrayList.addAll(this.f29378w);
        }
        C7668c c7668cM23445W = m23445W();
        String str = zzmVar.f29401f;
        Preconditions.m14368g(str);
        c7668cM23445W.mo22792d();
        c7668cM23445W.m22778t();
        try {
            SQLiteDatabase sQLiteDatabaseM22761x = c7668cM23445W.m22761x();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseM22761x.delete(DeepLinkIntentReceiver.DeepLinksTargets.APPS, "app_id=?", strArr) + 0 + sQLiteDatabaseM22761x.delete("events", "app_id=?", strArr) + sQLiteDatabaseM22761x.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM22761x.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM22761x.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM22761x.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM22761x.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM22761x.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM22761x.delete("main_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                c7668cM23445W.mo22836h().m23145P().m23149c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e2) {
            c7668cM23445W.mo22836h().m23137H().m23149c("Error resetting analytics data. appId, error", zzet.m23131x(str), e2);
        }
        if (com.google.android.gms.internal.measurement.zzkh.m22453b() && this.f29365j.m23243y().m23587r(zzap.f29118S0)) {
            if (zzmVar.f29408m) {
                m23438P(zzmVar);
            }
        } else {
            zzm zzmVarM23419d = m23419d(this.f29365j.mo22834f(), zzmVar.f29401f, zzmVar.f29402g, zzmVar.f29408m, zzmVar.f29415t, zzmVar.f29416u, zzmVar.f29413r, zzmVar.f29418w, zzmVar.f29400A);
            if (zzmVar.f29408m) {
                m23438P(zzmVarM23419d);
            }
        }
    }

    /* renamed from: x */
    final void m23463x(zzv zzvVar) {
        zzm zzmVarM23420e = m23420e(zzvVar.f29422f);
        if (zzmVarM23420e != null) {
            m23464y(zzvVar, zzmVarM23420e);
        }
    }

    /* renamed from: y */
    final void m23464y(zzv zzvVar, zzm zzmVar) {
        boolean z;
        Preconditions.m14372k(zzvVar);
        Preconditions.m14368g(zzvVar.f29422f);
        Preconditions.m14372k(zzvVar.f29423g);
        Preconditions.m14372k(zzvVar.f29424h);
        Preconditions.m14368g(zzvVar.f29424h.f29388g);
        m23423j0();
        m23451c0();
        if (TextUtils.isEmpty(zzmVar.f29402g) && TextUtils.isEmpty(zzmVar.f29418w)) {
            return;
        }
        if (!zzmVar.f29408m) {
            m23442T(zzmVar);
            return;
        }
        zzv zzvVar2 = new zzv(zzvVar);
        boolean z2 = false;
        zzvVar2.f29426j = false;
        m23445W().m22760w0();
        try {
            zzv zzvVarM22752q0 = m23445W().m22752q0(zzvVar2.f29422f, zzvVar2.f29424h.f29388g);
            if (zzvVarM22752q0 != null && !zzvVarM22752q0.f29423g.equals(zzvVar2.f29423g)) {
                this.f29365j.mo22836h().m23140K().m23150d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f29365j.m23218J().m23120B(zzvVar2.f29424h.f29388g), zzvVar2.f29423g, zzvVarM22752q0.f29423g);
            }
            if (zzvVarM22752q0 != null && (z = zzvVarM22752q0.f29426j)) {
                zzvVar2.f29423g = zzvVarM22752q0.f29423g;
                zzvVar2.f29425i = zzvVarM22752q0.f29425i;
                zzvVar2.f29429m = zzvVarM22752q0.f29429m;
                zzvVar2.f29427k = zzvVarM22752q0.f29427k;
                zzvVar2.f29430n = zzvVarM22752q0.f29430n;
                zzvVar2.f29426j = z;
                zzkj zzkjVar = zzvVar2.f29424h;
                zzvVar2.f29424h = new zzkj(zzkjVar.f29388g, zzvVarM22752q0.f29424h.f29389h, zzkjVar.m23494y(), zzvVarM22752q0.f29424h.f29393l);
            } else if (TextUtils.isEmpty(zzvVar2.f29427k)) {
                zzkj zzkjVar2 = zzvVar2.f29424h;
                zzvVar2.f29424h = new zzkj(zzkjVar2.f29388g, zzvVar2.f29425i, zzkjVar2.m23494y(), zzvVar2.f29424h.f29393l);
                zzvVar2.f29426j = true;
                z2 = true;
            }
            if (zzvVar2.f29426j) {
                zzkj zzkjVar3 = zzvVar2.f29424h;
                C7766m7 c7766m7 = new C7766m7(zzvVar2.f29422f, zzvVar2.f29423g, zzkjVar3.f29388g, zzkjVar3.f29389h, zzkjVar3.m23494y());
                if (m23445W().m22742T(c7766m7)) {
                    this.f29365j.mo22836h().m23144O().m23150d("User property updated immediately", zzvVar2.f29422f, this.f29365j.m23218J().m23120B(c7766m7.f28779c), c7766m7.f28781e);
                } else {
                    this.f29365j.mo22836h().m23137H().m23150d("(2)Too many active user properties, ignoring", zzet.m23131x(zzvVar2.f29422f), this.f29365j.m23218J().m23120B(c7766m7.f28779c), c7766m7.f28781e);
                }
                if (z2 && zzvVar2.f29430n != null) {
                    m23414M(new zzan(zzvVar2.f29430n, zzvVar2.f29425i), zzmVar);
                }
            }
            if (m23445W().m22743U(zzvVar2)) {
                this.f29365j.mo22836h().m23144O().m23150d("Conditional property added", zzvVar2.f29422f, this.f29365j.m23218J().m23120B(zzvVar2.f29424h.f29388g), zzvVar2.f29424h.m23494y());
            } else {
                this.f29365j.mo22836h().m23137H().m23150d("Too many conditional properties, ignoring", zzet.m23131x(zzvVar2.f29422f), this.f29365j.m23218J().m23120B(zzvVar2.f29424h.f29388g), zzvVar2.f29424h.m23494y());
            }
            m23445W().m22759w();
        } finally {
            m23445W().m22721A0();
        }
    }

    /* renamed from: z */
    final void m23465z(Runnable runnable) {
        m23423j0();
        if (this.f29370o == null) {
            this.f29370o = new ArrayList();
        }
        this.f29370o.add(runnable);
    }

    private zzkc(zzkh zzkhVar, zzfx zzfxVar) throws IllegalStateException {
        this.f29366k = false;
        Preconditions.m14372k(zzkhVar);
        zzfx zzfxVarM23203a = zzfx.m23203a(zzkhVar.f29386a, null);
        this.f29365j = zzfxVarM23203a;
        this.f29380y = -1L;
        zzkg zzkgVar = new zzkg(this);
        zzkgVar.m22779u();
        this.f29363h = zzkgVar;
        zzex zzexVar = new zzex(this);
        zzexVar.m22779u();
        this.f29358c = zzexVar;
        zzfr zzfrVar = new zzfr(this);
        zzfrVar.m22779u();
        this.f29357b = zzfrVar;
        zzfxVarM23203a.mo22835g().m23201z(new RunnableC7730i7(this, zzkhVar));
    }
}
