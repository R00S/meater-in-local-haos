package f1;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FrameMetricsAggregator.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final b f41046a;

    /* compiled from: FrameMetricsAggregator.java */
    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static HandlerThread f41047e;

        /* renamed from: f, reason: collision with root package name */
        private static Handler f41048f;

        /* renamed from: a, reason: collision with root package name */
        int f41049a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f41050b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f41051c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f41052d = new WindowOnFrameMetricsAvailableListenerC0514a();

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: f1.i$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0514a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0514a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f41049a & 1) != 0) {
                    aVar.e(aVar.f41050b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f41049a & 2) != 0) {
                    aVar2.e(aVar2.f41050b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f41049a & 4) != 0) {
                    aVar3.e(aVar3.f41050b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f41049a & 8) != 0) {
                    aVar4.e(aVar4.f41050b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f41049a & 16) != 0) {
                    aVar5.e(aVar5.f41050b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f41049a & 64) != 0) {
                    aVar6.e(aVar6.f41050b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f41049a & 32) != 0) {
                    aVar7.e(aVar7.f41050b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f41049a & 128) != 0) {
                    aVar8.e(aVar8.f41050b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f41049a & 256) != 0) {
                    aVar9.e(aVar9.f41050b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f41049a = i10;
        }

        @Override // f1.i.b
        public void a(Activity activity) {
            if (f41047e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f41047e = handlerThread;
                handlerThread.start();
                f41048f = new Handler(f41047e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f41050b;
                if (sparseIntArrayArr[i10] == null && (this.f41049a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f41052d, f41048f);
            this.f41051c.add(new WeakReference<>(activity));
        }

        @Override // f1.i.b
        public SparseIntArray[] b() {
            return this.f41050b;
        }

        @Override // f1.i.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f41051c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f41051c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f41052d);
            return this.f41050b;
        }

        @Override // f1.i.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f41050b;
            this.f41050b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    private static class b {
        b() {
        }

        public void a(Activity activity) {
            throw null;
        }

        public SparseIntArray[] b() {
            throw null;
        }

        public SparseIntArray[] c(Activity activity) {
            throw null;
        }

        public SparseIntArray[] d() {
            throw null;
        }
    }

    public i() {
        this(1);
    }

    public void a(Activity activity) {
        this.f41046a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f41046a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f41046a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f41046a.d();
    }

    public i(int i10) {
        this.f41046a = new a(i10);
    }
}
