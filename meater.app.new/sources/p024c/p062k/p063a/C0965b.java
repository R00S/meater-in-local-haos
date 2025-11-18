package p024c.p062k.p063a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: FocusStrategy.java */
/* renamed from: c.k.a.b */
/* loaded from: classes.dex */
class C0965b {

    /* compiled from: FocusStrategy.java */
    /* renamed from: c.k.a.b$a */
    public interface a<T> {
        /* renamed from: a */
        void mo6108a(T t, Rect rect);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: c.k.a.b$b */
    public interface b<T, V> {
        /* renamed from: a */
        V mo6110a(T t, int i2);

        /* renamed from: b */
        int mo6111b(T t);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: c.k.a.b$c */
    private static class c<T> implements Comparator<T> {

        /* renamed from: f */
        private final Rect f6432f = new Rect();

        /* renamed from: g */
        private final Rect f6433g = new Rect();

        /* renamed from: h */
        private final boolean f6434h;

        /* renamed from: i */
        private final a<T> f6435i;

        c(boolean z, a<T> aVar) {
            this.f6434h = z;
            this.f6435i = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f6432f;
            Rect rect2 = this.f6433g;
            this.f6435i.mo6108a(t, rect);
            this.f6435i.mo6108a(t2, rect2);
            int i2 = rect.top;
            int i3 = rect2.top;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                return this.f6434h ? 1 : -1;
            }
            if (i4 > i5) {
                return this.f6434h ? -1 : 1;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                return this.f6434h ? 1 : -1;
            }
            if (i8 > i9) {
                return this.f6434h ? -1 : 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m6114a(int i2, Rect rect, Rect rect2, Rect rect3) {
        boolean zM6115b = m6115b(i2, rect, rect2);
        if (m6115b(i2, rect, rect3) || !zM6115b) {
            return false;
        }
        return !m6123j(i2, rect, rect3) || i2 == 17 || i2 == 66 || m6124k(i2, rect, rect2) < m6126m(i2, rect, rect3);
    }

    /* renamed from: b */
    private static boolean m6115b(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static <L, T> T m6116c(L l, b<L, T> bVar, a<T> aVar, T t, Rect rect, int i2) {
        Rect rect2 = new Rect(rect);
        if (i2 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i2 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i2 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        T t2 = null;
        int iMo6111b = bVar.mo6111b(l);
        Rect rect3 = new Rect();
        for (int i3 = 0; i3 < iMo6111b; i3++) {
            T tMo6110a = bVar.mo6110a(l, i3);
            if (tMo6110a != t) {
                aVar.mo6108a(tMo6110a, rect3);
                if (m6121h(i2, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = tMo6110a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m6117d(L l, b<L, T> bVar, a<T> aVar, T t, int i2, boolean z, boolean z2) {
        int iMo6111b = bVar.mo6111b(l);
        ArrayList arrayList = new ArrayList(iMo6111b);
        for (int i3 = 0; i3 < iMo6111b; i3++) {
            arrayList.add(bVar.mo6110a(l, i3));
        }
        Collections.sort(arrayList, new c(z, aVar));
        if (i2 == 1) {
            return (T) m6119f(t, arrayList, z2);
        }
        if (i2 == 2) {
            return (T) m6118e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    private static <T> T m6118e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iLastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m6119f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iIndexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m6120g(int i2, int i3) {
        return (i2 * 13 * i2) + (i3 * i3);
    }

    /* renamed from: h */
    private static boolean m6121h(int i2, Rect rect, Rect rect2, Rect rect3) {
        if (!m6122i(rect, rect2, i2)) {
            return false;
        }
        if (m6122i(rect, rect3, i2) && !m6114a(i2, rect, rect2, rect3)) {
            return !m6114a(i2, rect, rect3, rect2) && m6120g(m6124k(i2, rect, rect2), m6128o(i2, rect, rect2)) < m6120g(m6124k(i2, rect, rect3), m6128o(i2, rect, rect3));
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m6122i(Rect rect, Rect rect2, int i2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    /* renamed from: j */
    private static boolean m6123j(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            return rect.left >= rect2.right;
        }
        if (i2 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i2 == 66) {
            return rect.right <= rect2.left;
        }
        if (i2 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: k */
    private static int m6124k(int i2, Rect rect, Rect rect2) {
        return Math.max(0, m6125l(i2, rect, rect2));
    }

    /* renamed from: l */
    private static int m6125l(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return i3 - i4;
    }

    /* renamed from: m */
    private static int m6126m(int i2, Rect rect, Rect rect2) {
        return Math.max(1, m6127n(i2, rect, rect2));
    }

    /* renamed from: n */
    private static int m6127n(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.left;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.top;
        } else if (i2 == 66) {
            i3 = rect2.right;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.bottom;
            i4 = rect.bottom;
        }
        return i3 - i4;
    }

    /* renamed from: o */
    private static int m6128o(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
