package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0217e;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p024c.p044g.p045a.p046a.C0876a;
import p024c.p044g.p045a.p047b.C0877a;

/* compiled from: ConstraintSet.java */
/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: classes.dex */
public class C0216d {

    /* renamed from: a */
    private static final int[] f1533a = {0, 4, 8};

    /* renamed from: b */
    private static SparseIntArray f1534b;

    /* renamed from: c */
    private HashMap<String, C0213a> f1535c = new HashMap<>();

    /* renamed from: d */
    private boolean f1536d = true;

    /* renamed from: e */
    private HashMap<Integer, a> f1537e = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$a */
    public static class a {

        /* renamed from: a */
        int f1538a;

        /* renamed from: b */
        public final d f1539b = new d();

        /* renamed from: c */
        public final c f1540c = new c();

        /* renamed from: d */
        public final b f1541d = new b();

        /* renamed from: e */
        public final e f1542e = new e();

        /* renamed from: f */
        public HashMap<String, C0213a> f1543f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m1378f(int i2, ConstraintLayout.C0211b c0211b) {
            this.f1538a = i2;
            b bVar = this.f1541d;
            bVar.f1586i = c0211b.f1449d;
            bVar.f1588j = c0211b.f1451e;
            bVar.f1590k = c0211b.f1453f;
            bVar.f1592l = c0211b.f1455g;
            bVar.f1593m = c0211b.f1457h;
            bVar.f1594n = c0211b.f1459i;
            bVar.f1595o = c0211b.f1461j;
            bVar.f1596p = c0211b.f1463k;
            bVar.f1597q = c0211b.f1465l;
            bVar.f1598r = c0211b.f1473p;
            bVar.f1599s = c0211b.f1474q;
            bVar.f1600t = c0211b.f1475r;
            bVar.f1601u = c0211b.f1476s;
            bVar.f1602v = c0211b.f1483z;
            bVar.f1603w = c0211b.f1417A;
            bVar.f1604x = c0211b.f1418B;
            bVar.f1605y = c0211b.f1467m;
            bVar.f1606z = c0211b.f1469n;
            bVar.f1545A = c0211b.f1471o;
            bVar.f1546B = c0211b.f1433Q;
            bVar.f1547C = c0211b.f1434R;
            bVar.f1548D = c0211b.f1435S;
            bVar.f1584h = c0211b.f1447c;
            bVar.f1580f = c0211b.f1443a;
            bVar.f1582g = c0211b.f1445b;
            b bVar2 = this.f1541d;
            bVar2.f1576d = ((ViewGroup.MarginLayoutParams) c0211b).width;
            bVar2.f1578e = ((ViewGroup.MarginLayoutParams) c0211b).height;
            bVar2.f1549E = ((ViewGroup.MarginLayoutParams) c0211b).leftMargin;
            bVar2.f1550F = ((ViewGroup.MarginLayoutParams) c0211b).rightMargin;
            bVar2.f1551G = ((ViewGroup.MarginLayoutParams) c0211b).topMargin;
            bVar2.f1552H = ((ViewGroup.MarginLayoutParams) c0211b).bottomMargin;
            bVar2.f1561Q = c0211b.f1422F;
            bVar2.f1562R = c0211b.f1421E;
            bVar2.f1564T = c0211b.f1424H;
            bVar2.f1563S = c0211b.f1423G;
            bVar2.f1587i0 = c0211b.f1436T;
            bVar2.f1589j0 = c0211b.f1437U;
            bVar2.f1565U = c0211b.f1425I;
            bVar2.f1566V = c0211b.f1426J;
            bVar2.f1567W = c0211b.f1429M;
            bVar2.f1568X = c0211b.f1430N;
            bVar2.f1569Y = c0211b.f1427K;
            bVar2.f1570Z = c0211b.f1428L;
            bVar2.f1571a0 = c0211b.f1431O;
            bVar2.f1573b0 = c0211b.f1432P;
            bVar2.f1585h0 = c0211b.f1438V;
            bVar2.f1556L = c0211b.f1478u;
            bVar2.f1558N = c0211b.f1480w;
            bVar2.f1555K = c0211b.f1477t;
            bVar2.f1557M = c0211b.f1479v;
            b bVar3 = this.f1541d;
            bVar3.f1560P = c0211b.f1481x;
            bVar3.f1559O = c0211b.f1482y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar3.f1553I = c0211b.getMarginEnd();
                this.f1541d.f1554J = c0211b.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m1379g(int i2, C0217e.a aVar) {
            m1378f(i2, aVar);
            this.f1539b.f1618d = aVar.f1637p0;
            e eVar = this.f1542e;
            eVar.f1622c = aVar.f1640s0;
            eVar.f1623d = aVar.f1641t0;
            eVar.f1624e = aVar.f1642u0;
            eVar.f1625f = aVar.f1643v0;
            eVar.f1626g = aVar.f1644w0;
            eVar.f1627h = aVar.f1645x0;
            eVar.f1628i = aVar.f1646y0;
            eVar.f1629j = aVar.f1647z0;
            eVar.f1630k = aVar.f1635A0;
            eVar.f1631l = aVar.f1636B0;
            eVar.f1633n = aVar.f1639r0;
            eVar.f1632m = aVar.f1638q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public void m1380h(AbstractC0214b abstractC0214b, int i2, C0217e.a aVar) {
            m1379g(i2, aVar);
            if (abstractC0214b instanceof Barrier) {
                b bVar = this.f1541d;
                bVar.f1579e0 = 1;
                Barrier barrier = (Barrier) abstractC0214b;
                bVar.f1575c0 = barrier.getType();
                this.f1541d.f1581f0 = barrier.getReferencedIds();
                this.f1541d.f1577d0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void m1381d(ConstraintLayout.C0211b c0211b) {
            b bVar = this.f1541d;
            c0211b.f1449d = bVar.f1586i;
            c0211b.f1451e = bVar.f1588j;
            c0211b.f1453f = bVar.f1590k;
            c0211b.f1455g = bVar.f1592l;
            c0211b.f1457h = bVar.f1593m;
            c0211b.f1459i = bVar.f1594n;
            c0211b.f1461j = bVar.f1595o;
            c0211b.f1463k = bVar.f1596p;
            c0211b.f1465l = bVar.f1597q;
            c0211b.f1473p = bVar.f1598r;
            c0211b.f1474q = bVar.f1599s;
            c0211b.f1475r = bVar.f1600t;
            c0211b.f1476s = bVar.f1601u;
            ((ViewGroup.MarginLayoutParams) c0211b).leftMargin = bVar.f1549E;
            ((ViewGroup.MarginLayoutParams) c0211b).rightMargin = bVar.f1550F;
            ((ViewGroup.MarginLayoutParams) c0211b).topMargin = bVar.f1551G;
            ((ViewGroup.MarginLayoutParams) c0211b).bottomMargin = bVar.f1552H;
            c0211b.f1481x = bVar.f1560P;
            c0211b.f1482y = bVar.f1559O;
            c0211b.f1478u = bVar.f1556L;
            c0211b.f1480w = bVar.f1558N;
            c0211b.f1483z = bVar.f1602v;
            c0211b.f1417A = bVar.f1603w;
            c0211b.f1467m = bVar.f1605y;
            c0211b.f1469n = bVar.f1606z;
            b bVar2 = this.f1541d;
            c0211b.f1471o = bVar2.f1545A;
            c0211b.f1418B = bVar2.f1604x;
            c0211b.f1433Q = bVar2.f1546B;
            c0211b.f1434R = bVar2.f1547C;
            c0211b.f1422F = bVar2.f1561Q;
            c0211b.f1421E = bVar2.f1562R;
            c0211b.f1424H = bVar2.f1564T;
            c0211b.f1423G = bVar2.f1563S;
            c0211b.f1436T = bVar2.f1587i0;
            c0211b.f1437U = bVar2.f1589j0;
            c0211b.f1425I = bVar2.f1565U;
            c0211b.f1426J = bVar2.f1566V;
            c0211b.f1429M = bVar2.f1567W;
            c0211b.f1430N = bVar2.f1568X;
            c0211b.f1427K = bVar2.f1569Y;
            c0211b.f1428L = bVar2.f1570Z;
            c0211b.f1431O = bVar2.f1571a0;
            c0211b.f1432P = bVar2.f1573b0;
            c0211b.f1435S = bVar2.f1548D;
            c0211b.f1447c = bVar2.f1584h;
            c0211b.f1443a = bVar2.f1580f;
            c0211b.f1445b = bVar2.f1582g;
            ((ViewGroup.MarginLayoutParams) c0211b).width = bVar2.f1576d;
            ((ViewGroup.MarginLayoutParams) c0211b).height = bVar2.f1578e;
            String str = bVar2.f1585h0;
            if (str != null) {
                c0211b.f1438V = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                c0211b.setMarginStart(this.f1541d.f1554J);
                c0211b.setMarginEnd(this.f1541d.f1553I);
            }
            c0211b.m1333a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1541d.m1383a(this.f1541d);
            aVar.f1540c.m1385a(this.f1540c);
            aVar.f1539b.m1387a(this.f1539b);
            aVar.f1542e.m1389a(this.f1542e);
            aVar.f1538a = this.f1538a;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$b */
    public static class b {

        /* renamed from: a */
        private static SparseIntArray f1544a;

        /* renamed from: d */
        public int f1576d;

        /* renamed from: e */
        public int f1578e;

        /* renamed from: f0 */
        public int[] f1581f0;

        /* renamed from: g0 */
        public String f1583g0;

        /* renamed from: h0 */
        public String f1585h0;

        /* renamed from: b */
        public boolean f1572b = false;

        /* renamed from: c */
        public boolean f1574c = false;

        /* renamed from: f */
        public int f1580f = -1;

        /* renamed from: g */
        public int f1582g = -1;

        /* renamed from: h */
        public float f1584h = -1.0f;

        /* renamed from: i */
        public int f1586i = -1;

        /* renamed from: j */
        public int f1588j = -1;

        /* renamed from: k */
        public int f1590k = -1;

        /* renamed from: l */
        public int f1592l = -1;

        /* renamed from: m */
        public int f1593m = -1;

        /* renamed from: n */
        public int f1594n = -1;

        /* renamed from: o */
        public int f1595o = -1;

        /* renamed from: p */
        public int f1596p = -1;

        /* renamed from: q */
        public int f1597q = -1;

        /* renamed from: r */
        public int f1598r = -1;

        /* renamed from: s */
        public int f1599s = -1;

        /* renamed from: t */
        public int f1600t = -1;

        /* renamed from: u */
        public int f1601u = -1;

        /* renamed from: v */
        public float f1602v = 0.5f;

        /* renamed from: w */
        public float f1603w = 0.5f;

        /* renamed from: x */
        public String f1604x = null;

        /* renamed from: y */
        public int f1605y = -1;

        /* renamed from: z */
        public int f1606z = 0;

        /* renamed from: A */
        public float f1545A = 0.0f;

        /* renamed from: B */
        public int f1546B = -1;

        /* renamed from: C */
        public int f1547C = -1;

        /* renamed from: D */
        public int f1548D = -1;

        /* renamed from: E */
        public int f1549E = -1;

        /* renamed from: F */
        public int f1550F = -1;

        /* renamed from: G */
        public int f1551G = -1;

        /* renamed from: H */
        public int f1552H = -1;

        /* renamed from: I */
        public int f1553I = -1;

        /* renamed from: J */
        public int f1554J = -1;

        /* renamed from: K */
        public int f1555K = -1;

        /* renamed from: L */
        public int f1556L = -1;

        /* renamed from: M */
        public int f1557M = -1;

        /* renamed from: N */
        public int f1558N = -1;

        /* renamed from: O */
        public int f1559O = -1;

        /* renamed from: P */
        public int f1560P = -1;

        /* renamed from: Q */
        public float f1561Q = -1.0f;

        /* renamed from: R */
        public float f1562R = -1.0f;

        /* renamed from: S */
        public int f1563S = 0;

        /* renamed from: T */
        public int f1564T = 0;

        /* renamed from: U */
        public int f1565U = 0;

        /* renamed from: V */
        public int f1566V = 0;

        /* renamed from: W */
        public int f1567W = -1;

        /* renamed from: X */
        public int f1568X = -1;

        /* renamed from: Y */
        public int f1569Y = -1;

        /* renamed from: Z */
        public int f1570Z = -1;

        /* renamed from: a0 */
        public float f1571a0 = 1.0f;

        /* renamed from: b0 */
        public float f1573b0 = 1.0f;

        /* renamed from: c0 */
        public int f1575c0 = -1;

        /* renamed from: d0 */
        public int f1577d0 = 0;

        /* renamed from: e0 */
        public int f1579e0 = -1;

        /* renamed from: i0 */
        public boolean f1587i0 = false;

        /* renamed from: j0 */
        public boolean f1589j0 = false;

        /* renamed from: k0 */
        public boolean f1591k0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1544a = sparseIntArray;
            sparseIntArray.append(C0221i.f1685F3, 24);
            f1544a.append(C0221i.f1691G3, 25);
            f1544a.append(C0221i.f1703I3, 28);
            f1544a.append(C0221i.f1709J3, 29);
            f1544a.append(C0221i.f1739O3, 35);
            f1544a.append(C0221i.f1733N3, 34);
            f1544a.append(C0221i.f1917q3, 4);
            f1544a.append(C0221i.f1911p3, 3);
            f1544a.append(C0221i.f1899n3, 1);
            f1544a.append(C0221i.f1769T3, 6);
            f1544a.append(C0221i.f1775U3, 7);
            f1544a.append(C0221i.f1959x3, 17);
            f1544a.append(C0221i.f1965y3, 18);
            f1544a.append(C0221i.f1971z3, 19);
            f1544a.append(C0221i.f1798Y2, 26);
            f1544a.append(C0221i.f1715K3, 31);
            f1544a.append(C0221i.f1721L3, 32);
            f1544a.append(C0221i.f1953w3, 10);
            f1544a.append(C0221i.f1947v3, 9);
            f1544a.append(C0221i.f1793X3, 13);
            f1544a.append(C0221i.f1812a4, 16);
            f1544a.append(C0221i.f1799Y3, 14);
            f1544a.append(C0221i.f1781V3, 11);
            f1544a.append(C0221i.f1805Z3, 15);
            f1544a.append(C0221i.f1787W3, 12);
            f1544a.append(C0221i.f1757R3, 38);
            f1544a.append(C0221i.f1673D3, 37);
            f1544a.append(C0221i.f1667C3, 39);
            f1544a.append(C0221i.f1751Q3, 40);
            f1544a.append(C0221i.f1661B3, 20);
            f1544a.append(C0221i.f1745P3, 36);
            f1544a.append(C0221i.f1941u3, 5);
            f1544a.append(C0221i.f1679E3, 76);
            f1544a.append(C0221i.f1727M3, 76);
            f1544a.append(C0221i.f1697H3, 76);
            f1544a.append(C0221i.f1905o3, 76);
            f1544a.append(C0221i.f1893m3, 76);
            f1544a.append(C0221i.f1818b3, 23);
            f1544a.append(C0221i.f1832d3, 27);
            f1544a.append(C0221i.f1846f3, 30);
            f1544a.append(C0221i.f1853g3, 8);
            f1544a.append(C0221i.f1825c3, 33);
            f1544a.append(C0221i.f1839e3, 2);
            f1544a.append(C0221i.f1804Z2, 22);
            f1544a.append(C0221i.f1811a3, 21);
            f1544a.append(C0221i.f1923r3, 61);
            f1544a.append(C0221i.f1935t3, 62);
            f1544a.append(C0221i.f1929s3, 63);
            f1544a.append(C0221i.f1763S3, 69);
            f1544a.append(C0221i.f1655A3, 70);
            f1544a.append(C0221i.f1881k3, 71);
            f1544a.append(C0221i.f1867i3, 72);
            f1544a.append(C0221i.f1874j3, 73);
            f1544a.append(C0221i.f1887l3, 74);
            f1544a.append(C0221i.f1860h3, 75);
        }

        /* renamed from: a */
        public void m1383a(b bVar) {
            this.f1572b = bVar.f1572b;
            this.f1576d = bVar.f1576d;
            this.f1574c = bVar.f1574c;
            this.f1578e = bVar.f1578e;
            this.f1580f = bVar.f1580f;
            this.f1582g = bVar.f1582g;
            this.f1584h = bVar.f1584h;
            this.f1586i = bVar.f1586i;
            this.f1588j = bVar.f1588j;
            this.f1590k = bVar.f1590k;
            this.f1592l = bVar.f1592l;
            this.f1593m = bVar.f1593m;
            this.f1594n = bVar.f1594n;
            this.f1595o = bVar.f1595o;
            this.f1596p = bVar.f1596p;
            this.f1597q = bVar.f1597q;
            this.f1598r = bVar.f1598r;
            this.f1599s = bVar.f1599s;
            this.f1600t = bVar.f1600t;
            this.f1601u = bVar.f1601u;
            this.f1602v = bVar.f1602v;
            this.f1603w = bVar.f1603w;
            this.f1604x = bVar.f1604x;
            this.f1605y = bVar.f1605y;
            this.f1606z = bVar.f1606z;
            this.f1545A = bVar.f1545A;
            this.f1546B = bVar.f1546B;
            this.f1547C = bVar.f1547C;
            this.f1548D = bVar.f1548D;
            this.f1549E = bVar.f1549E;
            this.f1550F = bVar.f1550F;
            this.f1551G = bVar.f1551G;
            this.f1552H = bVar.f1552H;
            this.f1553I = bVar.f1553I;
            this.f1554J = bVar.f1554J;
            this.f1555K = bVar.f1555K;
            this.f1556L = bVar.f1556L;
            this.f1557M = bVar.f1557M;
            this.f1558N = bVar.f1558N;
            this.f1559O = bVar.f1559O;
            this.f1560P = bVar.f1560P;
            this.f1561Q = bVar.f1561Q;
            this.f1562R = bVar.f1562R;
            this.f1563S = bVar.f1563S;
            this.f1564T = bVar.f1564T;
            this.f1565U = bVar.f1565U;
            this.f1566V = bVar.f1566V;
            this.f1567W = bVar.f1567W;
            this.f1568X = bVar.f1568X;
            this.f1569Y = bVar.f1569Y;
            this.f1570Z = bVar.f1570Z;
            this.f1571a0 = bVar.f1571a0;
            this.f1573b0 = bVar.f1573b0;
            this.f1575c0 = bVar.f1575c0;
            this.f1577d0 = bVar.f1577d0;
            this.f1579e0 = bVar.f1579e0;
            this.f1585h0 = bVar.f1585h0;
            int[] iArr = bVar.f1581f0;
            if (iArr != null) {
                this.f1581f0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1581f0 = null;
            }
            this.f1583g0 = bVar.f1583g0;
            this.f1587i0 = bVar.f1587i0;
            this.f1589j0 = bVar.f1589j0;
            this.f1591k0 = bVar.f1591k0;
        }

        /* renamed from: b */
        void m1384b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221i.f1792X2);
            this.f1574c = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = f1544a.get(index);
                if (i3 == 80) {
                    this.f1587i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1587i0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.f1597q = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1597q);
                            break;
                        case 2:
                            this.f1552H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1552H);
                            break;
                        case 3:
                            this.f1596p = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1596p);
                            break;
                        case 4:
                            this.f1595o = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1595o);
                            break;
                        case 5:
                            this.f1604x = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1546B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1546B);
                            break;
                        case 7:
                            this.f1547C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1547C);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f1553I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1553I);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            this.f1601u = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1601u);
                            break;
                        case 10:
                            this.f1600t = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1600t);
                            break;
                        case 11:
                            this.f1558N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1558N);
                            break;
                        case 12:
                            this.f1559O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1559O);
                            break;
                        case 13:
                            this.f1555K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1555K);
                            break;
                        case 14:
                            this.f1557M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1557M);
                            break;
                        case 15:
                            this.f1560P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1560P);
                            break;
                        case 16:
                            this.f1556L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1556L);
                            break;
                        case 17:
                            this.f1580f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1580f);
                            break;
                        case 18:
                            this.f1582g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1582g);
                            break;
                        case 19:
                            this.f1584h = typedArrayObtainStyledAttributes.getFloat(index, this.f1584h);
                            break;
                        case 20:
                            this.f1602v = typedArrayObtainStyledAttributes.getFloat(index, this.f1602v);
                            break;
                        case 21:
                            this.f1578e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1578e);
                            break;
                        case 22:
                            this.f1576d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1576d);
                            break;
                        case 23:
                            this.f1549E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1549E);
                            break;
                        case 24:
                            this.f1586i = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1586i);
                            break;
                        case 25:
                            this.f1588j = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1588j);
                            break;
                        case 26:
                            this.f1548D = typedArrayObtainStyledAttributes.getInt(index, this.f1548D);
                            break;
                        case 27:
                            this.f1550F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1550F);
                            break;
                        case 28:
                            this.f1590k = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1590k);
                            break;
                        case 29:
                            this.f1592l = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1592l);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f1554J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1554J);
                                break;
                            } else {
                                break;
                            }
                        case 31:
                            this.f1598r = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1598r);
                            break;
                        case 32:
                            this.f1599s = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1599s);
                            break;
                        case 33:
                            this.f1551G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1551G);
                            break;
                        case 34:
                            this.f1594n = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1594n);
                            break;
                        case 35:
                            this.f1593m = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1593m);
                            break;
                        case 36:
                            this.f1603w = typedArrayObtainStyledAttributes.getFloat(index, this.f1603w);
                            break;
                        case 37:
                            this.f1562R = typedArrayObtainStyledAttributes.getFloat(index, this.f1562R);
                            break;
                        case 38:
                            this.f1561Q = typedArrayObtainStyledAttributes.getFloat(index, this.f1561Q);
                            break;
                        case 39:
                            this.f1563S = typedArrayObtainStyledAttributes.getInt(index, this.f1563S);
                            break;
                        case 40:
                            this.f1564T = typedArrayObtainStyledAttributes.getInt(index, this.f1564T);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.f1565U = typedArrayObtainStyledAttributes.getInt(index, this.f1565U);
                                    break;
                                case 55:
                                    this.f1566V = typedArrayObtainStyledAttributes.getInt(index, this.f1566V);
                                    break;
                                case 56:
                                    this.f1567W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1567W);
                                    break;
                                case 57:
                                    this.f1568X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1568X);
                                    break;
                                case 58:
                                    this.f1569Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1569Y);
                                    break;
                                case 59:
                                    this.f1570Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1570Z);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.f1605y = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1605y);
                                            break;
                                        case 62:
                                            this.f1606z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1606z);
                                            break;
                                        case 63:
                                            this.f1545A = typedArrayObtainStyledAttributes.getFloat(index, this.f1545A);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.f1571a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f1573b0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f1575c0 = typedArrayObtainStyledAttributes.getInt(index, this.f1575c0);
                                                    break;
                                                case 73:
                                                    this.f1577d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1577d0);
                                                    break;
                                                case 74:
                                                    this.f1583g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f1591k0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1591k0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1544a.get(index));
                                                    break;
                                                case 77:
                                                    this.f1585h0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1544a.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f1589j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1589j0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$c */
    public static class c {

        /* renamed from: a */
        private static SparseIntArray f1607a;

        /* renamed from: b */
        public boolean f1608b = false;

        /* renamed from: c */
        public int f1609c = -1;

        /* renamed from: d */
        public String f1610d = null;

        /* renamed from: e */
        public int f1611e = -1;

        /* renamed from: f */
        public int f1612f = 0;

        /* renamed from: g */
        public float f1613g = Float.NaN;

        /* renamed from: h */
        public float f1614h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1607a = sparseIntArray;
            sparseIntArray.append(C0221i.f1888l4, 1);
            f1607a.append(C0221i.f1900n4, 2);
            f1607a.append(C0221i.f1906o4, 3);
            f1607a.append(C0221i.f1882k4, 4);
            f1607a.append(C0221i.f1875j4, 5);
            f1607a.append(C0221i.f1894m4, 6);
        }

        /* renamed from: a */
        public void m1385a(c cVar) {
            this.f1608b = cVar.f1608b;
            this.f1609c = cVar.f1609c;
            this.f1610d = cVar.f1610d;
            this.f1611e = cVar.f1611e;
            this.f1612f = cVar.f1612f;
            this.f1614h = cVar.f1614h;
            this.f1613g = cVar.f1613g;
        }

        /* renamed from: b */
        void m1386b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221i.f1868i4);
            this.f1608b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f1607a.get(index)) {
                    case 1:
                        this.f1614h = typedArrayObtainStyledAttributes.getFloat(index, this.f1614h);
                        break;
                    case 2:
                        this.f1611e = typedArrayObtainStyledAttributes.getInt(index, this.f1611e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1610d = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f1610d = C0876a.f5792b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f1612f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1609c = C0216d.m1363n(typedArrayObtainStyledAttributes, index, this.f1609c);
                        break;
                    case 6:
                        this.f1613g = typedArrayObtainStyledAttributes.getFloat(index, this.f1613g);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d */
    public static class d {

        /* renamed from: a */
        public boolean f1615a = false;

        /* renamed from: b */
        public int f1616b = 0;

        /* renamed from: c */
        public int f1617c = 0;

        /* renamed from: d */
        public float f1618d = 1.0f;

        /* renamed from: e */
        public float f1619e = Float.NaN;

        /* renamed from: a */
        public void m1387a(d dVar) {
            this.f1615a = dVar.f1615a;
            this.f1616b = dVar.f1616b;
            this.f1618d = dVar.f1618d;
            this.f1619e = dVar.f1619e;
            this.f1617c = dVar.f1617c;
        }

        /* renamed from: b */
        void m1388b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221i.f1960x4);
            this.f1615a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0221i.f1972z4) {
                    this.f1618d = typedArrayObtainStyledAttributes.getFloat(index, this.f1618d);
                } else if (index == C0221i.f1966y4) {
                    this.f1616b = typedArrayObtainStyledAttributes.getInt(index, this.f1616b);
                    this.f1616b = C0216d.f1533a[this.f1616b];
                } else if (index == C0221i.f1662B4) {
                    this.f1617c = typedArrayObtainStyledAttributes.getInt(index, this.f1617c);
                } else if (index == C0221i.f1656A4) {
                    this.f1619e = typedArrayObtainStyledAttributes.getFloat(index, this.f1619e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$e */
    public static class e {

        /* renamed from: a */
        private static SparseIntArray f1620a;

        /* renamed from: b */
        public boolean f1621b = false;

        /* renamed from: c */
        public float f1622c = 0.0f;

        /* renamed from: d */
        public float f1623d = 0.0f;

        /* renamed from: e */
        public float f1624e = 0.0f;

        /* renamed from: f */
        public float f1625f = 1.0f;

        /* renamed from: g */
        public float f1626g = 1.0f;

        /* renamed from: h */
        public float f1627h = Float.NaN;

        /* renamed from: i */
        public float f1628i = Float.NaN;

        /* renamed from: j */
        public float f1629j = 0.0f;

        /* renamed from: k */
        public float f1630k = 0.0f;

        /* renamed from: l */
        public float f1631l = 0.0f;

        /* renamed from: m */
        public boolean f1632m = false;

        /* renamed from: n */
        public float f1633n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1620a = sparseIntArray;
            sparseIntArray.append(C0221i.f1782V4, 1);
            f1620a.append(C0221i.f1788W4, 2);
            f1620a.append(C0221i.f1794X4, 3);
            f1620a.append(C0221i.f1770T4, 4);
            f1620a.append(C0221i.f1776U4, 5);
            f1620a.append(C0221i.f1746P4, 6);
            f1620a.append(C0221i.f1752Q4, 7);
            f1620a.append(C0221i.f1758R4, 8);
            f1620a.append(C0221i.f1764S4, 9);
            f1620a.append(C0221i.f1800Y4, 10);
            f1620a.append(C0221i.f1806Z4, 11);
        }

        /* renamed from: a */
        public void m1389a(e eVar) {
            this.f1621b = eVar.f1621b;
            this.f1622c = eVar.f1622c;
            this.f1623d = eVar.f1623d;
            this.f1624e = eVar.f1624e;
            this.f1625f = eVar.f1625f;
            this.f1626g = eVar.f1626g;
            this.f1627h = eVar.f1627h;
            this.f1628i = eVar.f1628i;
            this.f1629j = eVar.f1629j;
            this.f1630k = eVar.f1630k;
            this.f1631l = eVar.f1631l;
            this.f1632m = eVar.f1632m;
            this.f1633n = eVar.f1633n;
        }

        /* renamed from: b */
        void m1390b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221i.f1740O4);
            this.f1621b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f1620a.get(index)) {
                    case 1:
                        this.f1622c = typedArrayObtainStyledAttributes.getFloat(index, this.f1622c);
                        break;
                    case 2:
                        this.f1623d = typedArrayObtainStyledAttributes.getFloat(index, this.f1623d);
                        break;
                    case 3:
                        this.f1624e = typedArrayObtainStyledAttributes.getFloat(index, this.f1624e);
                        break;
                    case 4:
                        this.f1625f = typedArrayObtainStyledAttributes.getFloat(index, this.f1625f);
                        break;
                    case 5:
                        this.f1626g = typedArrayObtainStyledAttributes.getFloat(index, this.f1626g);
                        break;
                    case 6:
                        this.f1627h = typedArrayObtainStyledAttributes.getDimension(index, this.f1627h);
                        break;
                    case 7:
                        this.f1628i = typedArrayObtainStyledAttributes.getDimension(index, this.f1628i);
                        break;
                    case 8:
                        this.f1629j = typedArrayObtainStyledAttributes.getDimension(index, this.f1629j);
                        break;
                    case 9:
                        this.f1630k = typedArrayObtainStyledAttributes.getDimension(index, this.f1630k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1631l = typedArrayObtainStyledAttributes.getDimension(index, this.f1631l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1632m = true;
                            this.f1633n = typedArrayObtainStyledAttributes.getDimension(index, this.f1633n);
                            break;
                        } else {
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1534b = sparseIntArray;
        sparseIntArray.append(C0221i.f1938u0, 25);
        f1534b.append(C0221i.f1944v0, 26);
        f1534b.append(C0221i.f1956x0, 29);
        f1534b.append(C0221i.f1962y0, 30);
        f1534b.append(C0221i.f1676E0, 36);
        f1534b.append(C0221i.f1670D0, 35);
        f1534b.append(C0221i.f1822c0, 4);
        f1534b.append(C0221i.f1815b0, 3);
        f1534b.append(C0221i.f1801Z, 1);
        f1534b.append(C0221i.f1724M0, 6);
        f1534b.append(C0221i.f1730N0, 7);
        f1534b.append(C0221i.f1871j0, 17);
        f1534b.append(C0221i.f1878k0, 18);
        f1534b.append(C0221i.f1884l0, 19);
        f1534b.append(C0221i.f1925s, 27);
        f1534b.append(C0221i.f1968z0, 32);
        f1534b.append(C0221i.f1652A0, 33);
        f1534b.append(C0221i.f1864i0, 10);
        f1534b.append(C0221i.f1857h0, 9);
        f1534b.append(C0221i.f1748Q0, 13);
        f1534b.append(C0221i.f1766T0, 16);
        f1534b.append(C0221i.f1754R0, 14);
        f1534b.append(C0221i.f1736O0, 11);
        f1534b.append(C0221i.f1760S0, 15);
        f1534b.append(C0221i.f1742P0, 12);
        f1534b.append(C0221i.f1694H0, 40);
        f1534b.append(C0221i.f1926s0, 39);
        f1534b.append(C0221i.f1920r0, 41);
        f1534b.append(C0221i.f1688G0, 42);
        f1534b.append(C0221i.f1914q0, 20);
        f1534b.append(C0221i.f1682F0, 37);
        f1534b.append(C0221i.f1850g0, 5);
        f1534b.append(C0221i.f1932t0, 82);
        f1534b.append(C0221i.f1664C0, 82);
        f1534b.append(C0221i.f1950w0, 82);
        f1534b.append(C0221i.f1808a0, 82);
        f1534b.append(C0221i.f1795Y, 82);
        f1534b.append(C0221i.f1955x, 24);
        f1534b.append(C0221i.f1967z, 28);
        f1534b.append(C0221i.f1717L, 31);
        f1534b.append(C0221i.f1723M, 8);
        f1534b.append(C0221i.f1961y, 34);
        f1534b.append(C0221i.f1651A, 2);
        f1534b.append(C0221i.f1943v, 23);
        f1534b.append(C0221i.f1949w, 21);
        f1534b.append(C0221i.f1937u, 22);
        f1534b.append(C0221i.f1657B, 43);
        f1534b.append(C0221i.f1735O, 44);
        f1534b.append(C0221i.f1705J, 45);
        f1534b.append(C0221i.f1711K, 46);
        f1534b.append(C0221i.f1699I, 60);
        f1534b.append(C0221i.f1687G, 47);
        f1534b.append(C0221i.f1693H, 48);
        f1534b.append(C0221i.f1663C, 49);
        f1534b.append(C0221i.f1669D, 50);
        f1534b.append(C0221i.f1675E, 51);
        f1534b.append(C0221i.f1681F, 52);
        f1534b.append(C0221i.f1729N, 53);
        f1534b.append(C0221i.f1700I0, 54);
        f1534b.append(C0221i.f1890m0, 55);
        f1534b.append(C0221i.f1706J0, 56);
        f1534b.append(C0221i.f1896n0, 57);
        f1534b.append(C0221i.f1712K0, 58);
        f1534b.append(C0221i.f1902o0, 59);
        f1534b.append(C0221i.f1829d0, 61);
        f1534b.append(C0221i.f1843f0, 62);
        f1534b.append(C0221i.f1836e0, 63);
        f1534b.append(C0221i.f1741P, 64);
        f1534b.append(C0221i.f1790X0, 65);
        f1534b.append(C0221i.f1777V, 66);
        f1534b.append(C0221i.f1796Y0, 67);
        f1534b.append(C0221i.f1778V0, 79);
        f1534b.append(C0221i.f1931t, 38);
        f1534b.append(C0221i.f1772U0, 68);
        f1534b.append(C0221i.f1718L0, 69);
        f1534b.append(C0221i.f1908p0, 70);
        f1534b.append(C0221i.f1765T, 71);
        f1534b.append(C0221i.f1753R, 72);
        f1534b.append(C0221i.f1759S, 73);
        f1534b.append(C0221i.f1771U, 74);
        f1534b.append(C0221i.f1747Q, 75);
        f1534b.append(C0221i.f1784W0, 76);
        f1534b.append(C0221i.f1658B0, 77);
        f1534b.append(C0221i.f1802Z0, 78);
        f1534b.append(C0221i.f1789X, 80);
        f1534b.append(C0221i.f1783W, 81);
    }

    /* renamed from: i */
    private int[] m1360i(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objM1324f;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = C0220h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objM1324f = ((ConstraintLayout) view.getParent()).m1324f(0, strTrim)) != null && (objM1324f instanceof Integer)) {
                iIntValue = ((Integer) objM1324f).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: j */
    private a m1361j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0221i.f1919r);
        m1364o(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: k */
    private a m1362k(int i2) {
        if (!this.f1537e.containsKey(Integer.valueOf(i2))) {
            this.f1537e.put(Integer.valueOf(i2), new a());
        }
        return this.f1537e.get(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static int m1363n(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* renamed from: o */
    private void m1364o(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != C0221i.f1931t && C0221i.f1717L != index && C0221i.f1723M != index) {
                aVar.f1540c.f1608b = true;
                aVar.f1541d.f1574c = true;
                aVar.f1539b.f1615a = true;
                aVar.f1542e.f1621b = true;
            }
            switch (f1534b.get(index)) {
                case 1:
                    b bVar = aVar.f1541d;
                    bVar.f1597q = m1363n(typedArray, index, bVar.f1597q);
                    break;
                case 2:
                    b bVar2 = aVar.f1541d;
                    bVar2.f1552H = typedArray.getDimensionPixelSize(index, bVar2.f1552H);
                    break;
                case 3:
                    b bVar3 = aVar.f1541d;
                    bVar3.f1596p = m1363n(typedArray, index, bVar3.f1596p);
                    break;
                case 4:
                    b bVar4 = aVar.f1541d;
                    bVar4.f1595o = m1363n(typedArray, index, bVar4.f1595o);
                    break;
                case 5:
                    aVar.f1541d.f1604x = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1541d;
                    bVar5.f1546B = typedArray.getDimensionPixelOffset(index, bVar5.f1546B);
                    break;
                case 7:
                    b bVar6 = aVar.f1541d;
                    bVar6.f1547C = typedArray.getDimensionPixelOffset(index, bVar6.f1547C);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f1541d;
                        bVar7.f1553I = typedArray.getDimensionPixelSize(index, bVar7.f1553I);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f1541d;
                    bVar8.f1601u = m1363n(typedArray, index, bVar8.f1601u);
                    break;
                case 10:
                    b bVar9 = aVar.f1541d;
                    bVar9.f1600t = m1363n(typedArray, index, bVar9.f1600t);
                    break;
                case 11:
                    b bVar10 = aVar.f1541d;
                    bVar10.f1558N = typedArray.getDimensionPixelSize(index, bVar10.f1558N);
                    break;
                case 12:
                    b bVar11 = aVar.f1541d;
                    bVar11.f1559O = typedArray.getDimensionPixelSize(index, bVar11.f1559O);
                    break;
                case 13:
                    b bVar12 = aVar.f1541d;
                    bVar12.f1555K = typedArray.getDimensionPixelSize(index, bVar12.f1555K);
                    break;
                case 14:
                    b bVar13 = aVar.f1541d;
                    bVar13.f1557M = typedArray.getDimensionPixelSize(index, bVar13.f1557M);
                    break;
                case 15:
                    b bVar14 = aVar.f1541d;
                    bVar14.f1560P = typedArray.getDimensionPixelSize(index, bVar14.f1560P);
                    break;
                case 16:
                    b bVar15 = aVar.f1541d;
                    bVar15.f1556L = typedArray.getDimensionPixelSize(index, bVar15.f1556L);
                    break;
                case 17:
                    b bVar16 = aVar.f1541d;
                    bVar16.f1580f = typedArray.getDimensionPixelOffset(index, bVar16.f1580f);
                    break;
                case 18:
                    b bVar17 = aVar.f1541d;
                    bVar17.f1582g = typedArray.getDimensionPixelOffset(index, bVar17.f1582g);
                    break;
                case 19:
                    b bVar18 = aVar.f1541d;
                    bVar18.f1584h = typedArray.getFloat(index, bVar18.f1584h);
                    break;
                case 20:
                    b bVar19 = aVar.f1541d;
                    bVar19.f1602v = typedArray.getFloat(index, bVar19.f1602v);
                    break;
                case 21:
                    b bVar20 = aVar.f1541d;
                    bVar20.f1578e = typedArray.getLayoutDimension(index, bVar20.f1578e);
                    break;
                case 22:
                    d dVar = aVar.f1539b;
                    dVar.f1616b = typedArray.getInt(index, dVar.f1616b);
                    d dVar2 = aVar.f1539b;
                    dVar2.f1616b = f1533a[dVar2.f1616b];
                    break;
                case 23:
                    b bVar21 = aVar.f1541d;
                    bVar21.f1576d = typedArray.getLayoutDimension(index, bVar21.f1576d);
                    break;
                case 24:
                    b bVar22 = aVar.f1541d;
                    bVar22.f1549E = typedArray.getDimensionPixelSize(index, bVar22.f1549E);
                    break;
                case 25:
                    b bVar23 = aVar.f1541d;
                    bVar23.f1586i = m1363n(typedArray, index, bVar23.f1586i);
                    break;
                case 26:
                    b bVar24 = aVar.f1541d;
                    bVar24.f1588j = m1363n(typedArray, index, bVar24.f1588j);
                    break;
                case 27:
                    b bVar25 = aVar.f1541d;
                    bVar25.f1548D = typedArray.getInt(index, bVar25.f1548D);
                    break;
                case 28:
                    b bVar26 = aVar.f1541d;
                    bVar26.f1550F = typedArray.getDimensionPixelSize(index, bVar26.f1550F);
                    break;
                case 29:
                    b bVar27 = aVar.f1541d;
                    bVar27.f1590k = m1363n(typedArray, index, bVar27.f1590k);
                    break;
                case 30:
                    b bVar28 = aVar.f1541d;
                    bVar28.f1592l = m1363n(typedArray, index, bVar28.f1592l);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f1541d;
                        bVar29.f1554J = typedArray.getDimensionPixelSize(index, bVar29.f1554J);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f1541d;
                    bVar30.f1598r = m1363n(typedArray, index, bVar30.f1598r);
                    break;
                case 33:
                    b bVar31 = aVar.f1541d;
                    bVar31.f1599s = m1363n(typedArray, index, bVar31.f1599s);
                    break;
                case 34:
                    b bVar32 = aVar.f1541d;
                    bVar32.f1551G = typedArray.getDimensionPixelSize(index, bVar32.f1551G);
                    break;
                case 35:
                    b bVar33 = aVar.f1541d;
                    bVar33.f1594n = m1363n(typedArray, index, bVar33.f1594n);
                    break;
                case 36:
                    b bVar34 = aVar.f1541d;
                    bVar34.f1593m = m1363n(typedArray, index, bVar34.f1593m);
                    break;
                case 37:
                    b bVar35 = aVar.f1541d;
                    bVar35.f1603w = typedArray.getFloat(index, bVar35.f1603w);
                    break;
                case 38:
                    aVar.f1538a = typedArray.getResourceId(index, aVar.f1538a);
                    break;
                case 39:
                    b bVar36 = aVar.f1541d;
                    bVar36.f1562R = typedArray.getFloat(index, bVar36.f1562R);
                    break;
                case 40:
                    b bVar37 = aVar.f1541d;
                    bVar37.f1561Q = typedArray.getFloat(index, bVar37.f1561Q);
                    break;
                case 41:
                    b bVar38 = aVar.f1541d;
                    bVar38.f1563S = typedArray.getInt(index, bVar38.f1563S);
                    break;
                case 42:
                    b bVar39 = aVar.f1541d;
                    bVar39.f1564T = typedArray.getInt(index, bVar39.f1564T);
                    break;
                case 43:
                    d dVar3 = aVar.f1539b;
                    dVar3.f1618d = typedArray.getFloat(index, dVar3.f1618d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f1542e;
                        eVar.f1632m = true;
                        eVar.f1633n = typedArray.getDimension(index, eVar.f1633n);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e eVar2 = aVar.f1542e;
                    eVar2.f1623d = typedArray.getFloat(index, eVar2.f1623d);
                    break;
                case 46:
                    e eVar3 = aVar.f1542e;
                    eVar3.f1624e = typedArray.getFloat(index, eVar3.f1624e);
                    break;
                case 47:
                    e eVar4 = aVar.f1542e;
                    eVar4.f1625f = typedArray.getFloat(index, eVar4.f1625f);
                    break;
                case 48:
                    e eVar5 = aVar.f1542e;
                    eVar5.f1626g = typedArray.getFloat(index, eVar5.f1626g);
                    break;
                case 49:
                    e eVar6 = aVar.f1542e;
                    eVar6.f1627h = typedArray.getDimension(index, eVar6.f1627h);
                    break;
                case 50:
                    e eVar7 = aVar.f1542e;
                    eVar7.f1628i = typedArray.getDimension(index, eVar7.f1628i);
                    break;
                case 51:
                    e eVar8 = aVar.f1542e;
                    eVar8.f1629j = typedArray.getDimension(index, eVar8.f1629j);
                    break;
                case 52:
                    e eVar9 = aVar.f1542e;
                    eVar9.f1630k = typedArray.getDimension(index, eVar9.f1630k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f1542e;
                        eVar10.f1631l = typedArray.getDimension(index, eVar10.f1631l);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f1541d;
                    bVar40.f1565U = typedArray.getInt(index, bVar40.f1565U);
                    break;
                case 55:
                    b bVar41 = aVar.f1541d;
                    bVar41.f1566V = typedArray.getInt(index, bVar41.f1566V);
                    break;
                case 56:
                    b bVar42 = aVar.f1541d;
                    bVar42.f1567W = typedArray.getDimensionPixelSize(index, bVar42.f1567W);
                    break;
                case 57:
                    b bVar43 = aVar.f1541d;
                    bVar43.f1568X = typedArray.getDimensionPixelSize(index, bVar43.f1568X);
                    break;
                case 58:
                    b bVar44 = aVar.f1541d;
                    bVar44.f1569Y = typedArray.getDimensionPixelSize(index, bVar44.f1569Y);
                    break;
                case 59:
                    b bVar45 = aVar.f1541d;
                    bVar45.f1570Z = typedArray.getDimensionPixelSize(index, bVar45.f1570Z);
                    break;
                case 60:
                    e eVar11 = aVar.f1542e;
                    eVar11.f1622c = typedArray.getFloat(index, eVar11.f1622c);
                    break;
                case 61:
                    b bVar46 = aVar.f1541d;
                    bVar46.f1605y = m1363n(typedArray, index, bVar46.f1605y);
                    break;
                case 62:
                    b bVar47 = aVar.f1541d;
                    bVar47.f1606z = typedArray.getDimensionPixelSize(index, bVar47.f1606z);
                    break;
                case 63:
                    b bVar48 = aVar.f1541d;
                    bVar48.f1545A = typedArray.getFloat(index, bVar48.f1545A);
                    break;
                case 64:
                    c cVar = aVar.f1540c;
                    cVar.f1609c = m1363n(typedArray, index, cVar.f1609c);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f1540c.f1610d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f1540c.f1610d = C0876a.f5792b[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f1540c.f1612f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f1540c;
                    cVar2.f1614h = typedArray.getFloat(index, cVar2.f1614h);
                    break;
                case 68:
                    d dVar4 = aVar.f1539b;
                    dVar4.f1619e = typedArray.getFloat(index, dVar4.f1619e);
                    break;
                case 69:
                    aVar.f1541d.f1571a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1541d.f1573b0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f1541d;
                    bVar49.f1575c0 = typedArray.getInt(index, bVar49.f1575c0);
                    break;
                case 73:
                    b bVar50 = aVar.f1541d;
                    bVar50.f1577d0 = typedArray.getDimensionPixelSize(index, bVar50.f1577d0);
                    break;
                case 74:
                    aVar.f1541d.f1583g0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1541d;
                    bVar51.f1591k0 = typedArray.getBoolean(index, bVar51.f1591k0);
                    break;
                case 76:
                    c cVar3 = aVar.f1540c;
                    cVar3.f1611e = typedArray.getInt(index, cVar3.f1611e);
                    break;
                case 77:
                    aVar.f1541d.f1585h0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f1539b;
                    dVar5.f1617c = typedArray.getInt(index, dVar5.f1617c);
                    break;
                case 79:
                    c cVar4 = aVar.f1540c;
                    cVar4.f1613g = typedArray.getFloat(index, cVar4.f1613g);
                    break;
                case 80:
                    b bVar52 = aVar.f1541d;
                    bVar52.f1587i0 = typedArray.getBoolean(index, bVar52.f1587i0);
                    break;
                case 81:
                    b bVar53 = aVar.f1541d;
                    bVar53.f1589j0 = typedArray.getBoolean(index, bVar53.f1589j0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1534b.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1534b.get(index));
                    break;
            }
        }
    }

    /* renamed from: q */
    private String m1365q(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: c */
    public void m1366c(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m1367d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: d */
    void m1367d(ConstraintLayout constraintLayout, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1537e.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f1537e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C0877a.m5514a(childAt));
            } else {
                if (this.f1536d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1537e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f1537e.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f1541d.f1579e0 = 1;
                        }
                        int i3 = aVar.f1541d.f1579e0;
                        if (i3 != -1 && i3 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f1541d.f1575c0);
                            barrier.setMargin(aVar.f1541d.f1577d0);
                            barrier.setAllowsGoneWidget(aVar.f1541d.f1591k0);
                            b bVar = aVar.f1541d;
                            int[] iArr = bVar.f1581f0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1583g0;
                                if (str != null) {
                                    bVar.f1581f0 = m1360i(barrier, str);
                                    barrier.setReferencedIds(aVar.f1541d.f1581f0);
                                }
                            }
                        }
                        ConstraintLayout.C0211b c0211b = (ConstraintLayout.C0211b) childAt.getLayoutParams();
                        c0211b.m1333a();
                        aVar.m1381d(c0211b);
                        if (z) {
                            C0213a.m1341c(childAt, aVar.f1543f);
                        }
                        childAt.setLayoutParams(c0211b);
                        d dVar = aVar.f1539b;
                        if (dVar.f1617c == 0) {
                            childAt.setVisibility(dVar.f1616b);
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 17) {
                            childAt.setAlpha(aVar.f1539b.f1618d);
                            childAt.setRotation(aVar.f1542e.f1622c);
                            childAt.setRotationX(aVar.f1542e.f1623d);
                            childAt.setRotationY(aVar.f1542e.f1624e);
                            childAt.setScaleX(aVar.f1542e.f1625f);
                            childAt.setScaleY(aVar.f1542e.f1626g);
                            if (!Float.isNaN(aVar.f1542e.f1627h)) {
                                childAt.setPivotX(aVar.f1542e.f1627h);
                            }
                            if (!Float.isNaN(aVar.f1542e.f1628i)) {
                                childAt.setPivotY(aVar.f1542e.f1628i);
                            }
                            childAt.setTranslationX(aVar.f1542e.f1629j);
                            childAt.setTranslationY(aVar.f1542e.f1630k);
                            if (i4 >= 21) {
                                childAt.setTranslationZ(aVar.f1542e.f1631l);
                                e eVar = aVar.f1542e;
                                if (eVar.f1632m) {
                                    childAt.setElevation(eVar.f1633n);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f1537e.get(num);
            int i5 = aVar2.f1541d.f1579e0;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar2 = aVar2.f1541d;
                int[] iArr2 = bVar2.f1581f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f1583g0;
                    if (str2 != null) {
                        bVar2.f1581f0 = m1360i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f1541d.f1581f0);
                    }
                }
                barrier2.setType(aVar2.f1541d.f1575c0);
                barrier2.setMargin(aVar2.f1541d.f1577d0);
                ConstraintLayout.C0211b c0211bM1322d = constraintLayout.generateDefaultLayoutParams();
                barrier2.m1353n();
                aVar2.m1381d(c0211bM1322d);
                constraintLayout.addView(barrier2, c0211bM1322d);
            }
            if (aVar2.f1541d.f1572b) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0211b c0211bM1322d2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.m1381d(c0211bM1322d2);
                constraintLayout.addView(guideline, c0211bM1322d2);
            }
        }
    }

    /* renamed from: e */
    public void m1368e(Context context, int i2) {
        m1369f((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    /* renamed from: f */
    public void m1369f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1537e.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.C0211b c0211b = (ConstraintLayout.C0211b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1536d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1537e.containsKey(Integer.valueOf(id))) {
                this.f1537e.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f1537e.get(Integer.valueOf(id));
            aVar.f1543f = C0213a.m1339a(this.f1535c, childAt);
            aVar.m1378f(id, c0211b);
            aVar.f1539b.f1616b = childAt.getVisibility();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 17) {
                aVar.f1539b.f1618d = childAt.getAlpha();
                aVar.f1542e.f1622c = childAt.getRotation();
                aVar.f1542e.f1623d = childAt.getRotationX();
                aVar.f1542e.f1624e = childAt.getRotationY();
                aVar.f1542e.f1625f = childAt.getScaleX();
                aVar.f1542e.f1626g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f1542e;
                    eVar.f1627h = pivotX;
                    eVar.f1628i = pivotY;
                }
                aVar.f1542e.f1629j = childAt.getTranslationX();
                aVar.f1542e.f1630k = childAt.getTranslationY();
                if (i3 >= 21) {
                    aVar.f1542e.f1631l = childAt.getTranslationZ();
                    e eVar2 = aVar.f1542e;
                    if (eVar2.f1632m) {
                        eVar2.f1633n = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f1541d.f1591k0 = barrier.m1313o();
                aVar.f1541d.f1581f0 = barrier.getReferencedIds();
                aVar.f1541d.f1575c0 = barrier.getType();
                aVar.f1541d.f1577d0 = barrier.getMargin();
            }
        }
    }

    /* renamed from: g */
    public void m1370g(C0217e c0217e) {
        int childCount = c0217e.getChildCount();
        this.f1537e.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c0217e.getChildAt(i2);
            C0217e.a aVar = (C0217e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1536d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1537e.containsKey(Integer.valueOf(id))) {
                this.f1537e.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f1537e.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC0214b) {
                aVar2.m1380h((AbstractC0214b) childAt, id, aVar);
            }
            aVar2.m1379g(id, aVar);
        }
    }

    /* renamed from: h */
    public void m1371h(int i2, int i3, int i4, int i5) {
        if (!this.f1537e.containsKey(Integer.valueOf(i2))) {
            this.f1537e.put(Integer.valueOf(i2), new a());
        }
        a aVar = this.f1537e.get(Integer.valueOf(i2));
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b bVar = aVar.f1541d;
                    bVar.f1586i = i4;
                    bVar.f1588j = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar2 = aVar.f1541d;
                    bVar2.f1588j = i4;
                    bVar2.f1586i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m1365q(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    b bVar3 = aVar.f1541d;
                    bVar3.f1590k = i4;
                    bVar3.f1592l = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar4 = aVar.f1541d;
                    bVar4.f1592l = i4;
                    bVar4.f1590k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m1365q(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    b bVar5 = aVar.f1541d;
                    bVar5.f1593m = i4;
                    bVar5.f1594n = -1;
                    bVar5.f1597q = -1;
                    return;
                }
                if (i5 == 4) {
                    b bVar6 = aVar.f1541d;
                    bVar6.f1594n = i4;
                    bVar6.f1593m = -1;
                    bVar6.f1597q = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m1365q(i5) + " undefined");
            case 4:
                if (i5 == 4) {
                    b bVar7 = aVar.f1541d;
                    bVar7.f1596p = i4;
                    bVar7.f1595o = -1;
                    bVar7.f1597q = -1;
                    return;
                }
                if (i5 == 3) {
                    b bVar8 = aVar.f1541d;
                    bVar8.f1595o = i4;
                    bVar8.f1596p = -1;
                    bVar8.f1597q = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m1365q(i5) + " undefined");
            case 5:
                if (i5 != 5) {
                    throw new IllegalArgumentException("right to " + m1365q(i5) + " undefined");
                }
                b bVar9 = aVar.f1541d;
                bVar9.f1597q = i4;
                bVar9.f1596p = -1;
                bVar9.f1595o = -1;
                bVar9.f1593m = -1;
                bVar9.f1594n = -1;
                return;
            case 6:
                if (i5 == 6) {
                    b bVar10 = aVar.f1541d;
                    bVar10.f1599s = i4;
                    bVar10.f1598r = -1;
                    return;
                } else if (i5 == 7) {
                    b bVar11 = aVar.f1541d;
                    bVar11.f1598r = i4;
                    bVar11.f1599s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m1365q(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    b bVar12 = aVar.f1541d;
                    bVar12.f1601u = i4;
                    bVar12.f1600t = -1;
                    return;
                } else if (i5 == 6) {
                    b bVar13 = aVar.f1541d;
                    bVar13.f1600t = i4;
                    bVar13.f1601u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m1365q(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m1365q(i3) + " to " + m1365q(i5) + " unknown");
        }
    }

    /* renamed from: l */
    public void m1372l(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM1361j = m1361j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM1361j.f1541d.f1572b = true;
                    }
                    this.f1537e.put(Integer.valueOf(aVarM1361j.f1538a), aVarM1361j);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1373m(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0216d.m1373m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: p */
    public void m1374p(int i2, float f2) {
        m1362k(i2).f1541d.f1603w = f2;
    }
}
