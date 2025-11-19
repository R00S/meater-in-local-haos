package uc;

import Cc.C0982e;
import Cc.h;
import Ub.n;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.C4180D;
import oc.m;
import oc.u;
import oc.v;

/* compiled from: HttpHeaders.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!¨\u0006$"}, d2 = {"Loc/u;", "", "headerName", "", "Loc/h;", "a", "(Loc/u;Ljava/lang/String;)Ljava/util/List;", "LCc/e;", "", "result", "Loa/F;", "c", "(LCc/e;Ljava/util/List;)V", "", "g", "(LCc/e;)Z", "", "prefix", "h", "(LCc/e;B)Z", "d", "(LCc/e;)Ljava/lang/String;", "e", "Loc/n;", "Loc/v;", "url", "headers", "f", "(Loc/n;Loc/v;Loc/u;)V", "Loc/D;", "b", "(Loc/D;)Z", "LCc/h;", "LCc/h;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Cc.h f50535a;

    /* renamed from: b, reason: collision with root package name */
    private static final Cc.h f50536b;

    static {
        h.Companion companion = Cc.h.INSTANCE;
        f50535a = companion.d("\"\\");
        f50536b = companion.d("\t ,=");
    }

    public static final List<oc.h> a(u uVar, String headerName) {
        C3862t.g(uVar, "<this>");
        C3862t.g(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (n.t(headerName, uVar.h(i10), true)) {
                try {
                    c(new C0982e().A0(uVar.w(i10)), arrayList);
                } catch (EOFException e10) {
                    yc.j.INSTANCE.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(C4180D c4180d) {
        C3862t.g(c4180d, "<this>");
        if (C3862t.b(c4180d.getRequest().getMethod(), "HEAD")) {
            return false;
        }
        int code = c4180d.getCode();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && pc.d.v(c4180d) == -1 && !n.t("chunked", C4180D.k(c4180d, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(Cc.C0982e r7, java.util.List<oc.h> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.c0()
            if (r7 != 0) goto L1f
            return
        L1f:
            oc.h r7 = new oc.h
            java.util.Map r0 = kotlin.collections.M.h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = pc.d.L(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L67
            if (r6 != 0) goto L40
            boolean r2 = r7.c0()
            if (r2 == 0) goto L67
        L40:
            oc.h r2 = new oc.h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = Ub.n.y(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.C3862t.f(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L67:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = pc.d.L(r7, r4)
            int r5 = r5 + r6
        L71:
            if (r3 != 0) goto L81
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 != 0) goto Lba
            int r5 = pc.d.L(r7, r4)
        L81:
            if (r5 == 0) goto Lba
            r6 = 1
            if (r5 <= r6) goto L87
            return
        L87:
            boolean r6 = g(r7)
            if (r6 == 0) goto L8e
            return
        L8e:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9b
            java.lang.String r6 = d(r7)
            goto L9f
        L9b:
            java.lang.String r6 = e(r7)
        L9f:
            if (r6 != 0) goto La2
            return
        La2:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lab
            return
        Lab:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lb8
            boolean r3 = r7.c0()
            if (r3 != 0) goto Lb8
            return
        Lb8:
            r3 = r0
            goto L71
        Lba:
            oc.h r4 = new oc.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.e.c(Cc.e, java.util.List):void");
    }

    private static final String d(C0982e c0982e) throws EOFException {
        if (c0982e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C0982e c0982e2 = new C0982e();
        while (true) {
            long jJ1 = c0982e.j1(f50535a);
            if (jJ1 == -1) {
                return null;
            }
            if (c0982e.m(jJ1) == 34) {
                c0982e2.n0(c0982e, jJ1);
                c0982e.readByte();
                return c0982e2.Q();
            }
            if (c0982e.getSize() == jJ1 + 1) {
                return null;
            }
            c0982e2.n0(c0982e, jJ1);
            c0982e.readByte();
            c0982e2.n0(c0982e, 1L);
        }
    }

    private static final String e(C0982e c0982e) {
        long jJ1 = c0982e.j1(f50536b);
        if (jJ1 == -1) {
            jJ1 = c0982e.getSize();
        }
        if (jJ1 != 0) {
            return c0982e.D(jJ1);
        }
        return null;
    }

    public static final void f(oc.n nVar, v url, u headers) {
        C3862t.g(nVar, "<this>");
        C3862t.g(url, "url");
        C3862t.g(headers, "headers");
        if (nVar == oc.n.f47059b) {
            return;
        }
        List<m> listE = m.INSTANCE.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        nVar.a(url, listE);
    }

    private static final boolean g(C0982e c0982e) throws EOFException {
        boolean z10 = false;
        while (!c0982e.c0()) {
            byte bM = c0982e.m(0L);
            if (bM == 44) {
                c0982e.readByte();
                z10 = true;
            } else {
                if (bM != 32 && bM != 9) {
                    break;
                }
                c0982e.readByte();
            }
        }
        return z10;
    }

    private static final boolean h(C0982e c0982e, byte b10) {
        return !c0982e.c0() && c0982e.m(0L) == b10;
    }
}
