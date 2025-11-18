package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes2.dex */
final class j20 {

    /* renamed from: a */
    private static final int f19428a = zzsy.m20545i("nam");

    /* renamed from: b */
    private static final int f19429b = zzsy.m20545i("trk");

    /* renamed from: c */
    private static final int f19430c = zzsy.m20545i("cmt");

    /* renamed from: d */
    private static final int f19431d = zzsy.m20545i("day");

    /* renamed from: e */
    private static final int f19432e = zzsy.m20545i("ART");

    /* renamed from: f */
    private static final int f19433f = zzsy.m20545i("too");

    /* renamed from: g */
    private static final int f19434g = zzsy.m20545i("alb");

    /* renamed from: h */
    private static final int f19435h = zzsy.m20545i("com");

    /* renamed from: i */
    private static final int f19436i = zzsy.m20545i("wrt");

    /* renamed from: j */
    private static final int f19437j = zzsy.m20545i("lyr");

    /* renamed from: k */
    private static final int f19438k = zzsy.m20545i("gen");

    /* renamed from: l */
    private static final int f19439l = zzsy.m20545i("covr");

    /* renamed from: m */
    private static final int f19440m = zzsy.m20545i("gnre");

    /* renamed from: n */
    private static final int f19441n = zzsy.m20545i("grp");

    /* renamed from: o */
    private static final int f19442o = zzsy.m20545i("disk");

    /* renamed from: p */
    private static final int f19443p = zzsy.m20545i("trkn");

    /* renamed from: q */
    private static final int f19444q = zzsy.m20545i("tmpo");

    /* renamed from: r */
    private static final int f19445r = zzsy.m20545i("cpil");

    /* renamed from: s */
    private static final int f19446s = zzsy.m20545i("aART");

    /* renamed from: t */
    private static final int f19447t = zzsy.m20545i("sonm");

    /* renamed from: u */
    private static final int f19448u = zzsy.m20545i("soal");

    /* renamed from: v */
    private static final int f19449v = zzsy.m20545i("soar");

    /* renamed from: w */
    private static final int f19450w = zzsy.m20545i("soaa");

    /* renamed from: x */
    private static final int f19451x = zzsy.m20545i("soco");

    /* renamed from: y */
    private static final int f19452y = zzsy.m20545i("rtng");

    /* renamed from: z */
    private static final int f19453z = zzsy.m20545i("pgap");

    /* renamed from: A */
    private static final int f19424A = zzsy.m20545i("sosn");

    /* renamed from: B */
    private static final int f19425B = zzsy.m20545i("tvsh");

    /* renamed from: C */
    private static final int f19426C = zzsy.m20545i("----");

    /* renamed from: D */
    private static final String[] f19427D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static zzpv m15359a(int i2, String str, zzst zzstVar, boolean z, boolean z2) {
        int iM15363e = m15363e(zzstVar);
        if (z2) {
            iM15363e = Math.min(1, iM15363e);
        }
        if (iM15363e >= 0) {
            return z ? new zzpw(str, null, Integer.toString(iM15363e)) : new zzps("und", str, Integer.toString(iM15363e));
        }
        String strValueOf = String.valueOf(y10.m16051c(i2));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    /* renamed from: b */
    private static zzpw m15360b(int i2, String str, zzst zzstVar) {
        int iM20503d = zzstVar.m20503d();
        if (zzstVar.m20503d() == y10.f21009F0) {
            zzstVar.m20511l(8);
            return new zzpw(str, null, zzstVar.m20515p(iM20503d - 16));
        }
        String strValueOf = String.valueOf(y10.m16051c(i2));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    /* renamed from: c */
    private static zzpw m15361c(int i2, String str, zzst zzstVar) {
        int iM20503d = zzstVar.m20503d();
        if (zzstVar.m20503d() == y10.f21009F0 && iM20503d >= 22) {
            zzstVar.m20511l(10);
            int iM20507h = zzstVar.m20507h();
            if (iM20507h > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iM20507h);
                String string = sb.toString();
                int iM20507h2 = zzstVar.m20507h();
                if (iM20507h2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iM20507h2);
                    string = sb2.toString();
                }
                return new zzpw(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(y10.m16051c(i2));
        Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzpo.zza m15362d(com.google.android.gms.internal.ads.zzst r14) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j20.m15362d(com.google.android.gms.internal.ads.zzst):com.google.android.gms.internal.ads.zzpo$zza");
    }

    /* renamed from: e */
    private static int m15363e(zzst zzstVar) {
        zzstVar.m20511l(4);
        if (zzstVar.m20503d() == y10.f21009F0) {
            zzstVar.m20511l(8);
            return zzstVar.m20506g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
