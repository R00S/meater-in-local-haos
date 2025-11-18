package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a */
    private C0236b f2028a;

    /* renamed from: androidx.core.app.FrameMetricsAggregator$a */
    private static class C0235a extends C0236b {

        /* renamed from: a */
        private static HandlerThread f2029a;

        /* renamed from: b */
        private static Handler f2030b;

        /* renamed from: c */
        int f2031c;

        /* renamed from: d */
        SparseIntArray[] f2032d = new SparseIntArray[9];

        /* renamed from: e */
        private ArrayList<WeakReference<Activity>> f2033e = new ArrayList<>();

        /* renamed from: f */
        Window.OnFrameMetricsAvailableListener f2034f = new a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a */
        class a implements Window.OnFrameMetricsAvailableListener {
            a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                C0235a c0235a = C0235a.this;
                if ((c0235a.f2031c & 1) != 0) {
                    c0235a.m1520f(c0235a.f2032d[0], frameMetrics.getMetric(8));
                }
                C0235a c0235a2 = C0235a.this;
                if ((c0235a2.f2031c & 2) != 0) {
                    c0235a2.m1520f(c0235a2.f2032d[1], frameMetrics.getMetric(1));
                }
                C0235a c0235a3 = C0235a.this;
                if ((c0235a3.f2031c & 4) != 0) {
                    c0235a3.m1520f(c0235a3.f2032d[2], frameMetrics.getMetric(3));
                }
                C0235a c0235a4 = C0235a.this;
                if ((c0235a4.f2031c & 8) != 0) {
                    c0235a4.m1520f(c0235a4.f2032d[3], frameMetrics.getMetric(4));
                }
                C0235a c0235a5 = C0235a.this;
                if ((c0235a5.f2031c & 16) != 0) {
                    c0235a5.m1520f(c0235a5.f2032d[4], frameMetrics.getMetric(5));
                }
                C0235a c0235a6 = C0235a.this;
                if ((c0235a6.f2031c & 64) != 0) {
                    c0235a6.m1520f(c0235a6.f2032d[6], frameMetrics.getMetric(7));
                }
                C0235a c0235a7 = C0235a.this;
                if ((c0235a7.f2031c & 32) != 0) {
                    c0235a7.m1520f(c0235a7.f2032d[5], frameMetrics.getMetric(6));
                }
                C0235a c0235a8 = C0235a.this;
                if ((c0235a8.f2031c & 128) != 0) {
                    c0235a8.m1520f(c0235a8.f2032d[7], frameMetrics.getMetric(0));
                }
                C0235a c0235a9 = C0235a.this;
                if ((c0235a9.f2031c & 256) != 0) {
                    c0235a9.m1520f(c0235a9.f2032d[8], frameMetrics.getMetric(2));
                }
            }
        }

        C0235a(int i2) {
            this.f2031c = i2;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0236b
        /* renamed from: a */
        public void mo1515a(Activity activity) {
            if (f2029a == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f2029a = handlerThread;
                handlerThread.start();
                f2030b = new Handler(f2029a.getLooper());
            }
            for (int i2 = 0; i2 <= 8; i2++) {
                SparseIntArray[] sparseIntArrayArr = this.f2032d;
                if (sparseIntArrayArr[i2] == null && (this.f2031c & (1 << i2)) != 0) {
                    sparseIntArrayArr[i2] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f2034f, f2030b);
            this.f2033e.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0236b
        /* renamed from: b */
        public SparseIntArray[] mo1516b() {
            return this.f2032d;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0236b
        /* renamed from: c */
        public SparseIntArray[] mo1517c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f2033e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f2033e.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f2034f);
            return this.f2032d;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0236b
        /* renamed from: d */
        public SparseIntArray[] mo1518d() {
            SparseIntArray[] sparseIntArrayArr = this.f2032d;
            this.f2032d = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.C0236b
        /* renamed from: e */
        public SparseIntArray[] mo1519e() {
            for (int size = this.f2033e.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f2033e.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f2034f);
                    this.f2033e.remove(size);
                }
            }
            return this.f2032d;
        }

        /* renamed from: f */
        void m1520f(SparseIntArray sparseIntArray, long j2) {
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + j2) / 1000000);
                if (j2 >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.FrameMetricsAggregator$b */
    private static class C0236b {
        C0236b() {
        }

        /* renamed from: a */
        public void mo1515a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo1516b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo1517c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo1518d() {
            return null;
        }

        /* renamed from: e */
        public SparseIntArray[] mo1519e() {
            return null;
        }
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    /* renamed from: a */
    public void m1510a(Activity activity) {
        this.f2028a.mo1515a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] m1511b() {
        return this.f2028a.mo1516b();
    }

    /* renamed from: c */
    public SparseIntArray[] m1512c(Activity activity) {
        return this.f2028a.mo1517c(activity);
    }

    /* renamed from: d */
    public SparseIntArray[] m1513d() {
        return this.f2028a.mo1518d();
    }

    /* renamed from: e */
    public SparseIntArray[] m1514e() {
        return this.f2028a.mo1519e();
    }

    public FrameMetricsAggregator(int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2028a = new C0235a(i2);
        } else {
            this.f2028a = new C0236b();
        }
    }
}
