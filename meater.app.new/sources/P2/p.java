package P2;

import K2.b;
import U1.y;
import X1.y;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;
import v2.I;
import v2.InterfaceC4811q;

/* compiled from: SefReader.java */
/* loaded from: classes.dex */
final class p {

    /* renamed from: d, reason: collision with root package name */
    private static final l8.q f13864d = l8.q.d(':');

    /* renamed from: e, reason: collision with root package name */
    private static final l8.q f13865e = l8.q.d('*');

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f13866a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f13867b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f13868c;

    /* compiled from: SefReader.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13869a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13870b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13871c;

        public a(int i10, long j10, int i11) {
            this.f13869a = i10;
            this.f13870b = j10;
            this.f13871c = i11;
        }
    }

    private void a(InterfaceC4811q interfaceC4811q, I i10) {
        y yVar = new y(8);
        interfaceC4811q.readFully(yVar.e(), 0, 8);
        this.f13868c = yVar.u() + 8;
        if (yVar.q() != 1397048916) {
            i10.f51048a = 0L;
        } else {
            i10.f51048a = interfaceC4811q.getPosition() - (this.f13868c - 12);
            this.f13867b = 2;
        }
    }

    private static int b(String str) throws ParserException {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.a("Invalid SEF name", null);
        }
    }

    private void d(InterfaceC4811q interfaceC4811q, I i10) {
        long jA = interfaceC4811q.a();
        int i11 = this.f13868c - 20;
        y yVar = new y(i11);
        interfaceC4811q.readFully(yVar.e(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            yVar.X(2);
            short sW = yVar.w();
            if (sW == 2192 || sW == 2816 || sW == 2817 || sW == 2819 || sW == 2820) {
                this.f13866a.add(new a(sW, (jA - this.f13868c) - yVar.u(), yVar.u()));
            } else {
                yVar.X(8);
            }
        }
        if (this.f13866a.isEmpty()) {
            i10.f51048a = 0L;
        } else {
            this.f13867b = 3;
            i10.f51048a = this.f13866a.get(0).f13870b;
        }
    }

    private void e(InterfaceC4811q interfaceC4811q, List<y.b> list) throws ParserException {
        long position = interfaceC4811q.getPosition();
        int iA = (int) ((interfaceC4811q.a() - interfaceC4811q.getPosition()) - this.f13868c);
        X1.y yVar = new X1.y(iA);
        interfaceC4811q.readFully(yVar.e(), 0, iA);
        for (int i10 = 0; i10 < this.f13866a.size(); i10++) {
            a aVar = this.f13866a.get(i10);
            yVar.W((int) (aVar.f13870b - position));
            yVar.X(4);
            int iU = yVar.u();
            int iB = b(yVar.E(iU));
            int i11 = aVar.f13871c - (iU + 8);
            if (iB == 2192) {
                list.add(f(yVar, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static K2.b f(X1.y yVar, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listF = f13865e.f(yVar.E(i10));
        for (int i11 = 0; i11 < listF.size(); i11++) {
            List<String> listF2 = f13864d.f(listF.get(i11));
            if (listF2.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList.add(new b.C0169b(Long.parseLong(listF2.get(0)), Long.parseLong(listF2.get(1)), 1 << (Integer.parseInt(listF2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw ParserException.a(null, e10);
            }
        }
        return new K2.b(arrayList);
    }

    public int c(InterfaceC4811q interfaceC4811q, I i10, List<y.b> list) throws ParserException {
        int i11 = this.f13867b;
        long j10 = 0;
        if (i11 == 0) {
            long jA = interfaceC4811q.a();
            if (jA != -1 && jA >= 8) {
                j10 = jA - 8;
            }
            i10.f51048a = j10;
            this.f13867b = 1;
        } else if (i11 == 1) {
            a(interfaceC4811q, i10);
        } else if (i11 == 2) {
            d(interfaceC4811q, i10);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC4811q, list);
            i10.f51048a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f13866a.clear();
        this.f13867b = 0;
    }
}
