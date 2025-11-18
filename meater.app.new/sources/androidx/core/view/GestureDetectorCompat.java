package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class GestureDetectorCompat {

    /* renamed from: a */
    private final InterfaceC0277a f2260a;

    /* renamed from: androidx.core.view.GestureDetectorCompat$a */
    interface InterfaceC0277a {
        /* renamed from: a */
        boolean mo1844a(MotionEvent motionEvent);
    }

    /* renamed from: androidx.core.view.GestureDetectorCompat$b */
    static class C0278b implements InterfaceC0277a {

        /* renamed from: a */
        private static final int f2261a = ViewConfiguration.getTapTimeout();

        /* renamed from: b */
        private static final int f2262b = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: c */
        private int f2263c;

        /* renamed from: d */
        private int f2264d;

        /* renamed from: e */
        private int f2265e;

        /* renamed from: f */
        private int f2266f;

        /* renamed from: g */
        private final Handler f2267g;

        /* renamed from: h */
        final GestureDetector.OnGestureListener f2268h;

        /* renamed from: i */
        GestureDetector.OnDoubleTapListener f2269i;

        /* renamed from: j */
        boolean f2270j;

        /* renamed from: k */
        boolean f2271k;

        /* renamed from: l */
        private boolean f2272l;

        /* renamed from: m */
        private boolean f2273m;

        /* renamed from: n */
        private boolean f2274n;

        /* renamed from: o */
        MotionEvent f2275o;

        /* renamed from: p */
        private MotionEvent f2276p;

        /* renamed from: q */
        private boolean f2277q;

        /* renamed from: r */
        private float f2278r;

        /* renamed from: s */
        private float f2279s;

        /* renamed from: t */
        private float f2280t;

        /* renamed from: u */
        private float f2281u;

        /* renamed from: v */
        private boolean f2282v;

        /* renamed from: w */
        private VelocityTracker f2283w;

        C0278b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f2267g = new a(handler);
            } else {
                this.f2267g = new a();
            }
            this.f2268h = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                m1850g((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m1847e(context);
        }

        /* renamed from: b */
        private void m1845b() {
            this.f2267g.removeMessages(1);
            this.f2267g.removeMessages(2);
            this.f2267g.removeMessages(3);
            this.f2283w.recycle();
            this.f2283w = null;
            this.f2277q = false;
            this.f2270j = false;
            this.f2273m = false;
            this.f2274n = false;
            this.f2271k = false;
            if (this.f2272l) {
                this.f2272l = false;
            }
        }

        /* renamed from: c */
        private void m1846c() {
            this.f2267g.removeMessages(1);
            this.f2267g.removeMessages(2);
            this.f2267g.removeMessages(3);
            this.f2277q = false;
            this.f2273m = false;
            this.f2274n = false;
            this.f2271k = false;
            if (this.f2272l) {
                this.f2272l = false;
            }
        }

        /* renamed from: e */
        private void m1847e(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f2268h == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.f2282v = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f2265e = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2266f = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2263c = scaledTouchSlop * scaledTouchSlop;
            this.f2264d = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        /* renamed from: f */
        private boolean m1848f(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f2274n || motionEvent3.getEventTime() - motionEvent2.getEventTime() > f2262b) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f2264d;
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC0277a
        /* renamed from: a */
        public boolean mo1844a(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.f2283w == null) {
                this.f2283w = VelocityTracker.obtain();
            }
            this.f2283w.addMovement(motionEvent);
            int i2 = action & 255;
            boolean z = i2 == 6;
            int actionIndex = z ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float x = 0.0f;
            float y = 0.0f;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (actionIndex != i3) {
                    x += motionEvent.getX(i3);
                    y += motionEvent.getY(i3);
                }
            }
            float f2 = z ? pointerCount - 1 : pointerCount;
            float f3 = x / f2;
            float f4 = y / f2;
            if (i2 == 0) {
                if (this.f2269i == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.f2267g.hasMessages(3);
                    if (zHasMessages) {
                        this.f2267g.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.f2275o;
                    if (motionEvent3 == null || (motionEvent2 = this.f2276p) == null || !zHasMessages || !m1848f(motionEvent3, motionEvent2, motionEvent)) {
                        this.f2267g.sendEmptyMessageDelayed(3, f2262b);
                        zOnDoubleTap = false;
                    } else {
                        this.f2277q = true;
                        zOnDoubleTap = this.f2269i.onDoubleTap(this.f2275o) | false | this.f2269i.onDoubleTapEvent(motionEvent);
                    }
                }
                this.f2278r = f3;
                this.f2280t = f3;
                this.f2279s = f4;
                this.f2281u = f4;
                MotionEvent motionEvent4 = this.f2275o;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.f2275o = MotionEvent.obtain(motionEvent);
                this.f2273m = true;
                this.f2274n = true;
                this.f2270j = true;
                this.f2272l = false;
                this.f2271k = false;
                if (this.f2282v) {
                    this.f2267g.removeMessages(2);
                    this.f2267g.sendEmptyMessageAtTime(2, this.f2275o.getDownTime() + f2261a + ViewConfiguration.getLongPressTimeout());
                }
                this.f2267g.sendEmptyMessageAtTime(1, this.f2275o.getDownTime() + f2261a);
                return zOnDoubleTap | this.f2268h.onDown(motionEvent);
            }
            if (i2 == 1) {
                this.f2270j = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.f2277q) {
                    zOnFling = this.f2269i.onDoubleTapEvent(motionEvent) | false;
                } else {
                    if (this.f2272l) {
                        this.f2267g.removeMessages(3);
                        this.f2272l = false;
                    } else if (this.f2273m) {
                        boolean zOnSingleTapUp = this.f2268h.onSingleTapUp(motionEvent);
                        if (this.f2271k && (onDoubleTapListener = this.f2269i) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.f2283w;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.f2266f);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f2265e || Math.abs(xVelocity) > this.f2265e) {
                            zOnFling = this.f2268h.onFling(this.f2275o, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.f2276p;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.f2276p = motionEventObtain;
                VelocityTracker velocityTracker2 = this.f2283w;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2283w = null;
                }
                this.f2277q = false;
                this.f2271k = false;
                this.f2267g.removeMessages(1);
                this.f2267g.removeMessages(2);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        m1845b();
                        return false;
                    }
                    if (i2 == 5) {
                        this.f2278r = f3;
                        this.f2280t = f3;
                        this.f2279s = f4;
                        this.f2281u = f4;
                        m1846c();
                        return false;
                    }
                    if (i2 != 6) {
                        return false;
                    }
                    this.f2278r = f3;
                    this.f2280t = f3;
                    this.f2279s = f4;
                    this.f2281u = f4;
                    this.f2283w.computeCurrentVelocity(1000, this.f2266f);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.f2283w.getXVelocity(pointerId2);
                    float yVelocity2 = this.f2283w.getYVelocity(pointerId2);
                    for (int i4 = 0; i4 < pointerCount; i4++) {
                        if (i4 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(i4);
                            if ((this.f2283w.getXVelocity(pointerId3) * xVelocity2) + (this.f2283w.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.f2283w.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                }
                if (this.f2272l) {
                    return false;
                }
                float f5 = this.f2278r - f3;
                float f6 = this.f2279s - f4;
                if (this.f2277q) {
                    return false | this.f2269i.onDoubleTapEvent(motionEvent);
                }
                if (!this.f2273m) {
                    if (Math.abs(f5) < 1.0f && Math.abs(f6) < 1.0f) {
                        return false;
                    }
                    boolean zOnScroll = this.f2268h.onScroll(this.f2275o, motionEvent, f5, f6);
                    this.f2278r = f3;
                    this.f2279s = f4;
                    return zOnScroll;
                }
                int i5 = (int) (f3 - this.f2280t);
                int i6 = (int) (f4 - this.f2281u);
                int i7 = (i5 * i5) + (i6 * i6);
                if (i7 > this.f2263c) {
                    zOnFling = this.f2268h.onScroll(this.f2275o, motionEvent, f5, f6);
                    this.f2278r = f3;
                    this.f2279s = f4;
                    this.f2273m = false;
                    this.f2267g.removeMessages(3);
                    this.f2267g.removeMessages(1);
                    this.f2267g.removeMessages(2);
                } else {
                    zOnFling = false;
                }
                if (i7 > this.f2263c) {
                    this.f2274n = false;
                }
            }
            return zOnFling;
        }

        /* renamed from: d */
        void m1849d() {
            this.f2267g.removeMessages(3);
            this.f2271k = false;
            this.f2272l = true;
            this.f2268h.onLongPress(this.f2275o);
        }

        /* renamed from: g */
        public void m1850g(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f2269i = onDoubleTapListener;
        }

        /* renamed from: androidx.core.view.GestureDetectorCompat$b$a */
        private class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 1) {
                    C0278b c0278b = C0278b.this;
                    c0278b.f2268h.onShowPress(c0278b.f2275o);
                    return;
                }
                if (i2 == 2) {
                    C0278b.this.m1849d();
                    return;
                }
                if (i2 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                C0278b c0278b2 = C0278b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = c0278b2.f2269i;
                if (onDoubleTapListener != null) {
                    if (c0278b2.f2270j) {
                        c0278b2.f2271k = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(c0278b2.f2275o);
                    }
                }
            }

            a(Handler handler) {
                super(handler.getLooper());
            }
        }
    }

    /* renamed from: androidx.core.view.GestureDetectorCompat$c */
    static class C0279c implements InterfaceC0277a {

        /* renamed from: a */
        private final GestureDetector f2285a;

        C0279c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f2285a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC0277a
        /* renamed from: a */
        public boolean mo1844a(MotionEvent motionEvent) {
            return this.f2285a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m1843a(MotionEvent motionEvent) {
        return this.f2260a.mo1844a(motionEvent);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f2260a = new C0279c(context, onGestureListener, handler);
        } else {
            this.f2260a = new C0278b(context, onGestureListener, handler);
        }
    }
}
