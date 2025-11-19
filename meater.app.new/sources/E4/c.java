package E4;

import E4.c;
import P5.C1608p;
import com.apptionlabs.meater_app.cloud.requests.SafetyInfoRequest;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: DownloadSafetyManual.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0002\t\u0005B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LE4/c;", "", "<init>", "()V", "Loa/F;", "a", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: DownloadSafetyManual.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, d2 = {"LE4/c$a;", "", "<init>", "()V", "", "fileName", "Ljava/io/File;", "a", "(Ljava/lang/String;)Ljava/io/File;", "url", "c", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "deviceType", "b", "(Lcom/apptionlabs/meater_app/model/MEATERDeviceType;)Ljava/io/File;", "meaterManualCacheFileName", "Ljava/lang/String;", "meaterPlusManualCacheFileName", "meaterPlusSEManualCacheFileName", "meaterPlus2ManualCacheFileName", "meaterProManualCacheFileName", "meaterBlockManualCacheFileName", "meaterProXLManualCacheFileName", "meaterProDuoManualCacheFileName", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E4.c$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DownloadSafetyManual.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0065a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3866a;

            static {
                int[] iArr = new int[MEATERDeviceType.values().length];
                try {
                    iArr[MEATERDeviceType.PROBE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MEATERDeviceType.PLUS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MEATERDeviceType.PLUS_SE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f3866a = iArr;
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final File a(String fileName) {
            File file = new File(x4.g.h().getCacheDir(), x4.g.m(Locale.getDefault()));
            if (!file.exists()) {
                file.mkdir();
            }
            return new File(file, fileName);
        }

        public final File b(MEATERDeviceType deviceType) {
            String str;
            C3862t.g(deviceType, "deviceType");
            switch (C0065a.f3866a[deviceType.ordinal()]) {
                case 1:
                    str = "lc_manual-meater";
                    break;
                case 2:
                    str = "lc_manual-plus";
                    break;
                case 3:
                    str = "lc_manual-se";
                    break;
                case 4:
                    str = "lc_manual-plus2";
                    break;
                case 5:
                    str = "lc_manual-pro";
                    break;
                case 6:
                    str = "lc_manual-pro-xl";
                    break;
                case 7:
                    str = "lc_manual-pro-duo";
                    break;
                default:
                    str = "lc_manual-block";
                    break;
            }
            return a(str);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.File c(java.lang.String r2) {
            /*
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.C3862t.g(r2, r0)
                int r0 = r2.hashCode()
                switch(r0) {
                    case 28762941: goto L49;
                    case 90033041: goto L3d;
                    case 358623531: goto L31;
                    case 479978594: goto L25;
                    case 482757350: goto L19;
                    case 1251507306: goto Ld;
                    default: goto Lc;
                }
            Lc:
                goto L51
            Ld:
                java.lang.String r0 = "https://www.meater.com/safety-info/meater-se?download=false"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L16
                goto L51
            L16:
                java.lang.String r2 = "lc_manual-se"
                goto L56
            L19:
                java.lang.String r0 = "https://www.meater.com/safety-info/meater-plus2?download=false"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L22
                goto L51
            L22:
                java.lang.String r2 = "lc_manual-plus2"
                goto L56
            L25:
                java.lang.String r0 = "https://www.meater.com/safety-info/meater-plus?download=false"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L2e
                goto L51
            L2e:
                java.lang.String r2 = "lc_manual-plus"
                goto L56
            L31:
                java.lang.String r0 = "https://www.meater.com/safety-info/meater-produo?download=false"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L3a
                goto L51
            L3a:
                java.lang.String r2 = "lc_manual-pro-duo"
                goto L56
            L3d:
                java.lang.String r0 = "https://www.meater.com/safety-info/meater-block?download=false"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L46
                goto L51
            L46:
                java.lang.String r2 = "lc_manual-block"
                goto L56
            L49:
                java.lang.String r0 = "https://www.meater.com/safety-info/meater-proxl?download=false"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L54
            L51:
                java.lang.String r2 = "lc_manual-meater"
                goto L56
            L54:
                java.lang.String r2 = "lc_manual-pro-xl"
            L56:
                java.io.File r2 = r1.a(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: E4.c.Companion.c(java.lang.String):java.io.File");
        }

        private Companion() {
        }
    }

    /* compiled from: DownloadSafetyManual.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LE4/c$b;", "", "", "url", "bodyParams", "Ljava/io/File;", "file", "<init>", "(LE4/c;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V", "Loa/F;", "b", "()V", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "c", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String bodyParams;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final File file;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f3870d;

        public b(c cVar, String url, String bodyParams, File file) {
            C3862t.g(url, "url");
            C3862t.g(bodyParams, "bodyParams");
            C3862t.g(file, "file");
            this.f3870d = cVar;
            this.url = url;
            this.bodyParams = bodyParams;
            this.file = file;
            b();
        }

        private final void b() {
            new k().a(this.url, this.bodyParams, new j() { // from class: E4.d
                @Override // E4.j
                public final void a(String str) throws IOException {
                    c.b.c(this.f3871a, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b bVar, String str) throws IOException {
            if (str != null) {
                C1608p.n(bVar.file, str);
            }
        }
    }

    public c() {
        a();
    }

    private final void a() {
        if (x4.g.t().i1()) {
            Iterator<String> it = b().iterator();
            C3862t.f(it, "iterator(...)");
            while (it.hasNext()) {
                String next = it.next();
                C3862t.f(next, "next(...)");
                String str = next;
                String strT = new Gson().t(new SafetyInfoRequest(null, 1, null));
                C3862t.d(strT);
                new b(this, str, strT, INSTANCE.c(str));
            }
        }
    }

    private final ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (MEATERDeviceType mEATERDeviceType : MEATERDeviceType.getEntries()) {
            if (mEATERDeviceType == MEATERDeviceType.PROBE) {
                arrayList.add("https://www.meater.com/safety-info/meater?download=false");
            } else if (mEATERDeviceType == MEATERDeviceType.PLUS) {
                arrayList.add("https://www.meater.com/safety-info/meater-plus?download=false");
            } else if (mEATERDeviceType == MEATERDeviceType.PLUS_SE) {
                arrayList.add("https://www.meater.com/safety-info/meater-se?download=false");
            } else if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_PLUS) {
                arrayList.add("https://www.meater.com/safety-info/meater-plus2?download=false");
            } else if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_PLUS_PRO) {
                arrayList.add("https://www.meater.com/safety-info/meater-plus2?download=false");
            } else if (mEATERDeviceType == MEATERDeviceType.BLOCK) {
                arrayList.add("https://www.meater.com/safety-info/meater-block?download=false");
            } else if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
                arrayList.add("https://www.meater.com/safety-info/meater-proxl?download=false");
            } else if (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK) {
                arrayList.add("https://www.meater.com/safety-info/meater-produo?download=false");
            }
        }
        return arrayList;
    }
}
