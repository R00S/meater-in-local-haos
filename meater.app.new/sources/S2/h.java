package S2;

import S2.r;
import a3.C1888a;
import java.util.Objects;

/* compiled from: DefaultSubtitleParserFactory.java */
/* loaded from: classes.dex */
public final class h implements r.a {
    @Override // S2.r.a
    public boolean a(U1.s sVar) {
        String str = sVar.f17162o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // S2.r.a
    public r b(U1.s sVar) {
        String str = sVar.f17162o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new U2.a(sVar.f17165r);
                case "application/pgs":
                    return new V2.a();
                case "application/x-mp4-vtt":
                    return new C1888a();
                case "text/vtt":
                    return new a3.g();
                case "application/x-quicktime-tx3g":
                    return new Z2.a(sVar.f17165r);
                case "text/x-ssa":
                    return new W2.b(sVar.f17165r);
                case "application/x-subrip":
                    return new X2.a();
                case "application/ttml+xml":
                    return new Y2.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // S2.r.a
    public int c(U1.s sVar) {
        String str = sVar.f17162o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
