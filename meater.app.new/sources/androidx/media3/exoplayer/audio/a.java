package androidx.media3.exoplayer.audio;

import U1.C1727c;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.L;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import f2.C3316a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m8.AbstractC3979B;
import m8.AbstractC4009y;
import m8.AbstractC4010z;
import m8.j0;

/* compiled from: AudioCapabilities.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f26737c = new a(AbstractC4009y.H(e.f26742d));

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    private static final AbstractC4009y<Integer> f26738d = AbstractC4009y.J(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC4010z<Integer, Integer> f26739e = new AbstractC4010z.a().g(5, 6).g(17, 6).g(7, 6).g(30, 10).g(18, 6).g(6, 8).g(8, 8).g(14, 8).d();

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<e> f26740a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26741b;

    /* compiled from: AudioCapabilities.java */
    private static final class b {
        private static AbstractC3979B<Integer> a() {
            AbstractC3979B.a aVarI = new AbstractC3979B.a().i(8, 7);
            int i10 = L.f18626a;
            if (i10 >= 31) {
                aVarI.i(26, 27);
            }
            if (i10 >= 33) {
                aVarI.a(30);
            }
            return aVarI.m();
        }

        public static boolean b(AudioManager audioManager, androidx.media3.exoplayer.audio.c cVar) {
            AudioDeviceInfo[] devices = cVar == null ? ((AudioManager) C1804a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{cVar.f26761a};
            AbstractC3979B<Integer> abstractC3979BA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (abstractC3979BA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: AudioCapabilities.java */
    private static final class c {
        public static AbstractC4009y<Integer> a(C1727c c1727c) {
            AbstractC4009y.a aVarY = AbstractC4009y.y();
            j0<Integer> it = a.f26739e.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (L.f18626a >= L.K(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), c1727c.a().f17038a)) {
                    aVarY.a(next);
                }
            }
            aVarY.a(2);
            return aVarY.k();
        }

        public static int b(int i10, int i11, C1727c c1727c) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iM = L.M(i12);
                if (iM != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iM).build(), c1727c.a().f17038a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    /* compiled from: AudioCapabilities.java */
    private static final class d {
        public static a a(AudioManager audioManager, C1727c c1727c) {
            return new a(a.c(audioManager.getDirectProfilesForAttributes(c1727c.a().f17038a)));
        }

        public static androidx.media3.exoplayer.audio.c b(AudioManager audioManager, C1727c c1727c) {
            try {
                List audioDevicesForAttributes = ((AudioManager) C1804a.e(audioManager)).getAudioDevicesForAttributes(c1727c.a().f17038a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new androidx.media3.exoplayer.audio.c((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static boolean b() {
        String str = L.f18628c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongConstant"})
    public static AbstractC4009y<e> c(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(p8.f.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfileA = C3316a.a(list.get(i10));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (L.F0(format) || f26739e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) C1804a.e((Set) map.get(Integer.valueOf(format)))).addAll(p8.f.c(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(p8.f.c(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        for (Map.Entry entry : map.entrySet()) {
            aVarY.a(new e(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return aVarY.k();
    }

    private static AbstractC4009y<e> d(int[] iArr, int i10) {
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVarY.a(new e(i11, i10));
        }
        return aVarY.k();
    }

    public static a e(Context context, C1727c c1727c, AudioDeviceInfo audioDeviceInfo) {
        return f(context, c1727c, (L.f18626a < 23 || audioDeviceInfo == null) ? null : new androidx.media3.exoplayer.audio.c(audioDeviceInfo));
    }

    @SuppressLint({"UnprotectedReceiver"})
    static a f(Context context, C1727c c1727c, androidx.media3.exoplayer.audio.c cVar) {
        return g(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c1727c, cVar);
    }

    @SuppressLint({"InlinedApi"})
    static a g(Context context, Intent intent, C1727c c1727c, androidx.media3.exoplayer.audio.c cVar) {
        AudioManager audioManager = (AudioManager) C1804a.e(context.getSystemService("audio"));
        if (cVar == null) {
            cVar = L.f18626a >= 33 ? d.b(audioManager, c1727c) : null;
        }
        int i10 = L.f18626a;
        if (i10 >= 33 && (L.J0(context) || L.C0(context))) {
            return d.a(audioManager, c1727c);
        }
        if (i10 >= 23 && b.b(audioManager, cVar)) {
            return f26737c;
        }
        AbstractC3979B.a aVar = new AbstractC3979B.a();
        aVar.a(2);
        if (i10 >= 29 && (L.J0(context) || L.C0(context))) {
            aVar.j(c.a(c1727c));
            return new a(d(p8.f.l(aVar.m()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f26738d);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new a(d(p8.f.l(aVar.m()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(p8.f.c(intArrayExtra));
        }
        return new a(d(p8.f.l(aVar.m()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static int h(int i10) {
        int i11 = L.f18626a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(L.f18627b) && i10 == 1) {
            i10 = 2;
        }
        return L.M(i10);
    }

    static Uri j() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.t(this.f26740a, aVar.f26740a) && this.f26741b == aVar.f26741b;
    }

    public int hashCode() {
        return this.f26741b + (L.u(this.f26740a) * 31);
    }

    public Pair<Integer, Integer> i(s sVar, C1727c c1727c) {
        int iF = z.f((String) C1804a.e(sVar.f17162o), sVar.f17158k);
        if (!f26739e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !l(18)) {
            iF = 6;
        } else if ((iF == 8 && !l(8)) || (iF == 30 && !l(30))) {
            iF = 7;
        }
        if (!l(iF)) {
            return null;
        }
        e eVar = (e) C1804a.e(this.f26740a.get(iF));
        int iB = sVar.f17137D;
        if (iB == -1 || iF == 18) {
            int i10 = sVar.f17138E;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB = eVar.b(i10, c1727c);
        } else if (!sVar.f17162o.equals("audio/vnd.dts.uhd;profile=p2") || L.f18626a >= 33) {
            if (!eVar.c(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int iH = h(iB);
        if (iH == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iH));
    }

    public boolean k(s sVar, C1727c c1727c) {
        return i(sVar, c1727c) != null;
    }

    public boolean l(int i10) {
        return L.r(this.f26740a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f26741b + ", audioProfiles=" + this.f26740a + "]";
    }

    private a(List<e> list) {
        this.f26740a = new SparseArray<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            this.f26740a.put(eVar.f26743a, eVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f26740a.size(); i11++) {
            iMax = Math.max(iMax, this.f26740a.valueAt(i11).f26744b);
        }
        this.f26741b = iMax;
    }

    /* compiled from: AudioCapabilities.java */
    private static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f26742d;

        /* renamed from: a, reason: collision with root package name */
        public final int f26743a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26744b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC3979B<Integer> f26745c;

        static {
            f26742d = L.f18626a >= 33 ? new e(2, a(10)) : new e(2, 10);
        }

        public e(int i10, Set<Integer> set) {
            this.f26743a = i10;
            AbstractC3979B<Integer> abstractC3979BD = AbstractC3979B.D(set);
            this.f26745c = abstractC3979BD;
            j0<Integer> it = abstractC3979BD.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f26744b = iMax;
        }

        private static AbstractC3979B<Integer> a(int i10) {
            AbstractC3979B.a aVar = new AbstractC3979B.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(L.M(i11)));
            }
            return aVar.m();
        }

        public int b(int i10, C1727c c1727c) {
            return this.f26745c != null ? this.f26744b : L.f18626a >= 29 ? c.b(this.f26743a, i10, c1727c) : ((Integer) C1804a.e(a.f26739e.getOrDefault(Integer.valueOf(this.f26743a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f26745c == null) {
                return i10 <= this.f26744b;
            }
            int iM = L.M(i10);
            if (iM == 0) {
                return false;
            }
            return this.f26745c.contains(Integer.valueOf(iM));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f26743a == eVar.f26743a && this.f26744b == eVar.f26744b && L.d(this.f26745c, eVar.f26745c);
        }

        public int hashCode() {
            int i10 = ((this.f26743a * 31) + this.f26744b) * 31;
            AbstractC3979B<Integer> abstractC3979B = this.f26745c;
            return i10 + (abstractC3979B == null ? 0 : abstractC3979B.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f26743a + ", maxChannelCount=" + this.f26744b + ", channelMasks=" + this.f26745c + "]";
        }

        public e(int i10, int i11) {
            this.f26743a = i10;
            this.f26744b = i11;
            this.f26745c = null;
        }
    }
}
