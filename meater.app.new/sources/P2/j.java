package P2;

import U1.s;
import U1.y;
import m8.AbstractC4009y;
import v2.B;

/* compiled from: MetadataUtil.java */
/* loaded from: classes.dex */
final class j {
    public static Y1.a a(y yVar, String str) {
        for (int i10 = 0; i10 < yVar.e(); i10++) {
            y.b bVarD = yVar.d(i10);
            if (bVarD instanceof Y1.a) {
                Y1.a aVar = (Y1.a) bVarD;
                if (aVar.f19212B.equals(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    private static J2.e b(int i10, X1.y yVar) {
        int iQ = yVar.q();
        if (yVar.q() == 1684108385) {
            yVar.X(8);
            String strC = yVar.C(iQ - 16);
            return new J2.e("und", strC, strC);
        }
        X1.n.h("MetadataUtil", "Failed to parse comment attribute: " + Y1.b.a(i10));
        return null;
    }

    private static J2.a c(X1.y yVar) {
        int iQ = yVar.q();
        if (yVar.q() != 1684108385) {
            X1.n.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iL = b.l(yVar.q());
        String str = iL == 13 ? "image/jpeg" : iL == 14 ? "image/png" : null;
        if (str == null) {
            X1.n.h("MetadataUtil", "Unrecognized cover art flags: " + iL);
            return null;
        }
        yVar.X(4);
        int i10 = iQ - 16;
        byte[] bArr = new byte[i10];
        yVar.l(bArr, 0, i10);
        return new J2.a(str, null, 3, bArr);
    }

    public static y.b d(X1.y yVar) {
        int iF = yVar.f() + yVar.q();
        int iQ = yVar.q();
        int i10 = (iQ >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iQ;
                if (i11 == 6516084) {
                    return b(iQ, yVar);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return k(iQ, "TIT2", yVar);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return k(iQ, "TCOM", yVar);
                }
                if (i11 == 6578553) {
                    return k(iQ, "TDRC", yVar);
                }
                if (i11 == 4280916) {
                    return k(iQ, "TPE1", yVar);
                }
                if (i11 == 7630703) {
                    return k(iQ, "TSSE", yVar);
                }
                if (i11 == 6384738) {
                    return k(iQ, "TALB", yVar);
                }
                if (i11 == 7108978) {
                    return k(iQ, "USLT", yVar);
                }
                if (i11 == 6776174) {
                    return k(iQ, "TCON", yVar);
                }
                if (i11 == 6779504) {
                    return k(iQ, "TIT1", yVar);
                }
            } else {
                if (iQ == 1735291493) {
                    return j(yVar);
                }
                if (iQ == 1684632427) {
                    return e(iQ, "TPOS", yVar);
                }
                if (iQ == 1953655662) {
                    return e(iQ, "TRCK", yVar);
                }
                if (iQ == 1953329263) {
                    return g(iQ, "TBPM", yVar, true, false);
                }
                if (iQ == 1668311404) {
                    return g(iQ, "TCMP", yVar, true, true);
                }
                if (iQ == 1668249202) {
                    return c(yVar);
                }
                if (iQ == 1631670868) {
                    return k(iQ, "TPE2", yVar);
                }
                if (iQ == 1936682605) {
                    return k(iQ, "TSOT", yVar);
                }
                if (iQ == 1936679276) {
                    return k(iQ, "TSOA", yVar);
                }
                if (iQ == 1936679282) {
                    return k(iQ, "TSOP", yVar);
                }
                if (iQ == 1936679265) {
                    return k(iQ, "TSO2", yVar);
                }
                if (iQ == 1936679791) {
                    return k(iQ, "TSOC", yVar);
                }
                if (iQ == 1920233063) {
                    return g(iQ, "ITUNESADVISORY", yVar, false, false);
                }
                if (iQ == 1885823344) {
                    return g(iQ, "ITUNESGAPLESS", yVar, false, true);
                }
                if (iQ == 1936683886) {
                    return k(iQ, "TVSHOWSORT", yVar);
                }
                if (iQ == 1953919848) {
                    return k(iQ, "TVSHOW", yVar);
                }
                if (iQ == 757935405) {
                    return h(yVar, iF);
                }
            }
            X1.n.b("MetadataUtil", "Skipped unknown metadata entry: " + Y1.b.a(iQ));
            yVar.W(iF);
            return null;
        } finally {
            yVar.W(iF);
        }
    }

    private static J2.n e(int i10, String str, X1.y yVar) {
        int iQ = yVar.q();
        if (yVar.q() == 1684108385 && iQ >= 22) {
            yVar.X(10);
            int iP = yVar.P();
            if (iP > 0) {
                String str2 = "" + iP;
                int iP2 = yVar.P();
                if (iP2 > 0) {
                    str2 = str2 + "/" + iP2;
                }
                return new J2.n(str, null, AbstractC4009y.H(str2));
            }
        }
        X1.n.h("MetadataUtil", "Failed to parse index/count attribute: " + Y1.b.a(i10));
        return null;
    }

    private static int f(X1.y yVar) {
        int iQ = yVar.q();
        if (yVar.q() == 1684108385) {
            yVar.X(8);
            int i10 = iQ - 16;
            if (i10 == 1) {
                return yVar.H();
            }
            if (i10 == 2) {
                return yVar.P();
            }
            if (i10 == 3) {
                return yVar.K();
            }
            if (i10 == 4 && (yVar.j() & 128) == 0) {
                return yVar.L();
            }
        }
        X1.n.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static J2.i g(int i10, String str, X1.y yVar, boolean z10, boolean z11) {
        int iF = f(yVar);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z10 ? new J2.n(str, null, AbstractC4009y.H(Integer.toString(iF))) : new J2.e("und", str, Integer.toString(iF));
        }
        X1.n.h("MetadataUtil", "Failed to parse uint8 attribute: " + Y1.b.a(i10));
        return null;
    }

    private static J2.i h(X1.y yVar, int i10) {
        String strC = null;
        String strC2 = null;
        int i11 = -1;
        int i12 = -1;
        while (yVar.f() < i10) {
            int iF = yVar.f();
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            yVar.X(4);
            if (iQ2 == 1835360622) {
                strC = yVar.C(iQ - 12);
            } else if (iQ2 == 1851878757) {
                strC2 = yVar.C(iQ - 12);
            } else {
                if (iQ2 == 1684108385) {
                    i11 = iF;
                    i12 = iQ;
                }
                yVar.X(iQ - 12);
            }
        }
        if (strC == null || strC2 == null || i11 == -1) {
            return null;
        }
        yVar.W(i11);
        yVar.X(16);
        return new J2.k(strC, strC2, yVar.C(i12 - 16));
    }

    public static Y1.a i(X1.y yVar, int i10, String str) {
        while (true) {
            int iF = yVar.f();
            if (iF >= i10) {
                return null;
            }
            int iQ = yVar.q();
            if (yVar.q() == 1684108385) {
                int iQ2 = yVar.q();
                int iQ3 = yVar.q();
                int i11 = iQ - 16;
                byte[] bArr = new byte[i11];
                yVar.l(bArr, 0, i11);
                return new Y1.a(str, bArr, iQ3, iQ2);
            }
            yVar.W(iF + iQ);
        }
    }

    private static J2.n j(X1.y yVar) {
        String strA = J2.j.a(f(yVar) - 1);
        if (strA != null) {
            return new J2.n("TCON", null, AbstractC4009y.H(strA));
        }
        X1.n.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static J2.n k(int i10, String str, X1.y yVar) {
        int iQ = yVar.q();
        if (yVar.q() == 1684108385) {
            yVar.X(8);
            return new J2.n(str, null, AbstractC4009y.H(yVar.C(iQ - 16)));
        }
        X1.n.h("MetadataUtil", "Failed to parse text attribute: " + Y1.b.a(i10));
        return null;
    }

    public static void l(int i10, B b10, s.b bVar) {
        if (i10 == 1 && b10.a()) {
            bVar.Y(b10.f51014a).Z(b10.f51015b);
        }
    }

    public static void m(int i10, y yVar, s.b bVar, y... yVarArr) {
        y yVar2 = new y(new y.b[0]);
        if (yVar != null) {
            for (int i11 = 0; i11 < yVar.e(); i11++) {
                y.b bVarD = yVar.d(i11);
                if (bVarD instanceof Y1.a) {
                    Y1.a aVar = (Y1.a) bVarD;
                    if (!aVar.f19212B.equals("com.android.capture.fps")) {
                        yVar2 = yVar2.a(aVar);
                    } else if (i10 == 2) {
                        yVar2 = yVar2.a(aVar);
                    }
                }
            }
        }
        for (y yVar3 : yVarArr) {
            yVar2 = yVar2.b(yVar3);
        }
        if (yVar2.e() > 0) {
            bVar.l0(yVar2);
        }
    }
}
